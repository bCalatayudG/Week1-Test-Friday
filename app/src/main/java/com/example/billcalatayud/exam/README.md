# Test

# Week 1 - Test/Friday

## Encoding problem

### Encoding
#### How to test it
On the Exam.java you can test the encoding, just by changing the parameter on the line 8

``` java
encoding.f("Errors in strategy cannot be correct through tactical maneuvers");
```

### Character counting
#### How to test it
On the Exam.java you can test the encoding, just by changing the parameter on the line 9

``` java
encoding.g("Hello there! Apple!");
```

#### Results:

![alt text][Encoding]


## Jungle problem

The Jungle problem generate randomly, as random as java allows it, animal. Then makes them all make a sound, one after another. And finally makes them do randoms actions; when it makes them eat gives them random food, just for testing the functionality of the program

#### How to test it
On the Exam.java you can test the jungle, just by creating an object, and use it's methods
```
System.out.println("\n\n\t*** Jungle problem ***\n\n");
Jungle jungle = new Jungle();
System.out.println("\n--- Jungle soundOf --- \n");
jungle.makeSoundOf();
System.out.println("\n--- Jungle soundOf finished --- \n");
System.out.println("\n--- Random activities ---\n");
jungle.activities();
```

The ``` Jungle jungle = new Jungle(); ``` creates the object "jungle".
The ``` jungle.makeSoundOf(); ``` uses said object, and the method "makeSoundOf" in order to make every animal make a sound. 
The ``` jungle.activities();  ``` makes all the animals, previously created by the Jungle() constructor, make a sound. 

![alt text][jp1]
![alt text][jp2]
![alt text][jp3]
![alt text][jp4]
![alt text][jp5]
![alt text][jp6]

[Encoding]: https://github.com/bCalatayudG/Week1-Test-Friday/blob/master/app/src/main/java/com/example/billcalatayud/exam/Screenshots/Encoding.png 
"Encoding"

[jp1]: https://github.com/bCalatayudG/Week1-Test-Friday/blob/master/app/src/main/java/com/example/billcalatayud/exam/Screenshots/jp1.png "jp1"

[jp2]: https://github.com/bCalatayudG/Week1-Test-Friday/blob/master/app/src/main/java/com/example/billcalatayud/exam/Screenshots/jp2.png "jp2"

[jp3]: https://github.com/bCalatayudG/Week1-Test-Friday/blob/master/app/src/main/java/com/example/billcalatayud/exam/Screenshots/jp3.png "jp3"

[jp4]: https://github.com/bCalatayudG/Week1-Test-Friday/blob/master/app/src/main/java/com/example/billcalatayud/exam/Screenshots/jp4.png "jp4"

[jp5]: https://github.com/bCalatayudG/Week1-Test-Friday/blob/master/app/src/main/java/com/example/billcalatayud/exam/Screenshots/jp5.png "jp5"

[jp6]: https://github.com/bCalatayudG/Week1-Test-Friday/blob/master/app/src/main/java/com/example/billcalatayud/exam/Screenshots/jp6.png "jp6"
