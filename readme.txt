1. How to execute the program?
   1.1 Execute LeaveApplication System.jar file in dist folder.
   1.2 Login with following account. 
   1.2.1 if login with ID 0, you can new a staff, delete a staff and assign supervisor for staff.
   1.2.1 if login with other ID, you can apply leave and carry out leave handling (endorse or decline others application)
   1.2.3 if login with ID 0, due to title of director, you no need to apply leave.
   
   Default set account:
   Staff ID : 0
   Password : 1234
   Department: Human Resource
   
   Staff ID : 1
   Password : 1234
   Title: Director
   
   Staff ID : 2
   Password : 1234
   (General Staff)
   
   Staff ID : 3
   Password : 1234
   (General Staff)
   
   Staff ID : 4
   Password : 1234
   (General Staff)
   
   1.3 New staff
   1.3.1 enter name(String), password(String), Department(Sting), Title(Sting), then click Enter button
   
   1.4 Assign supervisor
   1.4.1 select the staff ID and select an supervisor ID for that staff.
   
   1.5 Delete staff
   1.5.1 Select a staff and click enter. the staff will be deleted.
   
   1.6 Apply leave
   1.6.1 enter StartLeaveDate(String) and EndLeaveDate(String).Those format should be YYYY/MM/DD. Y=year, M=month, D=day. Press enter to apply leave.
   1.6.2 When the leave submit to supervisor, the staff cannot apply another leave at this moment.
   1.6.3 until leave endorse or decline, the staff can acknowledge the endorsement and decline of the leave, then apply new one.
   1.6.4 director do not need to apply leave.
   
   1.7 Leave request handling
   1.7.1 As supervisor, the staff can view the leave apply from trainee.
   1.7.2 the leave application should endorse by all direct or indirect supervisor.
   1.7.3 either one supervisor decline, the applicant received the decline application message.

2. How to read source code?
   4 packages:
   Domain
   UserInterface
   UserInterface.HRuse
   UserInterface.Staff
   
   2.1 Domain
   2.1.1 Domain include 3 class: HR, LeaveApp, Staff 
   2.1.2 SYSmain.java is the Main. 
   
   2.2 UserInterface
   2.2.1 contain common UI
   2.2.2 ContentUI shows the center panel of the frame after login.
   2.2.3 FooterUI shows the bottom panel of the frame
   2.2.4 HeaderUI shows the top panel of the frame
   2.2.5 LoginWindowUI shows the first page requesting user to login 
   2.2.6 MainFrame is the main frame comprising of all the UI
   
   2.3 UserInterface.HRuse
   2.3.1 contain UI for Human resource staff use
   2.3.2 AssignSupervisorUI shows the panel of supervisor assignment
   2.3.3 DeleteStaffUi shows the panel of deleting staff
   2.3.4 NewStaffUi shows the panel of new a staff
   
   2.4 UserInterface.Staff
   2.4.1 contain UI for Director and general staff use
   2.4.2 handleLeaveUI shows the panel of handling leave request
   2.4.3 requestLeaveUI shows the panel of applying leave.
   
   
   
   