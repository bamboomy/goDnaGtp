package genetic;
import java.util.ArrayList;
class Thought8 extends Thought{
private static ArrayList<Thought8> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 754.2346221237326;
private double fd1 = 409.7671511528949;
private Thought fo0 = null;
private Thought fo1 = null;
Thought8 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought8 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought8 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought8 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought8 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought8 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought8 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought8 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought8 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought8 instance = new Thought8 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought8 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought8 instance = new Thought8 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought8 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought8 instance = new Thought8 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought8 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought8 instance = new Thought8 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought8 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought8 instance = new Thought8 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought8 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought8 instance = new Thought8 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought8 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought8 instance = new Thought8 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought8 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought8 instance = new Thought8 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fd1 = fd0 + fd1;
    fb1 = !fb0;
    fb1 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    boolean lb0 = true;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fd0 = fo0.m3(fb0, fb1, lb0, fb0);
}
    Thought lo1 = Thought19.getInstance();
    boolean lb2 = false;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fb0 = fo1.m2(fd0, fd1, fd0, fd1, fb1, lb0, lb2, fb0);
}
    fb1 = lb0 && lb2;
    Output.points[7][0] -= fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb2);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb0, lb2);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    boolean lb3 = false;
    double ld4 = 541.3596887282397;
    lb3 = fb0 && fb1;
    fd0 = fd1 - ld4;
    fd0 = fd1 - ld4;
    lb0 = !lb2;
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
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
        ab1 = fd1 < fd0;
    if (ab2) {
        ab3 = fd1 > fd0;
        fd1 *= -1;
        double ld0 = 200.50522393229411;
        ab4 = ld0 > fd0;
        Thought lo1 = Thought58.getInstance(fb0, fb1, ab1, ab2);
if(fo1 != null){
          fo0 = fo1.m4();
}
        fd1 = ld0 + fd0;
        ab3 = fd1 < ld0;
        Output.points[7][1] -= fd0;
if(fo1 != null){
          fo0 = fo1.m4(fd1, ld0, fd0, fd1, ab4, fb0, fb1, ab1);
}
        ab2 = ab3 || ab4;
        double ld2 = 594.1264789546032;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
          fb0 = fo0.m2(fo1, fo0, fo1, fo0, ld0, ld2, fd0, fd1, fb1, ab1, ab2, ab3);
}
        ld0 *= -1;
        ab4 = !fb0;
        double ld3 = 255.37571383211713;
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
}
        ld2 = ld3 - fd0;
        double ld4 = 731.8111049970404;
        for(int i0=0; i0<10; i0++){
            ab4 = fb0 || fb1;
            fd0 *= -1;
            ab1 = ab2 && ab3;
            boolean lb5 = false;
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
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    ad2 = ad3 - ad4;
    fb0 = !fb1;
    lb0 = fb0 && fb1;
    fd0 = fd1 - ad1;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
    Thought lo1 = Thought61.getInstance(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
    boolean lb2 = false;
    lb0 = lb2 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(fb1, lb0, lb2, fb0);
}
    ad4 *= -1;
    fb1 = lb0 && lb2;
if(fo0 != null){
      fo0.m3();
}
    fb0 = fb1 || lb0;
    fd0 *= -1;
    Output.points[7][2] -= fd1;
    lb2 = !fb0;
    boolean lb3 = true;
    double ld4 = 92.33903018346672;
    fb0 = ld4 > ad1;
    fb1 = ad2 > ad3;
    lb0 = lb2 || lb3;
        fb0 = ad4 < fd0;
    Output.points[7][3] -= fd1;
    boolean lb5 = false;
    fb0 = ld4 < ad1;

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
if(fo1 != null){
      fo1.m1(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    Output.points[7][4] -= fd0;
    fb1 = fd1 > ad1;
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    ad2 *= -1;
    ab2 = ad3 < ad4;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, ab3, ab4, fb0, fb1);
}
    ab1 = ab2 && ab3;
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
}
    ad4 = fd0 - fd1;
    ab2 = ad1 < ad2;
    ad3 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ad1);
}
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    ab3 = ad1 < ad2;
    ad3 *= -1;
    ab4 = fb0 && fb1;
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4(lb0, ab1, ab2, ab3);
}
    Output.points[7][5] -= ad4;
if(fo1 != null){
      fo0 = fo1.m4();
}
    ab4 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, fb0, fb1, lb0, ab1);
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
    fd0 *= -1;
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0);
}
    boolean lb0 = true;
    fb0 = !fb1;
    fd1 = fd0 - fd1;
    lb0 = fb0 && fb1;
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
    Thought lo1 = Thought19.getInstance(fo0, fo1, ao1, ao2, fb0, fb1, lb0, fb0);
    if (fb1) {
        fd0 = fd1 - fd0;
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
    fb0 = !fb1;
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0);
}
    fd1 *= -1;
    double ld0 = 282.0399388648702;
    ld0 = ad1 + ad2;
    fb0 = fb1 || fb0;
    ad3 = ad4 + fd0;
    Output.points[7][6] -= fd1;
    fb1 = fb0 || fb1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld0, ad1, ad2, ad3);
}
    ad4 = fd0 - fd1;
    fb0 = ld0 > ad1;
    Output.points[7][7] -= ad2;
if(ao3 != null){
      ao3.m3(fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ad3 = ao4.m3();
}
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ld0, fb0, fb1, lb1, fb0);
}
    double ld2 = 746.1002736243214;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
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
    ab1 = ab2 && ab3;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
    Output.points[7][8] -= fd1;
    ab2 = ab3 && ab4;
    fd0 = fd1 + fd0;
    fb0 = fd1 > fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, ab1, ab2, ab3);
}
    Thought lo0 = Thought25.getInstance(fd1, fd0, fd1, fd0);
    fd1 = fd0 - fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    ab4 = fb0 || fb1;
if(ao2 != null){
      ao1 = ao2.m4(ab1, ab2, ab3, ab4);
}
    double ld1 = 343.861338460352;
    ld1 = fd0 - fd1;
    fb0 = ld1 < fd0;
    fb1 = ab1 || ab2;
    double ld2 = 95.11962929317366;
    double ld3 = 878.5363873653026;
    ab3 = ld3 > fd0;
    fd1 = ld1 - ld2;
if(ao4 != null){
      ao3 = ao4.m4();
}
if(fo0 != null){
      ab4 = fo0.m2(ld3, fd0, fd1, ld1, fb0, fb1, ab1, ab2);
}
    ab3 = !ab4;
    for(int i0=0; i0<10; i0++){
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
        double ld4 = 807.1186666418979;
        for(int i1=0; i1<10; i1++){
if(fo1 != null){
              ld1 = fo1.m3(ao1, ao2, ao3, ao4, ld2, ld3, fd0, fd1, fb0, fb1, ab1, ab2);
}
            boolean lb5 = true;
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
    ab1 = ad1 > ad2;
if(ao1 != null){
      ab2 = ao1.m2(ao2, ao3, ao4, fo0, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      ad3 = fo1.m3(ad4, fd0, fd1, ad1);
}
    Thought lo0 = Thought14.getInstance(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0);
    boolean lb1 = true;
    lb1 = !ab1;
    ab2 = !ab3;
if(fo1 != null){
      fo0 = fo1.m4(ab4, fb0, fb1, lb1);
}
    ab1 = ab2 && ab3;
    boolean lb2 = false;
    double ld3 = 952.5027093827498;

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
    fb0 = fd1 < fd0;
    fb1 = !fb0;
    fb1 = fd1 > fd0;
if(fo0 != null){
      fo0.m3();
}
        fb0 = fd1 > fd0;
if(fo1 != null){
      fo1.m1(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    fb0 = fd1 < fd0;
    fb1 = fd1 > fd0;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 > fd0;
    fb0 = fd1 > fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    Output.points[8][0] -= fd1;
    fb1 = fb0 || fb1;
        fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
    Thought lo0 = Thought22.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
    Output.points[8][1] -= fd0;
    Output.points[8][2] += fd1;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
          fd0 = fo1.m3();
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
    Output.points[8][3] += fd1;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 && ab2;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    double ld0 = 299.3668204668199;
    ab3 = ab4 && fb0;
    Output.points[8][4] -= fd0;
    fb1 = fd1 < ld0;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1, ab1, ab2, ab3, ab4);
}
    Thought lo1 = Thought80.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
if(fo1 != null){
      fo0 = fo1.m4(ld0, fd0, fd1, ld0);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
}
    ab3 = ab4 || fb0;
    double ld2 = 318.7824477150668;
    fb1 = ab1 || ab2;
if(fo1 != null){
      ab3 = fo1.m2(ab4, fb0, fb1, ab1);
}
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    ab2 = !ab3;
if(fo0 != null){
      fd1 = fo0.m3(ld0, ld2, fd0, fd1, ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1, ld0, ld2, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fb0 = fo1.m2(ad1, ad2, ad3, ad4);
}
    fb1 = !fb0;
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
    fb1 = !fb0;
    Output.points[8][5] += ad4;
    double ld0 = 166.8012636556527;
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    double ld1 = 914.5932823020105;
        Thought lo2 = Thought42.getInstance();
    Output.points[8][6] += ad3;
    fb1 = ad4 > fd0;
    fb0 = fd1 < ld0;
    ld1 *= -1;
    double ld3 = 806.1108277312998;
if(fo0 != null){
      fo0.m1(ld3, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1);
}
        Output.points[8][7] -= ad1;
    Thought lo0 = Thought29.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
    boolean lb1 = false;
    fd1 *= -1;
    boolean lb2 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb1);
}
    lb2 = ab1 && ab2;
    Output.points[8][8] += ad1;
    boolean lb3 = false;
    ad2 *= -1;
if(fo0 != null){
      fo0.m2(ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    fd0 = fd1 + ad1;
    Output.points[0][0] -= ad2;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
if(fo1 != null){
          fo0 = fo1.m4();
}
        }
    Thought lo4 = Thought84.getInstance(ad3, ad4, fd0, fd1, fb1, lb1, lb2, lb3);
    boolean lb5 = true;
    boolean lb6 = true;
    ad1 *= -1;
    ad2 = ad3 - ad4;
    Output.points[0][1] -= fd0;
    Thought lo7 = Thought1.getInstance(fo0, fo1, fo0, fo1);
    double ld8 = 634.9554277265185;

Thought.STACK_COUNTER++;
return lb5;
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
    fd1 *= -1;
    lb0 = fb0 && fb1;
    lb0 = !fb0;
    fb1 = fd0 > fd1;
    Output.points[0][2] += fd0;
    if (lb0) {
        fd1 = fd0 + fd1;
        for(int i0=0; i0<10; i0++){
            for(int i1=0; i1<10; i1++){
}}}
Thought.STACK_COUNTER++;
return fb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
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
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 > fd1;
    ad1 = ad2 - ad3;
    boolean lb0 = true;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, lb0, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ad4, fd0, fd1, ad1);
}
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
    fd1 = ad1 + ad2;
    fb1 = lb0 || fb0;
    fb1 = lb0 || fb0;
if(ao2 != null){
      ao2.m1(fb1, lb0, fb0, fb1);
}
    lb0 = ad3 < ad4;
if(ao3 != null){
      fb0 = ao3.m2();
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
    fd0 = fd1 + fd0;
    ab1 = !ab2;
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
      ab1 = ao4.m2(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, fb1, ab1, ab2, ab3);
}
    Thought lo0 = Thought22.getInstance(fd0, fd1, fd0, fd1);
    boolean lb1 = false;
    fd0 *= -1;
    double ld2 = 241.69811933656266;
if(ao2 != null){
      ab3 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, ld2, fd0);
}
if(ao2 != null){
      ao1 = ao2.m4(ab4, fb0, fb1, lb1);
}
    ab1 = ab2 && ab3;
    double ld3 = 569.2466297351342;
if(ao4 != null){
      ao3 = ao4.m4();
}
    boolean lb4 = true;
    ab3 = ab4 && fb0;
    fd0 = fd1 - ld2;
    fb1 = lb1 && lb4;
    boolean lb5 = true;
    lb5 = ab1 || ab2;
    ld3 = fd0 - fd1;
    ld2 = ld3 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld2, ld3, fd0, ab3, ab4, fb0, fb1);
}
    Thought lo6 = Thought15.getInstance(ao1, ao2, ao3, ao4);

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 && ab4;
    fb0 = fb1 || ab1;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    boolean lb0 = false;
    fb0 = fb1 || lb0;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ab1, ab2, ab3, ab4);
}
    boolean lb1 = false;
if(fo1 != null){
      fd1 = fo1.m3(ad1, ad2, ad3, ad4);
}
    ab4 = fb0 && fb1;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, ad1, ad2, ad3);
}
    double ld2 = 796.5124022242043;
    boolean lb3 = false;
    double ld4 = 794.5989457913436;
    lb0 = ad2 > ad3;
    lb1 = ad4 < fd0;
    boolean lb5 = false;
    double ld6 = 99.0883908255334;
    lb3 = lb5 && ab1;
if(ao1 != null){
      fo1 = ao1.m4(ab2, ab3, ab4, fb0);
}
if(ao2 != null){
      fb1 = ao2.m2();
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 || fb1;
    fd1 = fd0 + fd1;
    for(int i0=0; i0<10; i0++){
        boolean lb0 = true;
        fd0 *= -1;
        fd1 = fd0 - fd1;
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
        boolean lb1 = false;
        fd0 = fd1 + fd0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        boolean lb2 = true;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb1, lb2, fb0, fb1);
}
        Thought lo3 = Thought90.getInstance(fo0, fo1, fo0, fo1, lb0, lb1, lb2, fb0);
if(fo1 != null){
          fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
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
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought9.getInstance(ab2, ab3, ab4, fb0);
    fb1 = fd0 < fd1;
    double ld1 = 392.10071623525215;
    ld1 *= -1;
    ab1 = ab2 || ab3;
    fd0 *= -1;
    double ld2 = 507.68107407706543;
    double ld3 = 377.3204497692849;
    Output.points[0][3] += ld3;
    ab4 = fd0 > fd1;
    fb0 = ld1 < ld2;
if(fo0 != null){
      fo1 = fo0.m4();
}
    boolean lb4 = false;
    fb0 = ld3 > fd0;
if(fo1 != null){
      fo1.m2(fd1, ld1, ld2, ld3, fb1, lb4, ab1, ab2);
}
    if (ab3) {
        ab4 = fd0 > fd1;
}
Thought.STACK_COUNTER++;
return ld1;
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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = ad1 + ad2;
    ad3 = ad4 - fd0;
    fd1 = ad1 + ad2;
    ad3 = ad4 + fd0;
    fd1 = ad1 - ad2;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
    Output.points[0][4] -= ad1;

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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    fd0 = fd1 - ad1;
    double ld0 = 558.9138629141879;
    boolean lb1 = true;
    boolean lb2 = false;
    lb1 = ad1 > ad2;
if(fo0 != null){
      fo0.m1(lb2, ab1, ab2, ab3);
}
    ad3 = ad4 + fd0;
    ab4 = !fb0;
if(fo1 != null){
      fb1 = fo1.m2();
}
    Output.points[0][5] += fd1;

Thought.STACK_COUNTER++;
return ld0;
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
    boolean lb0 = true;
    boolean lb1 = true;
    lb0 = !lb1;
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb1);
}
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fb1, lb0, lb1, fb0);
}
    Thought lo2 = Thought3.getInstance(fd1, fd0, fd1, fd0);
    Thought lo3 = Thought78.getInstance(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
    boolean lb4 = true;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb0, lb1);
}
    lb4 = !fb0;
    fb1 = !lb0;
if(ao1 != null){
      fd1 = ao1.m3();
}
    boolean lb5 = false;
    double ld6 = 614.2160782377935;
    lb1 = !lb4;
if(ao2 != null){
      lb5 = ao2.m2(ld6, fd0, fd1, ld6, fb0, fb1, lb0, lb1);
}
    Thought lo7 = Thought38.getInstance(ao3, ao4, fo0, fo1);
    Thought lo8 = Thought49.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, ld6, fd0, lb4, lb5, fb0, fb1);
if(fo0 != null){
      fd1 = fo0.m3(fo1, ao1, ao2, ao3, lb0, lb1, lb4, lb5);
}
    ld6 = fd0 - fd1;
    boolean lb9 = true;
    for(int i0=0; i0<10; i0++){
        lb9 = fb0 || fb1;
        ld6 = fd0 - fd1;
}
Thought.STACK_COUNTER++;
return ld6;
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
    ad2 = ad3 - ad4;
    for(int i0=0; i0<10; i0++){
if(ao2 != null){
          ao2.m1(fd0, fd1, ad1, ad2);
}
        fb0 = fb1 && fb0;
        boolean lb0 = false;
        Thought lo1 = Thought80.getInstance(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
        Thought lo2 = Thought37.getInstance(fb0, fb1, lb0, fb0);
        fb1 = !lb0;
        boolean lb3 = false;
        double ld4 = 880.5672737210582;
if(ao2 != null){
          ao1 = ao2.m4();
}
        lb3 = fb0 && fb1;
        ld4 = ad1 + ad2;
        lb0 = ad3 < ad4;
        lb3 = fb0 && fb1;
if(ao4 != null){
          ao3 = ao4.m4(fd0, fd1, ld4, ad1, lb0, lb3, fb0, fb1);
}
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
        boolean lb5 = false;
        ad2 = ad3 - ad4;
        double ld6 = 843.9152367395976;
        ad4 = fd0 + fd1;
        ld4 = ld6 - ad1;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0, lb0, lb3, lb5, fb0);
}
        fd1 *= -1;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 || ab3;
    Output.points[0][6] += fd1;
    ab4 = fb0 || fb1;
    ab1 = ab2 || ab3;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab4, fb0, fb1, ab1);
}
    boolean lb0 = true;
    ab1 = ab2 || ab3;
    Thought lo1 = Thought57.getInstance(fd0, fd1, fd0, fd1);
    ab4 = fb0 || fb1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(ao1 != null){
      ao1.m3(lb0, ab1, ab2, ab3);
}
if(ao2 != null){
      ao2.m2();
}
if(ao3 != null){
      ao3.m2(fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb0);
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
    Thought lo0 = Thought97.getInstance(ao2, ao3, ao4, fo0);
    ab2 = ab3 && ab4;
    fb0 = ad2 > ad3;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1, fb1, ab1, ab2, ab3);
}
    ab4 = ad2 > ad3;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb0, fb1, ab1, ab2);
}
    boolean lb1 = true;
    ab2 = ab3 || ab4;
    fb0 = ad4 > fd0;
    Thought lo2 = Thought61.getInstance(fd1, ad1, ad2, ad3);
    double ld3 = 569.4091728629174;
if(fo1 != null){
      ad3 = fo1.m3(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ld3);
}
    boolean lb4 = true;
if(fo0 != null){
      ad1 = fo0.m3(fb0, fb1, lb1, lb4);
}
        ab1 = ab2 || ab3;
if(fo1 != null){
      ad2 = fo1.m3();
}
    ab4 = ad3 < ad4;
    double ld5 = 561.2914658897145;
if(ao2 != null){
      ao1 = ao2.m4(ad4, fd0, fd1, ld3, fb0, fb1, lb1, lb4);
}
    Output.points[0][7] += ld5;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1);
}
    boolean lb6 = true;
    lb6 = ab1 && ab2;
    double ld7 = 481.2331473322929;
if(ao2 != null){
      ld7 = ao2.m3(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
        lb1 = lb4 && lb6;

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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 && fb1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    fd0 = fd1 - fd0;
    fb0 = fb1 && fb0;
    Thought lo0 = Thought82.getInstance();
    double ld1 = 41.82464522602857;
    fd0 *= -1;
    fb1 = fd1 > ld1;
    fb0 = fb1 || fb0;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld1, fd0, fb1, fb0, fb1, fb0);
}
    fd1 = ld1 - fd0;
    for(int i0=0; i0<10; i0++){
        Thought lo2 = Thought99.getInstance(fo1, fo0, fo1, fo0);
        if (fb1) {
            fd1 *= -1;
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
              fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
            Thought lo3 = Thought46.getInstance(fd0, fd1, ld1, fd0);
}}
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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
if(fo1 != null){
      fd1 = fo1.m3(ab2, ab3, ab4, fb0);
}
    fb1 = fd0 < fd1;
    ab1 = ab2 && ab3;
    ab4 = fb0 && fb1;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fo0.m2(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    double ld0 = 848.0971504377609;
    fb0 = fb1 || ab1;

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
    fb1 = !fb0;
    Thought lo0 = Thought66.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
    fb1 = fd1 < ad1;
    double ld1 = 302.70455138189374;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = ad1 > ad2;
    Thought lo2 = Thought12.getInstance(ad3, ad4, fd0, fd1);
    boolean lb3 = false;
    ld1 = ad1 - ad2;
    lb3 = !fb0;
    ad3 *= -1;
    fb1 = ad4 > fd0;
    lb3 = fb0 && fb1;
    lb3 = !fb0;
    fb1 = !lb3;
    fb0 = !fb1;
    Output.points[0][8] -= fd1;
    boolean lb4 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld1, ad1, ad2, ad3);
}
    boolean lb5 = false;
if(fo0 != null){
      fo1 = fo0.m4(lb3, lb4, lb5, fb0);
}
    ad4 *= -1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb1 = fd0 > fd1;
    lb3 = ld1 > ad1;
    ad2 = ad3 - ad4;
    Thought lo6 = Thought46.getInstance(fd0, fd1, ld1, ad1, lb4, lb5, fb0, fb1);
    double ld7 = 279.28518506101733;

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
      ad1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    ab1 = ab2 || ab3;
    ab4 = ad2 < ad3;
    Output.points[1][0] -= ad4;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
          ad3 = fo0.m3(ad4, fd0, fd1, ad1);
}
if(fo1 != null){
          ad2 = fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
        ab1 = ad1 > ad2;
if(fo0 != null){
          ad3 = fo0.m3(ab2, ab3, ab4, fb0);
}
        double ld0 = 617.4992806318376;
if(fo1 != null){
          fo1.m2();
}
if(fo0 != null){
          fo0.m3(ad3, ad4, fd0, fd1, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
          ab4 = fo1.m2(fo0, fo1, fo0, fo1);
}
        fb0 = fb1 && ab1;
        ab2 = ab3 || ab4;
        boolean lb1 = true;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, ad1, ad2, ad3, ab4, fb0, fb1, lb1);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 *= -1;
    boolean lb0 = true;
    fb0 = fb1 || lb0;
    fb0 = !fb1;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, lb0, fb0, fb1, lb0);
}
    if (fb0) {
        fb1 = lb0 && fb0;
if(ao1 != null){
          fd0 = ao1.m3(fd1, fd0, fd1, fd0);
}
        fb1 = lb0 && fb0;
        fb1 = lb0 || fb0;
if(ao2 != null){
          fb1 = ao2.m2(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
        lb0 = fb0 || fb1;
        boolean lb1 = true;
}
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
    ad2 = ad3 - ad4;
    fd0 = fd1 - ad1;
    fb0 = !fb1;
if(ao2 != null){
      ad2 = ao2.m3(fb0, fb1, fb0, fb1);
}
        fb0 = fb1 && fb0;
    boolean lb0 = false;
if(ao4 != null){
      ao3 = ao4.m4();
}
    Output.points[1][1] += ad3;
    fb0 = !fb1;
    boolean lb1 = false;
    ad4 = fd0 - fd1;
    lb0 = lb1 || fb0;
    fb1 = ad1 > ad2;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1, lb0, lb1, fb0, fb1);
}
    Output.points[1][2] += ad1;
    ad2 = ad3 + ad4;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 - fd0;
    if (ab1) {
        double ld0 = 711.0190728146281;
        ab2 = ab3 || ab4;
        fd0 = fd1 - ld0;
        fd0 = fd1 + ld0;
        fb0 = !fb1;
        ab1 = ab2 || ab3;
        ab4 = fb0 && fb1;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
          fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, ld0, fd0, fd1, ab1, ab2, ab3, ab4);
}
        Thought lo1 = Thought38.getInstance(ao1, ao2, ao3, ao4, fb0, fb1, ab1, ab2);
        Output.points[1][3] -= ld0;
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, ld0, fd0);
}
        Output.points[1][4] += fd1;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld0, fd0, fd1, ld0);
}
        fd0 *= -1;
if(ao2 != null){
          ao1 = ao2.m4(ab3, ab4, fb0, fb1);
}
        if (ab1) {
            Thought lo2 = Thought25.getInstance();
            fd1 = ld0 - fd0;
            ab2 = ab3 || ab4;
            Thought lo3 = Thought74.getInstance(fd1, ld0, fd0, fd1, fb0, fb1, ab1, ab2);
            ab3 = !ab4;
if(ao3 != null){
              ao3.m1(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
              ao2.m1(ao3, ao4, fo0, fo1, ld0, fd0, fd1, ld0, fb0, fb1, ab1, ab2);
}
}}
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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
    double ld0 = 185.0969230745956;
    ad1 = ad2 - ad3;
    ad4 = fd0 + fd1;
    Output.points[1][5] += ld0;
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4);
}
    boolean lb1 = false;
    lb1 = fd0 > fd1;
    boolean lb2 = false;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, ld0, ad1, ad2, ad3);
}
    lb2 = ab1 || ab2;
    for(int i0=0; i0<10; i0++){
        Thought lo3 = Thought2.getInstance(ab3, ab4, fb0, fb1);
if(ao4 != null){
          ao3 = ao4.m4();
}
if(fo1 != null){
          fo0 = fo1.m4(ad4, fd0, fd1, ld0, lb1, lb2, ab1, ab2);
}
        Output.points[1][6] += ad1;
        double ld4 = 377.11035631064493;
if(ao1 != null){
          ad1 = ao1.m3(ao2, ao3, ao4, fo0);
}
        ab3 = ab4 || fb0;
        fb1 = !lb1;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, lb2, ab1, ab2, ab3);
}
if(fo1 != null){
          fd1 = fo1.m3(ao1, ao2, ao3, ao4, ab4, fb0, fb1, lb1);
}
        ld4 = ld0 + ad1;
if(fo0 != null){
          lb2 = fo0.m2(ad2, ad3, ad4, fd0);
}
        }
    ab1 = ab2 && ab3;
    ld0 = ad1 + ad2;
if(fo1 != null){
      ad3 = fo1.m3(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ld0);
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
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    Output.points[1][7] -= fd0;
        Thought lo0 = Thought29.getInstance();
    double ld1 = 618.8616569550203;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld1, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
    fb0 = fb1 || fb0;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      ld1 = fo1.m3(fd0, fd1, ld1, fd0);
}
    fd1 = ld1 + fd0;
    fb1 = fb0 || fb1;
    double ld2 = 515.5990242956235;
    fb0 = !fb1;
    Output.points[1][8] -= fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ld1, ld2, fd0, fd1);
}
    Thought lo3 = Thought43.getInstance(fb0, fb1, fb0, fb1);
    boolean lb4 = false;
    ld1 = ld2 - fd0;
    lb4 = fb0 || fb1;
if(fo1 != null){
      fo1.m1();
}
    Output.points[2][0] += fd1;
    lb4 = ld1 < ld2;

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
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought27.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m1(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
    boolean lb1 = false;
    Output.points[2][1] -= fd1;
    fb0 = fb1 && lb1;
    fd0 *= -1;

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
    double ld0 = 17.138849496240788;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
}
    fb0 = fb1 && fb0;
    boolean lb1 = true;
if(fo0 != null){
      fo0.m1(fb0, fb1, lb1, fb0);
}
            fb1 = !lb1;
    boolean lb2 = false;
    lb2 = fd1 < ld0;
    fb0 = fb1 && lb1;
    lb2 = fd0 < fd1;
        fb0 = fb1 || lb1;
if(fo0 != null){
      fo1 = fo0.m4();
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
