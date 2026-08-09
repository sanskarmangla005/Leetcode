class Solution {
    public int countDigits(int num) {
        int temp = num;
        int count = 0;
        while(temp>0){
            int digit = temp % 10;  // last digit nikalo
            if(num % digit == 0){   // digit num ko divide karta hai?
                count ++;
            }
            temp = temp  / 10;    // last digit hatao

        }
        return count;
    }
}

//Har digit ko number se nikalo.
//Agar num % digit == 0 hai → count++.
//temp ko 10 se divide karke next digit par jao.
//End me count return karo.