
class Challenge {

  public static String sayHello(String name) {
    // You can print to STDOUT for debugging if you need to:
    System.out.print(name);

    // but you need to return the correct value in order to pass the challenge
    return "Hello, " + name + '!';
  }
}

/*

https://awwapp.com/b/ufirie9oumr7w/


public Double pointToTrees(List<Double> angles, Double aperture) {
	Double maxAngle = angles.get(0);
	Integer maxAmountOfTrees = 0;
	angles.forEach(
		a -> {
			Integer amountOfTrees = findTrees(a, a + aperture, angles);
			if ( amountOfTrees > maxAmountOfTrees){
				maxAmountOfTrees = amountOfTrees;
				maxAngle = a;
			}
}
	)
	return maxAngle;
}

350, 380
359

private Integer findTrees(Double lowerBound, Double upperBound, List<Double> angles) {


	return angles.stream().filter(a ->
(a >= lowerBound && a <= upperBound) //350 - 20
||
( upperBound> 360 && a >= 0 && a <=  upperBound % 360)
  ).count;
}

on a binary search tree we could find the node on the lower bound (log n) and then traverse through the tree
till the upper bound
and also start from 0 and go to the module


 */