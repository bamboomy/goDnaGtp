package genetic;
import java.util.ArrayList;
class Thought72 extends Thought{
private static ArrayList<Thought72> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 418.5408705342641;
private double fd1 = 199.54897214718594;
private Thought fo0 = null;
private Thought fo1 = null;
Thought72 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought72 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought72 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought72 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought72 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought72 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought72 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought72 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought72 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought72 instance = new Thought72 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought72 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought72 instance = new Thought72 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought72 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought72 instance = new Thought72 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought72 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought72 instance = new Thought72 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought72 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought72 instance = new Thought72 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought72 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought72 instance = new Thought72 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought72 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought72 instance = new Thought72 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought72 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought72 instance = new Thought72 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    double ld0 = 41.43601338073045;
    boolean lb1 = false;
    lb1 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0, fb1, lb1, fb0, fb1);
}
    lb1 = fb0 && fb1;
    Thought lo2 = Thought392.getInstance(lb1, fb0, fb1, lb1);
    fd0 *= -1;
    fb0 = fb1 && lb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m1(fd1, ld0, fd0, fd1);
}
    for(int i0=0; i0<10; i0++){
        }
    boolean lb3 = false;
    ld0 = fd0 - fd1;
    lb3 = ld0 > fd0;
    double ld4 = 552.0699210334745;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld4);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, ld4, fb0, fb1, lb1, lb3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb1, lb3);
}
if(fo1 != null){
      fb0 = fo1.m2();
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld4, fb1, lb1, lb3, fb0);
}
    double ld5 = 910.2155107791476;
    ld5 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fb1, lb1, lb3, fb0);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ld0, ld4, ld5, fd0);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, ld0, ld4, ld5);
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
    ab2 = fd1 < fd0;
    fd1 *= -1;
    ab3 = ab4 || fb0;
    double ld0 = 447.17389403423914;
    fb1 = ld0 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld0, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = ld0 > fd0;
    fd1 *= -1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
}
    ld0 = fd0 - fd1;
    for(int i0=0; i0<10; i0++){
        ld0 *= -1;
        Thought lo1 = Thought384.getInstance();
        fd0 = fd1 + ld0;
        Output.points[8][7] -= fd0;
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
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
        ad1 *= -1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb0, fb1, lb0, fb0);
}
    boolean lb1 = true;
if(fo1 != null){
      fd1 = fo1.m3(fb0, fb1, lb0, lb1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fb1 = fo1.m2(ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
    lb0 = ad3 < ad4;
    boolean lb2 = false;
    lb1 = fd0 < fd1;
    lb2 = fb0 || fb1;
    Thought lo3 = Thought303.getInstance(ad1, ad2, ad3, ad4, lb0, lb1, lb2, fb0);

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
    ad1 *= -1;
    Thought lo0 = Thought52.getInstance(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
if(fo1 != null){
      fb0 = fo1.m2();
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb1, ab1, ab2, ab3);
}
    boolean lb1 = true;
    ab3 = fd1 < ad1;
if(fo1 != null){
      fo0 = fo1.m4(ab4, fb0, fb1, lb1);
}
    Output.points[8][8] -= ad2;
    ad3 *= -1;
    Thought lo2 = Thought245.getInstance(fo0, fo1, fo0, fo1);
        boolean lb3 = true;
    double ld4 = 348.53015030437234;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
    boolean lb5 = true;
    ld4 = ad1 - ad2;
    lb3 = !lb5;
    ab1 = ab2 || ab3;
    ab4 = fb0 && fb1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
    lb1 = !lb3;
    lb5 = ab1 && ab2;
    ab3 = !ab4;
    boolean lb6 = false;

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
    boolean lb0 = true;
if(ao2 != null){
          ao2.m3(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    fb1 = fd0 < fd1;
    lb0 = fd0 > fd1;
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fb0, fb1, lb0, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
    if (lb0) {
        fd1 *= -1;
        Output.points[0][0] += fd0;
if(ao3 != null){
          ao3.m3(fb0, fb1, lb0, fb0);
}
        Thought lo1 = Thought59.getInstance(ao4, fo0, fo1, ao1);
        boolean lb2 = false;
        fb0 = fb1 && lb2;
if(ao2 != null){
          lb0 = ao2.m2(fd1, fd0, fd1, fd0);
}
        fb0 = fb1 && lb2;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
        double ld3 = 87.03758277889023;
        Thought lo4 = Thought7.getInstance(fd0, fd1, ld3, fd0, lb0, fb0, fb1, lb2);
        lb0 = fb0 || fb1;
if(ao3 != null){
          ao3.m1(ao4, fo0, fo1, ao1, lb2, lb0, fb0, fb1);
}
if(ao2 != null){
          fd1 = ao2.m3();
}
        double ld5 = 415.464556174057;
        ld3 = ld5 + fd0;
if(ao3 != null){
          ao3.m2(ao4, fo0, fo1, ao1, fd1, ld3, ld5, fd0, lb2, lb0, fb0, fb1);
}
        boolean lb6 = true;
        Thought lo7 = Thought2.getInstance(lb2, lb6, lb0, fb0);
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
    boolean lb0 = true;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      ao2.m3(ad2, ad3, ad4, fd0);
}
    fb0 = fb1 && lb0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ad1, ad2, ad3);
}
    Thought lo1 = Thought378.getInstance(ad4, fd0, fd1, ad1, fb0, fb1, lb0, fb0);
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, lb0, fb0, fb1);
}
    double ld2 = 512.4393833192654;
    Output.points[0][1] += ad1;
if(ao4 != null){
      ao3 = ao4.m4();
}
    boolean lb3 = true;
    Output.points[0][2] -= ad2;
    ad3 = ad4 + fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, ao1, ao2, ao3, ld2, ad1, ad2, ad3, lb0, lb3, fb0, fb1);
}
    double ld4 = 115.14345689360376;
    Thought lo5 = Thought196.getInstance(lb0, lb3, fb0, fb1);
    lb0 = ad3 > ad4;
    Thought lo6 = Thought81.getInstance(ao4, fo0, fo1, ao1);
if(ao2 != null){
          ao2.m3(fd0, fd1, ld2, ld4);
}
    lb3 = fb0 || fb1;
    lb0 = ad1 > ad2;
    ad3 = ad4 - fd0;
    Thought lo7 = Thought163.getInstance(ao3, ao4, fo0, fo1, fd1, ld2, ld4, ad1);

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
    Output.points[0][3] -= fd1;
    double ld0 = 457.3355112546199;
    ab2 = ld0 < fd0;
    for(int i0=0; i0<10; i0++){
        fd1 = ld0 + fd0;
        boolean lb1 = true;
        fd1 = ld0 - fd0;
        ab2 = fd1 > ld0;
        double ld2 = 631.5554958375856;
        for(int i1=0; i1<10; i1++){
if(ao2 != null){
              ao1 = ao2.m4(ld0, fd0, fd1, ld2, ab3, ab4, fb0, fb1);
}
            double ld3 = 730.3626798044484;
            ld2 *= -1;
if(ao3 != null){
              ld0 = ao3.m3(ao4, fo0, fo1, ao1, lb1, ab1, ab2, ab3);
}
if(ao3 != null){
              ao2 = ao3.m4();
}
            boolean lb4 = true;
if(ao4 != null){
              ao4.m1(fo0, fo1, ao1, ao2, fd0, fd1, ld3, ld2, ab3, ab4, fb0, fb1);
}
            Thought lo5 = Thought55.getInstance(lb4, lb1, ab1, ab2);
            boolean lb6 = false;
}}
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
    ab1 = ad1 < ad2;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(ad3, ad4, fd0, fd1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4);
}
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
          ad3 = fo0.m3(fo1, ao1, ao2, ao3, fb1, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
if(fo0 != null){
      ao4 = fo0.m4();
}
    Output.points[0][4] += ad4;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
}
if(ao1 != null){
      fo1 = ao1.m4(fb0, fb1, ab1, ab2);
}
    ab3 = ad3 > ad4;

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
    fd0 = fd1 + fd0;
    Thought lo0 = Thought376.getInstance(fo1, fo0, fo1, fo0);
    fb1 = !fb0;
    double ld1 = 871.2084643092046;
    fb1 = fd0 > fd1;
    ld1 = fd0 + fd1;
    ld1 *= -1;
    Thought lo2 = Thought30.getInstance(fd0, fd1, ld1, fd0);
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1);
}
if(fo0 != null){
      fb0 = fo0.m2(fd0, fd1, ld1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 < ld1;
    fd0 = fd1 + ld1;
        fd0 = fd1 + ld1;
    boolean lb3 = true;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, lb3, fb0, fb1, lb3);
}
    double ld4 = 329.0371213856116;
    Thought lo5 = Thought351.getInstance();
    boolean lb6 = false;
    lb6 = ld4 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld1, ld4, fd0, fb0, fb1, lb3, lb6);
}
    fb0 = fb1 && lb3;
    lb6 = fd1 < ld1;
if(fo0 != null){
      ld4 = fo0.m3(fb0, fb1, lb3, lb6);
}
    fb0 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb1 = lb3 || lb6;

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
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
    ab2 = ab3 && ab4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
    fd1 = fd0 + fd1;
    ab3 = ab4 && fb0;
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, ab1);
}
if(fo0 != null){
      fd0 = fo0.m3();
}
    double ld1 = 710.883703538431;
    Thought lo2 = Thought28.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0, ab2, ab3, ab4, fb0);

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
    boolean lb0 = true;
    Thought lo1 = Thought51.getInstance(lb0, fb0, fb1, lb0);
    for(int i0=0; i0<10; i0++){
        double ld2 = 16.834180071446752;
        ld2 = ad1 + ad2;
if(fo1 != null){
          fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
        ad3 = ad4 - fd0;
        Thought lo3 = Thought212.getInstance(fd1, ld2, ad1, ad2);
        Output.points[0][5] += ad3;
        Thought lo4 = Thought195.getInstance(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld2);
if(fo1 != null){
          fo0 = fo1.m4(ad1, ad2, ad3, ad4, fb1, lb0, fb0, fb1);
}
        lb0 = fd0 > fd1;
        ld2 *= -1;
        Thought lo5 = Thought244.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
        for(int i1=0; i1<10; i1++){
            ad1 *= -1;
if(fo0 != null){
              ad2 = fo0.m3();
}
            ad3 = ad4 + fd0;
            fd1 = ld2 - ad1;
            ad2 = ad3 - ad4;
            fd0 = fd1 - ld2;
            fb1 = !lb0;
if(fo1 != null){
              ad1 = fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, lb0, fb0);
}
            fb1 = !lb0;
            fb0 = fd1 < ld2;
            double ld6 = 512.7339737524428;
            ld2 = ad1 + ad2;
if(fo0 != null){
              fo0.m3(fb1, lb0, fb0, fb1);
}
            lb0 = ad3 < ad4;
}}
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
    ab1 = ad1 < ad2;
    ad3 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ad4 *= -1;
    fd0 *= -1;
    fd1 *= -1;
    ab2 = ad1 > ad2;
if(fo1 != null){
      fo1.m2(ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ad1, ad2, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    fb0 = ad4 < fd0;
    fb1 = fd1 < ad1;
if(fo0 != null){
      ab1 = fo0.m2();
}
    ab2 = ab3 && ab4;
    Thought lo0 = Thought293.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb0, fb1, ab1, ab2);
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
    fb1 = !lb1;
    Thought lo2 = Thought314.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      fo1.m3(fd1, ad1, ad2, ad3);
}
    boolean lb3 = true;
if(fo0 != null){
      lb3 = fo0.m2(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
    ad2 = ad3 - ad4;
if(fo1 != null){
      fd0 = fo1.m3(fd1, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb1, lb3);
}
    ab1 = ab2 && ab3;
    ad4 = fd0 - fd1;
if(fo0 != null){
      ad1 = fo0.m3();
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 && fb0;
    fb1 = fb0 || fb1;
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
    Thought lo0 = Thought373.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
    fb0 = fb1 && fb0;
    fb1 = fb0 || fb1;
    fb0 = fd1 < fd0;
if(fo1 != null){
      fb1 = fo1.m2(fb0, fb1, fb0, fb1);
}
    Thought lo1 = Thought344.getInstance(ao1, ao2, ao3, ao4);
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
    double ld2 = 108.38685249349331;
    Thought lo3 = Thought74.getInstance(ld2, fd0, fd1, ld2, fb0, fb1, fb0, fb1);
    fd0 = fd1 + ld2;
    fb0 = fd0 < fd1;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
          fb0 = ao2.m2(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      ad1 = ao1.m3();
}
    fb1 = fb0 && fb1;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    Output.points[0][6] -= fd1;
    double ld0 = 392.58029422485083;
if(ao1 != null){
      ao1.m3(fb0, fb1, fb0, fb1);
}
    for(int i0=0; i0<10; i0++){
        fb0 = fb1 && fb0;
if(ao2 != null){
          ao2.m3(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
          ao1 = ao2.m4(ld0, ad1, ad2, ad3);
}
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ld0);
}
        ad1 = ad2 + ad3;
        fb1 = fb0 && fb1;
        Thought lo1 = Thought54.getInstance(ad4, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
        Thought lo2 = Thought140.getInstance(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
        ad1 = ad2 - ad3;
        fb0 = fb1 && fb0;
        fb1 = ad4 > fd0;
if(ao1 != null){
          fd1 = ao1.m3();
}
if(ao2 != null){
          ao2.m3(ao3, ao4, fo0, fo1, ld0, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
        fb0 = !fb1;
if(ao1 != null){
          ad4 = ao1.m3(fb0, fb1, fb0, fb1);
}
        boolean lb3 = true;
        Thought lo4 = Thought122.getInstance(ao2, ao3, ao4, fo0);
if(fo1 != null){
          fd0 = fo1.m3(fd1, ld0, ad1, ad2);
}
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
    ab2 = fd1 < fd0;
if(ao1 != null){
      fo1 = ao1.m4(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    Thought lo0 = Thought106.getInstance(ao2, ao3, ao4, fo0, ab1, ab2, ab3, ab4);
    double ld1 = 620.9089069646221;
    fb0 = fd0 < fd1;
if(ao1 != null){
      fo1 = ao1.m4();
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld1, fd0, fd1, ld1, fb1, ab1, ab2, ab3);
}
    ab4 = fd0 > fd1;
        ld1 = fd0 + fd1;
    boolean lb2 = true;
    ab4 = ld1 < fd0;
if(ao2 != null){
      ao2.m2(fb0, fb1, lb2, ab1);
}
    fd1 = ld1 + fd0;
    Output.points[0][7] -= fd1;
    boolean lb3 = true;
    ab1 = ab2 || ab3;
    ab4 = fb0 || fb1;
    double ld4 = 569.4261640297931;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    boolean lb5 = true;
        if (lb2) {
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    lb0 = ad1 > ad2;
    boolean lb1 = true;
if(ao2 != null){
      ao1 = ao2.m4(ad3, ad4, fd0, fd1);
}
    lb1 = ad1 > ad2;
    double ld2 = 63.257067372580316;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0);
}
    boolean lb3 = false;
    lb3 = ab1 && ab2;
    boolean lb4 = true;
        ab2 = ab3 && ab4;
    fd1 *= -1;
if(ao3 != null){
      fb0 = ao3.m2(ld2, ad1, ad2, ad3, fb1, lb0, lb1, lb3);
}
    lb4 = ab1 && ab2;
    ad4 = fd0 - fd1;
    for(int i0=0; i0<10; i0++){
        ab3 = ab4 || fb0;
        fb1 = ld2 < ad1;
        lb0 = lb1 && lb3;
        lb4 = ad2 < ad3;
        Thought lo5 = Thought385.getInstance(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
if(ao2 != null){
          fb0 = ao2.m2();
}
        boolean lb6 = false;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ld2, fb0, fb1, lb6, lb0);
}
if(ao3 != null){
          lb1 = ao3.m2(lb3, lb4, ab1, ab2);
}
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 186.37020113284814;
    fb0 = fb1 || fb0;
if(fo1 != null){
      fo1.m1(fd0, fd1, ld0, fd0);
}
    Thought lo1 = Thought325.getInstance(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1);
    fb1 = ld0 > fd0;
    boolean lb2 = true;
    lb2 = !fb0;
    fb1 = !lb2;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld0, fd0, fd1, fb0, fb1, lb2, fb0);
}
    fb1 = lb2 && fb0;
    boolean lb3 = false;
    ld0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb2, lb3);
}
    Output.points[0][8] += fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo4 = Thought356.getInstance(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1, fb0, fb1, lb2, lb3);
    boolean lb5 = true;
    boolean lb6 = true;
    lb5 = ld0 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(lb6, fb0, fb1, lb2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb7 = true;
    lb3 = !lb5;
    Thought lo8 = Thought336.getInstance(fd1, ld0, fd0, fd1);
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, fd0, lb6, lb7, fb0, fb1);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, lb2, lb3, lb5, lb6);
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
    Output.points[1][0] -= fd0;
    boolean lb0 = false;
    Thought lo1 = Thought23.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb0, ab1, ab2, ab3);
}
if(fo1 != null){
      fo0 = fo1.m4(ab4, fb0, fb1, lb0);
}
    fd1 *= -1;
    ab1 = fd0 > fd1;
    boolean lb2 = true;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    Output.points[1][1] -= fd1;

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
    double ld0 = 717.4537699984937;
    ad1 *= -1;
    fb0 = fb1 || fb0;
    fb1 = fb0 || fb1;
    ad2 = ad3 + ad4;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, ad1);
}
    ad2 *= -1;
    fb0 = ad3 > ad4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ad1);
}
    fb1 = ad2 < ad3;

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
    boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0, lb0, ab1, ab2, ab3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    ab1 = ab2 || ab3;
    Thought lo1 = Thought236.getInstance(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, ab4, fb0, fb1, lb0);
    if (ab1) {
        ad4 = fd0 - fd1;
if(fo0 != null){
          fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1);
}
        fb1 = ad1 > ad2;
        Thought lo2 = Thought204.getInstance(ad3, ad4, fd0, fd1);
if(fo0 != null){
          lb0 = fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
        fd0 = fd1 - ad1;
        ad2 = ad3 - ad4;
        Thought lo3 = Thought27.getInstance(fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
        fb0 = fb1 && lb0;
        boolean lb4 = true;
        ad3 *= -1;
        boolean lb5 = false;
        Output.points[1][2] -= ad4;
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1, lb5, lb0, ab1, ab2);
}
        Output.points[1][3] += fd0;
        ab3 = ab4 && fb0;
        double ld6 = 964.6766492144747;
if(fo0 != null){
          fb1 = fo0.m2();
}
        } else {
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    Output.points[1][4] -= fd0;
    boolean lb0 = false;
    fd1 *= -1;
    lb0 = fb0 || fb1;
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
if(ao2 != null){
      ao1 = ao2.m4(lb0, fb0, fb1, lb0);
}
    fb0 = !fb1;
    for(int i0=0; i0<10; i0++){
        fd0 = fd1 + fd0;
        lb0 = fb0 || fb1;
if(ao3 != null){
          fd1 = ao3.m3(ao4, fo0, fo1, ao1);
}
        Thought lo1 = Thought302.getInstance(fd0, fd1, fd0, fd1);
if(ao2 != null){
          fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(ao2 != null){
          ao1 = ao2.m4(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, lb0, fb0);
}
        fd1 = fd0 - fd1;
        fb1 = !lb0;
        fd0 *= -1;
if(ao3 != null){
          fb0 = ao3.m2();
}
        fb1 = lb0 && fb0;
if(ao4 != null){
          ao4.m1(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
if(ao4 != null){
          ao3 = ao4.m4(lb0, fb0, fb1, lb0);
}
        fb0 = fb1 && lb0;
        fb0 = fb1 || lb0;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
        double ld2 = 480.45812725160476;
        fd0 = fd1 + ld2;
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
    if (fb1) {
        fb0 = ad1 > ad2;
        ad3 = ad4 + fd0;
if(ao1 != null){
          fb1 = ao1.m2(fd1, ad1, ad2, ad3);
}
if(ao2 != null){
          ao2.m1(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1);
}
        fb0 = ad2 < ad3;
        Thought lo0 = Thought343.getInstance(ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
        fb1 = fb0 || fb1;
        boolean lb1 = false;
        for(int i0=0; i0<10; i0++){
            lb1 = ad2 < ad3;
if(ao2 != null){
              ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, lb1, fb0);
}
if(ao2 != null){
              ao1 = ao2.m4();
}
            double ld2 = 482.5944437834346;
if(ao3 != null){
              fb1 = ao3.m2(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, lb1, fb0, fb1, lb1);
}
}}
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
    boolean lb0 = true;
if(ao2 != null){
      fd1 = ao2.m3(ab1, ab2, ab3, ab4);
}
    boolean lb1 = false;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1);
}
    boolean lb2 = true;
    ab3 = fd0 > fd1;
    ab4 = !fb0;
    if (fb1) {
if(ao2 != null){
          lb0 = ao2.m2(fd0, fd1, fd0, fd1);
}
if(ao3 != null){
          lb1 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
if(ao2 != null){
          lb2 = ao2.m2(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
        boolean lb3 = true;
        ab4 = fd0 < fd1;
        Output.points[1][5] -= fd0;
if(ao3 != null){
          fd1 = ao3.m3(ao4, fo0, fo1, ao1, fb0, fb1, lb3, lb0);
}
        lb1 = fd0 < fd1;
if(ao3 != null){
          ao2 = ao3.m4();
}
        fd0 = fd1 - fd0;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ad1 < ad2;
if(ao2 != null){
      ab3 = ao2.m2(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, ab4, fb0, fb1, ab1);
}
    ab2 = ad1 > ad2;
    ad3 = ad4 - fd0;
    fd1 *= -1;
    ab3 = !ab4;
    fb0 = ad1 < ad2;
if(ao1 != null){
          ad3 = ao1.m3(fb1, ab1, ab2, ab3);
}
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1);
}
    ab4 = !fb0;
    boolean lb0 = false;
if(ao2 != null){
      ao1 = ao2.m4(ad4, fd0, fd1, ad1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0);
}
    fb0 = fd1 > ad1;
    ad2 = ad3 - ad4;
    fd0 = fd1 - ad1;
    Thought lo1 = Thought380.getInstance(ad2, ad3, ad4, fd0, fb1, lb0, ab1, ab2);
    ab3 = !ab4;
    boolean lb2 = false;
        fd1 = ad1 - ad2;
    ad3 = ad4 + fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab4, fb0, fb1, lb0);
}
    fd1 *= -1;

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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4();
}
        fd1 = fd0 + fd1;
    fb0 = fb1 && lb0;
    if (fb0) {
        fd0 *= -1;
        Thought lo1 = Thought343.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
if(fo1 != null){
          fo0 = fo1.m4(lb0, fb0, fb1, lb0);
}
if(fo0 != null){
          fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
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
    Output.points[1][6] += fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    double ld0 = 167.12325650407297;
    fd0 *= -1;
    ab1 = ab2 && ab3;
if(fo1 != null){
      ab4 = fo1.m2(fd1, ld0, fd0, fd1, fb0, fb1, ab1, ab2);
}
    Output.points[1][7] += ld0;
    ab3 = !ab4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
    fd0 = fd1 - ld0;
    double ld1 = 369.3534435373253;
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb2 = true;
    Thought lo3 = Thought323.getInstance(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld0, ab2, ab3, ab4, fb0);
    Output.points[1][8] -= ld1;
    Output.points[2][0] -= fd0;
    double ld4 = 580.7157084410163;
if(fo0 != null){
      fd0 = fo0.m3(fb1, lb2, ab1, ab2);
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
    fb1 = ad1 < ad2;
    Output.points[2][1] -= ad3;
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fd0 = fd1 + ad1;
    ad2 = ad3 - ad4;
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ad1, ad2, ad3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
    double ld0 = 791.5763235711254;
    double ld1 = 49.67151290091968;
if(fo1 != null){
      fo1.m3(ld1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    ad4 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    ld0 = ld1 + ad1;
    Thought lo2 = Thought167.getInstance();
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = ld0 < ld1;
    Output.points[2][2] += ad1;
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    Thought lo3 = Thought34.getInstance(fo1, fo0, fo1, fo0);
    double ld4 = 781.7913035531888;
    boolean lb5 = true;
if(fo1 != null){
      fo1.m1(ad1, ad2, ad3, ad4);
}
    fd0 = fd1 - ld0;
    Output.points[2][3] += ld1;
    boolean lb6 = true;

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
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
    Output.points[2][4] += ad3;
    boolean lb0 = true;
    ab3 = ad4 > fd0;
if(fo1 != null){
      ab4 = fo1.m2();
}
    for(int i0=0; i0<10; i0++){
        fb0 = !fb1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, lb0, ab1, ab2, ab3);
}
        ad4 *= -1;
if(fo0 != null){
          fd0 = fo0.m3(ab4, fb0, fb1, lb0);
}
        double ld1 = 822.2522711591448;
        fd0 = fd1 - ld1;
        Output.points[2][5] += ad1;
        for(int i1=0; i1<10; i1++){
            }
if(fo1 != null){
          ab1 = fo1.m2(fo0, fo1, fo0, fo1);
}
        Output.points[2][6] -= ad2;
if(fo0 != null){
          ad3 = fo0.m3(ad4, fd0, fd1, ld1);
}
        double ld2 = 68.43755819613287;
        double ld3 = 21.49346510834441;
if(fo1 != null){
          ab2 = fo1.m2(fo0, fo1, fo0, fo1, ld2, ld3, ad1, ad2);
}
        double ld4 = 997.8151273993353;
        boolean lb5 = false;
        ad2 *= -1;
if(fo0 != null){
          fo0.m3(ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
        boolean lb6 = false;
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
    boolean lb0 = true;
    lb0 = fd0 > fd1;
    Thought lo1 = Thought118.getInstance(ao1, ao2, ao3, ao4, fb0, fb1, lb0, fb0);
    Thought lo2 = Thought183.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
    Thought lo3 = Thought196.getInstance(lb0, fb0, fb1, lb0);
    boolean lb4 = true;
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3);
}
    fd0 = fd1 - fd0;
    double ld5 = 123.74275949385603;
    lb4 = fd0 < fd1;
    ld5 = fd0 - fd1;
    double ld6 = 384.6988475652713;
if(ao4 != null){
      fb0 = ao4.m2(ld5, ld6, fd0, fd1);
}
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3, ld5, ld6, fd0, fd1);
}
if(ao4 != null){
      ld5 = ao4.m3(ld6, fd0, fd1, ld5, fb1, lb0, lb4, fb0);
}
    fb1 = ld6 > fd0;
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, lb0, lb4, fb0, fb1);
}

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = ad2 < ad3;
    boolean lb0 = false;
    ad4 = fd0 - fd1;
    fb0 = !fb1;
        ad1 *= -1;
if(ao1 != null){
      ao1.m3();
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, lb0, fb0, fb1, lb0);
}
    boolean lb1 = true;
    boolean lb2 = true;
    fd1 = ad1 + ad2;
    ad3 *= -1;
    Output.points[2][7] -= ad4;
    for(int i0=0; i0<10; i0++){
if(ao3 != null){
          ao2 = ao3.m4(lb1, lb2, fb0, fb1);
}
        for(int i1=0; i1<10; i1++){
            lb0 = lb1 && lb2;
            double ld3 = 377.4561622644559;
            fb0 = !fb1;
if(ao4 != null){
              ao4.m3(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
              lb0 = ao3.m2(ad4, fd0, fd1, ld3);
}
if(ao4 != null){
              ad1 = ao4.m3(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0);
}
if(ao3 != null){
              fd1 = ao3.m3(ld3, ad1, ad2, ad3, lb1, lb2, fb0, fb1);
}
            lb0 = ad4 > fd0;
            Thought lo4 = Thought399.getInstance(ao4, fo0, fo1, ao1, lb1, lb2, fb0, fb1);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
          ao1.m3();
}
    fd0 = fd1 + fd0;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || ab1;
            ab2 = fd1 < fd0;
if(ao1 != null){
          ab3 = ao1.m2(ab4, fb0, fb1, ab1);
}
    ab2 = fd1 < fd0;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1);
}
    Output.points[2][8] -= fd1;

Thought.STACK_COUNTER++;
return ao1;
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
if(ao2 != null){
      ao2.m2(ad1, ad2, ad3, ad4);
}
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2);
}
    boolean lb0 = true;
        ad3 = ad4 - fd0;
    double ld1 = 132.65032871185977;
    fd0 = fd1 - ld1;
if(ao2 != null){
      lb0 = ao2.m2(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
    double ld2 = 749.8125588722388;
        boolean lb3 = false;
    ab4 = fb0 || fb1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb0, lb3, ab1, ab2);
}
    Output.points[3][0] += ad4;
    fd0 = fd1 - ld1;
    double ld4 = 958.4409024605003;
    ab3 = ab4 || fb0;
    fb1 = lb0 || lb3;
    ld2 = ld4 - ad1;
    boolean lb5 = false;
    lb5 = ab1 && ab2;
    boolean lb6 = true;

Thought.STACK_COUNTER++;
return ao3;
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
    boolean lb0 = true;
    fd0 = fd1 + fd0;
    Output.points[3][1] -= fd1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    double ld1 = 814.3873639328554;
    fb0 = fb1 && lb0;
    ld1 *= -1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0, fb0, fb1, lb0, fb0);
}
    boolean lb2 = false;
    fb0 = !fb1;
if(fo0 != null){
      fo0.m1(lb0, lb2, fb0, fb1);
}
    Thought lo3 = Thought273.getInstance(fo1, fo0, fo1, fo0);
    Thought lo4 = Thought28.getInstance(fd1, ld1, fd0, fd1);
    lb0 = !lb2;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1);
}
    fb1 = lb0 && lb2;
    fd0 *= -1;
    boolean lb5 = true;
    lb5 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld1, fd0, fd1, lb0, lb2, lb5, fb0);
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
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought86.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
    fb0 = !fb1;
    Output.points[3][2] += fd0;
    fd1 *= -1;
    Thought lo1 = Thought126.getInstance();
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + fd0;
    Thought lo2 = Thought345.getInstance(fb0, fb1, fb0, fb1);
    Thought lo3 = Thought301.getInstance(fo1, fo0, fo1, fo0);
    fb0 = fb1 || fb0;
    fd1 = fd0 + fd1;
    boolean lb4 = true;
    Thought lo5 = Thought178.getInstance(fd0, fd1, fd0, fd1);
    fd0 = fd1 + fd0;
    fb0 = fd1 > fd0;
    fb1 = fd1 > fd0;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
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
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo0.m1(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    fd1 *= -1;
    fb0 = fd0 > fd1;
    double ld0 = 395.8998385850256;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
if(fo0 != null){
      fo0.m1();
}
    fb0 = ld0 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    fb0 = ld0 > fd0;
    fb1 = fb0 || fb1;
    fd1 = ld0 + fd0;
    fd1 *= -1;
    ld0 *= -1;
    boolean lb1 = true;

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