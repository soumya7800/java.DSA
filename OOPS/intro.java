package OOPS;

public class intro {
    public static void main(String[] args)
    {
        // store the 5 roll nos

        int[] rollno = new int[5];

        // store the 5 names
        String[] name = new String[5];

        // data of 5 elements: {roll no , name , marks}

        int[] rolno = new int[5];
        String[] nam = new String[5];
        float[] marks = new float[5];

        // class and object : class is a template and object is an instance of class

        // for creating own data type we use class keyword
        // class is the logical construct and object is the physical construct / reality

        // objects have 3 essential properties : state , behavior and identity

        // state : it is the data of the object
        // behavior : it is the function of the object  
        // identity : it is the unique name of the object

        // example of state : roll no , name , marks
        // example of behavior : display , input
        // example of identity : student1 , student2 , student3


        Student[] students = new Student[5];


    }

    // create a class student which has 3 data members : roll no , name , marks

    class Student
    {
        int rollno;
        String name ;
        float marks ;
// template for creating student objects

// class is a user defined data type which has data members and member functions
// instance is the physical existence of a class and it is created using the new keyword



//  object are the heap memory and class is the stack memory

// dot operator is used to access the members of the class using the object it links the refrence variable with the instance variable and member function of the class

// constructor is a special member function which is used to initialize the object and it has the same name as the class and it does not have any return type

// new keyword is used to create an object and it allocates memory for the object in the heap memory and it returns the reference of the object



    }
}
