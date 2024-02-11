"""
This file illustrates how compound data is represented in python
"""

class Person:
    def __init__(self, firstName, lastName, yearOfBirth):
        self.firstName = firstName
        self.lastName = lastName
        self.yearOfBirth = yearOfBirth

    def getFirstName(self):
        return self.firstName
    
    def getFullName(self):
        return self.firstName + ' ' + self.lastName
    
    def getAge(self):
        return 2023 - self.yearOfBirth

import unittest

class PersonTest(unittest.TestCase):
    def setUp(self):
        self.john = Person('John', 'Smith', 1995)
        self.sally = Person('Sally', 'Ride', 1951)

    def testAge(self):
        self.assertEqual(28, self.john.getAge())
        self.assertEqual(72, self.sally.getAge())

if __name__ == '__main__':
    unittest.main()