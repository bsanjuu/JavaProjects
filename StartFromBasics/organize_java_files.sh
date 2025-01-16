#!/bin/bash

# Create directories based on the topics
mkdir -p "Basic Java Concepts" "Control Flow" "Loops" "Classes and Objects" \
         "Arrays" "Strings" "Static Members" "Object-Oriented Programming (OOP) Concepts" \
         "Inheritance" "Packages and Access Modifiers" "Polymorphism" "Inner Classes" \
         "Interfaces" "Enum and Annotations" "Exception Handling" "Multithreading" "Collections"

# Function to move files if they exist
move_file() {
    if [ -e "$1" ]; then
        mv "$1" "$2"
    else
        echo "File $1 does not exist, skipping..."
    fi
}

# Move files to corresponding folders
move_file "TypeConv.java" "Basic Java Concepts/"
move_file "Literal.java" "Basic Java Concepts/"
move_file "AssignmentOperators.java" "Basic Java Concepts/"
move_file "RelationalOperators.java" "Basic Java Concepts/"
move_file "LogicalOperators.java" "Basic Java Concepts/"
move_file "IfelseEg.java" "Control Flow/"
move_file "OperatorsEg.java" "Control Flow/"
move_file "SwitchEg.java" "Control Flow/"
move_file "WhileLoop.java" "Loops/"
move_file "DoWhile.java" "Loops/"
move_file "ForLoop.java" "Loops/"
move_file "MethodsEg.java" "Classes and Objects/"
move_file "MethodOverloading.java" "Classes and Objects/"
move_file "StackAndHeap.java" "Classes and Objects/"
move_file "ClassAndObjectTheory.java" "Classes and Objects/"
move_file "Arrays.java" "Arrays/"
move_file "ArrayStudent.java" "Arrays/"
move_file "Strings.java" "Strings/"
move_file "StringBuffers.java" "Strings/"
move_file "StaticEg.java" "Static Members/"
move_file "StaticEgMethod.java" "Static Members/"
move_file "EncapsEg.java" "Object-Oriented Programming (OOP) Concepts/"
move_file "ThisAndSuper.java" "Object-Oriented Programming (OOP) Concepts/"
move_file "ConstructorEg.java" "Object-Oriented Programming (OOP) Concepts/"
move_file "InheritenceEg.java" "Inheritance/"
move_file "MultilevelInheritence.java" "Inheritance/"
move_file "PackageExample.java" "Packages and Access Modifiers/"
move_file "AccessModifiers.java" "Packages and Access Modifiers/"
move_file "Polym.java" "Polymorphism/"
move_file "DynamicMethod.java" "Polymorphism/"
move_file "FinalEg.java" "Polymorphism/"
move_file "UpCastDownCast.java" "Polymorphism/"
move_file "InnerClass.java" "Inner Classes/"
move_file "AnonymousClass.java" "Inner Classes/"
move_file "InterfaceEg.java" "Interfaces/"
move_file "InterfaceEggs.java" "Interfaces/"
move_file "EnumEg.java" "Enum and Annotations/"
move_file "EnumClassEg.java" "Enum and Annotations/"
move_file "EnumSwitchEg.java" "Enum and Annotations/"
move_file "AnnotationsEg.java" "Enum and Annotations/"
move_file "ExceptionHandling.java" "Exception Handling/"
move_file "TryCatchEg.java" "Exception Handling/"
move_file "ExceptonThrow.java" "Exception Handling/"
move_file "ThrowsExp.java" "Exception Handling/"
move_file "TryWRes.java" "Exception Handling/"
move_file "Threads.java" "Multithreading/"
move_file "ThreadPrority.java" "Multithreading/"
move_file "Race.java" "Multithreading/"
move_file "CollectionEg.java" "Collections/"
move_file "HashMapEg.java" "Collections/"

echo "Files have been organized into their respective folders."
