package b.lambda.square;

@FunctionalInterface
public interface Square {

	int getArea(int x);

	default int getMinX() {
		return 0;
	}

}
