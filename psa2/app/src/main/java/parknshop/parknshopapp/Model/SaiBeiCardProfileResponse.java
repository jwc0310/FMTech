package parknshop.parknshopapp.Model;

/**
 * Created by Kate on 2015/4/14
 */
public class SaiBeiCardProfileResponse extends CardProfileResponse {

    public SaiBeiCardProfileResponse(String body) {
        super(body);
        MALE = "M";
        FEMALE = "F";
    }

    @Override
    public int getSalary() {
        if (salary != null) {
            if (salary.equals("0")) {
                return 0;
            }
            if (salary.equals("<= 19999")) {
                return 1;
            }
            if (salary.equals("20000 - 29999")) {
                return 2;
            }
            if (salary.equals("30000 - 39999")) {
                return 3;
            }
            if (salary.equals("40000 - 49999")) {
                return 4;
            }
            if (salary.equals(">= 50000")) {
                return 5;
            }
        }
        return -1;
    }

    public String getEducationKey(int idx) {
        switch (idx) {
            case 0:
                return "Doctor";

            case 1:
                return "Master";

            case 2:
                return "Bachelor";

            case 3:
                return "College";

            case 4:
                return "High School";

            case 5:
                return "Others";

            default:
                return "";
        }
    }

    public String getMarriageKey(int idx) {
        switch (idx) {
            case 0:
                return "Single";

            case 1:
                return "Married";

            default:
                return "";
        }
    }

    public String getChildKey(int idx) {
        switch (idx) {
            case 0:
                return "0";

            case 1:
                return "1";

            case 2:
                return "2";

            case 3:
                return "3 Or Above";

            default:
                return "";
        }
    }

    public String getSalaryKey(int idx) {
        switch (idx) {
            case 0:
                return "0";

            case 1:
                return "<= 19999";

            case 2:
                return "20000 - 29999";

            case 3:
                return "30000 - 39999";

            case 4:
                return "40000 - 49999";

            case 5:
                return ">= 50000";

            default:
                return "";
        }
    }

    public String getGradeKey(int idx) {
        switch (idx) {
            case 0:
                return "Company Head/ Owner";

            case 1:
                return "High-level Management Role";

            case 2:
                return "Mid-level Management Role";

            case 3:
                return "Permanent Employee";

            case 4:
                return "Contractor/ Part-time";

            default:
                return "";
        }
    }

    public String getJobKey(int idx) {
        switch (idx) {
            case 0:
                return "Finance/ Insurance";

            case 1:
                return "Government Employee";

            case 2:
                return "Manufactory Worker/ Driver";

            case 3:
                return "General Business";

            case 4:
                return "Leisure/ Sport/ Travel Agency";

            case 5:
                return "Military/ Police/ Firefighter";

            case 6:
                return "Non-Profit Organization Staffs";

            case 7:
                return "Students";

            case 8:
                return "Freelancer/ Housewife/ Others";

            default:
                return "";
        }
    }
}
