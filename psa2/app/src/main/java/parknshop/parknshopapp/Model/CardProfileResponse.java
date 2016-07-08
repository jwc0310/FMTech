package parknshop.parknshopapp.Model;

/**
 * Created by Kate on 2015/4/14
 */
public class CardProfileResponse extends SaibeiResponse {
    public String cardNumber;
    public String name;
    public String gender;
    public String birth; //MM/dd/yyyy
    public String education;
    public String marriage;
    public String child;
    public String job;
    public String grade;
    public String salary;
    public String mobile;
    public String phone2;
    public String phone;
    public String city;
    public String region;
    public String zipCode;
    public String streetName;
    public String streetNumber;
    public String section;
    public String alley;
    public String lane;
    public String room;
    public String floor;
    public String email;
    public boolean smsFlag;
    public boolean emailFlag;
    public boolean mailFlag;
    private String[] address;

    public CardProfileResponse(String body) {
        super(body);
    }

    @Override
    public void read() {
        super.read();

        if (bodyArray.length > 1) {
            RC = "0";
            cardNumber = bodyArray[0];
            name = bodyArray[1];
            if (bodyArray.length > 16) {
                gender = bodyArray[2];
                //Log.i("tester", "gender:" + gender);
                birth = bodyArray[3];
                education = bodyArray[4];
                marriage = bodyArray[5];
                child = bodyArray[6];
                job = bodyArray[7];
                grade = bodyArray[8];
                salary = bodyArray[9];
                mobile = bodyArray[10];
                phone2 = "";
                phone = "";
                String[] phones = bodyArray[11].split("-", -1);
                if (phones.length > 1) {
                    phone2 = phones[0];
                    phone = phones[1];
                } else if (phones.length > 0) {
                    phone = phones[0];
                }
                address = bodyArray[12].split("\\|", -1);
                city = "";
                region = "";
                zipCode = "";
                streetName = "";
                streetNumber = "";
                section = "";
                alley = "";
                lane = "";
                floor = "";
                room = "";
                if (address.length > 0) {
                    city = address[0];
                    if (address.length > 1) {
                        region = address[1];
                    }
                    if (address.length > 2) {
                        zipCode = address[2];
                    }
                    if (address.length > 5) {
                        streetName = address[5];
                    }
                    if (address.length > 6) {
                        section = address[6];
                    }
                    if (address.length > 7) {
                        alley = address[7];
                    }
                    if (address.length > 8) {
                        lane = address[8];
                    }
                    if (address.length > 9) {
                        streetNumber = address[9];
                    }
                    if (address.length > 10) {
                        floor = address[10];
                    }
                    if (address.length > 11) {
                        room = address[11];
                    }
                }
                email = bodyArray[13];
                smsFlag = bodyArray[14].equals(YES);
                emailFlag = bodyArray[15].equals(YES);
                mailFlag = bodyArray[16].equals(YES);
            }
        }
    }

    public static final String YES = "Y";
    public static final String NO = "N";

    public String MALE = "MALE";
    public String FEMALE = "FEMALE";

    public boolean isMale() {
        return getGender() != null && gender.equals("M");
    }

    public String getGender() {
        return gender;
    }

    public String getBirth() {
        return Utility.formatSaibeiDate(birth);
    }

    public boolean isMarried() {
        return marriage != null && marriage.equals("2");
    }

    public int getChild() {
        try {
            return Integer.parseInt(child);
        } catch (Exception e) {
            return -1;
        }
    }

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

    public int getJob() {
        try {
            return Integer.parseInt(job) - 1;
        } catch (Exception e) {
            return -1;
        }
    }

    public int getEducation() {
        try {
            return Integer.parseInt(education) - 1;
        } catch (Exception e) {
            return -1;
        }
    }

    public int getGrade() {
        try {
            return Integer.parseInt(grade) - 1;
        } catch (Exception e) {
            return -1;
        }
    }

    public boolean isSpecialAddress() {
        return city == null;
    }

    public String[] getAddress() {
        return address;
    }

    public String getEducationKey(int idx) {
        switch (idx) {
            case 0:
                return "DOCTOR";

            case 1:
                return "MASTER";

            case 2:
                return "BACHELOR";

            case 3:
                return "COLLEGE";

            case 4:
                return "HIGH_SCHOOL";

            case 5:
                return "OTHERS";

            default:
                return "";
        }
    }

    public String getMarriageKey(int idx) {
        switch (idx) {
            case 0:
                return "SINGLE";

            case 1:
                return "MARRIED";

            default:
                return "";
        }
    }

    public String getChildKey(int idx) {
        switch (idx) {
            case 0:
                return "ZERO";

            case 1:
                return "ONE";

            case 2:
                return "TWO";

            case 3:
                return "THREE_OR_MORE";

            default:
                return "";
        }
    }

    public String getSalaryKey(int idx) {
        switch (idx) {
            case 0:
                return "ZERO";

            case 1:
                return "20000_OR_BELOW";

            case 2:
                return "20000_TO_29999";

            case 3:
                return "30000_TO_39999";

            case 4:
                return "40000_TO_49999";

            case 5:
                return "50000_OR_ABOVE";

            default:
                return "";
        }
    }

    public String getGradeKey(int idx) {
        switch (idx) {
            case 0:
                return "OWNER";

            case 1:
                return "HIGH";

            case 2:
                return "MID";

            case 3:
                return "PERMANENT";

            case 4:
                return "PART_TIME";

            default:
                return "";
        }
    }

    public String getJobKey(int idx) {
        switch (idx) {
            case 0:
                return "FINANCE_INSURANCE";

            case 1:
                return "GOVERNMENT_EMPLOYEE";

            case 2:
                return "MANUFACTORY_WORKER";

            case 3:
                return "GENERAL_BUSINESS";

            case 4:
                return "LEISURE";

            case 5:
                return "MILITARY";

            case 6:
                return "NON_PROFIT";

            case 7:
                return "STUDENTS";

            case 8:
                return "OTHERS";

            default:
                return "";
        }
    }
}
