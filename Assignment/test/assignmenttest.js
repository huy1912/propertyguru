AssignmentTest = TestCase("AssignmentTest");

AssignmentTest.prototype.setUp = function() {
	ass = new propertyguru.Assignment();
};

AssignmentTest.prototype.tearDown = function() {
	ass = null;
};

AssignmentTest.prototype.testAssignment1 = function() {
	assertEquals("Expect empty value!!!", "", ass.assignment1(null));
	assertEquals("Expect empty value!!!", "", ass.assignment1(1));
	assertEquals("Expect empty value!!!", "", ass.assignment1("1234"));
	assertEquals("Expect empty value!!!", "", ass.assignment1([12, 13, "14", 15, -16]));
	assertEquals("Expect empty value!!!", "", ass.assignment1([12, 13, 14, 15, -16]));
	assertEquals("Expect same value!!!", "Fizz 13 14 FizzBuzz 16", ass.assignment1([12, 13, 14, 15, 16]));
};

AssignmentTest.prototype.testAssignment2 = function() {
	assertEquals("Expect empty value!!!", "", ass.assignment2(null));
	assertEquals("Expect empty value!!!", "", ass.assignment2(1));
	assertEquals("Expect empty value!!!", "", ass.assignment2("1234"));
	assertEquals("Expect empty value!!!", "", ass.assignment2([12, 13, "14", 15, -16]));
	assertEquals("Expect empty value!!!", "", ass.assignment2([12, 13, 14, 15, -16]));
	assertEquals("Expect same value!!!", "4 Buzz Fizz Bazz 8 Fizz Buzz Bazz Fizz", ass.assignment2([4, 5, 6, 7, 8, 9, 10, 11, 12]));
	assertEquals("Expect same value!!!", "19 Buzz Fizz Bazz 23", ass.assignment2([19, 20, 21, 22, 23]));
};