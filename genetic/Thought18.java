package genetic;
import java.util.ArrayList;
class Thought18 extends Thought{
private static ArrayList<Thought18> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 40.0789730243422;
private double fd1 = 3.652789878102918;
private Thought fo0 = null;
private Thought fo1 = null;
Thought18 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought18 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought18 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought18 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought18 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought18 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought18 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought18 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought18 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought18 instance = new Thought18 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought18 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought18 instance = new Thought18 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought18 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought18 instance = new Thought18 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought18 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought18 instance = new Thought18 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought18 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought18 instance = new Thought18 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought18 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought18 instance = new Thought18 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought18 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought18 instance = new Thought18 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought18 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought18 instance = new Thought18 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    double ld0 = 136.31129475700743;
    Output.points[4][1] += ld0;
    Thought lo1 = Thought68.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
    fd1 = ld0 + fd0;
        Output.points[4][2] -= fd1;
    ld0 = fd0 + fd1;
if(fo1 != null){
      ld0 = fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    boolean lb2 = true;
    boolean lb3 = false;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, ld0, fd0, fd1, lb3, fb0, fb1, lb2);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    ld0 *= -1;
    boolean lb4 = true;
if(fo0 != null){
      fo0.m3(fd0, fd1, ld0, fd0);
}
    fd1 *= -1;
    lb3 = ld0 < fd0;
if(fo1 != null){
      lb4 = fo1.m2(fb0, fb1, lb2, lb3);
}
    lb4 = fb0 && fb1;
if(fo0 != null){
      lb2 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1);
}
if(fo1 != null){
      lb3 = fo1.m2(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, lb4, fb0, fb1, lb2);
}
    lb3 = lb4 && fb0;

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
    double ld0 = 384.55156681596674;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    Thought lo1 = Thought55.getInstance(fo1, fo0, fo1, fo0);
    double ld2 = 877.1378406042692;
    boolean lb3 = true;
if(fo0 != null){
      fo1 = fo0.m4(ld2, fd0, fd1, ld0, ab4, fb0, fb1, lb3);
}
    Thought lo4 = Thought81.getInstance();
    boolean lb5 = false;
if(fo0 != null){
      fo1 = fo0.m4(ld2, fd0, fd1, ld0);
}
    lb5 = !ab1;
if(fo0 != null){
      fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
    Thought lo6 = Thought45.getInstance(fo1, fo0, fo1, fo0, ld2, fd0, fd1, ld0);
    fb1 = lb3 || lb5;
    ld2 = fd0 - fd1;
    ld0 = ld2 + fd0;

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
    ad2 *= -1;
        Thought lo0 = Thought53.getInstance(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fb1 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    Thought lo1 = Thought70.getInstance();
    double ld2 = 202.87584785625444;
    ad4 = fd0 + fd1;
    boolean lb3 = false;
    boolean lb4 = true;
    ld2 = ad1 + ad2;
    ad3 = ad4 - fd0;
    boolean lb5 = true;
    if (lb3) {
        lb4 = fd1 < ld2;
if(fo0 != null){
          fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
if(fo1 != null){
          fo1.m1(lb5, fb0, fb1, lb3);
}
        fd0 *= -1;
        } else {
        lb4 = fd1 > ld2;
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
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
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    lb0 = ad2 > ad3;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
}
    ad2 *= -1;
    for(int i0=0; i0<10; i0++){
        ad3 = ad4 + fd0;
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, lb0, ab1);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
          fo1 = fo0.m4(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
        boolean lb1 = true;
        fd0 *= -1;
        boolean lb2 = false;
        ab4 = fd1 < ad1;
        Output.points[4][3] -= ad2;
        ad3 *= -1;
        boolean lb3 = true;
if(fo1 != null){
          fo1.m1();
}
        ab4 = fb0 && fb1;
        boolean lb4 = true;
        ad4 *= -1;
        lb1 = lb2 && lb3;
        double ld5 = 844.7725367394594;
        lb4 = lb0 && ab1;
        ab2 = !ab3;
        ad4 = fd0 - fd1;
if(fo1 != null){
          fo0 = fo1.m4(ld5, ad1, ad2, ad3);
}
        ab4 = ad4 > fd0;
if(fo1 != null){
          fo0 = fo1.m4(fb0, fb1, lb1, lb2);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fd0 > fd1;
    fb1 = fd0 < fd1;
    fb0 = fd0 < fd1;
    fb1 = !fb0;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought50.getInstance(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
    fb1 = fb0 && fb1;
    Thought lo1 = Thought82.getInstance(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fd1 = fd0 + fd1;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 < fd1;
    Thought lo2 = Thought82.getInstance();
    double ld3 = 120.12193327455567;
if(fo0 != null){
      ao4 = fo0.m4(ld3, fd0, fd1, ld3);
}
if(fo1 != null){
      fo1.m1(fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ld3, fd0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ld3, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
    ld3 *= -1;

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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    boolean lb0 = true;
if(ao2 != null){
      fb0 = ao2.m2(ad2, ad3, ad4, fd0, fb1, lb0, fb0, fb1);
}
    fd1 *= -1;
    boolean lb1 = false;
if(ao4 != null){
      ao3 = ao4.m4();
}
    ad1 = ad2 - ad3;
    boolean lb2 = true;
    boolean lb3 = false;
if(fo0 != null){
      ad4 = fo0.m3(fd0, fd1, ad1, ad2);
}
    double ld4 = 453.2992787276425;
    lb0 = !lb1;
    double ld5 = 999.7296045360158;
    ad1 = ad2 - ad3;
    ad4 = fd0 + fd1;
    double ld6 = 771.3919085116968;
    lb2 = ld4 > ld5;
if(fo1 != null){
      lb3 = fo1.m2(fb0, fb1, lb0, lb1);
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
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fd0 *= -1;
    fb0 = !fb1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ab1, ab2, ab3, ab4);
}
    Thought lo0 = Thought82.getInstance(fo1, ao1, ao2, ao3);
if(ao4 != null){
      ao4.m3(fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      ab3 = fo0.m2();
}
if(fo1 != null){
      fo1.m1(fd1, fd0, fd1, fd0);
}
    boolean lb1 = true;
if(ao2 != null){
      ao1 = ao2.m4(ab3, ab4, fb0, fb1);
}
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    lb1 = !ab1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
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
    ad2 *= -1;
    ab1 = ad3 > ad4;
    fd0 *= -1;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
        ad1 = ad2 - ad3;
    Thought lo0 = Thought13.getInstance(ao1, ao2, ao3, ao4);
if(fo0 != null){
      ad4 = fo0.m3(fd0, fd1, ad1, ad2, fb1, ab1, ab2, ab3);
}
        boolean lb1 = true;
    ab3 = ad3 < ad4;
    ab4 = fb0 || fb1;
    lb1 = fd0 < fd1;
    ab1 = ad1 > ad2;
    ad3 = ad4 - fd0;
if(ao1 != null){
      fo1 = ao1.m4();
}
    ab2 = ab3 && ab4;
    fb0 = fb1 || lb1;
    ab1 = ab2 || ab3;
if(ao2 != null){
      ab4 = ao2.m2(fd1, ad1, ad2, ad3);
}
    double ld2 = 847.0281615715356;
    ad3 = ad4 + fd0;
    fd1 = ld2 - ad1;

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
    fb1 = !fb0;
if(fo0 != null){
      fd0 = fo0.m3(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fb1 = fb0 || fb1;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    Output.points[4][4] -= fd1;
    fb0 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb1 = fd0 < fd1;
    fd0 = fd1 - fd0;
    for(int i0=0; i0<10; i0++){
        double ld0 = 763.8476724686284;
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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 355.6715278275937;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, fd0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo1 = Thought88.getInstance(fd1, ld0, fd0, fd1);
if(fo1 != null){
      fo0 = fo1.m4(fb1, ab1, ab2, ab3);
}
    boolean lb2 = true;
    ld0 = fd0 + fd1;
    boolean lb3 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0);
}
    ab2 = ab3 && ab4;
    Thought lo4 = Thought11.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, fb0, fb1, lb2, lb3);
    ab1 = ab2 && ab3;
    fd1 *= -1;
    if (ab4) {
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, fb0, fb1, lb2, lb3);
}
        ab1 = !ab2;
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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ad1 = ad2 + ad3;
if(fo1 != null){
      fo1.m1(ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      ad2 = fo0.m3();
}
    if (fb1) {
        if (fb0) {
            ad3 = ad4 + fd0;
if(fo0 != null){
              fo1 = fo0.m4(fd1, ad1, ad2, ad3);
}
            } else if (fb1) {
            fb0 = ad4 < fd0;
            Output.points[4][5] -= fd1;
            ad1 = ad2 - ad3;
            double ld0 = 652.8933034536722;
if(fo1 != null){
              ad3 = fo1.m3(fb1, fb0, fb1, fb0);
}
            Thought lo1 = Thought33.getInstance(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld0);
            fb1 = !fb0;
            ad1 = ad2 - ad3;
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
            fb1 = ad1 < ad2;
            fb0 = ad3 > ad4;
            for(int i0=0; i0<10; i0++){
                fb1 = !fb0;
                fb1 = fb0 || fb1;
                Output.points[4][6] += fd0;
if(fo1 != null){
                  fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
                double ld2 = 611.3550141399576;
if(fo0 != null){
                  fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
}}}
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
    Thought lo0 = Thought18.getInstance(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
if(fo1 != null){
      fd0 = fo1.m3();
}
    boolean lb1 = true;
    boolean lb2 = true;
if(fo0 != null){
      fd1 = fo0.m3(ad1, ad2, ad3, ad4);
}
    ab4 = fd0 > fd1;
if(fo1 != null){
      ad1 = fo1.m3(fb0, fb1, lb1, lb2);
}
    ab1 = ad2 < ad3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
    ab2 = !ab3;
    ad2 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, ab4, fb0, fb1, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb2, ab1, ab2, ab3);
}
    ad1 = ad2 + ad3;
    ab4 = fb0 || fb1;
    boolean lb3 = true;
    ad4 = fd0 + fd1;
    double ld4 = 848.8422885909857;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0);
}
    fb1 = fd1 > fd0;
    fb0 = fb1 && fb0;
    fd1 = fd0 - fd1;
    fb1 = fb0 || fb1;
    boolean lb0 = false;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
    Output.points[4][7] -= fd0;
if(ao2 != null){
      ao2.m3();
}
    fb0 = fd1 > fd0;
    fd1 = fd0 + fd1;
    fb1 = fd0 > fd1;
    Thought lo1 = Thought37.getInstance(fd0, fd1, fd0, fd1);
    fd0 = fd1 - fd0;
    lb0 = !fb0;
    fd1 *= -1;
    Thought lo2 = Thought98.getInstance(fb1, lb0, fb0, fb1);
    Output.points[4][8] -= fd0;

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
        double ld0 = 830.2348418656779;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, ld0, ad1, ad2, fb1, fb0, fb1, fb0);
}
    double ld1 = 361.2159735575244;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
    boolean lb2 = false;
    fb0 = fb1 && lb2;
    Output.points[5][0] += ad2;
    fb0 = fb1 || lb2;
    ad3 = ad4 - fd0;
    fb0 = !fb1;
if(fo1 != null){
      lb2 = fo1.m2(ao1, ao2, ao3, ao4);
}
    fb0 = !fb1;
    double ld3 = 495.69320781828856;
    boolean lb4 = true;
    fd0 = fd1 - ld0;
    ld1 = ld3 - ad1;
    lb2 = ad2 > ad3;
    lb4 = fb0 || fb1;
    Thought lo5 = Thought1.getInstance(ad4, fd0, fd1, ld0, lb2, lb4, fb0, fb1);
    boolean lb6 = true;
if(fo1 != null){
      fo0 = fo1.m4();
}
    Output.points[5][1] += ld1;
if(ao1 != null){
      ld3 = ao1.m3(ad1, ad2, ad3, ad4);
}
    double ld7 = 971.2503144834271;
    double ld8 = 147.18847604260966;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 257.9763539293219;
    ab2 = fd0 > fd1;
    ab3 = ab4 && fb0;
    fb1 = ld0 < fd0;
if(ao2 != null){
      ao2.m2(ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || ab1;
    Thought lo1 = Thought31.getInstance(ao3, ao4, fo0, fo1, fd1, ld0, fd0, fd1);
    ld0 = fd0 - fd1;
    ab2 = ab3 && ab4;
    fb0 = fb1 || ab1;
    ab2 = ld0 > fd0;
    ab3 = fd1 < ld0;
    fd0 = fd1 + ld0;
    if (ab4) {
        fd0 = fd1 - ld0;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ld0, fd0, fb0, fb1, ab1, ab2);
}
        Output.points[5][2] -= fd1;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 - ad3;
    ab2 = ab3 && ab4;
    fb0 = fb1 || ab1;
    ad4 *= -1;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
}
    fd0 = fd1 + ad1;
    fb1 = !ab1;
    ab2 = ad2 > ad3;
        ab3 = ad4 < fd0;
    ab4 = fb0 && fb1;
    fd1 = ad1 + ad2;
    ab1 = ab2 && ab3;
if(fo1 != null){
      ad3 = fo1.m3(ao1, ao2, ao3, ao4);
}
    boolean lb0 = false;
    Thought lo1 = Thought69.getInstance(ad4, fd0, fd1, ad1, ab3, ab4, fb0, fb1);
    ad2 = ad3 + ad4;
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo2 = Thought81.getInstance(fd0, fd1, ad1, ad2);
    Output.points[5][3] += ad3;
        ad4 = fd0 + fd1;
    boolean lb3 = true;
    double ld4 = 189.6727584347841;
    boolean lb5 = true;
if(ao1 != null){
      ld4 = ao1.m3(lb0, lb3, lb5, ab1);
}
    ab2 = !ab3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
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
    fb1 = fb0 || fb1;
    fd1 *= -1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 < fd0;
    boolean lb0 = true;
    fb0 = fb1 || lb0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fb0 = fo0.m2(fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
if(fo1 != null){
      fo1.m3();
}
    fd0 = fd1 - fd0;
    lb0 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    boolean lb1 = false;
    fd1 = fd0 + fd1;
    Output.points[5][4] += fd0;
    boolean lb2 = false;
    boolean lb3 = true;

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
if(fo0 != null){
      ab1 = fo0.m2(ab2, ab3, ab4, fb0);
}
    fb1 = fd0 < fd1;
    ab1 = ab2 && ab3;
    ab4 = fd0 > fd1;
    boolean lb0 = true;
    fd0 *= -1;
    ab4 = !fb0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fb1 = lb0 || ab1;
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb1, lb0, ab1, ab2);
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
    ad1 *= -1;
    boolean lb0 = true;
    fb0 = !fb1;
if(fo0 != null){
          lb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    Thought lo1 = Thought76.getInstance(ad2, ad3, ad4, fd0, fb0, fb1, lb0, fb0);
    double ld2 = 526.1732448803732;
    boolean lb3 = true;
    fd0 = fd1 + ld2;
    fb0 = ad1 > ad2;
    fb1 = lb0 || lb3;
    if (fb0) {
        double ld4 = 271.82112376503966;
        ad2 = ad3 + ad4;
        Output.points[5][5] += fd0;
if(fo1 != null){
          fo1.m3();
}
        fd1 = ld4 + ld2;
if(fo0 != null){
          ad1 = fo0.m3(ad2, ad3, ad4, fd0);
}
        fb1 = !lb0;
        lb3 = fb0 && fb1;
if(fo0 != null){
          fo1 = fo0.m4(lb0, lb3, fb0, fb1);
}
        boolean lb5 = false;
        fd1 = ld4 - ld2;
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
        } else if (lb0) {
        lb3 = fd1 < ld2;
        fb0 = ad1 < ad2;
        ad3 = ad4 + fd0;
        boolean lb6 = true;
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    ab1 = ad1 < ad2;
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, ab1, ab2, ab3);
}
    boolean lb1 = false;
    ab3 = ab4 && fb0;
    Thought lo2 = Thought3.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
          fb1 = fo1.m2(ad1, ad2, ad3, ad4, lb0, lb1, ab1, ab2);
}
    Thought lo3 = Thought29.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2);
}

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      fd1 = ao1.m3(fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    Output.points[5][6] += fd1;
    fd0 = fd1 + fd0;
    lb0 = fd1 > fd0;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    Output.points[5][7] -= fd1;
    fb1 = lb0 || fb0;
if(fo1 != null){
      fb1 = fo1.m2(ao1, ao2, ao3, ao4, lb0, fb0, fb1, lb0);
}
    fb0 = !fb1;
    boolean lb1 = false;
    boolean lb2 = false;
    double ld3 = 17.54982201021775;
    double ld4 = 65.8993546059167;
    lb0 = !lb1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    double ld5 = 989.0149323230577;
            Thought lo6 = Thought69.getInstance(ld3, ld4, ld5, fd0, lb2, fb0, fb1, lb0);
    lb1 = lb2 && fb0;

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
    ad1 *= -1;
    fb0 = fb1 || fb0;
    Output.points[5][8] -= ad2;
if(ao1 != null){
      ad3 = ao1.m3();
}
if(ao3 != null){
      ao2 = ao3.m4(ad4, fd0, fd1, ad1);
}
    fb1 = fb0 && fb1;
    boolean lb0 = true;
    lb0 = !fb0;
if(fo0 != null){
      ao4 = fo0.m4(fb1, lb0, fb0, fb1);
}
    double ld1 = 680.913567284168;
    double ld2 = 71.49272454531526;
    lb0 = fb0 || fb1;
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4, ld2, ad1, ad2, ad3);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ld1, lb0, fb0, fb1, lb0);
}
    Output.points[6][0] -= ld2;
    double ld3 = 541.022956652906;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb0, fb1, lb0, fb0);
}
    fb1 = ld3 > ad1;
    Thought lo4 = Thought11.getInstance(fo0, fo1, ao1, ao2);
    lb0 = fb0 && fb1;
    lb0 = ad2 > ad3;
    Thought lo5 = Thought15.getInstance(ad4, fd0, fd1, ld1, fb0, fb1, lb0, fb0);
    ld2 = ld3 - ad1;

Thought.STACK_COUNTER++;
return ad2;
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
    ab1 = ab2 && ab3;
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao4 != null){
      ao3 = ao4.m4(fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought51.getInstance(ab4, fb0, fb1, ab1);
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
    fd1 *= -1;
    ab2 = ab3 || ab4;
    boolean lb1 = true;
    Output.points[6][1] -= fd0;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb1);
}
    ab1 = fd1 < fd0;
    ab2 = !ab3;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ab4, fb0, fb1, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = fd0 < fd1;

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
    ad2 = ad3 + ad4;
    ab1 = ab2 && ab3;
    boolean lb0 = true;
    fd0 = fd1 - ad1;
if(ao2 != null){
      ao1 = ao2.m4();
}
    ad2 = ad3 + ad4;
    ab3 = ab4 && fb0;
    fb1 = lb0 && ab1;
    fd0 = fd1 + ad1;
    Output.points[6][2] += ad2;
if(ao3 != null){
      ad3 = ao3.m3(ad4, fd0, fd1, ad1);
}
    boolean lb1 = true;
if(ao4 != null){
      ao4.m3(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0);
}
    fb0 = !fb1;
    fd1 *= -1;
if(ao4 != null){
          lb0 = ao4.m2(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, lb1, ab1, ab2, ab3);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab4, fb0, fb1, lb0);
}
    boolean lb2 = false;
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1);
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
      fb1 = fo1.m2(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m3();
}
    double ld0 = 660.4782766051104;
if(fo1 != null){
      fo1.m3(ld0, fd0, fd1, ld0);
}
    fb0 = !fb1;
    fb0 = fb1 && fb0;
    Output.points[6][3] += fd0;
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
}
    boolean lb1 = true;
    boolean lb2 = false;
    lb2 = !fb0;
    fb1 = lb1 && lb2;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1, fb0, fb1, lb1, lb2);
}
    double ld3 = 855.9188752017392;
    ld0 = ld3 - fd0;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, lb1, lb2, fb0);
}
    fb1 = lb1 && lb2;
    fd1 *= -1;
    fb0 = ld0 > ld3;
    fb1 = fd0 < fd1;
    ld0 = ld3 + fd0;
    lb1 = !lb2;

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
    boolean lb0 = false;
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      ab1 = fo1.m2(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo0.m3();
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    for(int i0=0; i0<10; i0++){
        fb1 = lb0 || ab1;
if(fo1 != null){
          fd1 = fo1.m3(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
          fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
        lb0 = fd0 > fd1;
        boolean lb1 = true;
        boolean lb2 = false;
        Output.points[6][4] -= fd0;
        Output.points[6][5] -= fd1;
        if (lb2) {
if(fo1 != null){
              fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb0, ab1, ab2, ab3);
}
            ab4 = fb0 && fb1;
            Thought lo3 = Thought58.getInstance(fo0, fo1, fo0, fo1, lb1, lb2, lb0, ab1);
            Thought lo4 = Thought39.getInstance(fo0, fo1, fo0, fo1);
            ab2 = fd1 < fd0;
            fd1 = fd0 - fd1;
if(fo0 != null){
              ab3 = fo0.m2(fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb1);
}
            double ld5 = 677.1821347021204;
if(fo1 != null){
              fo1.m3();
}
            lb2 = lb0 || ab1;
            ld5 = fd0 - fd1;
if(fo0 != null){
              ld5 = fo0.m3(fd0, fd1, ld5, fd0);
}
            ab2 = ab3 && ab4;
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
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 + ad3;
        Thought lo0 = Thought21.getInstance(fb0, fb1, fb0, fb1);
    ad4 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
          ad3 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        ad4 *= -1;
if(fo1 != null){
          fb0 = fo1.m2(fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
        ad3 *= -1;
if(fo1 != null){
          fo0 = fo1.m4();
}
if(fo0 != null){
          fb1 = fo0.m2(ad4, fd0, fd1, ad1);
}
        fb0 = !fb1;
        Thought lo1 = Thought57.getInstance(fb0, fb1, fb0, fb1);
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
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    fd1 = ad1 + ad2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
}
    boolean lb0 = false;
    Output.points[6][6] -= ad2;
if(fo0 != null){
      ab3 = fo0.m2(fo1, fo0, fo1, fo0);
}
    ad3 = ad4 - fd0;
if(fo1 != null){
      fd1 = fo1.m3(ad1, ad2, ad3, ad4, ab4, fb0, fb1, lb0);
}
    fd0 *= -1;
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4();
}
    lb1 = !ab1;
    ab2 = fd1 > ad1;
    ad2 *= -1;
if(fo0 != null){
      ad3 = fo0.m3(ad4, fd0, fd1, ad1);
}
if(fo1 != null){
          ad2 = fo1.m3(ab3, ab4, fb0, fb1);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
    fd0 = fd1 - fd0;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fb0, fb1, lb0, fb0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    fb1 = lb0 && fb0;
    fb1 = lb0 || fb0;
    double ld1 = 663.7784486750065;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, ld1, fd0, fb1, lb0, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
if(fo0 != null){
      ao4 = fo0.m4(fd1, ld1, fd0, fd1);
}
    lb0 = !fb0;
    ld1 = fd0 - fd1;
if(ao1 != null){
      fo1 = ao1.m4(fb1, lb0, fb0, fb1);
}
        Output.points[6][7] -= ld1;
if(ao2 != null){
      lb0 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, ld1, fd0);
}
    fd1 = ld1 + fd0;
    fb0 = fb1 && lb0;
    Thought lo2 = Thought61.getInstance(ao1, ao2, ao3, ao4, fd1, ld1, fd0, fd1, fb0, fb1, lb0, fb0);
    fb1 = !lb0;
    Thought lo3 = Thought15.getInstance(fo0, fo1, ao1, ao2, fb0, fb1, lb0, fb0);
    double ld4 = 816.2648419407932;
    double ld5 = 402.95058740320127;
    fb1 = lb0 || fb0;
    Thought lo6 = Thought68.getInstance(ao3, ao4, fo0, fo1);

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
        boolean lb0 = false;
if(ao2 != null){
      lb0 = ao2.m2(ad1, ad2, ad3, ad4, fb0, fb1, lb0, fb0);
}
if(ao3 != null){
      fb1 = ao3.m2();
}
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, ad1, ad2);
}
if(fo1 != null){
      fo1.m2(lb0, fb0, fb1, lb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
}
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4, fb0, fb1, lb0, fb0);
}
    boolean lb1 = false;
if(fo1 != null){
      fd0 = fo1.m3(ao1, ao2, ao3, ao4, fb0, fb1, lb0, lb1);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, ao1, ao2, ao3);
}
    for(int i0=0; i0<10; i0++){
        Output.points[6][8] += ad1;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 *= -1;
if(ao1 != null){
      fd0 = ao1.m3(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
    Thought lo0 = Thought68.getInstance();
    boolean lb1 = true;
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
    ab4 = fb0 || fb1;
    fd1 *= -1;
    lb1 = !ab1;
    boolean lb2 = true;
    Output.points[7][0] += fd0;
    fd1 = fd0 - fd1;
    ab1 = fd0 > fd1;
    fd0 *= -1;
    boolean lb3 = true;
    fd1 = fd0 - fd1;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 && ab4;
    boolean lb0 = false;
if(ao1 != null){
      ao1.m1(ad1, ad2, ad3, ad4);
}
    double ld1 = 749.9538039145913;
if(ao2 != null){
      ad4 = ao2.m3(ab4, fb0, fb1, lb0);
}
    ab1 = ab2 || ab3;
    Thought lo2 = Thought60.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, ld1, ad1);
    Thought lo3 = Thought47.getInstance(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0, ab4, fb0, fb1, lb0);
    fd1 = ld1 + ad1;
if(fo0 != null){
      ab1 = fo0.m2(fo1, ao1, ao2, ao3, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
      ad2 = ao4.m3(ad3, ad4, fd0, fd1, fb1, lb0, ab1, ab2);
}
    ab3 = ab4 && fb0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb1 = ld1 > ad1;
    Thought lo4 = Thought95.getInstance(ad2, ad3, ad4, fd0);

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
    Thought lo0 = Thought7.getInstance(fb0, fb1, fb0, fb1);
    fd0 = fd1 - fd0;
    fb0 = fb1 && fb0;
    fb1 = fd1 < fd0;
    fb0 = fb1 && fb0;
    fb1 = fb0 || fb1;
    Thought lo1 = Thought38.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
    Thought lo2 = Thought2.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
    Thought lo3 = Thought8.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb4 = false;

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
    fd1 *= -1;
    Thought lo0 = Thought83.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
if(fo0 != null){
      fo1 = fo0.m4();
}
    boolean lb1 = false;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    Output.points[7][1] -= fd1;
    lb1 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fb1, lb1, fb0, fb1);
}
    Output.points[7][2] += fd0;
    lb1 = !fb0;
    double ld2 = 205.50890725661648;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld2, fd0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ld2, fd0, fd1, ld2, fb1, lb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb1, fb0, fb1, lb1);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
    Thought lo3 = Thought12.getInstance(fd0, fd1, ld2, fd0, fb1, lb1, fb0, fb1);
    fd1 *= -1;
if(fo0 != null){
      fo0.m3();
}
if(fo0 != null){
      fo1 = fo0.m4(ld2, fd0, fd1, ld2);
}
    lb1 = fb0 && fb1;
    boolean lb4 = false;
if(fo0 != null){
      fo1 = fo0.m4(lb1, lb4, fb0, fb1);
}
    lb1 = lb4 || fb0;
    boolean lb5 = false;

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
    fb1 = fb0 && fb1;
    fd1 *= -1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
        fd0 = fd1 + fd0;
    Output.points[7][3] += fd1;
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
    Output.points[7][4] += fd1;
        fb1 = fd0 > fd1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    Output.points[7][5] -= fd1;
    lb0 = fd0 > fd1;
    fb0 = fd0 > fd1;
    fb1 = lb0 && fb0;
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;

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
