#计191戴若妍2019311217

PC机模拟程序

##实验目的

(1) 用类描述计算机中CPU的速度和硬盘的容量。要求Java应用程序有4个类，名字分别是PC、CPU、HardDisk和Test，其中Test是主类。

(2) 掌握构造方法和对象的创建

(3) 了解类与程序的基本结构

(4) 理解类的封装

##实验要求

(1) CPU类：要求getSpeed()返回speed的值，用setSpeed(int m)方法将参数m的值赋值给speed

(2) HardDisk类：要求getamount()返回amount的值，用setamount(int m)方法将参数m的值赋值给amount

(3) PC类：要求setCPU(CPU c)将参数c的值赋值给cpu,用setHardDisk(HardDisk h)方法将参数h的值赋值给HD，用show()方法显示cpu的速度和硬盘的容量

(4) Test主类：

main方法中创建CPU对象cpu，cpu 将自己的 speed 设置为2200

main方法中创建HardDisk对象disk，disk将自己的 amount 设置为200

main方法中创建PC对象pc

pc调用setCPU(CPU c)方法，调用实参是cpu

pc调用setHardDisk(HardDisk h)方法，调用实参是disk

pc调用show()方法

###附加内容：

(1) 类中定义不少于两个构造方法

(2) 每个类定义不少于2个属性，且属性的类型应该多样化

(3) 根据课堂中关于访问权限的内容，尝试定义属性的修饰符多样化，类中定义方法操作属性，避免直接通过“类对象.属性”的形式访问属性值；且定义的方法内应该有符合常理的逻辑判断

(4) 尝试把本次实验的多个类放置在不同的包中，体会修饰符private的用法

##实验方法

1.先按照基础要求，创建PC、CPU、HardDisk、Test 4个类写入代码包中来描述CPU的速度和硬盘的容量

2.每个类中使用两个构造方法来给类中变量进行初始化赋值，描述属性变量

3.用关键词this表示当前对象的变量进行赋值

4.通过if判断输入的变量是否符合范围

5.因private访问权限Test主类中使用set（）方法赋值

6.通过private把类中的速度和容量封装起来，不能在其他类中直接访问，起到保护作用

7.在输出语句中使用get（）方法将赋值过的变量输出出来

##核心方法

1.方法1：speed使用访问权限，不能直接访问，用此方法用其他变量间接替代

	public void setSpeed(int m){
		this.speed = m;
		}
	int getSpeed(){  //定义方法
		return speed ;//返回值
		}
    
2.方法2：this关键词表示当前对象的变量，分配给该对象的实例成员变量

	public void settem( int tem) {
		if(tem>=45&&tem<=65) {
			this.tem=tem;
		}
	}
  
  3.方法3：使用“System.out.println（）”方法输出所期望的值
  
      void show(){
        System.out.println("CPU速度："+cpu.getSpeed());
        System.out.println("硬盘容量："+HD.getAmount());
        System.out.println("CPU温度："+cpu.gettem());
        System.out.println("硬盘的品牌："+HD.getBrand());
    }
    
    4.方法4：使用if方法进行判断
    
    	public void settem( int tem) {
		if(tem>=45&&tem<=65) {
			this.tem=tem;
		}
	}
  
  ##实验结果
  
  
