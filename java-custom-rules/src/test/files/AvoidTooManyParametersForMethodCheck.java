class AvoidTooManyParametersForMethodCheck {
	public void methodTest(int input1, int input2, int input3, int input4, int input5, int input6) { // Noncompliant {{Too many params}}
		System.out.println(input1 + input2 + input3 + input4 + input5 + input6);
	}

	public void methodTest(int input1, int input2, int input3) {// compliant
		System.out.println(input1 + input2 + input3);
	}
}
