package genetic;
import java.util.ArrayList;
class Thought38 extends Thought{
private static ArrayList<Thought38> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 123.89213213421009;
private double fd1 = 850.001064353532;
private Thought fo0 = null;
private Thought fo1 = null;
Thought38 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought38 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought38 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought38 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought38 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought38 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought38 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought38 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought38 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought38 instance = new Thought38 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought38 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought38 instance = new Thought38 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought38 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought38 instance = new Thought38 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought38 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought38 instance = new Thought38 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought38 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought38 instance = new Thought38 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought38 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought38 instance = new Thought38 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought38 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought38 instance = new Thought38 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought38 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought38 instance = new Thought38 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fb0 = fd1 < fd0;
    fd1 = fd0 + fd1;
    fb1 = fb0 && fb1;
    Thought lo0 = Thought63.getInstance(fb0, fb1, fb0, fb1);
    Thought lo1 = Thought78.getInstance();
    Thought lo2 = Thought45.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb3 = false;
    Thought lo4 = Thought39.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb3, fb0, fb1, lb3);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb3, fb0);
}
    fb1 = fd1 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    Thought lo5 = Thought13.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
    lb3 = fd1 > fd0;
    Output.points[0][3] += fd1;
    double ld6 = 424.29398329037735;
    boolean lb7 = true;

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
    ab2 = fd0 > fd1;
if(fo0 != null){
      fd0 = fo0.m3(ab3, ab4, fb0, fb1);
}
    boolean lb0 = true;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd0 = fd1 - fd0;
    boolean lb1 = false;
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1, lb0, lb1, ab1, ab2);
}
    boolean lb2 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ab2 = fd0 > fd1;
    boolean lb3 = false;
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    lb0 = lb1 || lb2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb3, ab1, ab2, ab3);
}
    boolean lb4 = false;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    boolean lb5 = true;
    ab2 = fd1 > fd0;
    fd1 = fd0 + fd1;

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
        boolean lb0 = false;
    Thought lo1 = Thought13.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
if(fo0 != null){
      fo1 = fo0.m4(lb0, fb0, fb1, lb0);
}
    fd0 = fd1 + ad1;
if(fo1 != null){
      fo1.m2();
}
if(fo0 != null){
      ad2 = fo0.m3(ad3, ad4, fd0, fd1, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb2 = false;
    boolean lb3 = true;
    ad1 = ad2 - ad3;
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, lb3, fb0, fb1, lb0);
}
    lb2 = ad3 > ad4;
    lb3 = fd0 < fd1;

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
    boolean lb0 = true;
    ab1 = !ab2;
    double ld1 = 574.8624973153937;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
    Thought lo2 = Thought76.getInstance(ld1, ad1, ad2, ad3);
    lb0 = !ab1;
    ab2 = ad4 < fd0;
    double ld3 = 599.1723702953005;
    ab3 = ab4 && fb0;
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld1, ld3, ad1);
}
    boolean lb4 = false;
    Thought lo5 = Thought54.getInstance(fb0, fb1, lb0, lb4);
    double ld6 = 158.71422609345444;
    double ld7 = 220.4805791250093;
    Output.points[0][4] += ld7;
    ad1 = ad2 - ad3;
    boolean lb8 = false;
    lb8 = ab1 || ab2;
    ab3 = !ab4;
    boolean lb9 = false;
    ab4 = ad4 > fd0;
if(fo1 != null){
      fb0 = fo1.m2();
}
    Thought lo10 = Thought82.getInstance(fd1, ld1, ld3, ld6, fb1, lb0, lb4, lb8);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ld7, ad1, ad2, ad3, lb9, ab1, ab2, ab3);
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
    fb1 = fb0 || fb1;
    fb0 = fd1 < fd0;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    double ld0 = 650.2621973394605;
    fb1 = fb0 && fb1;
    boolean lb1 = true;
    ld0 = fd0 - fd1;
    ld0 = fd0 + fd1;
if(ao1 != null){
      ld0 = ao1.m3(fd0, fd1, ld0, fd0);
}
    lb1 = fd1 < ld0;
    Thought lo2 = Thought16.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, ld0, fd0);
    fb0 = fb1 || lb1;
    fb0 = fd1 < ld0;
if(fo1 != null){
      fd0 = fo1.m3(fb1, lb1, fb0, fb1);
}
    fd1 = ld0 - fd0;
    fd1 *= -1;
    double ld3 = 53.004191134903834;
    Thought lo4 = Thought2.getInstance();
    ld0 = ld3 + fd0;
if(ao1 != null){
      ao1.m3(fd1, ld0, ld3, fd0, lb1, fb0, fb1, lb1);
}
    fd1 = ld0 + ld3;
    if (fb0) {
        double ld5 = 250.23521340423346;
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
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought38.getInstance(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
    fb0 = !fb1;
if(fo0 != null){
      fo0.m2(fd0, fd1, ad1, ad2);
}
    fb0 = ad3 < ad4;
    fb1 = fd0 < fd1;
    fb0 = fb1 && fb0;
    ad1 *= -1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
}
    fd1 = ad1 + ad2;
if(ao1 != null){
      fo1 = ao1.m4(fb1, fb0, fb1, fb0);
}
    ad3 = ad4 - fd0;
    fd1 = ad1 + ad2;
    boolean lb1 = true;
    double ld2 = 696.7679178949246;
if(ao2 != null){
      fb0 = ao2.m2();
}
    Thought lo3 = Thought22.getInstance(ad2, ad3, ad4, fd0, fb1, lb1, fb0, fb1);
    if (lb1) {
        fb0 = fb1 || lb1;
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
    Thought lo0 = Thought49.getInstance(ao1, ao2, ao3, ao4);
    boolean lb1 = false;
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    Thought lo2 = Thought44.getInstance(ao4, fo0, fo1, ao1, fb0, fb1, lb1, ab1);
if(ao2 != null){
      ab2 = ao2.m2(fd0, fd1, fd0, fd1);
}
    ab3 = ab4 && fb0;
    Output.points[0][5] -= fd0;
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    Thought lo3 = Thought64.getInstance(fb1, lb1, ab1, ab2);
    fd1 = fd0 + fd1;
if(ao2 != null){
      ao2.m2();
}
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    fd0 = fd1 + fd0;
    boolean lb4 = false;
if(fo0 != null){
      fd1 = fo0.m3(fo1, ao1, ao2, ao3);
}
    Output.points[0][6] -= fd0;
    fd1 *= -1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, lb1, lb4, ab1, ab2);
}
if(ao4 != null){
      ab3 = ao4.m2(fo0, fo1, ao1, ao2, ab4, fb0, fb1, lb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, fd0, fd1);
}
    lb4 = ab1 && ab2;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1);
}
    Thought lo5 = Thought37.getInstance(ab3, ab4, fb0, fb1);
    fd0 = fd1 - fd0;

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
if(ao1 != null){
      ab1 = ao1.m2();
}
if(ao2 != null){
      ad2 = ao2.m3(ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, ab1, ab2);
}
    fd0 = fd1 + ad1;
    ab3 = ad2 < ad3;
    ab4 = ad4 > fd0;
if(ao2 != null){
      fd1 = ao2.m3(ad1, ad2, ad3, ad4);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2);
}
    Thought lo0 = Thought35.getInstance(fb0, fb1, ab1, ab2);
    ab3 = ad3 > ad4;
if(ao4 != null){
      ao3 = ao4.m4();
}
        if (ab4) {
        fb0 = !fb1;
        Output.points[0][7] -= fd0;
if(fo1 != null){
          fo0 = fo1.m4(fd1, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
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
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    fb0 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    boolean lb1 = false;
    lb0 = lb1 && fb0;
    fd0 = fd1 - fd0;

Thought.STACK_COUNTER++;
return fb1;
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
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
if(fo0 != null){
      fo0.m1();
}
    Thought lo0 = Thought32.getInstance(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
    fd1 *= -1;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
        Output.points[0][8] -= fd1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
          fd0 = fo1.m3(ab1, ab2, ab3, ab4);
}
        Thought lo1 = Thought53.getInstance();
if(fo1 != null){
          fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
        fd1 *= -1;
        ab3 = fd0 > fd1;
        fd0 = fd1 + fd0;
        ab4 = !fb0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        fd1 = fd0 - fd1;
if(fo0 != null){
          fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
        double ld2 = 219.51943218563648;
if(fo1 != null){
          ld2 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
}
Thought.STACK_COUNTER++;
return ab3;
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
    fb1 = fb0 && fb1;
    boolean lb0 = false;
    double ld1 = 297.48096530724473;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
    lb0 = fb0 || fb1;
    Output.points[1][0] += fd0;
    fd1 *= -1;
    ld1 *= -1;
    if (lb0) {
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(fo0 != null){
          fd0 = fo0.m3(fb0, fb1, lb0, fb0);
}
if(fo1 != null){
          fb1 = fo1.m2();
}
        Output.points[1][1] += fd1;
if(fo1 != null){
          fo0 = fo1.m4(ld1, ad1, ad2, ad3, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        ad4 = fd0 - fd1;
        boolean lb2 = false;
        boolean lb3 = true;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, ad1, ad2, ad3, lb3, lb0, fb0, fb1);
}
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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = !ab3;
    for(int i0=0; i0<10; i0++){
        ab4 = fb0 && fb1;
        double ld0 = 219.24709431588676;
        }
    ab1 = ab2 && ab3;
    ad1 = ad2 + ad3;
    Output.points[1][2] -= ad4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
}
    fd0 *= -1;
    ab2 = ab3 || ab4;
    boolean lb1 = true;
    fd1 = ad1 + ad2;
    ab4 = ad3 < ad4;
    fd0 = fd1 + ad1;
    ad2 = ad3 + ad4;
    Thought lo2 = Thought4.getInstance(fd0, fd1, ad1, ad2);
    fb0 = !fb1;
    Thought lo3 = Thought61.getInstance(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
if(fo0 != null){
      fo0.m3(lb1, ab1, ab2, ab3);
}
    Thought lo4 = Thought12.getInstance();
if(fo1 != null){
      ab4 = fo1.m2(ad1, ad2, ad3, ad4, fb0, fb1, lb1, ab1);
}
    Thought lo5 = Thought31.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
    ad3 = ad4 - fd0;

Thought.STACK_COUNTER++;
return fb1;
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
    boolean lb0 = true;
    lb0 = fb0 || fb1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, lb0, fb0, fb1, lb0);
}
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
    fd0 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0);
}
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, lb0, fb0);
}
    Thought lo1 = Thought43.getInstance();
if(fo0 != null){
      fo0.m2(fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = ad1 > ad2;
    ad3 *= -1;
    fb0 = !fb1;
    double ld0 = 591.6136627160571;
    ad3 = ad4 + fd0;
    Output.points[1][3] += fd1;
    fb0 = ld0 > ad1;
    Output.points[1][4] -= ad2;
    boolean lb1 = false;
    ad3 *= -1;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1);
}
    fb1 = ad4 > fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ld0, ad1, ad2, lb1, fb0, fb1, lb1);
}
if(ao1 != null){
          ad3 = ao1.m3(ao2, ao3, ao4, fo0, fb0, fb1, lb1, fb0);
}

Thought.STACK_COUNTER++;
return fb1;
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
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1);
}
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
if(ao4 != null){
      ao3 = ao4.m4(ab1, ab2, ab3, ab4);
}
    fb0 = fd0 < fd1;
if(fo0 != null){
      fb1 = fo0.m2();
}
    Output.points[1][5] -= fd0;
    double ld0 = 791.9383853995829;
    ab1 = fd0 > fd1;
    ab2 = !ab3;
if(fo1 != null){
      ab4 = fo1.m2(ld0, fd0, fd1, ld0, fb0, fb1, ab1, ab2);
}
    fd0 *= -1;
    Output.points[1][6] -= fd1;
    ab3 = ab4 || fb0;
    fb1 = !ab1;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0);
}
    boolean lb1 = false;
    ld0 = fd0 - fd1;
if(fo1 != null){
      ab1 = fo1.m2(ao1, ao2, ao3, ao4, ld0, fd0, fd1, ld0, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, ao1, ao2, ao3, fb1, lb1, ab1, ab2);
}
    boolean lb2 = true;
if(fo0 != null){
      ao4 = fo0.m4(fd1, ld0, fd0, fd1);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ld0, fd0, fd1, ld0);
}
if(fo1 != null){
      fo1.m3(ab2, ab3, ab4, fb0);
}
    fb1 = lb1 || lb2;
    fd0 *= -1;
    ab1 = ab2 && ab3;
if(ao2 != null){
      ao1 = ao2.m4();
}
    double ld3 = 850.326674165867;
if(ao3 != null){
      ab4 = ao3.m2(fd0, fd1, ld0, ld3, fb0, fb1, lb1, lb2);
}

Thought.STACK_COUNTER++;
return ab1;
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
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    boolean lb0 = false;
    fd0 = fd1 + ad1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, lb0, ab1);
}
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0);
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3);
}
if(ao3 != null){
      ao2 = ao3.m4(ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      ad4 = ao4.m3();
}
    fd0 = fd1 + ad1;
    fb1 = !lb0;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    Thought lo1 = Thought75.getInstance(ao1, ao2, ao3, ao4, fd1, ad1, ad2, ad3, fb0, fb1, lb0, ab1);
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3, ab2, ab3, ab4, fb0);
}
    fb1 = !lb0;
    ab1 = !ab2;
if(ao4 != null){
      ab3 = ao4.m2(ad4, fd0, fd1, ad1);
}
    boolean lb2 = true;
    ad2 = ad3 - ad4;
    ab3 = ab4 || fb0;
    boolean lb3 = false;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, ad1, ad2);
}
    fb0 = !fb1;
    double ld4 = 161.17860225097598;
    ad2 = ad3 + ad4;
if(fo0 != null){
      fd0 = fo0.m3(lb0, lb2, lb3, ab1);
}
if(fo1 != null){
      fo1.m1();
}
    Output.points[1][7] += fd1;

Thought.STACK_COUNTER++;
return ab2;
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
    fd0 = fd1 - fd0;
    fb1 = fb0 || fb1;
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fb0 = fo0.m2();
}
    double ld0 = 816.2831261697739;
    fb1 = ld0 > fd0;
    fb0 = !fb1;
    for(int i0=0; i0<10; i0++){
        boolean lb1 = true;
        double ld2 = 352.8034109614713;
        lb1 = !fb0;
        Thought lo3 = Thought76.getInstance(fd0, fd1, ld2, ld0, fb1, lb1, fb0, fb1);
        lb1 = fb0 || fb1;
        Thought lo4 = Thought7.getInstance(fo1, fo0, fo1, fo0);
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
    fd0 *= -1;
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
    fd1 *= -1;
    boolean lb0 = false;
    lb0 = ab1 && ab2;
    fd0 = fd1 - fd0;
    Thought lo1 = Thought97.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
    lb0 = !ab1;
    Output.points[1][8] += fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
        fb1 = lb0 && ab1;
    ab2 = !ab3;
    fd0 = fd1 + fd0;
    fd1 *= -1;
    Output.points[2][0] += fd0;
    boolean lb2 = false;
    double ld3 = 143.63396491867158;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld3, fd0);
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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    Output.points[2][1] -= fd0;
if(fo1 != null){
      fb0 = fo1.m2(fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
    fb0 = fd1 < ad1;
    boolean lb1 = true;
    ad2 *= -1;
if(fo0 != null){
      fb0 = fo0.m2();
}
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1, fb1, lb0, lb1, fb0);
}
    Thought lo2 = Thought50.getInstance(fo1, fo0, fo1, fo0);
    Output.points[2][2] -= ad1;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, lb0, lb1, fb0, fb1);
}
    lb0 = fd1 > ad1;
    lb1 = fb0 && fb1;
    double ld3 = 429.5950589166213;
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, lb0, lb1, fb0, fb1);
}
    lb0 = ad2 < ad3;
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ld3);
}
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          lb1 = fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
        fd0 = fd1 - ld3;
if(fo0 != null){
          fb0 = fo0.m2(fb1, lb0, lb1, fb0);
}
        ad1 = ad2 + ad3;
        boolean lb4 = true;
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 || ab4;
    ad2 = ad3 + ad4;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb0 = fb1 || ab1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
}
    boolean lb0 = true;
    ad1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
    Thought lo1 = Thought21.getInstance(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought68.getInstance(fb1, fb0, fb1, fb0);
    fb1 = fb0 && fb1;
    double ld1 = 998.5655115703876;
    fb0 = !fb1;
if(ao2 != null){
      ao1 = ao2.m4();
}
    ld1 = fd0 - fd1;
    ld1 = fd0 + fd1;
if(ao3 != null){
      fb0 = ao3.m2(ld1, fd0, fd1, ld1, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
      fb1 = ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, ld1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    fb1 = !fb0;
    Thought lo2 = Thought43.getInstance(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
    fd1 = ld1 - fd0;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 - ad3;
    fb1 = !fb0;
    fb1 = ad4 > fd0;
if(ao1 != null){
      fd1 = ao1.m3(ad1, ad2, ad3, ad4);
}
    fd0 = fd1 - ad1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
    fd1 = ad1 + ad2;
    fb0 = ad3 > ad4;
    fd0 = fd1 + ad1;
if(ao2 != null){
      ad2 = ao2.m3(fb1, fb0, fb1, fb0);
}
    ad3 = ad4 - fd0;
    fd1 = ad1 + ad2;

Thought.STACK_COUNTER++;
return ad3;
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
    ab2 = !ab3;
    ab4 = !fb0;
    boolean lb0 = true;
    Thought lo1 = Thought41.getInstance();
    fb0 = fb1 && lb0;
    boolean lb2 = true;
if(ao1 != null){
      fd1 = ao1.m3(fd0, fd1, fd0, fd1, lb2, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    boolean lb3 = false;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, lb0, lb2, lb3, ab1);
}
    fd0 = fd1 + fd0;
    Thought lo4 = Thought17.getInstance(ao1, ao2, ao3, ao4, ab2, ab3, ab4, fb0);
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo0.m2(fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    fd1 = fd0 - fd1;
    fb1 = !lb0;
    Thought lo5 = Thought4.getInstance(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);

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
    ab2 = ad2 < ad3;
    boolean lb0 = true;
if(ao2 != null){
      ao2.m2(ab2, ab3, ab4, fb0);
}
    ad4 = fd0 + fd1;
    fb1 = lb0 && ab1;
    ab2 = ab3 || ab4;
if(ao3 != null){
      ao3.m3();
}
    Output.points[2][3] += ad1;
    fb0 = fb1 && lb0;
if(ao4 != null){
      ab1 = ao4.m2(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, lb0, ab1, ab2, ab3);
}
    Thought lo1 = Thought31.getInstance(ao3, ao4, fo0, fo1, ab4, fb0, fb1, lb0);
    fd0 = fd1 - ad1;
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0);
}
    if (ab1) {
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ad1, ad2, ad3);
}
if(ao4 != null){
          ao3 = ao4.m4(ab2, ab3, ab4, fb0);
}
        ad4 *= -1;
        double ld2 = 676.8094069358613;
        Thought lo3 = Thought7.getInstance();
if(fo0 != null){
          fb1 = fo0.m2(ad4, fd0, fd1, ld2, lb0, ab1, ab2, ab3);
}
        ad1 *= -1;
        Output.points[2][4] -= ad2;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
        ab4 = ad3 < ad4;
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    Thought lo0 = Thought94.getInstance(fd1, fd0, fd1, fd0);
    fd1 = fd0 - fd1;
    Output.points[2][5] -= fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo1.m1(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb0 = fd0 < fd1;
    fb1 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 < fd1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
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
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
    boolean lb0 = true;
    Thought lo1 = Thought99.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
    Thought lo2 = Thought34.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, lb0, ab1);
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
    for(int i0=0; i0<10; i0++){
        ab2 = !ab3;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
        ab4 = !fb0;
        boolean lb3 = false;
        Thought lo4 = Thought47.getInstance(fb0, fb1, lb3, lb0);
        boolean lb5 = false;
if(fo1 != null){
          fd0 = fo1.m3();
}
        fd1 = fd0 - fd1;
if(fo0 != null){
          fo0.m2(fd0, fd1, fd0, fd1, lb0, ab1, ab2, ab3);
}
        boolean lb6 = true;
        Thought lo7 = Thought84.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
        Thought lo8 = Thought9.getInstance(fo1, fo0, fo1, fo0, lb3, lb5, lb6, lb0);
        fd0 *= -1;
        ab1 = ab2 || ab3;
if(fo0 != null){
          fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
        ab4 = fb0 || fb1;
        fd1 *= -1;
        lb3 = fd0 > fd1;
        double ld9 = 569.1295589622353;
        boolean lb10 = true;
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
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    for(int i0=0; i0<10; i0++){
        boolean lb0 = false;
        ad1 = ad2 - ad3;
        ad4 *= -1;
        fb0 = fd0 > fd1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
        fb1 = lb0 || fb0;
if(fo0 != null){
          fb1 = fo0.m2(lb0, fb0, fb1, lb0);
}
        fd0 = fd1 + ad1;
        ad2 = ad3 - ad4;
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
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    double ld0 = 463.52517543877457;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    ab1 = ad4 < fd0;
    Thought lo1 = Thought58.getInstance(fo1, fo0, fo1, fo0, fd1, ld0, ad1, ad2, ab2, ab3, ab4, fb0);
    ad3 *= -1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
}
    ab4 = !fb0;
if(fo0 != null){
      fo0.m2(ad4, fd0, fd1, ld0);
}
    ad1 = ad2 + ad3;
    for(int i0=0; i0<10; i0++){
        if (fb1) {
            ab1 = ad4 < fd0;
}}
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
    fd0 = fd1 + fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    double ld0 = 749.8383115150399;
    double ld1 = 483.0864930391824;
    ld1 = fd0 - fd1;
if(ao2 != null){
      ao1 = ao2.m4(fb1, fb0, fb1, fb0);
}
    Thought lo2 = Thought65.getInstance();
    ld0 = ld1 - fd0;
    fb1 = !fb0;
    double ld3 = 997.9920648045961;
        fd0 = fd1 - ld0;
    Thought lo4 = Thought41.getInstance(ld1, ld3, fd0, fd1, fb1, fb0, fb1, fb0);
    Output.points[2][6] += ld0;
    ld1 = ld3 + fd0;
    fd1 *= -1;
    Thought lo5 = Thought42.getInstance(ao3, ao4, fo0, fo1);
    boolean lb6 = false;
    Thought lo7 = Thought20.getInstance(ao1, ao2, ao3, ao4, ld0, ld1, ld3, fd0, fb0, fb1, lb6, fb0);
    boolean lb8 = false;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
    ad1 = ad2 - ad3;
if(ao1 != null){
      fb0 = ao1.m2(ad4, fd0, fd1, ad1);
}
    ad2 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1);
}
if(ao3 != null){
      ao2 = ao3.m4(fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought41.getInstance();
    double ld1 = 230.30069536394703;
    ld1 = ad1 - ad2;
if(fo0 != null){
      ao4 = fo0.m4(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    ld1 = ad1 - ad2;
    boolean lb2 = true;
    boolean lb3 = false;
    lb3 = fb0 && fb1;
if(fo1 != null){
      ad3 = fo1.m3(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ld1, lb2, lb3, fb0, fb1);
}
    boolean lb4 = false;
    ad1 = ad2 + ad3;
    boolean lb5 = true;
    boolean lb6 = true;
if(fo0 != null){
      ad4 = fo0.m3(fo1, ao1, ao2, ao3, lb2, lb3, lb4, lb5);
}
    lb6 = fd0 > fd1;
    ld1 = ad1 + ad2;

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
    boolean lb0 = false;
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
    ab1 = ab2 || ab3;
    double ld1 = 316.8723404853127;
    boolean lb2 = true;
    double ld3 = 22.21010365999919;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld3, fd0, fd1, ld1);
}
if(ao4 != null){
      ao3 = ao4.m4(ab3, ab4, fb0, fb1);
}
    boolean lb4 = false;
    double ld5 = 823.0258720336004;
    lb0 = !lb2;
if(fo0 != null){
      ld3 = fo0.m3();
}
    lb4 = ab1 || ab2;
    Thought lo6 = Thought55.getInstance(ld5, fd0, fd1, ld1, ab3, ab4, fb0, fb1);
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4);
}
    if (lb0) {
        lb2 = lb4 || ab1;
        ld3 = ld5 + fd0;
        ab2 = !ab3;
        fd1 = ld1 + ld3;
}
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 972.2606727117677;
    Thought lo1 = Thought84.getInstance(ao2, ao3, ao4, fo0, ld0, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
if(fo1 != null){
      ad4 = fo1.m3(ao1, ao2, ao3, ao4, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld0, ad1, ad2);
}
    ad3 *= -1;
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ld0);
}
    Output.points[2][7] += ad1;
    ab3 = ab4 && fb0;
if(fo0 != null){
      fo0.m2(fb1, ab1, ab2, ab3);
}
    ad2 *= -1;
if(fo1 != null){
          fo1.m3();
}
    for(int i0=0; i0<10; i0++){
        ad3 = ad4 - fd0;
        boolean lb2 = false;
        ab3 = ab4 && fb0;
        Output.points[2][8] += fd1;
if(ao2 != null){
          ao1 = ao2.m4(ld0, ad1, ad2, ad3, fb1, lb2, ab1, ab2);
}
        for(int i1=0; i1<10; i1++){
            double ld3 = 251.37675059083085;
if(ao4 != null){
              ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
            ad3 *= -1;
            double ld4 = 585.0817004516094;
if(ao3 != null){
              ad3 = ao3.m3(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ld3, ab3, ab4, fb0, fb1);
}
            lb2 = ab1 || ab2;
            double ld5 = 257.5496028059865;
}}
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
    fb1 = fb0 || fb1;
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo1.m3(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fb0 = fd0 > fd1;
if(fo1 != null){
          fd0 = fo1.m3(fb1, fb0, fb1, fb0);
}
    Output.points[3][0] -= fd1;
    fb1 = !fb0;

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
    Thought lo0 = Thought61.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Output.points[3][1] += fd0;
    fb1 = fd1 < fd0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    Output.points[3][2] -= fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo0.m2(fd0, fd1, fd0, fd1);
}
    Thought lo1 = Thought62.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
    fd0 *= -1;
    fb0 = fb1 || fb0;
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    fd1 = fd0 + fd1;
    double ld2 = 619.7284762418099;

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
    fb0 = fb1 && fb0;
    fb1 = fb0 && fb1;
if(fo1 != null){
      fb0 = fo1.m2();
}
    fb1 = fd0 > fd1;
    fb0 = !fb1;
if(fo0 != null){
      fo0.m1(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    Thought lo0 = Thought41.getInstance(fo1, fo0, fo1, fo0);
    double ld1 = 429.64802447229334;
    double ld2 = 843.4737045304436;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld1, ld2, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    boolean lb3 = false;
    Thought lo4 = Thought23.getInstance(fo1, fo0, fo1, fo0, lb3, fb0, fb1, lb3);
    ld1 = ld2 - fd0;
    Output.points[3][3] += fd1;
    Thought lo5 = Thought41.getInstance(ld1, ld2, fd0, fd1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld1, ld2, fd0, fd1);
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
