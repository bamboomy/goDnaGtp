package genetic;
import java.util.ArrayList;
class Thought40 extends Thought{
private static ArrayList<Thought40> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 217.83338699232507;
private double fd1 = 915.7849260047391;
private Thought fo0 = null;
private Thought fo1 = null;
Thought40 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought40 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought40 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought40 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought40 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought40 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought40 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought40 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought40 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought40 instance = new Thought40 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought40 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought40 instance = new Thought40 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought40 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought40 instance = new Thought40 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought40 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought40 instance = new Thought40 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought40 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought40 instance = new Thought40 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought40 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought40 instance = new Thought40 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought40 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought40 instance = new Thought40 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought40 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought40 instance = new Thought40 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fb1 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    lb0 = fd0 < fd1;
    fd0 = fd1 - fd0;
    Thought lo1 = Thought363.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
    fd1 = fd0 + fd1;
    fb0 = fb1 && lb0;
    double ld2 = 760.8814563115214;
if(fo0 != null){
      fo1 = fo0.m4(ld2, fd0, fd1, ld2, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
}
if(fo1 != null){
      fo1.m2();
}
    lb0 = !fb0;
    Thought lo3 = Thought20.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld2, fd0, fb1, lb0, fb0, fb1);
if(fo0 != null){
      lb0 = fo0.m2(fb0, fb1, lb0, fb0);
}
    fb1 = lb0 && fb0;
    Thought lo4 = Thought203.getInstance(fo1, fo0, fo1, fo0);

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
      fo1.m2(fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    Thought lo0 = Thought105.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
if(fo1 != null){
      fo0 = fo1.m4();
}
    ab3 = !ab4;
    fb0 = fb1 || ab1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    double ld1 = 944.1573909298954;
    boolean lb2 = true;
if(fo0 != null){
      fo0.m2(fb0, fb1, lb2, ab1);
}
    Output.points[2][6] += ld1;
    double ld3 = 693.772309552783;
    double ld4 = 992.6429685668896;
    boolean lb5 = false;
    Thought lo6 = Thought373.getInstance(fo1, fo0, fo1, fo0);
    ld3 = ld4 + fd0;
    ab1 = !ab2;
    Thought lo7 = Thought280.getInstance(fd1, ld1, ld3, ld4);
    ab3 = fd0 > fd1;
    ab4 = ld1 < ld3;
    double ld8 = 290.42415126217276;
    ld4 = ld8 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld1, ld3, ld4);
}
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(ld8, fd0, fd1, ld1, lb2, lb5, ab1, ab2);
}
    ab3 = ld3 < ld4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb2);
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
if(fo1 != null){
      fb1 = fo1.m2();
}
    ad2 = ad3 - ad4;
    fd0 = fd1 + ad1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 < ad1;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    fb0 = ad2 > ad3;
    boolean lb0 = false;
    fb0 = ad4 > fd0;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
    lb0 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ad1, ad2, ad3);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
    for(int i0=0; i0<10; i0++){
        boolean lb1 = false;
if(fo0 != null){
          fo0.m1(ad2, ad3, ad4, fd0, lb1, lb0, fb0, fb1);
}
        boolean lb2 = true;
        lb1 = !lb2;
if(fo1 != null){
          fd1 = fo1.m3(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb1);
}
if(fo0 != null){
          lb2 = fo0.m2();
}
        lb0 = fb0 && fb1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, lb1, lb2, lb0, fb0);
}
if(fo0 != null){
          fo1 = fo0.m4(fb1, lb1, lb2, lb0);
}
        Thought lo3 = Thought390.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
          fb0 = fo1.m2(fd0, fd1, ad1, ad2);
}
        fb1 = lb1 && lb2;
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
    if (ab1) {
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
          fb1 = fo0.m2(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
          fo1.m3();
}
        fb0 = ad3 > ad4;
        fd0 = fd1 - ad1;
        fb1 = ab1 || ab2;
if(fo0 != null){
          ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
        Output.points[2][7] -= ad1;
        ad2 *= -1;
        ab1 = ab2 || ab3;
        ab4 = fb0 || fb1;
if(fo1 != null){
          fo1.m1(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
          ad3 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
          fo1 = fo0.m4(ad4, fd0, fd1, ad1);
}
        fb0 = fb1 || ab1;
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
        ab2 = ab3 || ab4;
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
if(ao1 != null){
      fb0 = ao1.m2(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought152.getInstance(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
    double ld1 = 118.32276148895205;
    fd0 *= -1;
if(ao1 != null){
      fo1 = ao1.m4();
}
    fb1 = fd1 < ld1;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, ld1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    Thought lo2 = Thought79.getInstance(fb0, fb1, fb0, fb1);
    Thought lo3 = Thought385.getInstance(ao1, ao2, ao3, ao4);
    boolean lb4 = true;
if(fo0 != null){
      lb4 = fo0.m2(ld1, fd0, fd1, ld1);
}
    fd0 *= -1;
    boolean lb5 = true;
    Thought lo6 = Thought309.getInstance(fo1, ao1, ao2, ao3, fd1, ld1, fd0, fd1);
    lb5 = !fb0;
    ld1 *= -1;
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, ld1, fd0, fb1, lb4, lb5, fb0);
}
    fb1 = lb4 && lb5;
    boolean lb7 = true;
    boolean lb8 = true;
    lb7 = !lb8;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb0, fb1, lb4, lb5);
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
      fb0 = ao2.m2();
}
    fb1 = !fb0;
    Thought lo0 = Thought342.getInstance(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
    fb1 = !fb0;
if(ao1 != null){
      ao1.m1(fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      fd0 = ao2.m3(fd1, ad1, ad2, ad3);
}
    fb1 = !fb0;
    boolean lb1 = true;
    fb0 = ad4 > fd0;
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
if(ao2 != null){
      fb1 = ao2.m2(fd0, fd1, ad1, ad2, lb1, fb0, fb1, lb1);
}
    fb0 = fb1 || lb1;
    fb0 = !fb1;
    lb1 = ad3 > ad4;
    fd0 = fd1 + ad1;
    ad2 = ad3 + ad4;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, lb1, fb0);
}
if(ao3 != null){
      ao3.m1();
}
    fd0 = fd1 + ad1;
    double ld2 = 331.0349676396046;
    Thought lo3 = Thought131.getInstance(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, fb1, lb1, fb0, fb1);
    lb1 = fb0 && fb1;
    Output.points[2][8] -= fd0;
if(ao3 != null){
      ao2 = ao3.m4(lb1, fb0, fb1, lb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    fb0 = fd1 < ld2;
    Output.points[3][0] += ad1;

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
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    fd1 *= -1;
    ab1 = ab2 && ab3;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    Thought lo0 = Thought288.getInstance(fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
    if (ab2) {
        Thought lo1 = Thought222.getInstance(ao4, fo0, fo1, ao1, ab3, ab4, fb0, fb1);
if(ao3 != null){
          ao2 = ao3.m4();
}
        ab1 = fd1 > fd0;
        boolean lb2 = false;
        ab1 = ab2 && ab3;
if(ao4 != null){
          fd1 = ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb2);
}
        boolean lb3 = false;
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
    double ld0 = 747.7962751168119;
if(ao1 != null){
      ao1.m2(ab2, ab3, ab4, fb0);
}
    for(int i0=0; i0<10; i0++){
        double ld1 = 806.113817960907;
        ld1 *= -1;
        }
    fb1 = ab1 && ab2;
    ad1 = ad2 + ad3;
    Thought lo2 = Thought342.getInstance(ao2, ao3, ao4, fo0);
if(fo1 != null){
      ab3 = fo1.m2(ad4, fd0, fd1, ld0);
}
    ab4 = ad1 < ad2;
if(ao1 != null){
      ad3 = ao1.m3(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ld0);
}
if(ao1 != null){
      fo1 = ao1.m4(ad1, ad2, ad3, ad4, fb0, fb1, ab1, ab2);
}
    ab3 = ab4 && fb0;
    fb1 = fd0 < fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
}
    boolean lb3 = false;
    ld0 = ad1 + ad2;
    Thought lo4 = Thought244.getInstance();
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, ab4, fb0, fb1, lb3);
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
    double ld0 = 994.9139179386982;
    Output.points[3][1] -= ld0;
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    fd0 = fd1 - ld0;
    double ld1 = 61.63285247201549;
    ld1 = fd0 - fd1;
    ld0 *= -1;
    for(int i0=0; i0<10; i0++){
        boolean lb2 = false;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        fb0 = fb1 || lb2;
        fb0 = fb1 || lb2;
        ld1 *= -1;
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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[3][2] -= fd0;
    fd1 *= -1;
    ab1 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          ab2 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
        double ld0 = 326.5180304950076;
        boolean lb1 = false;
if(fo1 != null){
          fo1.m2(ld0, fd0, fd1, ld0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb1, ab1, ab2);
}
        Output.points[3][3] += fd0;
        boolean lb2 = true;
        boolean lb3 = true;
        fd1 *= -1;
        boolean lb4 = false;
        lb4 = !ab1;
        }
    fb1 = fd0 > fd1;
    ab1 = fd0 < fd1;
    fd0 *= -1;
    ab2 = fd1 < fd0;
    ab3 = !ab4;
if(fo1 != null){
      fo0 = fo1.m4();
}
    double ld5 = 930.1025261352845;
    if (fb0) {
        double ld6 = 749.2353986845936;
        fb1 = ld5 < fd0;
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 184.28266858806535;
    if (fb1) {
        Output.points[3][4] += ld0;
        boolean lb1 = false;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, lb1, fb0, fb1, lb1);
}
        fb0 = !fb1;
        fd0 = fd1 + ld0;
        lb1 = !fb0;
if(fo0 != null){
          fo0.m1(fb1, lb1, fb0, fb1);
}
        boolean lb2 = true;
        lb1 = !lb2;
        ad1 *= -1;
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
          fo0.m2(ad2, ad3, ad4, fd0);
}
        fb0 = fd1 < ld0;
        fb1 = lb1 && lb2;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
if(fo1 != null){
          fb0 = fo1.m2(fd0, fd1, ld0, ad1, fb1, lb1, lb2, fb0);
}
        fb1 = lb1 || lb2;
        boolean lb3 = false;
        Output.points[3][5] += ad2;
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, lb3, fb0, fb1, lb1);
}
        lb2 = !lb3;
if(fo0 != null){
          fo1 = fo0.m4();
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb0, fb1, lb1, lb2);
}
        boolean lb4 = false;
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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    ad1 *= -1;
    ab1 = ab2 || ab3;
if(fo1 != null){
      ab4 = fo1.m2(fb0, fb1, lb0, ab1);
}
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0);
}
    ab3 = ad2 < ad3;
    Output.points[3][6] += ad4;
    boolean lb1 = false;
    fd0 = fd1 + ad1;
    ab3 = ad2 < ad3;
    Thought lo2 = Thought93.getInstance(ad4, fd0, fd1, ad1);
    ad2 = ad3 + ad4;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
    boolean lb3 = true;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
        fb0 = fd0 > fd1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, lb0, fb0, fb1);
}
    fd0 *= -1;
    lb0 = fd1 < fd0;
if(ao4 != null){
      ao3 = ao4.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    Thought lo1 = Thought132.getInstance(fb1, lb0, fb0, fb1);
    lb0 = fd1 > fd0;
    boolean lb2 = false;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 - ad4;
    fb0 = fd0 < fd1;
    fb1 = fb0 || fb1;
    fb0 = fb1 || fb0;
    for(int i0=0; i0<10; i0++){
        fb1 = ad1 < ad2;
        ad3 = ad4 - fd0;
if(ao1 != null){
          fd1 = ao1.m3(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
          fo1 = ao1.m4(ad1, ad2, ad3, ad4);
}
        fd0 *= -1;
        double ld0 = 814.4468276184658;
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
    double ld0 = 749.3656029407437;
    fd0 = fd1 - ld0;
if(ao2 != null){
      ab2 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, ld0, fd0);
}
    double ld1 = 248.88044052613284;
    boolean lb2 = true;
if(ao1 != null){
      ab2 = ao1.m2(fd0, fd1, ld0, ld1, ab3, ab4, fb0, fb1);
}
    boolean lb3 = false;
        double ld4 = 998.5647113470231;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, lb2, lb3, ab1, ab2);
}
    Thought lo5 = Thought141.getInstance();
    Thought lo6 = Thought86.getInstance(ao1, ao2, ao3, ao4, ld4, fd0, fd1, ld0, ab3, ab4, fb0, fb1);
    double ld7 = 873.363908258564;
    boolean lb8 = false;
    ld1 = ld4 - ld7;
if(fo0 != null){
      fo0.m2(lb2, lb3, lb8, ab1);
}
    Output.points[3][7] -= fd0;
    ab2 = fd1 > ld0;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    boolean lb9 = true;
    ab2 = ld1 > ld4;
    ld7 *= -1;
    Thought lo10 = Thought342.getInstance(fd0, fd1, ld0, ld1);
    double ld11 = 365.25835660868495;

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
    Thought lo0 = Thought345.getInstance(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
    boolean lb1 = false;
    for(int i0=0; i0<10; i0++){
        Output.points[3][8] -= fd0;
        boolean lb2 = false;
if(fo1 != null){
          fo1.m2(fd1, ad1, ad2, ad3, lb1, ab1, ab2, ab3);
}
if(ao1 != null){
          ad4 = ao1.m3(ao2, ao3, ao4, fo0, ab4, fb0, fb1, lb2);
}
        lb1 = ab1 && ab2;
        ab3 = ab4 && fb0;
        fb1 = fd0 > fd1;
        ad1 = ad2 + ad3;
        ad4 = fd0 + fd1;
        lb2 = lb1 || ab1;
        if (ab2) {
if(ao1 != null){
              fo1 = ao1.m4();
}
            Thought lo3 = Thought14.getInstance(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
            double ld4 = 62.34480745149195;
}}
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
    fb1 = fd0 < fd1;
    fb0 = fb1 && fb0;
    boolean lb0 = false;
    boolean lb1 = true;
    lb1 = fb0 && fb1;
    Thought lo2 = Thought249.getInstance(lb0, lb1, fb0, fb1);
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
        fd1 = fd0 - fd1;
if(fo0 != null){
      lb0 = fo0.m2(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fd1 = fo0.m3();
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
    ab2 = ab3 || ab4;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, ab1, ab2);
}
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
    for(int i0=0; i0<10; i0++){
        Output.points[4][0] += fd0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        fd1 = fd0 + fd1;
        }
    Output.points[4][1] -= fd0;
if(fo0 != null){
      ab3 = fo0.m2(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    for(int i1=0; i1<10; i1++){
        Thought lo0 = Thought145.getInstance(fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
        Thought lo1 = Thought276.getInstance(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
        fb1 = fd1 < fd0;
        Thought lo2 = Thought174.getInstance();
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
        fb0 = fb1 || ab1;
if(fo0 != null){
          fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
        boolean lb3 = false;
        Thought lo4 = Thought86.getInstance(fo1, fo0, fo1, fo0);
        Thought lo5 = Thought145.getInstance(fd1, fd0, fd1, fd0);
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
    fd0 = fd1 + ad1;
    fb1 = fb0 && fb1;
    Thought lo0 = Thought146.getInstance(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m2();
}
        Thought lo1 = Thought195.getInstance(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    ad4 = fd0 - fd1;

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
    boolean lb0 = false;
    ad2 = ad3 - ad4;
    double ld1 = 832.4709553352025;
    ad4 = fd0 - fd1;
    ld1 = ad1 + ad2;
    Output.points[4][2] += ad3;
    Thought lo2 = Thought98.getInstance(fo0, fo1, fo0, fo1);
    Thought lo3 = Thought257.getInstance(ad4, fd0, fd1, ld1);
    boolean lb4 = false;
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    boolean lb5 = true;
    fd1 = ld1 - ad1;
    double ld6 = 650.1125775085544;
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4, lb0, lb4, lb5, ab1);
}
    ab2 = fd0 < fd1;
    double ld7 = 35.21639490741768;
    ld1 = ld6 + ld7;
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[4][3] -= fd1;
    fb0 = fb1 || fb0;
    boolean lb0 = true;
    double ld1 = 302.8561493984304;
if(ao1 != null){
      ld1 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, ld1, fd0, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fo1.m3(fb1, lb0, fb0, fb1);
}
    lb0 = !fb0;
    Thought lo2 = Thought315.getInstance(ao1, ao2, ao3, ao4);
    fd1 = ld1 + fd0;
    double ld3 = 167.48489690494392;
    fb1 = fd0 < fd1;
if(fo0 != null){
      lb0 = fo0.m2(ld1, ld3, fd0, fd1);
}
    Output.points[4][4] -= ld1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ld3, fd0, fd1, ld1);
}
if(fo1 != null){
      ld3 = fo1.m3(fd0, fd1, ld1, ld3, fb0, fb1, lb0, fb0);
}
    fd0 = fd1 + ld1;
    Output.points[4][5] -= ld3;
    fb1 = fd0 > fd1;
if(ao1 != null){
      ld1 = ao1.m3(ao2, ao3, ao4, fo0, lb0, fb0, fb1, lb0);
}
    double ld4 = 372.59228360900477;

Thought.STACK_COUNTER++;
return ld3;
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
if(ao2 != null){
      fb1 = ao2.m2();
}
    boolean lb0 = false;
if(ao3 != null){
      lb0 = ao3.m2(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, fb0, fb1, lb0, fb0);
}
if(ao3 != null){
          ao2 = ao3.m4(fb1, lb0, fb0, fb1);
}
if(ao4 != null){
      lb0 = ao4.m2(fo0, fo1, ao1, ao2);
}
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, ad1, ad2);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1);
}
    ad1 = ad2 - ad3;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1, fb0, fb1, lb0, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, lb0, fb0, fb1);
}
    boolean lb1 = true;
    ad2 = ad3 - ad4;
    lb0 = fd0 < fd1;
if(ao1 != null){
      ad1 = ao1.m3();
}

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
    if (ab2) {
        ab3 = fd0 < fd1;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
        fd0 = fd1 - fd0;
        Thought lo0 = Thought236.getInstance(ab2, ab3, ab4, fb0);
        boolean lb1 = true;
        fb0 = fd1 < fd0;
        double ld2 = 900.2478117869173;
        fd0 = fd1 - ld2;
        boolean lb3 = true;
if(ao2 != null){
          ao2.m2(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
          ao1 = ao2.m4(fd0, fd1, ld2, fd0);
}
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ld2, fd0, fd1);
}
        fb0 = ld2 > fd0;
        boolean lb4 = true;
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
    ad2 = ad3 + ad4;
    ab2 = ab3 && ab4;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ad1, ad2, fb0, fb1, ab1, ab2);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab3, ab4, fb0, fb1);
}
    Thought lo0 = Thought275.getInstance();
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = ad1 > ad2;
    ad3 = ad4 - fd0;
if(ao3 != null){
      fd1 = ao3.m3(fb1, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      ab1 = ao3.m2(ad1, ad2, ad3, ad4);
}
    ab2 = fd0 > fd1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4);
}
    Output.points[4][6] += fd0;
    ab3 = fd1 < ad1;
if(ao4 != null){
      ab4 = ao4.m2(ad2, ad3, ad4, fd0, fb0, fb1, ab1, ab2);
}
    double ld1 = 601.0046383255772;
if(fo0 != null){
      ab3 = fo0.m2(fo1, ao1, ao2, ao3, ab4, fb0, fb1, ab1);
}
    double ld2 = 397.7712100185088;
    ab2 = ad4 > fd0;
    boolean lb3 = false;
if(ao4 != null){
      fd1 = ao4.m3();
}
    ld1 = ld2 - ad1;
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      fb1 = ao4.m2(lb3, ab1, ab2, ab3);
}
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3);
}
if(fo0 != null){
      ao4 = fo0.m4(fd1, ld1, ld2, ad1);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
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
    fb0 = fd0 > fd1;
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
    boolean lb0 = true;
if(fo1 != null){
      fo1.m2(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    fb1 = fd0 < fd1;
    boolean lb1 = false;
    lb0 = lb1 || fb0;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, lb0, lb1, fb0, fb1);
}
    lb0 = !lb1;
    for(int i0=0; i0<10; i0++){
        Output.points[4][7] -= fd0;
if(fo1 != null){
          fo1.m3();
}
        fd1 = fd0 + fd1;
        Thought lo2 = Thought379.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb1);
if(fo1 != null){
          fo0 = fo1.m4(fb0, fb1, lb0, lb1);
}
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0);
}
        fb0 = !fb1;
if(fo1 != null){
          fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
        lb0 = fd1 > fd0;
        fd1 = fd0 - fd1;
        double ld3 = 752.3842043329569;
        lb1 = ld3 < fd0;
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
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought262.getInstance(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
    double ld1 = 8.122724241657064;
    boolean lb2 = false;
    ab3 = ab4 && fb0;
    fb1 = ld1 > fd0;
    Thought lo3 = Thought297.getInstance();
    Output.points[4][8] += fd1;
    lb2 = ab1 && ab2;
if(fo1 != null){
      ld1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0, ab3, ab4, fb0, fb1);
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
    double ld0 = 299.8374753026736;
        fb0 = !fb1;
    Output.points[5][0] -= ld0;
    fb0 = fb1 || fb0;
if(fo1 != null){
      fb1 = fo1.m2(fb0, fb1, fb0, fb1);
}
    Thought lo1 = Thought199.getInstance(fo0, fo1, fo0, fo1);
    ad1 *= -1;
    ad2 *= -1;
    for(int i0=0; i0<10; i0++){
        ad3 = ad4 - fd0;
        Thought lo2 = Thought84.getInstance(fd1, ld0, ad1, ad2);
        fb0 = !fb1;
        Output.points[5][1] -= ad3;
        Output.points[5][2] -= ad4;
        fd0 = fd1 + ld0;
        double ld3 = 433.0276410640707;
        ld0 *= -1;
        double ld4 = 932.0934580059549;
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
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    fd1 = ad1 + ad2;
    boolean lb0 = false;
if(fo0 != null){
      fo0.m1(ad3, ad4, fd0, fd1, lb0, ab1, ab2, ab3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    ad1 = ad2 - ad3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
}
    double ld1 = 458.85974559575106;
if(fo1 != null){
      fo1.m3(fb0, fb1, lb0, ab1);
}
    ab2 = !ab3;
    ad1 = ad2 + ad3;
    ad4 *= -1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld1, ad1);
}
    boolean lb2 = true;
    ad2 *= -1;
    ab3 = ad3 < ad4;
    double ld3 = 723.8341997554382;
    ad4 = fd0 + fd1;
    Thought lo4 = Thought299.getInstance(fo1, fo0, fo1, fo0, ld1, ld3, ad1, ad2);
    ad3 *= -1;
    boolean lb5 = false;

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
    fb1 = fb0 || fb1;
if(ao1 != null){
      ao1.m1(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = fd0 + fd1;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 - fd0;
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fb1, fb0, fb1, fb0);
}
    Output.points[5][3] += fd1;
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3);
}
    boolean lb0 = false;
if(ao4 != null){
      ao4.m3(fd0, fd1, fd0, fd1);
}
    fb0 = !fb1;
    double ld1 = 114.37749907474642;
    double ld2 = 243.70098059314415;
    ld1 *= -1;
    boolean lb3 = true;
    ld2 = fd0 + fd1;
    lb0 = ld1 > ld2;
    lb3 = fb0 && fb1;
    fd0 = fd1 + ld1;
    lb0 = lb3 && fb0;
    ld2 = fd0 + fd1;
    fb1 = lb0 || lb3;
    ld1 = ld2 + fd0;
    fb0 = fd1 < ld1;
    fb1 = ld2 > fd0;

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
    ad2 = ad3 + ad4;
    double ld0 = 627.3048715778835;
    Output.points[5][4] -= ad4;
    Output.points[5][5] -= fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ld0, ad1, ad2);
}
if(ao3 != null){
      ao2 = ao3.m4(ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    if (fb0) {
if(ao4 != null){
          ld0 = ao4.m3(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
          ao3 = ao4.m4();
}
        boolean lb1 = false;
if(fo0 != null){
          fb0 = fo0.m2(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4, fb1, lb1, fb0, fb1);
}
        Thought lo2 = Thought319.getInstance(lb1, fb0, fb1, lb1);
        Output.points[5][6] -= fd0;
        fb0 = fd1 > ld0;
        Thought lo3 = Thought152.getInstance(ao4, fo0, fo1, ao1);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 919.5418000034192;
    fd0 *= -1;
if(ao1 != null){
      ao1.m1(fd1, ld0, fd0, fd1);
}
    ld0 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ld0, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4(fd1, ld0, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || ab1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4();
}
    ld0 *= -1;
    boolean lb1 = true;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, ld0, fd0, fb0, fb1, lb1, ab1);
}
    ab2 = ab3 && ab4;
if(ao1 != null){
      fo1 = ao1.m4(fb0, fb1, lb1, ab1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    ab2 = ab3 && ab4;
    fb0 = fb1 || lb1;
    ab1 = !ab2;
    ab3 = fd1 < ld0;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ld0, fd0);
}
    ab4 = fd1 < ld0;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, fd0, fd1, ld0, fd0);
}
        fb0 = !fb1;
    double ld2 = 840.0625005363067;
    fd0 *= -1;
if(ao3 != null){
      lb1 = ao3.m2(fd1, ld0, ld2, fd0, ab1, ab2, ab3, ab4);
}
    Thought lo3 = Thought354.getInstance(ao4, fo0, fo1, ao1, fb0, fb1, lb1, ab1);

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
if(ao1 != null){
      ad2 = ao1.m3();
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = ad1 > ad2;
    Output.points[5][7] += ad3;
if(ao2 != null){
      ao2.m3(fb1, ab1, ab2, ab3);
}
    ab4 = ad4 > fd0;
    if (fb0) {
        for(int i0=0; i0<10; i0++){
            Output.points[5][8] += fd1;
if(ao3 != null){
              ao3.m2(ao4, fo0, fo1, ao1);
}
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
if(fo0 != null){
      fb1 = fo0.m2(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fb1 = fd0 > fd1;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    double ld0 = 384.5483317501211;
    boolean lb1 = false;
if(fo1 != null){
      fb0 = fo1.m2();
}
        fd0 = fd1 + ld0;
    fd0 *= -1;
    boolean lb2 = false;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0, fb0, fb1, lb1, lb2);
}
    fd0 *= -1;
    fb0 = fd1 < ld0;
    fd0 = fd1 - ld0;
        fd0 = fd1 + ld0;
if(fo0 != null){
      fo1 = fo0.m4(fb1, lb1, lb2, fb0);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    fb1 = !lb1;
    lb2 = fb0 && fb1;
if(fo0 != null){
      fo0.m3(fd1, ld0, fd0, fd1);
}
    ld0 = fd0 + fd1;
    Thought lo3 = Thought162.getInstance(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
    lb1 = lb2 || fb0;
if(fo1 != null){
      fb1 = fo1.m2(fd0, fd1, ld0, fd0, lb1, lb2, fb0, fb1);
}
    double ld4 = 787.6307378567495;

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
    Thought lo0 = Thought261.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
    fd0 *= -1;
    boolean lb1 = false;
        lb1 = fd1 > fd0;
    fd1 *= -1;
if(fo0 != null){
      fb0 = fo0.m2();
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb1);
}
    boolean lb2 = true;
    lb2 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(lb1, lb2, fb0, fb1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    boolean lb3 = false;
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
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fb0 = fd1 > fd0;
    boolean lb0 = true;
        Thought lo1 = Thought359.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
    boolean lb2 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb0, lb2);
}
    fb0 = !fb1;
    double ld3 = 180.61262542680697;
    fd0 *= -1;
if(fo1 != null){
      fd1 = fo1.m3();
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ld3, fd0, fd1, ld3, lb0, lb2, fb0, fb1);
}
    fd0 *= -1;
if(fo1 != null){
      fo1.m2(lb0, lb2, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld3, fd0, fd1);
}
    ld3 *= -1;
    Thought lo4 = Thought240.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld3, fd0);
    Thought lo5 = Thought291.getInstance(fd1, ld3, fd0, fd1, lb0, lb2, fb0, fb1);
        double ld6 = 289.42743426650753;
    Output.points[6][0] -= ld3;

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
