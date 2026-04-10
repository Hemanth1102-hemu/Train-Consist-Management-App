package Test;

import static org.junit.Assert.*;
import org.junit.Test;
import src.Train_Consist_Management_App;

public class RegexValidationTest {

    @Test
    public void testRegex_ValidTrainID() {
        assertTrue(Train_Consist_Management_App.validateTrainID("TRN-1234"));
    }

    @Test
    public void testRegex_InvalidTrainIDFormat() {
        assertFalse(Train_Consist_Management_App.validateTrainID("TRAIN12"));
        assertFalse(Train_Consist_Management_App.validateTrainID("TRN12A"));
        assertFalse(Train_Consist_Management_App.validateTrainID("1234-TRN"));
    }

    @Test
    public void testRegex_ValidCargoCode() {
        assertTrue(Train_Consist_Management_App.validateCargoCode("PET-AB"));
    }

    @Test
    public void testRegex_InvalidCargoCodeFormat() {
        assertFalse(Train_Consist_Management_App.validateCargoCode("PET-ab"));
        assertFalse(Train_Consist_Management_App.validateCargoCode("PET123"));
        assertFalse(Train_Consist_Management_App.validateCargoCode("AB-PET"));
    }

    @Test
    public void testRegex_TrainIDDigitLengthValidation() {
        assertFalse(Train_Consist_Management_App.validateTrainID("TRN-123"));
        assertFalse(Train_Consist_Management_App.validateTrainID("TRN-12345"));
    }

    @Test
    public void testRegex_CargoCodeUppercaseValidation() {
        assertFalse(Train_Consist_Management_App.validateCargoCode("PET-aa"));
        assertFalse(Train_Consist_Management_App.validateCargoCode("PET-Ab"));
    }

    @Test
    public void testRegex_EmptyInputHandling() {
        assertFalse(Train_Consist_Management_App.validateTrainID(""));
        assertFalse(Train_Consist_Management_App.validateCargoCode(""));
    }

    @Test
    public void testRegex_ExactPatternMatch() {
        assertFalse(Train_Consist_Management_App.validateTrainID("TRN-1234XYZ"));
        assertFalse(Train_Consist_Management_App.validateCargoCode("PET-AB12"));
    }
}