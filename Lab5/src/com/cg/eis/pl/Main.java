package com.cg.eis.pl;
import java.util.Scanner;

import com.cg.eis.bean.*;
import com.cg.eis.service.*;

public class Main  {
	public static void main(String args[]) {
Scanner s=new Scanner(System.in);
Service ser=new Service();
Employee a=ser.details();
ser.showDetails();

}
}
