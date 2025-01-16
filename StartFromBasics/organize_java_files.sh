#!/bin/bash

# Create necessary directories
mkdir -p "Objectclasses, Nested Classes and Interfaces" \
         "Error Handling and Exception Handling" \
         "Annotations and Functional Interfaces" \
         "Variables" \
         "Strings" \
         "Basic Weather Project" \
         "Runnable and Throwable" \
         "Hashmaps and Sorting" \
         "This and Super"

# Function to move files if they exist
move_file() {
    if [ -e "$1" ]; then
        mv "$1" "$2"
        echo "Moved $1 to $2"
    else
        echo "File $1 does not exist, skipping..."
    fi
}

# Move files to the corresponding directories
move_file "AbstractClass.java" "Objectclasses, Nested Classes and Interfaces/"
move_file "ObjectClass.java" "Objectclasses, Nested Classes and Interfaces/"
move_file "ErrorsEg.java" "Error Handling and Exception Handling/"
move_file "FunctionalInterfaceEg.java" "Annotations and Functional Interfaces/"
move_file "Hello.java" "Variables/"
move_file "Mutabless.java" "Strings/"
move_file "RandomArray.java" "Basic Weather Project/"
move_file "ReadingIp.java" "Error Handling and Exception Handling/"
move_file "RunnableNThrowable.java" "Runnable and Throwable/"
move_file "Sorting.java" "Hashmaps and Sorting/"
move_file "SortingStrings.java" "Hashmaps and Sorting/"
move_file "SortingStudent.java" "Hashmaps and Sorting/"
move_file "Stringss.java" "Strings/"
move_file "ThisEg.java" "This and Super/"
move_file "ThisVsSuper.java" "This and Super/"
move_file "VariableClass.java" "Variables/"

echo "All files have been moved to their respective directories."
