// package builder;

// public class Student {
    
//     private final String firstName ; // mandatory
//     private final String lastName  ; // mandatory
//     private final String age; // optional
//     private final String gender; // optional
//     private final boolean isGraduate; // optional
//     private final boolean hasExperience; // optional
//     private final String city; // optional
//     private final String state; // optional
//     private final boolean isEarning; // optional

//     public Student(Builder builder){
//         this.firstName = builder.firstName;
//         this.lastName = builder.lastName;
//         this.age = builder.age;
//     }
//    static class Builder{
//         private String firstName; // mandatory
//         private String lastName; // mandatory
//         private String age; // optional
//         private String gender; // optional
//         private boolean isGraduate; // optional
//         private boolean hasExperience; // optional
//         private String city; // optional
//         private String state; // optional
//         private boolean isEarning; // optional

//         private Builder(String firstName, String lastName){
//            this.firstName = firstName;
//            this.lastName = lastName;

//         }

//         public Builder setAge(String age){
//             this.age = age;
//             return this;
//         }

//         public Builder setIsGraduated(boolean isGraduate){
//             this.isGraduate = isGraduate;
//             return this;
//         }

//         public Student build(){
//             return new Student(this);
//         }

//         // public Builder setGender(String gender){
//         //     this.gender = gender;
//         //     return new Builder();
//         // }

//         // public Builder setCity(String city){
//         //     this.city = city;
//         //     return new Builder();
//         // }

//         // public Builder setState(String state){
//         //     this.state = state;
//         //     return new Builder();
//         // }

//    }

//     public static void main(String args[])
//     {
//         //System.out.println(student);
//         Student student = new Student.Builder("Sandeep", "Anumalla")
//                                     .setAge("df").build();
//      }
// }
