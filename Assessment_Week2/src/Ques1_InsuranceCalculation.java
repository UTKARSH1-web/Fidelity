import java.util.Scanner;


    class Insurance {
        private String insuranceNumber;
        private String insuranceName;
        private double amountCovered;

        public String getInsuranceNumber() {
            return insuranceNumber;
        }

        public void setInsuranceNumber(String insuranceNumber) {
            this.insuranceNumber = insuranceNumber;
        }

        public String getInsuranceName() {
            return insuranceName;
        }

        public void setInsuranceName(String insuranceName) {
            this.insuranceName = insuranceName;
        }

        public double getAmountCovered() {
            return amountCovered;
        }

        public void setAmountCovered(double amountCovered) {
            this.amountCovered = amountCovered;
        }
    }

    class MotorInsurance extends Insurance {
        private double idv;
        private float depPercent;

        public double getIdv() {
            return idv;
        }

        public void setIdv(double idv) {
            this.idv = idv;
        }

        public float getDepPercent() {
            return depPercent;
        }

        public void setDepPercent(float depPercent) {
            this.depPercent = depPercent;
        }

        public double calculatePrem() {
            idv = getAmountCovered() - ((getAmountCovered() * depPercent) / 100);
            return (idv * 3) / 100;
        }
    }

    class LifeInsurance extends Insurance {
        private int policyTerm;
        private float benefitPer;

        public int getPolicyTerm() {
            return policyTerm;
        }

        public void setPolicyTerm(int policyTerm) {
            this.policyTerm = policyTerm;
        }

        public float getBenefitPer() {
            return benefitPer;
        }

        public void setBenefitPer(float benefitPer) {
            this.benefitPer = benefitPer;
        }

        public double calculatePrem() {
            return (getAmountCovered() - ((getAmountCovered() * benefitPer) / 100)) / policyTerm;
        }


    public class Ques1_InsuranceCalculation {
        public static void addPolicy(Insurance ins, int opt) {
            double prem = 0;
            if (opt == 1) {
                LifeInsurance lifeIns = (LifeInsurance) ins;
                prem = lifeIns.calculatePrem();
            } else if (opt == 2) {
                MotorInsurance motor = (MotorInsurance) ins;
                prem = motor.calculatePrem();
            }
            System.out.println("Calculate Prem: " + prem);
        }
    }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Insurance Number:");
            String insuranceNumber = sc.nextLine();

            System.out.println("Insurance Name:");
            String insuranceName = sc.nextLine();

            System.out.println("Insurance Amount:");
            double amountCovered = sc.nextDouble();

            System.out.println("Select");
            System.out.println("1. Life Insurance");
            System.out.println("2. Motor Insurance");
            int opt = sc.nextInt();

            if (opt == 1) {
                System.out.println("Policy Term:");
                int policyTerm = sc.nextInt();
                System.out.println("Benefit Percent:");
                float benefitPer = sc.nextFloat();

                LifeInsurance lifeIns = new LifeInsurance();
                lifeIns.setInsuranceNumber(insuranceNumber);
                lifeIns.setInsuranceName(insuranceName);
                lifeIns.setAmountCovered(amountCovered);
                lifeIns.setPolicyTerm(policyTerm);
                lifeIns.setBenefitPer(benefitPer);

                Ques1_InsuranceCalculation.addPolicy(lifeIns,1);

            }
            else if (opt == 2) {
                System.out.println("Depreciation Percent:");
                float depPercent = sc.nextFloat();
                MotorInsurance motorIns = new MotorInsurance();
                motorIns.setInsuranceNumber(insuranceNumber);
                motorIns.setInsuranceName(insuranceName);
                motorIns.setAmountCovered(amountCovered);
                motorIns.setDepPercent(depPercent);

                Ques1_InsuranceCalculation.addPolicy(motorIns,2);
            }
            sc.close();
        }
    }
