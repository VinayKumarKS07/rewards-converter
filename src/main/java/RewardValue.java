public class RewardValue {

        private double cashValue;
        private double milesValue;

       public double getMilesValue() {
           return milesValue;
       }

        public RewardValue(double cashValue) {
            this.cashValue = cashValue;
            this.milesValue = convertToMiles(cashValue);
        }

        public RewardValue(double  milesValue , boolean ismiles){
           this.milesValue=milesValue;
           if(ismiles){
               this.cashValue=convertToCash(milesValue);
           }
        }

        public double getCashValue() {
            return cashValue;
        }




        private double convertToMiles(double cashValue) {
            return cashValue * 0.0035;
        }


        private double convertToCash(double milesValue) {
            return milesValue / 0.0035;
        }
    }


