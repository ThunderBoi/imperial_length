##Userstories:

As a user I want to type in the inch and get the according centimeters displayed
As a user I want to type in the centimeter and get the according yards displayed

##REPO URL: 
https://github.com/ThunderBoi/imperial_length.git


##Problem:
Bei local branch in intellij wurde bei inch to cent  vergessen einen lokalen feature branch zu erstellen. Dieser wurde dann nur auf den lokalen master committet und in neuen feature branch im repo gepusht. M den lokalen branch zu zeigen wurde das Prozedere dann mit der Funktion yard to meter gemacht. (lokaler feature branch von master  	)
service wurde intital nicht eingebunden deshalb wurde dieser erst später nachgebracht. Hat jedoch funktioniert. DIe Tetsts haben auch funtioniert.


##USAGE:
To use this program execute the jar file / use the project and run it and type in:

Localhost:8080

To calculate the inch to centimeter:
Localhost:8080/calculate/centimeter/(value)

To calculate the yards to meters:
Localhost:8080/calculate/meter/(value)

