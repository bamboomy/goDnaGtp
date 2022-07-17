package genetic;
import java.util.ArrayList;
class Thought57 extends Thought{
private static ArrayList<Thought57> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 367.46331325608134;
private double fd1 = 881.5334171221369;
private Thought fo0 = null;
private Thought fo1 = null;
Thought57 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought57 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought57 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought57 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought57 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought57 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought57 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought57 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought57 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought57 instance = new Thought57 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought57 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought57 instance = new Thought57 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought57 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought57 instance = new Thought57 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought57 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought57 instance = new Thought57 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought57 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought57 instance = new Thought57 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought57 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought57 instance = new Thought57 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought57 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought57 instance = new Thought57 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought57 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought57 instance = new Thought57 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fb0 = fb1 || fb0;
    fd0 *= -1;
    fb1 = fb0 || fb1;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought203.getInstance(fb0, fb1, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd0 = fd1 + fd0;
    fb0 = fd1 > fd0;
    fd1 *= -1;
        fd0 *= -1;
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    double ld2 = 824.1115984655696;
    fd0 = fd1 + ld2;
    for(int i0=0; i0<10; i0++){
        boolean lb3 = false;
        double ld4 = 771.8086064465588;
        lb1 = ld2 > fd0;
        fb0 = fd1 > ld4;
        fb1 = ld2 > fd0;
        Output.points[3][7] -= fd1;
        double ld5 = 30.20244056751548;
        lb3 = lb1 || fb0;
        fb1 = ld4 > ld5;
        ld2 *= -1;
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
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo1.m3(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    ab1 = fd1 < fd0;
    double ld0 = 585.3855946320925;
    double ld1 = 962.7444870748903;
    boolean lb2 = true;
if(fo0 != null){
      fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      ld1 = fo1.m3(fo0, fo1, fo0, fo1);
}
        boolean lb3 = false;
    double ld4 = 882.356290277899;
    ab4 = ld4 > fd0;
    boolean lb5 = false;
    Output.points[3][8] += fd1;
    ld0 = ld1 + ld4;
if(fo0 != null){
      ab4 = fo0.m2(fd0, fd1, ld0, ld1);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ld4, fd0, fd1, ld0);
}
    fb0 = ld1 > ld4;
    boolean lb6 = false;
    fb0 = fb1 || lb2;

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
    ad2 = ad3 - ad4;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    ad3 = ad4 + fd0;
    Thought lo0 = Thought129.getInstance();
    if (fb0) {
        boolean lb1 = true;
        fd1 *= -1;
        ad1 *= -1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb0, fb1, lb1, fb0);
}
if(fo0 != null){
          fo1 = fo0.m4(fb1, lb1, fb0, fb1);
}
        lb1 = !fb0;
        Thought lo2 = Thought52.getInstance(fo1, fo0, fo1, fo0);
        fd1 *= -1;
        ad1 = ad2 + ad3;
        Thought lo3 = Thought276.getInstance(ad4, fd0, fd1, ad1);
        boolean lb4 = true;
        ad2 = ad3 - ad4;
        Thought lo5 = Thought100.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
        ad3 = ad4 + fd0;
        fb0 = fd1 < ad1;
        double ld6 = 339.8430785643448;
        Output.points[4][0] += ad1;
        ad2 = ad3 - ad4;
        Output.points[4][1] += fd0;
if(fo1 != null){
          fd1 = fo1.m3(ld6, ad1, ad2, ad3, fb1, lb1, lb4, fb0);
}
        Thought lo7 = Thought121.getInstance(fo0, fo1, fo0, fo1, fb1, lb1, lb4, fb0);
        ad4 *= -1;
        fd0 = fd1 + ld6;
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
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 *= -1;
    Thought lo0 = Thought23.getInstance();
    if (ab2) {
        ab3 = ad3 < ad4;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, ab4, fb0, fb1, ab1);
}
if(fo0 != null){
          fo0.m1(ab2, ab3, ab4, fb0);
}
        Thought lo1 = Thought219.getInstance(fo1, fo0, fo1, fo0);
        ad3 *= -1;
        Thought lo2 = Thought202.getInstance(ad4, fd0, fd1, ad1);
        fb1 = ab1 || ab2;
        boolean lb3 = true;
        ad2 *= -1;
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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    fb0 = fd0 < fd1;
    double ld0 = 111.14239907746384;
if(ao3 != null){
      ao2 = ao3.m4(ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    fd0 *= -1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb1, fb0, fb1, fb0);
}
    boolean lb1 = true;
    fd1 *= -1;
    ld0 = fd0 + fd1;
    double ld2 = 264.4915844425842;
    ld0 = ld2 + fd0;
if(ao4 != null){
      fd1 = ao4.m3();
}
    fb0 = fb1 || lb1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, ao1, ao2, ao3, ld0, ld2, fd0, fd1, fb1, lb1, fb0, fb1);
}
    boolean lb3 = false;
    lb1 = ld0 > ld2;
if(ao4 != null){
      fd0 = ao4.m3(lb3, fb0, fb1, lb1);
}
    Thought lo4 = Thought187.getInstance(fo0, fo1, ao1, ao2);
if(ao3 != null){
      lb3 = ao3.m2(fd1, ld0, ld2, fd0);
}
    Thought lo5 = Thought125.getInstance(ao4, fo0, fo1, ao1, fd1, ld0, ld2, fd0);
    if (fb0) {
if(ao3 != null){
          ao2 = ao3.m4(fd1, ld0, ld2, fd0, fb1, lb1, lb3, fb0);
}
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb1, lb1, lb3, fb0);
}
        Thought lo6 = Thought349.getInstance();
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, ld0, ld2, fd0, fb1, lb1, lb3, fb0);
}
        fb1 = !lb1;
        boolean lb7 = true;
if(fo0 != null){
          ao4 = fo0.m4(lb1, lb3, fb0, fb1);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0);
}
    double ld0 = 833.8001183116079;
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, ld0, ad1, ad2);
}
if(ao3 != null){
      ao2 = ao3.m4(ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    double ld1 = 250.5785709221969;
    boolean lb2 = false;
if(ao4 != null){
      ld0 = ao4.m3(fo0, fo1, ao1, ao2, lb2, fb0, fb1, lb2);
}
    boolean lb3 = false;
    ld1 = ad1 - ad2;
    ad3 *= -1;
    ad4 *= -1;
    lb3 = fd0 > fd1;
    double ld4 = 132.30312201262385;
    fb0 = fb1 || lb2;
if(ao3 != null){
      ao3.m2();
}
    Thought lo5 = Thought128.getInstance(ao4, fo0, fo1, ao1, ld0, ld1, ld4, ad1, lb3, fb0, fb1, lb2);
    Thought lo6 = Thought362.getInstance(lb3, fb0, fb1, lb2);
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1);
}
    ad2 *= -1;
if(ao1 != null){
      lb3 = ao1.m2(ad3, ad4, fd0, fd1);
}
        ld0 = ld1 - ld4;
    ad1 = ad2 + ad3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ld0);
}
if(ao2 != null){
      fb0 = ao2.m2(ld1, ld4, ad1, ad2, fb1, lb2, lb3, fb0);
}
    Output.points[4][2] += ad3;
    ad4 *= -1;
    Thought lo7 = Thought34.getInstance(ao3, ao4, fo0, fo1, fb1, lb2, lb3, fb0);

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
if(ao1 != null){
      fd1 = ao1.m3();
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(ao2 != null){
      fd0 = ao2.m3(fb1, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1);
}
    Thought lo0 = Thought86.getInstance(fd1, fd0, fd1, fd0);
    ab1 = !ab2;
    double ld1 = 597.2480038335647;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, ld1, fd0, fd1);
}
    Thought lo2 = Thought137.getInstance(ld1, fd0, fd1, ld1, ab3, ab4, fb0, fb1);
    boolean lb3 = false;
    lb3 = fd0 > fd1;
    Thought lo4 = Thought130.getInstance(ao1, ao2, ao3, ao4, ab1, ab2, ab3, ab4);
if(fo1 != null){
      fo0 = fo1.m4();
}
    ld1 = fd0 + fd1;
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, ld1, fd0, fd1, ld1, fb1, lb3, ab1, ab2);
}
    boolean lb5 = false;
if(ao1 != null){
      fo1 = ao1.m4(ab2, ab3, ab4, fb0);
}
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1);
}
    fb1 = lb3 && lb5;
if(ao1 != null){
      ao1.m1(fd0, fd1, ld1, fd0);
}
if(ao2 != null){
      ab1 = ao2.m2(ao3, ao4, fo0, fo1, fd1, ld1, fd0, fd1);
}
    boolean lb6 = true;

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
    ad1 = ad2 + ad3;
if(ao1 != null){
      ad4 = ao1.m3(fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
    boolean lb0 = true;
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, ab4, fb0, fb1, lb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ab1, ab2, ab3, ab4);
}
    boolean lb1 = true;
    Thought lo2 = Thought248.getInstance(ao4, fo0, fo1, ao1);
    ab4 = !fb0;

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
    fb1 = fb0 || fb1;
    fd0 *= -1;
    fd1 *= -1;
if(fo1 != null){
      fo1.m2(fd0, fd1, fd0, fd1);
}
        fb0 = fb1 || fb0;
    fd0 = fd1 + fd0;
    double ld0 = 396.33947102443244;
    fb1 = !fb0;
    Thought lo1 = Thought117.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
    fb1 = fd1 > ld0;
if(fo0 != null){
      fb0 = fo0.m2(fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
if(fo0 != null){
      fb1 = fo0.m2();
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + ld0;

Thought.STACK_COUNTER++;
return fb0;
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
if(fo0 != null){
      fo0.m3(ab2, ab3, ab4, fb0);
}
    fb1 = ab1 || ab2;
    ab3 = !ab4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd1 *= -1;
    fb0 = !fb1;
    ab1 = fd0 > fd1;
    ab2 = fd0 > fd1;
if(fo1 != null){
      fo1.m3(fd0, fd1, fd0, fd1);
}
    double ld0 = 960.4070485319091;
    ab3 = ab4 || fb0;

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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 52.55663151413601;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, ld0, ad1, ad2, ad3);
}
    fb1 = fb0 || fb1;
if(fo1 != null){
      fb0 = fo1.m2(ad4, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    Thought lo1 = Thought231.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
        ad1 = ad2 + ad3;
if(fo1 != null){
      fo0 = fo1.m4();
}
        double ld2 = 465.77170134726083;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    Output.points[4][3] += ld0;
if(fo0 != null){
      fb1 = fo0.m2(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m1(ld2, ad1, ad2, ad3);
}
if(fo0 != null){
          fb0 = fo0.m2(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld0);
}
    boolean lb3 = false;
    Thought lo4 = Thought296.getInstance(ld2, ad1, ad2, ad3, fb0, fb1, lb3, fb0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb3, fb0, fb1);
}
    Output.points[4][4] += ad4;
if(fo0 != null){
      fo1 = fo0.m4();
}
    lb3 = fd0 > fd1;
    ld0 = ld2 - ad1;

Thought.STACK_COUNTER++;
return fb0;
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
    Output.points[4][5] += ad2;
    Thought lo0 = Thought133.getInstance(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, ab1, ab2);
}
    ab3 = ad1 > ad2;
    ab4 = ad3 < ad4;
    boolean lb1 = true;
if(fo1 != null){
      ab4 = fo1.m2(fo0, fo1, fo0, fo1);
}
    fd0 = fd1 + ad1;
    boolean lb2 = true;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
    Thought lo3 = Thought343.getInstance(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
if(fo0 != null){
      fo0.m1(ad4, fd0, fd1, ad1, ab4, fb0, fb1, lb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb2, ab1, ab2, ab3);
}
if(fo1 != null){
      ad2 = fo1.m3();
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, ab4, fb0, fb1, lb1);
}
    lb2 = ad1 < ad2;
if(fo0 != null){
      ad3 = fo0.m3(ab1, ab2, ab3, ab4);
}

Thought.STACK_COUNTER++;
return fb0;
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
    fd1 = fd0 + fd1;
    fb1 = fb0 || fb1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fb0 = fb1 || fb0;
    fd0 = fd1 + fd0;
        fd1 = fd0 - fd1;
    double ld0 = 28.309717349206977;
    ld0 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ld0, fd0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, ld0, fd0, fd1);
}
    boolean lb1 = true;
if(fo0 != null){
      ao4 = fo0.m4(ld0, fd0, fd1, ld0, fb0, fb1, lb1, fb0);
}
    boolean lb2 = false;
    boolean lb3 = true;
if(fo1 != null){
      lb3 = fo1.m2(ao1, ao2, ao3, ao4, fb0, fb1, lb1, lb2);
}
    fd0 *= -1;
    Thought lo4 = Thought38.getInstance();

Thought.STACK_COUNTER++;
return lb3;
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
    fb1 = ad1 < ad2;
    Thought lo0 = Thought336.getInstance(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
        boolean lb1 = true;
if(fo0 != null){
      fo0.m3(lb1, fb0, fb1, lb1);
}
    fb0 = fb1 && lb1;
    ad1 = ad2 + ad3;
    fb0 = ad4 > fd0;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    fd1 = ad1 + ad2;
    boolean lb2 = true;
    boolean lb3 = false;
    boolean lb4 = false;
if(ao1 != null){
      fo1 = ao1.m4(ad3, ad4, fd0, fd1);
}

Thought.STACK_COUNTER++;
return lb3;
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
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    ab1 = fd0 > fd1;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    boolean lb1 = true;
    double ld2 = 571.7534429744106;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fb0, fb1, lb0, lb1);
}
    boolean lb3 = false;
    lb3 = ab1 || ab2;
    boolean lb4 = true;
    Thought lo5 = Thought192.getInstance();
    ab2 = ld2 < fd0;
    fd1 *= -1;
    ld2 = fd0 + fd1;
    ld2 = fd0 - fd1;
    ld2 = fd0 - fd1;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 - ad3;
    Thought lo0 = Thought347.getInstance(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1, ab2, ab3, ab4, fb0);
if(ao1 != null){
      fo1 = ao1.m4(fb1, ab1, ab2, ab3);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    Output.points[4][6] -= ad2;
if(ao2 != null){
      ab4 = ao2.m2(ad3, ad4, fd0, fd1);
}
    fb0 = ad1 > ad2;
    ad3 = ad4 + fd0;
    boolean lb1 = true;
    Thought lo2 = Thought376.getInstance(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3);
    Thought lo3 = Thought117.getInstance(ad4, fd0, fd1, ad1, fb0, fb1, lb1, ab1);
if(ao1 != null){
      ad2 = ao1.m3(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
}
    fb1 = !lb1;
    ab1 = !ab2;
    boolean lb4 = true;
if(ao1 != null){
      fo1 = ao1.m4();
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(ao2 != null){
      fb1 = ao2.m2(lb1, lb4, ab1, ab2);
}
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1);
}
    Thought lo5 = Thought15.getInstance(ad1, ad2, ad3, ad4);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2);
}
    ab3 = !ab4;
    boolean lb6 = true;
if(ao3 != null){
      ao2 = ao3.m4(ad3, ad4, fd0, fd1, ab4, fb0, fb1, lb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, lb4, lb6, ab1, ab2);
}
    ab3 = ab4 && fb0;
if(ao4 != null){
      ad1 = ao4.m3();
}
    ad2 = ad3 - ad4;
    if (fb1) {
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought217.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
    boolean lb1 = false;
if(fo0 != null){
      fb0 = fo0.m2(fb1, lb1, fb0, fb1);
}
    lb1 = fb0 && fb1;
    lb1 = fd0 < fd1;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
    fb1 = !lb1;
    boolean lb2 = false;
    Output.points[4][7] -= fd1;
    Output.points[4][8] += fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    boolean lb3 = false;
    Thought lo4 = Thought173.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1, lb2, lb3, fb0, fb1);
}
if(fo1 != null){
      lb1 = fo1.m2(fo0, fo1, fo0, fo1, lb2, lb3, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      lb1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb2, lb3, fb0, fb1);
}
    Output.points[5][0] += fd0;
    fd1 = fd0 + fd1;
if(fo1 != null){
      lb1 = fo1.m2(lb2, lb3, fb0, fb1);
}
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo0.m3(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;

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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    boolean lb0 = true;
    Thought lo1 = Thought37.getInstance(fd1, fd0, fd1, fd0, lb0, ab1, ab2, ab3);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb0);
}
    ab1 = ab2 && ab3;
    ab4 = !fb0;
if(fo1 != null){
      fd1 = fo1.m3();
}
    boolean lb2 = true;
    fd0 = fd1 - fd0;
    fd1 *= -1;
    double ld3 = 563.5792476014636;
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld3, fd0, fd1, ld3, lb0, lb2, ab1, ab2);
}
    fd0 = fd1 - ld3;
    for(int i0=0; i0<10; i0++){
        Thought lo4 = Thought237.getInstance(ab3, ab4, fb0, fb1);
        lb0 = lb2 || ab1;
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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[5][1] -= ad1;
    fb1 = ad2 > ad3;
    Output.points[5][2] -= ad4;
    fb0 = fb1 && fb0;
    fb1 = fd0 > fd1;
    fb0 = !fb1;
    fb0 = fb1 || fb0;
    ad1 = ad2 - ad3;
    Output.points[5][3] += ad4;
    fd0 *= -1;
    fd1 = ad1 + ad2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb1 = fb0 || fb1;
    for(int i0=0; i0<10; i0++){
        fb0 = ad3 < ad4;
        }
    fd0 *= -1;
        Thought lo0 = Thought290.getInstance(fd1, ad1, ad2, ad3);
    Thought lo1 = Thought181.getInstance(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
    ad2 = ad3 + ad4;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    Output.points[5][4] += ad3;
    boolean lb2 = false;
if(fo1 != null){
      fb0 = fo1.m2();
}
    fb1 = lb2 && fb0;

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
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    fd0 = fd1 + ad1;
if(fo1 != null){
      ad2 = fo1.m3(fb1, ab1, ab2, ab3);
}
    boolean lb0 = false;
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0);
}
    double ld1 = 974.0815941077673;
    double ld2 = 76.41581376322632;
    ad2 = ad3 - ad4;
if(fo1 != null){
      fd0 = fo1.m3(fd1, ld1, ld2, ad1);
}
    Output.points[5][5] -= ad2;
    ab3 = ad3 > ad4;
    ab4 = fd0 > fd1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ld1, ld2, ad1, ad2);
}
if(fo1 != null){
      ad3 = fo1.m3(ad4, fd0, fd1, ld1, fb0, fb1, lb0, ab1);
}
    double ld3 = 498.2348371061388;
    ab2 = ld2 > ld3;
    boolean lb4 = true;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo1.m1();
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb1, lb0, lb4, ab1);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m2(fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + fd0;
    Output.points[5][6] -= fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    boolean lb0 = false;
    fb0 = fd0 > fd1;
    boolean lb1 = false;
if(ao2 != null){
      ao2.m1(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
        fd1 = fd0 - fd1;
    Thought lo2 = Thought158.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb1);
}
    fb0 = fd0 < fd1;
        fb1 = !lb0;
    fd0 = fd1 - fd0;
    Thought lo3 = Thought13.getInstance(ao3, ao4, fo0, fo1, lb1, fb0, fb1, lb0);
if(ao1 != null){
      ao1.m3();
}
    lb1 = !fb0;
    boolean lb4 = true;
    fb0 = fb1 || lb0;
    lb1 = lb4 && fb0;
    Thought lo5 = Thought45.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, fb1, lb0, lb1, lb4);
    Output.points[5][7] -= fd1;
if(ao1 != null){
      fo1 = ao1.m4(fb0, fb1, lb0, lb1);
}
    fd0 = fd1 + fd0;
if(ao2 != null){
      lb4 = ao2.m2(ao3, ao4, fo0, fo1);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m3(ad1, ad2, ad3, ad4);
}
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2);
}
    ad3 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought20.getInstance();
    fb0 = ad2 > ad3;
    ad4 *= -1;
    fb1 = fb0 && fb1;
    fd0 = fd1 - ad1;
    Output.points[5][8] += ad2;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    ad1 = ad2 - ad3;
    ad4 = fd0 + fd1;
if(ao2 != null){
      ad1 = ao2.m3(fb0, fb1, fb0, fb1);
}
    ad2 = ad3 - ad4;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    for(int i0=0; i0<10; i0++){
        }
    lb0 = !ab1;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0);
}
    Thought lo1 = Thought35.getInstance(fd1, fd0, fd1, fd0);
    fd1 *= -1;
    fd0 *= -1;
    fd1 = fd0 + fd1;
    double ld2 = 843.2965328116242;
    boolean lb3 = false;
    boolean lb4 = true;
    double ld5 = 328.30852942387816;
    lb4 = !ab1;
    Thought lo6 = Thought21.getInstance(fo1, ao1, ao2, ao3, ld2, ld5, fd0, fd1);
    ld2 = ld5 + fd0;
if(ao4 != null){
      ao4.m1(fd1, ld2, ld5, fd0, ab2, ab3, ab4, fb0);
}
    Thought lo7 = Thought185.getInstance(fo0, fo1, ao1, ao2, fb1, lb0, lb3, lb4);
if(ao3 != null){
      fd1 = ao3.m3();
}
    ab1 = ld2 > ld5;
    ab2 = fd0 < fd1;
    ab3 = ld2 > ld5;
if(ao4 != null){
      ab4 = ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, ld2, ld5, fb0, fb1, lb0, lb3);
}
    lb4 = !ab1;
    ab2 = fd0 > fd1;
    ab3 = ld2 < ld5;
    boolean lb8 = false;
    boolean lb9 = true;
    Thought lo10 = Thought213.getInstance(ab2, ab3, ab4, fb0);

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
if(ao1 != null){
      ab1 = ao1.m2(ao2, ao3, ao4, fo0);
}
    ab2 = ad2 < ad3;
if(ao1 != null){
      fo1 = ao1.m4(ad4, fd0, fd1, ad1);
}
    ad2 = ad3 + ad4;
if(ao2 != null){
          fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3);
}
if(ao2 != null){
      ao1 = ao2.m4(ad4, fd0, fd1, ad1, ab3, ab4, fb0, fb1);
}
    boolean lb0 = true;
    ad2 = ad3 + ad4;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb0, ab1, ab2, ab3);
}
    boolean lb1 = false;
    fd0 = fd1 - ad1;
    double ld2 = 855.7531603552625;
    Thought lo3 = Thought364.getInstance();
if(ao3 != null){
      ad1 = ao3.m3(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
    Thought lo4 = Thought324.getInstance(lb0, lb1, ab1, ab2);
    boolean lb5 = true;
    ab2 = ab3 && ab4;
    Thought lo6 = Thought201.getInstance(ao2, ao3, ao4, fo0);
    fd1 *= -1;
if(fo1 != null){
      fb0 = fo1.m2(ld2, ad1, ad2, ad3);
}
    fb1 = lb0 && lb1;
    ad4 = fd0 + fd1;
    lb5 = ld2 > ad1;
    Thought lo7 = Thought91.getInstance(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0);

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
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo0.m3(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 < fd0;
    fb0 = fb1 || fb0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    Output.points[6][0] += fd0;
    fb1 = fb0 && fb1;
    fd1 *= -1;
    double ld0 = 999.2033414484072;
        ld0 = fd0 + fd1;
    ld0 = fd0 - fd1;

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
    Output.points[6][1] += fd0;
    Output.points[6][2] += fd1;
if(fo1 != null){
      fo1.m1();
}
    Thought lo0 = Thought277.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fd0 = fd1 + fd0;
    double ld2 = 515.6037213491496;
    for(int i0=0; i0<10; i0++){
        Output.points[6][3] += fd0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb1, ab1, ab2);
}
        Thought lo3 = Thought389.getInstance();
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld2, fd0, fd1, ab3, ab4, fb0, fb1);
}
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
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    for(int i0=0; i0<10; i0++){
        ad1 = ad2 - ad3;
if(fo1 != null){
          ad4 = fo1.m3(fb0, fb1, fb0, fb1);
}
        Thought lo0 = Thought279.getInstance(fo0, fo1, fo0, fo1);
        }
if(fo0 != null){
      fd0 = fo0.m3(fd1, ad1, ad2, ad3);
}
    ad4 = fd0 - fd1;
    fb0 = fb1 && fb0;
    ad1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    fd1 *= -1;
    ad1 = ad2 + ad3;
    fb1 = ad4 > fd0;

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
    ad2 = ad3 - ad4;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
}
    Thought lo0 = Thought57.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
    ab3 = ab4 && fb0;
    Thought lo1 = Thought327.getInstance();
    ad3 = ad4 + fd0;
    fb1 = ab1 || ab2;
    fd1 *= -1;
    Output.points[6][4] += ad1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
    Output.points[6][5] += fd1;
    Thought lo2 = Thought296.getInstance(ab1, ab2, ab3, ab4);
    fb0 = fb1 && ab1;
    ad1 = ad2 - ad3;
    ab2 = ad4 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ab3 = !ab4;
if(fo0 != null){
      fo0.m1(fd1, ad1, ad2, ad3);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(ao1 != null){
      fd1 = ao1.m3(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 < fd1;
    fd0 = fd1 + fd0;
    if (fb1) {
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
        double ld0 = 863.1895778527772;
if(ao2 != null){
          fb0 = ao2.m2();
}
        fd0 *= -1;
        fb1 = !fb0;
        boolean lb1 = false;
        fb0 = !fb1;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ld0, fd0, fd1, lb1, fb0, fb1, lb1);
}
        fb0 = fb1 && lb1;
        double ld2 = 374.6026555921299;
        double ld3 = 710.6985276597618;
        fb0 = ld0 < ld2;
        fb1 = ld3 < fd0;
if(ao3 != null){
          lb1 = ao3.m2(fb0, fb1, lb1, fb0);
}
if(ao4 != null){
          ao4.m3(fo0, fo1, ao1, ao2);
}
        double ld4 = 36.9919828983907;
if(ao4 != null){
          ao3 = ao4.m4(fd0, fd1, ld0, ld2);
}
        fb1 = !lb1;
        fb0 = fb1 || lb1;
        ld3 = ld4 - fd0;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought8.getInstance(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
    fd1 = ad1 + ad2;
    ad3 *= -1;
    fb1 = !fb0;
if(ao1 != null){
      fo1 = ao1.m4(ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ad2 = ao2.m3(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      fb1 = ao1.m2();
}
    fb0 = ad3 < ad4;
    fb1 = fb0 || fb1;
    fb0 = !fb1;
    fd0 *= -1;
    fd1 = ad1 - ad2;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = fd0 < fd1;
    ab2 = fd0 < fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(ao1 != null){
      ao1.m3(ab1, ab2, ab3, ab4);
}
    fd0 = fd1 + fd0;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      fb1 = ao1.m2(fd1, fd0, fd1, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    ab1 = !ab2;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    fd0 = fd1 - fd0;
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2, ab1, ab2, ab3, ab4);
}
    double ld0 = 143.28580437469495;
if(ao4 != null){
      ao3 = ao4.m4();
}
    fb0 = fb1 || ab1;
if(fo0 != null){
      ld0 = fo0.m3(fo1, ao1, ao2, ao3, fd0, fd1, ld0, fd0, ab2, ab3, ab4, fb0);
}
    Thought lo1 = Thought369.getInstance(fb1, ab1, ab2, ab3);

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 || ab4;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0);
}
    fb0 = fb1 && ab1;
    ab2 = !ab3;
    ab4 = fb0 && fb1;
    Thought lo0 = Thought217.getInstance(ad1, ad2, ad3, ad4);
    ab1 = !ab2;
if(fo1 != null){
      fd0 = fo1.m3(ao1, ao2, ao3, ao4, fd1, ad1, ad2, ad3);
}
if(fo0 != null){
      ad4 = fo0.m3(fd0, fd1, ad1, ad2, ab3, ab4, fb0, fb1);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
    ab1 = ab2 && ab3;
    ad3 = ad4 + fd0;

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
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb0 = fd1 > fd0;
    boolean lb0 = false;
    fb0 = fd1 > fd0;
    double ld1 = 315.32792034109417;
    double ld2 = 647.2994181252803;
    ld2 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, ld2, fd0, fd1, fb1, lb0, fb0, fb1);
}
    lb0 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    boolean lb3 = false;
    ld1 *= -1;
    boolean lb4 = true;
    ld2 = fd0 - fd1;
    Thought lo5 = Thought293.getInstance(ld1, ld2, fd0, fd1);

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
    fd0 = fd1 - fd0;
    fb0 = fd1 > fd0;
    fb1 = fd1 > fd0;
    fb0 = !fb1;
    Output.points[6][6] += fd1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought346.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
    fb0 = fb1 || fb0;
    Thought lo1 = Thought393.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
    Output.points[6][7] -= fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
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
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb0 = true;
if(fo0 != null){
      fo0.m3(fd1, fd0, fd1, fd0);
}
    Output.points[6][8] -= fd1;
    fb0 = fd0 > fd1;
    fb1 = lb0 || fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    boolean lb1 = false;
    double ld2 = 886.8222561283504;
    Output.points[7][0] -= ld2;

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
