import unittest

def can_drive(age):
    """
    Determines if a person can drive based on their age.
    """
    driving_age = 16
    return age >= driving_age

class CanDriveTest(unittest.TestCase):

    def test_method1(self):
        # Test for age below the driving age
        self.assertEqual(can_drive(15), False, "15 yrs old cannot drive")

    def test_method2(self):
        # Test for age exactly at the driving age
        self.assertEqual(can_drive(16), True, "16 yrs old can drive")

    def test_method3(self):
        # Test for age above the driving age
        self.assertEqual(can_drive(18), True, "18 yrs old can drive")

    def test_method4(self):
        # Test for invalid input (negative age)
        self.assertEqual(can_drive(-1), False, "Invalid input: age cannot be negative")

    def test_method5(self):
        # Test for below driving age (zero)
        self.assertEqual(can_drive(0), False, "0 yr old cannot drive")

if __name__ == "__main__":
    unittest.main()
