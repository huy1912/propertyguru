propertyguru = {};
propertyguru.Assignment = function() {};

propertyguru.Assignment.prototype.assignment1 = function(arrays) {
	if (arrays == null || !(arrays instanceof Array)) {
		return "";
	}
	var builder = "";
	for (var i = 0; i < arrays.length; i++) {
		value = arrays[i];
		if (isNaN(value) || value < 0) {
			return "";
		}
		if (value % 3 == 0 && value % 5 == 0) {
			builder += "FizzBuzz";
		}
		else if (value % 3 == 0) {
			builder += "Fizz";
		}
		else if (value % 5 == 0) {
			builder += "Buzz";
		}
		else {
			builder += value;
		}
		builder += " ";
	}
	return builder.trim();
};

propertyguru.Assignment.prototype.assignment2 = function(arrays) {	
	if (arrays == null || !(arrays instanceof Array)) {
		return "";
	}
	
	var builder = "";
	var foundFizz = false;
	var foundBuzz = false;
	for (var i = 0; i < arrays.length; i++) {
		value = arrays[i];
		if (isNaN(value) || value < 0) {
			return "";
		}
		if (value % 3 == 0 && value % 5 == 0) {
			builder += "FizzBuzz";
			foundFizz = false;
			foundBuzz = false;
		}
		else if (value % 3 == 0) {
			builder += "Fizz";
			foundFizz = true;
		}
		else if (value % 5 == 0) {
			builder += "Buzz";
			foundBuzz = true;
		}
		else {
			if (foundFizz && foundBuzz) {
				builder += "Bazz";
			}
			else {
				builder += value;
			}
			foundFizz = false;
			foundBuzz = false;
		}
		builder += " ";
	}
	return builder.trim();
};