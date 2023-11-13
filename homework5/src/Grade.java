public class Grade {
    double grade;
    public Grade(double grade){this.grade=grade;}

    public String getAlphabeticGrade(){
        if (this.grade == 4.0){
            return "The Alphabetic value of " + this.grade + " is either a A or A+";
        }
        else{
            if ((this.grade<4.0) && (this.grade>=3.7)){
                return "The Alphabetic value of " + this.grade + " is a A-";
            }
            else{
                if (this.grade >=3.4){
                    return "The Alphabetic value of " + this.grade + " is a B+";
                }
                else{
                    if (this.grade>=3.1){
                        return "The Alphabetic value of " + this.grade + " is a B";
                    }
                    else{
                        if (this.grade>=2.8){
                            return "The Alphabetic value of " + this.grade + " is a B-";
                        }
                        else{
                            if (this.grade>=2.5){
                                return "The Alphabetic value of " + this.grade + " is a C+";
                            }
                            else{
                                if (this.grade>=2.2){
                                    return "The Alphabetic value of " + this.grade + " is a C";
                                }
                                else{
                                    if (this.grade>=1.9){
                                        return "The Alphabetic value of " + this.grade + " is a C-";
                                    }
                                    else{
                                        if (this.grade>=1.6){
                                            return "The Alphabetic value of " + this.grade + " is a D+";
                                        }
                                        else{
                                            if (this.grade>=1.3){
                                                return "The Alphabetic value of " + this.grade + " is a D";
                                            }
                                            else{
                                                if (this.grade>=1.0){
                                                    return "The Alphabetic value of " + this.grade + " is a D-";
                                                }
                                                else{
                                                    return "The Alphabetic value of " + this.grade + " is an F";
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
