import pymysql
from tkinter import *
def upname(event):
      connection=pymysql.connect(
host="localhost",
       user="root",
db="experiment"
)
    cur=connection.cursor()
    r=int(ro.get())
    n=nm.get()
    s="update employee set EmpName='%s' where empno='%d'"
    args=(n,r)

    try:
        cur.execute(s%args)
        print("updated name")
    except:
        print("something went wrong")

    connection.commit()
    connection.close()

def upsal(event):

    connection=pymysql.connect(
        host="localhost",
        user="root",
        db="experiment"
        )

    cur=connection.cursor()
    r=int(ro.get())
    sal=int(sa.get())
    s="update employee set Salary='%d' where empno='%d'"
    args=(sal,r)
    try:
        cur.execute(s%args)
        print("updated salary")
    except:
        print("something went wrong")
    connection.commit()
    connection.close()

window=Tk()
window.geometry("500x500")

lbl=Label(window, text="empno")
lbl.place(x=60,y=50)
ro=Entry(window)
ro.place(x=180,y=50)
lb2=Label(window, text="EmpName")
lb2.place(x=60,y=80)
nm=Entry(window)
nm.place(x=180,y=80)

lb3=Label(window, text="Salary")
lb3.place(x=60,y=110)
sa=Entry(window)
sa.place(x=180,y=110)

btn=Button(window, text="update name")
btn.place(x=200,y=160)
btn.bind('<Button-1>',upname)

btn=Button(window, text="update salary")
btn.place(x=200,y=200)
btn.bind('<Button-1>',upsal)
