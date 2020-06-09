package Util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Database {

    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;
    PreparedStatement pstmt = null;
    int connect = 0;

    Database() {

        try {

            //creating database
            con = Util.getConnection1();
            stmt = con.createStatement();

            stmt.execute("drop database if exists cmsdb");
            stmt.execute("create database if not exists cmsdb");
            stmt.execute("use cmsdb");

            // creating tables for LoginPkg
            stmt.execute("create table if not exists login (username VARCHAR(45) not null primary key,password VARCHAR(45)  ,usertype VARCHAR(45), active varchar(1) default 'N' ) ");
            stmt.execute("create table if not exists dateformat(dateformat varchar(60))");
            stmt.execute("create table if not exists log (id int not null primary key auto_increment, username varchar(45), date varchar(45), time varchar(45))");

            // creating tables for ManagementPkg and AdmissionModule
            stmt.execute("create table if not exists codelist(rcpno int,rollno int, emp_id int, slno int not null primary key auto_increment )");

            //need to change

            stmt.execute("create table if not exists fee_btech(fee_type varchar(100),1st_year int default 0,2nd_year int default 0,3rd_year int default 0,4th_year int default 0) ");
            stmt.execute("create table if not exists fee_btech_jcecb(fee_type varchar(100),1st_year int default 0,2nd_year int default 0,3rd_year int default 0,4th_year int default 0) ");

            //need to change

            stmt.execute("create table if not exists branch( course varchar(60) not null, branch varchar(50) not null, code varchar(5) not null)");
            stmt.execute("create table if not exists course( course varchar(60) not null primary key)");


            stmt.execute("create table if not exists pay_report( rcpno varchar(60) primary key, rollno varchar(60), enrollmentno varchar(60), formno VARCHAR(45), firstname varchar(60), middlename varchar(60), lastname varchar(60), course varchar(60), session varchar(100), semester varchar(20), address varchar(100), tutionfee double default 0, hostelfee double default 0, messfee double default 0, examfee double default 0, uniformcharge double default 0, busfare double default 0, other double default 0 ,amount varchar(60) default 0, rdate varchar(60)) ");


            stmt.execute("create table if not exists other_fee ( attribute varchar(60) not null primary key, fee_amount int default 0)");
            stmt.execute("create table if not exists cheque (rcpno varchar(60),rollno varchar(60),enrollno varchar(60), chqno varchar(60) , bankname varchar(60),date varchar(60),amount varchar(60))");
            stmt.execute("create table if not exists chequecart (rcpno varchar(60),rollno varchar(60),enrollno varchar(60), chqno varchar(60) , bankname varchar(60),date varchar(60),amount varchar(60))");
            stmt.execute("create table if not exists dd(rcpno varchar(60),rollno varchar(60),enrollno varchar(60), ddno varchar(60) , bankname varchar(60),date varchar(60),amount varchar(60))");
            stmt.execute("create table if not exists ddcart(rcpno varchar(60),rollno varchar(60),enrollno varchar(60), ddno varchar(60) , bankname varchar(60),date varchar(60),amount varchar(60))");
            stmt.execute("create table if not exists student_details (roll_number varchar(60) not null primary key,enrollment_number VARCHAR(45) ,first_name VARCHAR(45), middle_name VARCHAR(45),last_name VARCHAR(45),gender varchar(10), father_name VARCHAR(45),mother_name VARCHAR(45),dob varchar(45), bloodgroup varchar(5), nationality VARCHAR(45),marital_status VARCHAR(45),religion VARCHAR(45),course VARCHAR(45),cast varchar(45), branch VARCHAR(45),semester VARCHAR(4), session varchar(45), lib_member varchar(1) default 'N') ");
            stmt.execute("create table if not exists submitteddoc (roll_number varchar(60) not null primary key, m10 varchar(45), c10 varchar(45), m12 varchar(45), c12 varchar(45), cgrd varchar(45), other varchar(45), enrollmentno varchar(60) ) ");
            stmt.execute("create table if not exists student_image (roll_number varchar(60) not null primary key, image longblob) ");
            stmt.execute("create table if not exists educational_details (roll_number varchar(60) not null primary key, hsexamtype varchar(60), hsname varchar(60), hsboard varchar(60), hssubject varchar(60), hsgrade varchar(60), hspassingyear varchar(5), iexamtype varchar(60), iname varchar(60), iboard varchar(60), isubject varchar(60), igrade varchar(60), ipassingyear varchar(5), ugexamtype varchar(60), ugname varchar(60), ugboard varchar(60), ugsubject varchar(60), uggrade varchar(60), ugpassingyear varchar(5), pgexamtype varchar(60), pgname varchar(60), pgboard varchar(60), pgsubject varchar(60), pggrade varchar(60), pgpassingyear varchar(5), oexamtype varchar(60), oname varchar(60), oboard varchar(60), osubject varchar(60), ograde varchar(60), opassingyear varchar(5), enrollment_number varchar(60))");
            stmt.execute("create table if not exists fee_details (roll_number varchar(60) not null primary key, admode varchar(60), hfc varchar(60) default 0, tfc varchar(60) default 0, mfc varchar(60) default 0, efc varchar(60) default 0, ufc varchar(60) default 0, bfc varchar(60) default 0, ofc varchar(60) default 0, thf varchar(60) default 0, ttf varchar(60) default 0, tmf varchar(60) default 0, tef varchar(60) default 0, tuf varchar(60) default 0, tbf varchar(60) default 0, tof varchar(60) default 0, total varchar(60) default 0, enrollmentno varchar(60))");
            stmt.execute("create table if not exists student_address (roll_number varchar(60) not null primary key, padd varchar(100),  pcity varchar(60), pstate varchar(60), pcountry varchar(60), ppin varchar(60), cadd varchar(100), ccity varchar(60), cstate varchar(60), ccountry varchar(60), cpin varchar(60), mobileno varchar(60), pmail varchar(60), phoneno varchar(60), smail varchar(60), enrollmentno varchar(60))");
            stmt.execute("create table if not exists reciept_checker( rcpno varchar(60), rollno varchar(60), enrollmentno varchar(60), firstname varchar(60), middlename varchar(60), lastname varchar(60), course varchar(60), session varchar(100), semester varchar(20), address varchar(100), tutionfee double default 0, hostelfee double default 0, messfee double default 0, examfee double default 0, uniformcharge double default 0, busfare double default 0, other double default 0,amount varchar(60) default 0, rdate varchar(60)) ");
            stmt.execute("create table if not exists due(roll_number varchar(60) primary key, enrollment_number varchar(45), tdue varchar(60) default 0, hdue varchar(60) default 0, edue varchar(60) default 0, mdue varchar(60) default 0, bdue varchar(60) default 0, udue varchar(60) default 0, odue varchar(60) default 0, totaldue varchar(60) default 0)");

            //create tables for libraryPkg
            stmt.execute("create table if not exists bookmaster (book_id int not null Primary Key auto_increment, title varchar(45), author varchar(45), place varchar(45), publisher varchar(45), edition varchar(45), publication_year varchar(45), category varchar(45), price varchar(45), volume varchar(45), billno varchar(45), billdate varchar(45), isbnno varchar(45), keyword varchar(45), status varchar(45) default 'Available', reason varchar(500), mem_id int  ) ");
            stmt.execute("create table if not exists bookcategory (category varchar(45) primary key ) ");
            stmt.execute("create table if not exists membermaster (mem_id int not null Primary Key auto_increment, mem_name varchar(45), mem_address varchar(100), mem_email_id varchar(45), mem_mobile_no varchar(45), mem_active varchar(1), mem_type varchar(45) ) ");
            stmt.execute("create table if not exists transaction (trn_id int(10) not null Primary Key auto_increment, trn_mem_id int(10) NOT NULL, trn_book_id int(10) not null, trn_issue_dt varchar(45) not null, trn_receive_dt varchar(45) default NULL, Chk_Rcv boolean not null default false) ");
            stmt.execute("create table if not exists memberrules (rule_id int NOT NULL primary key auto_increment , mem_type varchar(45), fine_amount varchar(45) default 0, fine_time varchar(45), max_book varchar(45) default 0, max_issue_day varchar(45) default 0, mem_expirydate varchar(45), mem_id int unique ) ");
            stmt.execute("create table if not exists transaction_cart (trn_id int(10) not null Primary Key auto_increment, trn_mem_id int(10) NOT NULL, trn_book_id int(10) unique not null, trn_issue_dt varchar(45) not null, trn_receive_dt varchar(45) default NULL, status varchar(45) default 'Issuing', Chk_Rcv boolean not null default false) ");
            stmt.execute("create table if not exists lib_account (lib_acc_id int not null primary key auto_increment, trn_mem_id int, trn_book_id int, fine varchar(45) default 0, fine_paid_dt varchar(45), paid_amount varchar(45) default 0, book_rtn_days int, due varchar(45) default 0 ) ");

            //create tables for hrmanagement
            stmt.execute("create table if not exists shift_Setting (shift_id int not null primary key auto_increment, shifting_time varchar(60), start_time varchar(60), end_time varchar(60), shifting_charge varchar(60) )");
            stmt.execute("create table if not exists holiday_Setting (id int not null primary key auto_increment, start_date date, end_date date, description varchar(200) )");
            stmt.execute("create table if not exists weekly_holiday_setting (id int not null primary key, sun_holiday varchar(1), mon_holiday varchar(1), tue_holiday varchar(1), wed_holiday varchar(1), thu_holiday varchar(1), fri_holiday varchar(1), sat_holiday varchar(1) )");
            stmt.execute("create table if not exists holiday_temp_setting (id int not null primary key auto_increment, start_date date, end_date date, description varchar(200) )");
            stmt.execute("create table if not exists leave_Setting (leave_id int not null primary key auto_increment, month varchar(60), cl varchar(60) default 0, pl varchar(60) default 0, sl varchar(60) default 0, el varchar(60) default 0, other varchar(60) default 0, marital varchar(60) default 0, maternity varchar(60) default 0 )");
            stmt.execute("create table if not exists attendance_status (status_type varchar(45) primary key, status_code varchar(60), status_color varchar(60) )");
            stmt.execute("create table if not exists facility_Setting (parameter_type varchar(60) primary key, max_time varchar(60), rate varchar(60) )");
            stmt.execute("create table if not exists deduction_Details (attribute varchar(60) not null primary key, time_hrs varchar(20), time_min varchar(20), set_day varchar(60), max_day varchar(60) )");
            stmt.execute("create table if not exists allowance_setting (attribute varchar(60) primary key, rate varchar(60))");
            stmt.execute("create table if not exists tax_Setting (tax_name varchar(60) not null primary key, rate varchar(60) )");
            stmt.execute("create table if not exists payroll_Frequencies (pay_period varchar(60) primary key, period_time_1 varchar(45), period_time_2 varchar(45), period_time_3 varchar(45), period_time_4 varchar(45) )");
            stmt.execute("create table if not exists payslip_Setting (id varchar(1) primary key, payslip_number varchar(60) )");
            stmt.execute("create table if not exists employee_details (id int not null  primary key auto_increment, emp_id varchar(60) not null unique, title varchar(60), first_name varchar(60), last_name varchar(60), dob varchar(60), gender varchar(7), desg_id int, dept_id int, joining_date varchar(60), status varchar(60), retirement_date varchar(60), lib_mem varchar(1) default 'N' )");
            stmt.execute("create table if not exists employee_address (id int not null  primary key auto_increment, emp_id varchar(60) not null unique, address varchar(200), city varchar(60), state varchar(60), country varchar(60), zip_code varchar(60), landline varchar(60), mobile varchar(60), email_id varchar(60) )");
            stmt.execute("create table if not exists official_details (id int not null  primary key auto_increment, emp_id varchar(60) not null unique, room_number varchar(60), phone_number varchar(60), extension_number varchar(60), fax_number varchar(60), reporting_to varchar(60), branch varchar(60), office_address varchar(200) )");
            stmt.execute("create table if not exists emp_image (id int not null  primary key auto_increment, emp_id varchar(60) not null unique, image longblob )");
            stmt.execute("create table if not exists emp_pay_period (id int not null  primary key auto_increment, emp_id varchar(60) not null unique, period varchar(60), amount varchar(60) )");
//            
//            stmt.execute("create table if not exists att_status (id int not null primary key auto_increment, att_date date, intime varchar(60), outtime varchar(60), emp_id varchar(60) )");
//            stmt.execute("create table if not exists passport_details (passport_number varchar(60) primary key, valid_upto date, identification_type varchar(60), marital_status varchar(60), nationality varchar(60), emp_id varchar(60) )");
//            stmt.execute("create table if not exists prv_employer (id int not null primary key auto_increment, company_name varchar(60), period varchar(60), designation varchar(60), emp_id varchar(60) )");
//            stmt.execute("create table if not exists emp_remarks (emp_id varchar(60) primary key, remarks varchar(500) )");
//            stmt.execute("create table if not exists emp_shift_details (id int not null primary key auto_increment, assign_shift varchar(60), apply_date date, start_date date, end_date date, emp_id varchar(60) )");
//            stmt.execute("create table if not exists emp_leave_details (id int not null primary key auto_increment, leave_type varchar(60), start_date date, end_date date, apply_date date, contact_number varchar(60), remarks varchar(500), emp_id varchar(60) )");
//            stmt.execute("create table if not exists tour_details (_tour_id int not null primary key auto_increment, tour_type varchar(60), location varchar(60), start_date date, end_date date, emp_id varchar(60) )");
//            stmt.execute("create table if not exists tr_pay_details (id int not null primary key auto_increment, amt_by_cmp varchar(60), amt_by_client varchar(60), salary_affect varchar(60), tour_id int, emp_id varchar(60) )");
//            stmt.execute("create table if not exists training_details (tr_id int not null primary key auto_increment, course_name varchar(60), start_date date, end_date date, location varchar(60), amount varchar(60), pay_by_cmp varchar(5), salary_affect varchar(60), remarks varchar(500), emp_id varchar(60) )");
//            stmt.execute("create table if not exists expenses_details (id int not null primary key auto_increment, exp_type varchar(60), amount varchar(60), remarks varchar(500), emp_id varchar(60) )");
//            stmt.execute("create table if not exists expenses_tour_details (id int not null primary key auto_increment, expenses_type varchar(60), amount varchar(60), tour_id int, emp_id varchar(60) )");
//            stmt.execute("create table if not exists emp_payment (id int not null primary key auto_increment, old_salary varchar(60), rate varchar(60), new_salary varchar(60), apply_date date, effective_date date, emp_id varchar(60) )");
//            stmt.execute("create table if not exists payroll_details (payslip_no varchar(60) not null primary key, monthly_salary varchar(60), pay_period varchar(60), paid_days varchar(60), total_payment varchar(60), emp_id varchar(60) )");
//            stmt.execute("create table if not exists payment_addition (id int not null primary key auto_increment, ot_charge varchar(60), shift_charge varchar(60), total_allowance varchar(60), tour_amount varchar(60), training_amount varchar(60), misc_payment varchar(60), emp_id varchar(60) )");
//            stmt.execute("create table if not exists payment_deduction (id int not null primary key auto_increment, leave_days varchar(60), leave_amount varchar(60), pf_amount varchar(60), esi_amount varchar(60), tax_amount varchar(60), mess_charge varchar(60), conveyance_charge varchar(60), lc_ec_amount varchar(60), misc_deduction varchar(60), email_id varchar(60) )");
//
//            stmt.execute("create table if not exists emp_shift (shift_id int not null primary key auto_increment, shifting_time varchar(60), start_time date, end_time date, shifting_charge varchar(60), emp_id varchar(60) )");
//            stmt.execute("create table if not exists emp_holiday (id int not null primary key auto_increment, start_date date, end_date date, description varchar(200), sun_holiday varchar(1), mon_holiday varchar(1), tue_holiday varchar(1), wed_holiday varchar(1), thu_holiday varchar(1), fri_holiday varchar(1), sat_holiday varchar(1), emp_id varchar(60) )");
//            stmt.execute("create table if not exists emp_leave (leave_id int not null primary key auto_increment, month varchar(60), cl varchar(60), pl varchar(60), sl varchar(60), el varchar(60), other varchar(60), emp_id varchar(60) )");
//            stmt.execute("create table if not exists emp_overtime_Details (id int not null primary key auto_increment, max_hrs varchar(45), wages_per_hr varchar(60), emp_id varchar(60) )");
//            stmt.execute("create table if not exists facility_Setting (parameter_type varchar(60) primary key, rate varchar(60), emp_id varchar(60) )");
//            stmt.execute("create table if not exists allowance_Info (attribute varchar(60) primary key, rate varchar(60), emp_id varchar(60) )");
//            stmt.execute("create table if not exists deduction_Details (id int not null primary key auto_increment, time_hrs varchar(20), time_min varchar(20), deduction_type varchar(60), emp_id varchar(60) )");
//            stmt.execute("create table if not exists payroll_Frequencies (id int not null primary key auto_increment, pay_period varchar(10), period_time_1 varchar(45), period_time_2 varchar(45), period_time_3 varchar(45), period_time_4 varchar(45), emp_id varchar(60) )");
//

            //Inserting values
            stmt.executeUpdate("insert into  login values ('sam','sam','Admin', 'N')");
            stmt.executeUpdate("insert into dateformat values('dd-MM-yy')");
            stmt.executeUpdate("insert into codelist(rcpno, rollno, emp_id) values('100', '200', 1)");
            stmt.executeUpdate("insert into fee_btech (fee_type)values('TUITION FEE'),('DEVELOPMENT FEE'),('CAUTION MONEY'),('UNIVERSITY REGISTRATION'),('ADMISSION FORM+PROSPECTUS'),('ADMISSION+COLLEGE REGISTRATION'),('ID CARD'),('GAMES AND SPORTS'),('INTERNAL EXAM'),('LIBRARY CHARGE'),('STUDENT WELLFARE'),('MEDICAL'),('INTERNET'),('TRAINING+PLACEMENT'),('MAINTENENCE'),('ELECTRICITY+GENERATOR'),('CULTURAL ACTIVITY'),('TRANSPORTATION'),('TOTAL')");
            stmt.executeUpdate("insert into fee_btech_jcecb (fee_type)values('TUITION FEE'),('DEVELOPMENT FEE'),('CAUTION MONEY'),('UNIVERSITY REGISTRATION'),('ADMISSION FORM+PROSPECTUS'),('ADMISSION+COLLEGE REGISTRATION'),('ID CARD'),('GAMES AND SPORTS'),('INTERNAL EXAM'),('LIBRARY CHARGE'),('STUDENT WELLFARE'),('MEDICAL'),('INTERNET'),('TRAINING+PLACEMENT'),('MAINTENENCE'),('ELECTRICITY+GENERATOR'),('CULTURAL ACTIVITY'),('TRANSPORTATION'),('TOTAL')");
            stmt.executeUpdate("insert into other_fee(attribute) values ('Hostel Fee')");
            stmt.executeUpdate("insert into other_fee(attribute) values ('Exam Fee')");
            stmt.executeUpdate("insert into other_fee(attribute) values ('Mess Fee')");
            stmt.executeUpdate("insert into other_fee(attribute) values ('Bus Charge')");
            stmt.executeUpdate("insert into other_fee(attribute) values ('Uniform Charge')");
            stmt.executeUpdate("insert into other_fee(attribute) values ('Other Charge')");
            stmt.executeUpdate("insert into bookcategory(category) values ('Magzine')");
            stmt.executeUpdate("insert into course values ('B.Tech')");
            stmt.executeUpdate("insert into course values ('Polytechnic')");

            stmt.executeUpdate("insert into branch values ('B.Tech','Electronics & Communication', 'EC')");
            stmt.executeUpdate("insert into branch values ('B.Tech','Electrical & Electronics', 'EE')");
            stmt.executeUpdate("insert into branch values ('B.Tech','Mechanical Engg.', 'ME')");
            stmt.executeUpdate("insert into branch values ('B.Tech','Computer Science', 'CS')");
            stmt.executeUpdate("insert into branch values ('B.Tech','Civil Engg.', 'CE')");

            stmt.executeUpdate("insert into shift_setting(shifting_time) values ('General')");
            stmt.executeUpdate("insert into shift_setting(shifting_time) values ('Morning')");
            stmt.executeUpdate("insert into shift_setting(shifting_time) values ('Day')");
            stmt.executeUpdate("insert into shift_setting(shifting_time) values ('Afternoon')");
            stmt.executeUpdate("insert into shift_setting(shifting_time) values ('Evening')");
            stmt.executeUpdate("insert into shift_setting(shifting_time) values ('Night')");

            stmt.executeUpdate("insert into weekly_holiday_setting values (1, 'Y','N','N','N','N','N','N')");
            stmt.executeUpdate("insert into leave_Setting(month) values ('General'),('Jan'),('Feb'),('Mar'),('Apr'),('May'),('Jun'),('Jul'),('Aug'),('Sep'),('Oct'),('Nov'),('Dec')");
            stmt.executeUpdate("insert into attendance_status (status_type) values ('Present'),('Half Day'),('Tour'),('Leave'),('Absent'),('Training'),('Holiday'),('Late Coming'),('Weekly Holiday') ");
            stmt.executeUpdate("insert into facility_Setting (parameter_type) values ('OT'),('PF'),('Mess'),('ESI'),('Conveyance')");
            stmt.executeUpdate("insert into deduction_Details (attribute) values ('HD'),('LCEL')");
            stmt.executeUpdate("insert into allowance_setting (attribute) values ('DA'),('Bonus'),('Accommodation'),('Medical'),('Traveling'),('Other')");
            stmt.executeUpdate("insert into payroll_Frequencies (pay_period) values ('Weekly'),('Semi-Monthly'),('Monthly'),('Quarterly'),('Semi-Annualy'),('Annualy'),('Daily')");
            stmt.executeUpdate("insert into payslip_Setting (id) values ('1')");
            System.out.println("Database updation successful.....");
        } catch (Exception e) {
            connect = 1;
            System.out.println("Database creation error :-" + e.toString());
            e.printStackTrace();
        } finally {
        }

    }

    public static void main(String[] args) {
        Database db = new Database();


    }
}
