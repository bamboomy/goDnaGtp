package genetic;
import java.util.ArrayList;
class Thought3 extends Thought{
private static ArrayList<Thought3> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 436.12680974000995;
private double fd1 = 367.5713754212194;
private Thought fo0 = null;
private Thought fo1 = null;
Thought3 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought3 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought3 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought3 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought3 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought3 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought3 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought3 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fd0 = ad1; 
fd1 = ad2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
public static Thought3 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought3 instance = new Thought3 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought3 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought3 instance = new Thought3 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought3 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought3 instance = new Thought3 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought3 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought3 instance = new Thought3 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought3 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought3 instance = new Thought3 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought3 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought3 instance = new Thought3 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought3 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought3 instance = new Thought3 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought3 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought3 instance = new Thought3 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
void m1() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought96.getInstance(fb0, fb1, fb0, fb1);
if(fo1 != null){
      fo1.m1();
}
if(fo0 != null){
      fo0.m2(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    fb0 = fb1 && fb0;
    fb1 = fb0 && fb1;
    fd1 = fd0 - fd1;
    boolean lb1 = false;
    double ld2 = 936.7850246697914;
    double ld3 = 803.6567100199894;
    boolean lb4 = true;
    lb1 = !lb4;
    double ld5 = 658.3400014687011;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld2, ld3, ld5, fd0, fb0, fb1, lb1, lb4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb1, lb4);
}
if(fo1 != null){
      fo1.m3(fd1, ld2, ld3, ld5);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld2, ld3);
}
    fb0 = ld5 < fd0;
    Thought lo6 = Thought6.getInstance(fb1, lb1, lb4, fb0);
if(fo1 != null){
      fo1.m3();
}
    fb1 = fd1 < ld2;
    lb1 = ld3 < ld5;
    lb4 = !fb0;
    fb1 = lb1 || lb4;
    if (fb0) {
        Thought lo7 = Thought3.getInstance(fd0, fd1, ld2, ld3, fb1, lb1, lb4, fb0);
        fb1 = lb1 || lb4;
}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
    double ld0 = 123.41501948213285;
    ld0 = fd0 + fd1;
    ab3 = ab4 || fb0;
if(fo0 != null){
      ld0 = fo0.m3(fd0, fd1, ld0, fd0);
}
    fd1 = ld0 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1);
}
    fb1 = ld0 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fb0 = fo1.m2();
}
if(fo0 != null){
      fb1 = fo0.m2(fd1, ld0, fd0, fd1, ab1, ab2, ab3, ab4);
}
    Thought lo1 = Thought21.getInstance(fo1, fo0, fo1, fo0);
    ld0 = fd0 + fd1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, fd0);
}
    Thought lo2 = Thought74.getInstance(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1);
    Output.points[8][5] += ld0;
    ab2 = ab3 || ab4;
    fd0 *= -1;
    fd1 = ld0 + fd0;
    double ld3 = 778.3651190766502;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      ad1 = fo0.m3(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fb0 = fo1.m2();
}
    fb1 = ad2 < ad3;
    Output.points[8][6] += ad4;
    fb0 = fd0 < fd1;
if(fo0 != null){
      ad1 = fo0.m3(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
    ad1 *= -1;
    boolean lb0 = true;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    Thought lo1 = Thought46.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, lb0, fb0);
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
}
if(fo1 != null){
      lb0 = fo1.m2(fd1, ad1, ad2, ad3);
}
    fb0 = !fb1;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
    double ld0 = 922.9863432129584;
    fb1 = ab1 || ab2;
    ab3 = ab4 || fb0;
if(fo1 != null){
      fb1 = fo1.m2();
}
    fd0 = fd1 - ld0;
    Thought lo1 = Thought63.getInstance(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
    fb0 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    double ld2 = 930.0621524068221;
    if (fb1) {
if(fo0 != null){
          ab1 = fo0.m2(fo1, fo0, fo1, fo0, ld0, ld2, ad1, ad2, ab2, ab3, ab4, fb0);
}
        Thought lo3 = Thought24.getInstance(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
        ad3 = ad4 + fd0;
if(fo1 != null){
          fo1.m1(fd1, ld0, ld2, ad1);
}
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
        boolean lb4 = true;
        fd1 = ld0 + ld2;
}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought83.getInstance(fb1, fb0, fb1, fb0);
    fb1 = fd0 < fd1;
    fd0 = fd1 - fd0;
    fb0 = fd1 < fd0;
    fd1 *= -1;
    fd0 = fd1 + fd0;
    fb1 = fb0 || fb1;
    boolean lb1 = false;
    boolean lb2 = false;
if(ao2 != null){
      lb1 = ao2.m2();
}
    double ld3 = 411.4391785889033;
    lb2 = fb0 || fb1;
if(ao3 != null){
      lb1 = ao3.m2(fd0, fd1, ld3, fd0, lb2, fb0, fb1, lb1);
}
    lb2 = fb0 && fb1;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2);
}
    boolean lb4 = true;
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, ld3, fd0, fd1, ld3, lb1, lb2, lb4, fb0);
}
    fd0 = fd1 + ld3;
    fd0 = fd1 + ld3;
    fb1 = lb1 || lb2;
    Thought lo5 = Thought44.getInstance(ao2, ao3, ao4, fo0, lb4, fb0, fb1, lb1);
if(fo1 != null){
      lb2 = fo1.m2(fd0, fd1, ld3, fd0);
}
    Output.points[8][7] -= fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld3, fd0, fd1, ld3);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[8][8] -= ad2;
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought57.getInstance();
    ad3 = ad4 + fd0;
    Output.points[0][0] += fd1;
    Output.points[0][1] += ad1;
    ad2 = ad3 + ad4;
    Thought lo1 = Thought86.getInstance(fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4);
}
    Thought lo2 = Thought20.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2);
    fb1 = !fb0;
    fb1 = fb0 || fb1;
    fb0 = fb1 || fb0;
    Thought lo3 = Thought84.getInstance(fb1, fb0, fb1, fb0);
    ad3 = ad4 + fd0;
    Thought lo4 = Thought53.getInstance();
    double ld5 = 451.4768179281501;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ld5, ad1, fb1, fb0, fb1, fb0);
}
    Thought lo6 = Thought94.getInstance(ao3, ao4, fo0, fo1);
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    double ld7 = 225.04429419486988;
    fb1 = fb0 && fb1;
    fd0 *= -1;
    fd1 = ld5 - ld7;
    if (fb0) {
}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[0][2] -= fd0;
    ab2 = !ab3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab4, fb0, fb1, ab1);
}
    Output.points[0][3] -= fd1;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1);
}
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
    ab2 = ab3 && ab4;
        for(int i0=0; i0<10; i0++){
        fb0 = fb1 && ab1;
        }
    boolean lb0 = false;
        ab1 = ab2 && ab3;
if(ao3 != null){
      ab4 = ao3.m2(fb0, fb1, lb0, ab1);
}
    fd0 *= -1;
    Thought lo1 = Thought13.getInstance();
if(fo0 != null){
      ao4 = fo0.m4(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    for(int i1=0; i1<10; i1++){
        fb1 = fd1 > fd0;
if(fo1 != null){
          fo1.m2(ao1, ao2, ao3, ao4);
}
        Output.points[0][4] += fd1;
        lb0 = fd0 > fd1;
        Thought lo2 = Thought59.getInstance(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
    ad1 *= -1;
    fb1 = !ab1;
    ad2 = ad3 + ad4;
    double ld0 = 650.1597354789225;
if(ao1 != null){
      ao1.m3(ad4, fd0, fd1, ld0);
}
    ad1 = ad2 + ad3;
    ad4 *= -1;
    fd0 = fd1 - ld0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
    Thought lo1 = Thought23.getInstance(ab2, ab3, ab4, fb0);
    double ld2 = 398.2617752816263;
    Output.points[0][5] -= ad4;
    double ld3 = 786.5488392916741;
if(ao2 != null){
      ad4 = ao2.m3();
}
    Thought lo4 = Thought59.getInstance(fd0, fd1, ld0, ld2, fb1, ab1, ab2, ab3);
    ld3 *= -1;
    Output.points[0][6] -= ad1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      ab4 = ao3.m2(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, fb0, fb1, ab1, ab2);
}
    fd1 = ld0 - ld2;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab3, ab4, fb0, fb1);
}
    Thought lo5 = Thought8.getInstance(ld3, ad1, ad2, ad3);

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[0][7] += fd0;
    fd1 = fd0 + fd1;
    fb0 = !fb1;
    boolean lb0 = false;
    lb0 = !fb0;
    fd0 *= -1;
    fd1 *= -1;
    Thought lo1 = Thought4.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
    fd0 = fd1 + fd0;
if(fo1 != null){
      fb1 = fo1.m2(lb0, fb0, fb1, lb0);
}
    Thought lo2 = Thought58.getInstance();
    fb0 = fd1 < fd0;
    fd1 = fd0 - fd1;
    fb1 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd0 *= -1;
    double ld3 = 342.181045645014;
    fd0 = fd1 - ld3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld3, fd0, fb0, fb1, lb0, fb0);
}
    Thought lo4 = Thought72.getInstance(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
if(fo0 != null){
      fo0.m1(fd1, ld3, fd0, fd1);
}
    boolean lb5 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld3, fd0, fd1, ld3);
}
if(fo0 != null){
      fo1 = fo0.m4(lb0, lb5, fb0, fb1);
}

Thought.STACK_COUNTER++;
return lb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = !ab3;
    ab4 = fb0 && fb1;
    ab1 = fd1 < fd0;
    ab2 = fd1 > fd0;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fo1.m2(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    ab1 = ab2 && ab3;
    fd1 = fd0 - fd1;
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ab3 = fd0 < fd1;
    ab4 = fd0 < fd1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, lb0, ab1);
}
    fd0 *= -1;
    ab2 = ab3 && ab4;
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb0, ab1);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    for(int i0=0; i0<10; i0++){
        ab2 = !ab3;
if(fo1 != null){
          fo0 = fo1.m4(ab4, fb0, fb1, lb0);
}
if(fo0 != null){
          fo0.m3();
}
        ab1 = ab2 || ab3;
}
Thought.STACK_COUNTER++;
return ab4;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
    Output.points[0][8] -= ad4;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2);
}
    fb1 = ad3 < ad4;
    lb0 = fd0 < fd1;
    ad1 = ad2 + ad3;
    double ld1 = 203.04547436835583;
    fb0 = fb1 || lb0;
    Output.points[1][0] += ad3;
    boolean lb2 = true;
    ad4 = fd0 - fd1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ld1, ad1, ad2, ad3);
}
    boolean lb3 = true;
    ad4 *= -1;
        lb2 = lb3 || fb0;
    double ld4 = 70.6339537379979;
    boolean lb5 = true;
    double ld6 = 904.3814333163767;
    double ld7 = 393.55296696776975;
    fb0 = !fb1;
    ad2 *= -1;

Thought.STACK_COUNTER++;
return lb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[1][1] -= ad1;
    ab2 = ad2 > ad3;
if(fo0 != null){
      fo1 = fo0.m4(ab3, ab4, fb0, fb1);
}
    boolean lb0 = true;
    boolean lb1 = false;
    boolean lb2 = true;
    Output.points[1][2] += ad4;
    lb0 = lb1 || lb2;
    Thought lo3 = Thought42.getInstance();
if(fo1 != null){
      fo1.m3(fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
}
    Thought lo4 = Thought66.getInstance(fo0, fo1, fo0, fo1);
    fb0 = ad3 < ad4;
    fd0 = fd1 + ad1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb1, lb0, lb1, lb2);
}
    Thought lo5 = Thought94.getInstance(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
    fb0 = fd1 > ad1;
    double ld6 = 482.05109125521324;
    fb1 = ad1 > ad2;
    lb0 = ad3 < ad4;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld6, ad1);
}
    lb1 = lb2 || ab1;
    ab2 = !ab3;
    ad2 = ad3 + ad4;
    ab4 = fb0 || fb1;
    fd0 = fd1 - ld6;
    Thought lo7 = Thought48.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
    lb0 = fd0 < fd1;
    lb1 = ld6 > ad1;

Thought.STACK_COUNTER++;
return lb2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fd0 > fd1;
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
    fd0 = fd1 + fd0;
    lb0 = !fb0;
    fb1 = lb0 || fb0;
    boolean lb1 = false;
    Thought lo2 = Thought68.getInstance();
    fd1 *= -1;
    fb0 = fb1 || lb0;
    fd0 = fd1 + fd0;
    lb1 = !fb0;
if(ao4 != null){
      ao3 = ao4.m4(fd1, fd0, fd1, fd0, fb1, lb0, lb1, fb0);
}
    Thought lo3 = Thought57.getInstance(fo0, fo1, ao1, ao2);
    fb1 = fd1 < fd0;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, lb0, lb1, fb0, fb1);
}
    boolean lb4 = false;
if(ao2 != null){
          lb0 = ao2.m2(ao3, ao4, fo0, fo1, lb1, lb4, fb0, fb1);
}
    Output.points[1][3] += fd1;

Thought.STACK_COUNTER++;
return lb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 && fb1;
if(ao1 != null){
      ao1.m1(ad1, ad2, ad3, ad4);
}
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2);
}
    boolean lb0 = true;
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, lb0, fb0);
}
    fb1 = lb0 || fb0;
    fb1 = ad3 < ad4;
    boolean lb1 = true;
    fd0 = fd1 - ad1;
    boolean lb2 = true;
if(ao3 != null){
      lb0 = ao3.m2();
}
    ad2 = ad3 + ad4;
    double ld3 = 96.97237297697959;
    Thought lo4 = Thought5.getInstance(ad4, fd0, fd1, ld3, lb1, lb2, fb0, fb1);
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    lb0 = !lb1;
    double ld5 = 721.0860622338934;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, ld5, ad1, ad2, ad3, lb2, fb0, fb1, lb0);
}

Thought.STACK_COUNTER++;
return lb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    Output.points[1][4] += fd1;
    Output.points[1][5] -= fd0;
    lb0 = !ab1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(ao1 != null){
      ao1.m3(fd1, fd0, fd1, fd0);
}
    double ld1 = 800.9843069293981;
    fb1 = lb0 && ab1;
    boolean lb2 = false;
    double ld3 = 693.9004572569538;
    ab1 = !ab2;
    Thought lo4 = Thought99.getInstance(ao2, ao3, ao4, fo0, ld3, fd0, fd1, ld1);
if(ao1 != null){
          fo1 = ao1.m4(ab3, ab4, fb0, fb1);
}
    ld3 = fd0 + fd1;
    lb0 = lb2 || ab1;
        double ld5 = 361.1631747178424;
    ld1 *= -1;
if(ao2 != null){
      ao2.m1();
}
    ld3 *= -1;
if(ao3 != null){
      ab2 = ao3.m2(ld5, fd0, fd1, ld1, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    Thought lo6 = Thought43.getInstance(ao4, fo0, fo1, ao1, ld3, ld5, fd0, fd1, lb0, lb2, ab1, ab2);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab3, ab4, fb0, fb1);
}
if(ao2 != null){
      ao2.m3(ld1, ld3, ld5, fd0);
}
    lb0 = fd1 < ld1;

Thought.STACK_COUNTER++;
return lb2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    boolean lb1 = false;
    lb0 = ad2 > ad3;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1);
}
    lb1 = ab1 || ab2;
    ad2 = ad3 - ad4;
    ab3 = !ab4;
    fd0 *= -1;
    fd1 = ad1 - ad2;
    ad3 = ad4 - fd0;
    fd1 = ad1 + ad2;
    fb0 = ad3 < ad4;
if(ao1 != null){
      fo1 = ao1.m4(fb1, lb0, lb1, ab1);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    ab2 = ab3 || ab4;
    Output.points[1][6] -= fd0;
    fd1 *= -1;
if(fo0 != null){
      ao4 = fo0.m4(ad1, ad2, ad3, ad4, fb0, fb1, lb0, lb1);
}
    ab1 = ab2 || ab3;
if(fo1 != null){
      fd0 = fo1.m3(ao1, ao2, ao3, ao4);
}
    fd1 = ad1 + ad2;
if(fo0 != null){
          fo0.m2(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1, ab4, fb0, fb1, lb0);
}
    lb1 = ad1 > ad2;
    boolean lb2 = false;
    lb2 = !ab1;
    Thought lo3 = Thought69.getInstance(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
    fb1 = !lb0;

Thought.STACK_COUNTER++;
return lb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought4.getInstance(fd0, fd1, fd0, fd1);
    fb0 = fd0 > fd1;
    fb1 = fb0 && fb1;
    fb0 = fb1 || fb0;
    fb1 = fb0 && fb1;
    Thought lo1 = Thought42.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo1.m2(fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    Output.points[1][7] += fd1;
    fd0 = fd1 - fd0;
    Thought lo2 = Thought2.getInstance();
    fb0 = fd1 < fd0;
    fd1 = fd0 + fd1;
    boolean lb3 = true;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, fb0, fb1, lb3, fb0);
}

Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb0 = false;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, lb0, ab1, ab2);
}
if(fo1 != null){
      fo1.m3(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    ab3 = ab4 || fb0;
if(fo0 != null){
      fd1 = fo0.m3(fb1, lb0, ab1, ab2);
}
    fd0 = fd1 - fd0;
    boolean lb1 = true;
    if (ab2) {
if(fo0 != null){
          fo1 = fo0.m4();
}
        fd1 = fd0 + fd1;
        ab3 = fd0 < fd1;
        fd0 = fd1 + fd0;
        boolean lb2 = false;
}
Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 - ad3;
    fb1 = ad4 > fd0;
    boolean lb0 = true;
    boolean lb1 = false;
    lb0 = lb1 || fb0;
    fb1 = fd1 < ad1;
    lb0 = !lb1;
    Output.points[1][8] += ad2;
    ad3 = ad4 - fd0;
if(fo1 != null){
      fo1.m2(fd1, ad1, ad2, ad3, fb0, fb1, lb0, lb1);
}
    fb0 = ad4 < fd0;
    Thought lo2 = Thought37.getInstance(fo0, fo1, fo0, fo1);
    double ld3 = 453.5152543185947;
    fd0 *= -1;
    fb1 = !lb0;
    lb1 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld3, ad1, ad2, lb0, lb1, fb0, fb1);
}
    Thought lo4 = Thought92.getInstance(fo0, fo1, fo0, fo1, lb0, lb1, fb0, fb1);
    boolean lb5 = false;
    ad3 = ad4 + fd0;
    Thought lo6 = Thought90.getInstance(fd1, ld3, ad1, ad2);
    ad3 = ad4 + fd0;
    lb0 = fd1 < ld3;
    for(int i0=0; i0<10; i0++){
}
Thought.STACK_COUNTER++;
return ad1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    double ld0 = 839.293684196638;
if(fo0 != null){
      fo1 = fo0.m4(ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo1.m1();
}
if(fo0 != null){
      ab1 = fo0.m2(ad4, fd0, fd1, ld0, ab2, ab3, ab4, fb0);
}
    double ld1 = 900.1280073747364;
if(fo1 != null){
      ld1 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb1, ab1, ab2, ab3);
}
    double ld2 = 263.84972084709364;
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
}
    ab2 = !ab3;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, ld1);
}
    boolean lb3 = false;
    Thought lo4 = Thought58.getInstance(fo0, fo1, fo0, fo1, ld2, ad1, ad2, ad3);
    ab3 = !ab4;
    fb0 = ad4 > fd0;
    Thought lo5 = Thought3.getInstance(fb1, lb3, ab1, ab2);
if(fo1 != null){
      fo0 = fo1.m4();
}
    ab3 = ab4 && fb0;
if(fo0 != null){
          fo0.m1(fd1, ld0, ld1, ld2, fb1, lb3, ab1, ab2);
}

Thought.STACK_COUNTER++;
return ad1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 *= -1;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1);
}
    fd1 = fd0 + fd1;
    fb1 = fb0 || fb1;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    fb1 = fb0 || fb1;
if(ao1 != null){
      fo1 = ao1.m4(fd1, fd0, fd1, fd0);
}
    fb0 = fb1 || fb0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    double ld0 = 487.8747913637488;
    fb1 = fb0 || fb1;
    fd0 = fd1 + ld0;

Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = ad1 < ad2;
    Output.points[2][0] += ad3;
    Output.points[2][1] += ad4;
    boolean lb0 = false;
    fb0 = fd0 < fd1;
if(ao2 != null){
      ad1 = ao2.m3(fb1, lb0, fb0, fb1);
}
if(ao3 != null){
      ao3.m3();
}
if(fo0 != null){
      ao4 = fo0.m4(ad2, ad3, ad4, fd0, lb0, fb0, fb1, lb0);
}
    Output.points[2][2] -= fd1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, fb1, lb0, fb0, fb1);
}
    lb0 = fd0 > fd1;
if(fo0 != null){
      ao4 = fo0.m4(ad1, ad2, ad3, ad4);
}
    fb0 = fd0 > fd1;
    ad1 = ad2 - ad3;
    fb1 = lb0 && fb0;
    double ld1 = 112.9724879328382;
if(fo1 != null){
      fb1 = fo1.m2(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1);
}
    lb0 = ld1 < ad1;
    boolean lb2 = false;
    double ld3 = 954.5706832684459;
    boolean lb4 = true;

Thought.STACK_COUNTER++;
return ad1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    fd1 = fd0 - fd1;
    Output.points[2][3] -= fd0;
if(ao2 != null){
      ao1 = ao2.m4(ab1, ab2, ab3, ab4);
}
    fd1 = fd0 + fd1;
    boolean lb1 = true;
if(ao3 != null){
      ab4 = ao3.m2();
}
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb1);
}
        Thought lo2 = Thought66.getInstance(fo1, ao1, ao2, ao3);
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}

Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
}
    ad2 = ad3 + ad4;
    for(int i0=0; i0<10; i0++){
        boolean lb0 = false;
        fd0 *= -1;
        ab4 = !fb0;
if(ao2 != null){
          fd1 = ao2.m3(ad1, ad2, ad3, ad4);
}
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2);
}
        boolean lb1 = false;
        fb0 = fb1 && lb0;
        boolean lb2 = false;
        double ld3 = 805.5523007284779;
if(ao3 != null){
          lb1 = ao3.m2(lb2, ab1, ab2, ab3);
}
        Output.points[2][4] -= ad2;
        ad3 = ad4 - fd0;
if(ao4 != null){
          ao4.m1();
}
        fd1 = ld3 + ad1;
if(fo0 != null){
          ad2 = fo0.m3(ad3, ad4, fd0, fd1, ab4, fb0, fb1, lb0);
}
if(fo1 != null){
          lb1 = fo1.m2(ao1, ao2, ao3, ao4);
}
        Thought lo4 = Thought10.getInstance(fo0, fo1, ao1, ao2, ld3, ad1, ad2, ad3, lb2, ab1, ab2, ab3);
        ad4 *= -1;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab4, fb0, fb1, lb0);
}
if(ao4 != null){
          ao3 = ao4.m4(fd0, fd1, ld3, ad1);
}
        Output.points[2][5] -= ad2;
        boolean lb5 = false;
}
Thought.STACK_COUNTER++;
return ad4;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought47.getInstance(fb1, fb0, fb1, fb0);
if(fo0 != null){
      fd0 = fo0.m3();
}
    fd1 *= -1;
    fd0 = fd1 + fd0;
    fb1 = fd1 < fd0;
    fd1 *= -1;
if(fo1 != null){
          fo1.m1(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Thought lo1 = Thought81.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
    fb0 = fb1 || fb0;
    double ld2 = 690.6661055967608;

Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought55.getInstance(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    fb1 = fd0 > fd1;
    boolean lb1 = false;
    lb1 = ab1 && ab2;
    boolean lb2 = true;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    ab2 = fd1 < fd0;
    ab3 = fd1 > fd0;

Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
if(fo0 != null){
      fb0 = fo0.m2(fb1, lb0, fb0, fb1);
}
    lb0 = ad2 < ad3;
if(fo1 != null){
      fb0 = fo1.m2();
}
    ad4 = fd0 - fd1;
if(fo0 != null){
      fo0.m1(ad1, ad2, ad3, ad4, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Thought lo1 = Thought60.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, lb0, fb0, fb1, lb0);
    boolean lb2 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb2, fb0, fb1, lb0);
}
    lb2 = ad3 > ad4;
    fb0 = fb1 || lb0;
    Output.points[2][6] += fd0;
if(fo1 != null){
      lb2 = fo1.m2(fd1, ad1, ad2, ad3);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
    fb0 = fb1 || lb0;
        boolean lb3 = false;
    lb2 = ad2 > ad3;
    ad4 = fd0 - fd1;
    ad1 *= -1;
    lb3 = ad2 > ad3;
    ad4 *= -1;
    fd0 = fd1 - ad1;
    boolean lb4 = true;
    for(int i0=0; i0<10; i0++){
}
Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      ad2 = fo0.m3();
}
    fb1 = !ab1;
    ab2 = ab3 || ab4;
    ad3 = ad4 + fd0;
if(fo1 != null){
      fb0 = fo1.m2(fd1, ad1, ad2, ad3, fb1, ab1, ab2, ab3);
}
    ab4 = ad4 < fd0;
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ab4 = fd1 < ad1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb0, fb1, lb0, ab1);
}
        Output.points[2][7] -= fd1;

Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 *= -1;
    Thought lo0 = Thought0.getInstance(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
    boolean lb1 = false;
    fd1 = fd0 + fd1;
    Output.points[2][8] -= fd0;
    boolean lb2 = true;
    for(int i0=0; i0<10; i0++){
if(ao1 != null){
          fo1 = ao1.m4(lb2, fb0, fb1, lb1);
}
}
Thought.STACK_COUNTER++;
return ao2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought24.getInstance();
    Output.points[3][0] -= ad2;
if(ao1 != null){
      ao1.m3(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    ad1 = ad2 + ad3;
    Output.points[3][1] += ad4;
    double ld1 = 20.968786319409666;
    fb1 = fb0 || fb1;
    ad4 *= -1;
    fd0 = fd1 - ld1;
    Thought lo2 = Thought74.getInstance(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
    fb0 = fb1 || fb0;
    fb1 = fd0 > fd1;
    boolean lb3 = false;
    Thought lo4 = Thought21.getInstance(fo1, ao1, ao2, ao3, lb3, fb0, fb1, lb3);

Thought.STACK_COUNTER++;
return ao4;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
    double ld0 = 991.8268025022529;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld0, fd0, fd1, ld0);
}
if(ao3 != null){
      ao3.m2(ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      fd0 = ao4.m3();
}
if(fo0 != null){
      fb1 = fo0.m2(fd1, ld0, fd0, fd1, ab1, ab2, ab3, ab4);
}
    ld0 = fd0 - fd1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    ld0 *= -1;
    fd0 = fd1 + ld0;

Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 || ab3;
    Thought lo0 = Thought65.getInstance(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0, ab4, fb0, fb1, ab1);
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3, ab2, ab3, ab4, fb0);
}
    fb1 = fd1 < ad1;
    ab1 = ad2 > ad3;
    boolean lb1 = false;
if(ao4 != null){
      ad4 = ao4.m3(fd0, fd1, ad1, ad2);
}
    ab1 = ad3 > ad4;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, ad1, ad2);
}
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
    for(int i0=0; i0<10; i0++){
        double ld2 = 245.38935604259007;
        fb1 = ad2 > ad3;
        boolean lb3 = true;
        boolean lb4 = true;
if(ao2 != null){
          ao1 = ao2.m4();
}
if(ao3 != null){
          ao3.m1(ad4, fd0, fd1, ld2, lb3, lb4, lb1, ab1);
}
        ab2 = ab3 && ab4;
        fb0 = fb1 || lb3;
        double ld5 = 284.2049144536529;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
        Thought lo6 = Thought82.getInstance(ao4, fo0, fo1, ao1, ld5, ad1, ad2, ad3, lb4, lb1, ab1, ab2);
}
Thought.STACK_COUNTER++;
return ao2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
void accept(String color) throws CountDownExc {
switch (color) {
case "e":
empty();
break;
case "own":
own();
break;
case "other":
other();
break;
default:
throw new RuntimeException("Illegal color!!!");
}
}
void empty() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fd1 > fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fd0 *= -1;
if(fo1 != null){
      fo1.m1(fd1, fd0, fd1, fd0);
}
    fb0 = fb1 && fb0;
    fb1 = fd1 > fd0;
    fb0 = fd1 < fd0;
    fb1 = fb0 || fb1;
    boolean lb0 = false;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fd1 = fo0.m3(lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    fb1 = lb0 && fb0;
    fb1 = fd0 < fd1;
    lb0 = fb0 && fb1;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    lb0 = fb0 && fb1;
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    double ld1 = 872.5079306983614;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0);
}
    fd1 = ld1 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(lb0, fb0, fb1, lb0);
}
    boolean lb2 = true;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought49.getInstance();
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    double ld1 = 104.19494717748871;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 > fd1;
    double ld2 = 908.675501180106;
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fb1 = fo1.m2(fd0, fd1, fd0, fd1);
}
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fb1 = fb0 || fb1;
    fb0 = fb1 || fb0;
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    double ld0 = 130.23411296060885;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fb0 = fo1.m2(ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    fb0 = fd0 > fd1;
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, fb0, fb1, lb1, fb0);
}
    boolean lb2 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb1, lb2);
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld0, fd0, fd1);
}
if(fo1 != null){
      ld0 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
}
    fd1 *= -1;
    fb0 = !fb1;
if(fo0 != null){
      lb1 = fo0.m2(lb2, fb0, fb1, lb1);
}
    Thought lo3 = Thought71.getInstance();
if(fo1 != null){
      lb2 = fo1.m2(ld0, fd0, fd1, ld0, fb0, fb1, lb1, lb2);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
}
