# Integrated IT Project: SIT Announcement System
**Web application development of the announcement system.**<br>
> Front-end
+ Developed by Vue.js CompositionAPI and TailwindCSS.
> Back-end
+ Developed by Java Spring boot.
<br><br>
**_Feature จะมี 2 รูปแบบ เป็นฝั่งของ Admin และ User_**
> Admin Features
1. **Announcement List** → Admin จะเห็น รายละเอียดเบื้องต้นของ การประกาศ เช่น หัวข้อการประกาศ, ประเภทของการประกาศ, วันเวลา เปิด-ปิดของเวลาประกาศ (ถูกconvert ตาม Timezone บน browser), ประกาศนี้จะแสดงให้ user เห็นหรือไม่ และจำนวนครั้งที่มีการเข้าดูการประกาศนั้น ๆ จาก User 
<br>

![image](https://github.com/ImJemsz/IntegratedProject-SAS/assets/145842063/dc0d35e1-a25d-4a08-9ff1-90da0268aa14)

1.2 **Add Announcement** → Admin สามารถเพิ่ม การประกาศได้ ด้วยการกดปุ่ม Add Announcement
<br>

![image](https://github.com/ImJemsz/IntegratedProject-SAS/assets/145842063/1041613f-4a6a-4cd9-bd51-0c58fe655bd6)
 
→ และจะเข้ามาในหน้าของการกรอกรายละเอียด ต่าง ๆ ของการประกาศ กด Submit เพื่อ บันทึกการประกาศ Cancel เพื่อยกเลิกการเพิ่มการประกาศ
<br>

![image](https://github.com/ImJemsz/IntegratedProject-SAS/assets/145842063/a6105468-9aac-44d9-9f9a-2d6f2da1eb2a)

3. **View Announcement** → คือการเข้าดูรายละเอียด ของการประกาศ
<br>

![image](https://github.com/ImJemsz/IntegratedProject-SAS/assets/145842063/7c5aade8-5ae3-4d60-b43a-7f51f04896d8)
![image](https://github.com/ImJemsz/IntegratedProject-SAS/assets/145842063/fddff48f-28f0-4d90-aef2-97de443217d1)


→ สามารถกด Edit เพื่อแก้ไขการประกาศได้
<br>

![image](https://github.com/ImJemsz/IntegratedProject-SAS/assets/145842063/64f45c60-e249-4814-b2ad-40a4f603085b)

4. **Delete Announcement** → ทำการลบการประกาศ ก่อนการลบจะมีแจ้งเตือนขึ้นมา เพื่อให้ทำการ confirm การลบ
<br>

![image](https://github.com/ImJemsz/IntegratedProject-SAS/assets/145842063/02e31266-4d89-4645-91ed-4d180865a5ed)

5. **Timezone** → เมื่อเปลี่ยน timezone บน browser ตัวประกาศก็จะทำการเปลี่ยนวันเวลา ให้ตรงตามวันเวลาของ local timezone นั้น ๆ
<br>

![image](https://github.com/ImJemsz/IntegratedProject-SAS/assets/145842063/0533885f-59a6-4011-b588-06934e421952)
 
6. **User List** → ที่ nav bar ด้านข้างสามารถกดเปลี่ยนดู User List ได้ ซึ่งหน้านี้จะแสดง Username, Name, Eamil, Role, CreatedOn(วันเวลาที่สร้าง), UpdatedOn(วันเวลาที่มีการแก้ไขข้อมูล user นี้ล่าสุด)
<br>

![image](https://github.com/ImJemsz/IntegratedProject-SAS/assets/145842063/f77d350b-6eeb-4154-aeae-31ac6922bc30)

7. **Add User** → เพิ่มข้อมูล user เข้าไปได้
<br>

![image](https://github.com/ImJemsz/IntegratedProject-SAS/assets/145842063/42ea366b-e7be-491b-8656-5e8129d41426)

โดยใน feature นี้จะมีการตรวจสอบอยู่หลายส่วน ได้แก่
→ ตรวจสอบให้แน่ใจว่า user ใส่ข้อมูลครบ 
<br>

![image](https://github.com/ImJemsz/IntegratedProject-SAS/assets/145842063/0b44835d-b359-462c-a161-0da02c6d9d35)

→ ตรวจสอบว่า มีส่วนไหนที่กรอกไปซ้ำกับในฐานข้อมูลเดิมไหม โดยจะตรวจสอบอยู่ด้วยกัน 3 ส่วนคือ Username, Name, Email
<br>

![image](https://github.com/ImJemsz/IntegratedProject-SAS/assets/145842063/85a0f269-55da-4f4b-b844-0de578788c4e)

→ ตรวจสอบ pattern ของรหัสเพื่อเพิ่มความ strong ของรหัส และตรวจสอบ confirm password เพื่อเป็นการให้ user ตรวจสอบ password ที่ตนนั้นได้กรอก
<br>

![image](https://github.com/ImJemsz/IntegratedProject-SAS/assets/145842063/a2b3594b-acd8-4706-b385-a7939fd7d807)

→ ตรวจสอบรุปแบบของ email เพื่อความถูกต้องของ email ที่ใช้ติดต่อกับ user และเลือก role ระหว่าง Admin คือผู้ดูแลระบบ กับ Announcer คือคนที่เขียนการประกาศ
<br>

![image](https://github.com/ImJemsz/IntegratedProject-SAS/assets/145842063/a1107d62-3130-4bf5-b336-fabe4609e40a)

→ กด Save เพื่อบันทึกข้อมูลและให้ระบบตรวจสอบข้อมูล หรือจะกด Cancel เพื่อยกเลิกการเพิ่ม user <br>
→ **Feature นี้จะเป็นตัวช่วยเตือน ให้ทำการตรวจสอบข้อมูลให้ถูกต้องก่อนเพิ่มข้อมูลเข้าไปใน ฐานข้อมูล**

8. **Edit User** → เป็นการแก้ไข ข้อมูลของ user หากการแก้ไขเกิดไปซ้ำกับข้อมูลที่อยู่ในฐานข้อมูลก็จะแจ้งเตือนออก และต้องแก้ฉะนั้นจะไม่สามารถบันทึกการแก้ไขได้ หรือสามารถกด Cancel เพื่อยกเลิกการแก้ไขก็ได้เช่นกัน
<br>

![image](https://github.com/ImJemsz/IntegratedProject-SAS/assets/145842063/bebdca44-8c3b-41c8-af67-3a407800724e)

![image](https://github.com/ImJemsz/IntegratedProject-SAS/assets/145842063/0864f04a-426c-46c6-928b-d85d6bb89a59)

9. **Delete User** → กดเพื่อทำการลบ User ก็จะมีการขึ้นมา confirm เพื่อยืนยันการลบก่อนเหมือนกันกับ การลบ Announcement
<br>

![image](https://github.com/ImJemsz/IntegratedProject-SAS/assets/145842063/7813d12a-759e-4ef8-8880-3697b16c0cf4)

10. **Match Password** → เป็นการทดลองการ Login ของ User ซึ่งจะตรวจสอบทั้ง Username และ Password ว่าถูกต้องหรือไม่
<br>

![image](https://github.com/ImJemsz/IntegratedProject-SAS/assets/145842063/ae615300-04d7-4e95-b29a-9173d83c7b4d)
![image](https://github.com/ImJemsz/IntegratedProject-SAS/assets/145842063/2b95e95a-6809-42d6-aa94-2644a64b0ae1)
![image](https://github.com/ImJemsz/IntegratedProject-SAS/assets/145842063/1083e631-b1e2-4144-ace7-67c84507de0d)


> Client Features
1. **Active Announcements** → แสดง การประกาศ ที่ยังไม่หมดเวลาประกาศ และมีการเปิดแสดงให้ client เห็นจาก admin
<br>

![image](https://github.com/ImJemsz/IntegratedProject-SAS/assets/145842063/6b8a6d0e-8194-48ed-9e40-844716f583d9)

2. **Close Announcement** → แสดงการประกาศที่ปิดไปแล้ว เนื่องจากเลยวันกำหนด
<br>

![image](https://github.com/ImJemsz/IntegratedProject-SAS/assets/145842063/36b63557-c032-432b-819e-23f48d5e7850)



