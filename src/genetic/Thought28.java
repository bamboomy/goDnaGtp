package genetic;
import java.util.ArrayList;
class Thought28 extends Thought{
private static ArrayList<Thought28> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 912.7802113110715;
private double fd1 = 104.16567090256295;
private Thought fo0 = null;
private Thought fo1 = null;
Thought28 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought28 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought28 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought28 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought28 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought28 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought28 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought28 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought28 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought28 instance = new Thought28 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought28 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought28 instance = new Thought28 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought28 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought28 instance = new Thought28 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought28 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought28 instance = new Thought28 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought28 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought28 instance = new Thought28 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought28 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought28 instance = new Thought28 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought28 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought28 instance = new Thought28 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought28 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought28 instance = new Thought28 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    Output.points[1][0] -= fd0;
    double ld0 = 834.9438611087204;
    fd0 = fd1 - ld0;
    fd0 = fd1 - ld0;
    fb1 = fd0 > fd1;
    Thought lo1 = Thought44.getInstance(fb0, fb1, fb0, fb1);
    ld0 *= -1;
if(fo0 != null){
      fb0 = fo0.m2();
}
    fb1 = fd0 > fd1;
    fb0 = fb1 && fb0;
    fb1 = ld0 < fd0;
if(fo1 != null){
      fb0 = fo1.m2(fd1, ld0, fd0, fd1, fb1, fb0, fb1, fb0);
}
    boolean lb2 = false;
    fb0 = fb1 || lb2;
    fb0 = fb1 && lb2;
    ld0 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb0 = fb1 && lb2;
    fb0 = fb1 && lb2;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0, fb1, lb2, fb0, fb1);
}
    lb2 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb2, fb0, fb1, lb2);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1);
}
        fb0 = ld0 > fd0;

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
      fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo1.m2();
}
    fb0 = fd0 > fd1;
    fb1 = fd0 < fd1;
if(fo0 != null){
      fo0.m1(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fd0 = fd1 - fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    fb0 = fd0 < fd1;
    double ld0 = 253.40822403988847;
    boolean lb1 = false;
    ld0 = fd0 + fd1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0, fb0, fb1, lb1, ab1);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo0.m2(fd0, fd1, ld0, fd0);
}
    boolean lb2 = false;
    boolean lb3 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1);
}
    ld0 *= -1;
    boolean lb4 = true;
if(fo1 != null){
      fd0 = fo1.m3(ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fo0.m2(fd1, ld0, fd0, fd1, lb1, lb2, lb3, lb4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ab1 = ld0 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb1, lb1, lb2, lb3);
}
    boolean lb5 = false;
    ld0 *= -1;
    lb4 = fd0 < fd1;

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
    double ld0 = 802.5581316789129;
    fb0 = fb1 && fb0;
if(fo0 != null){
      fb1 = fo0.m2(ld0, ad1, ad2, ad3);
}
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld0);
}
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ad1, fb0, fb1, lb1, fb0);
}
    ad2 = ad3 - ad4;
    Output.points[1][1] -= fd0;
    boolean lb2 = true;
    fd1 *= -1;
    ld0 = ad1 - ad2;
    Output.points[1][2] += ad3;
    boolean lb3 = true;
    double ld4 = 793.1225802291463;
    lb3 = ad3 < ad4;
    fb0 = fd0 > fd1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb1, lb2, lb3);
}
    Thought lo5 = Thought22.getInstance(ld0, ld4, ad1, ad2);
    fb0 = ad3 > ad4;
    Output.points[1][3] -= fd0;
    fb1 = lb1 || lb2;

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
    ab1 = ad2 < ad3;
    ab2 = ad4 > fd0;
    ab3 = ab4 && fb0;
    fd1 *= -1;
    fb1 = ab1 && ab2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fo1 = fo0.m4(ab3, ab4, fb0, fb1);
}
    ab1 = fd0 < fd1;
    ad1 = ad2 + ad3;
    ab2 = ad4 > fd0;
    ab3 = ab4 || fb0;
    fb1 = fd1 < ad1;
if(fo1 != null){
      ad2 = fo1.m3();
}
    ad3 = ad4 - fd0;
if(fo0 != null){
      ab1 = fo0.m2(fd1, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
}
    Output.points[1][4] += ad2;
    Output.points[1][5] += ad3;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1);
}
    ab3 = !ab4;
    double ld0 = 624.6110555404351;

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
    fd1 = fd0 - fd1;
    double ld0 = 406.0654418130301;
    fb0 = fb1 || fb0;
    ld0 = fd0 + fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld0, fd0, fd1, ld0);
}
if(ao2 != null){
      ao1 = ao2.m4(fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      fd0 = ao3.m3();
}
    fd1 = ld0 + fd0;
    boolean lb1 = false;
if(ao4 != null){
      ao4.m3(fd1, ld0, fd0, fd1, fb0, fb1, lb1, fb0);
}
    Thought lo2 = Thought4.getInstance(fo0, fo1, ao1, ao2);
    fb1 = lb1 || fb0;
    fb1 = ld0 < fd0;
if(ao3 != null){
      lb1 = ao3.m2(ao4, fo0, fo1, ao1, fd1, ld0, fd0, fd1, fb0, fb1, lb1, fb0);
}
    fb1 = lb1 && fb0;
    double ld3 = 895.315356528697;
    boolean lb4 = true;
    boolean lb5 = false;
if(ao2 != null){
      lb5 = ao2.m2(ao3, ao4, fo0, fo1, fb0, fb1, lb1, lb4);
}
    Output.points[1][6] += ld0;
    boolean lb6 = true;
if(ao1 != null){
      ao1.m2(ld3, fd0, fd1, ld0);
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
        Output.points[1][7] += ad2;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1);
}
if(ao2 != null){
      ad1 = ao2.m3(fb0, fb1, fb0, fb1);
}
    double ld0 = 799.6702791701836;
        fb0 = !fb1;
if(ao4 != null){
      ao3 = ao4.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    boolean lb1 = false;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    Thought lo2 = Thought54.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, ld0, ad1, lb1, fb0, fb1, lb1);
    ad2 = ad3 - ad4;
    fd0 = fd1 - ld0;
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3, fb0, fb1, lb1, fb0);
}
    ad1 = ad2 + ad3;
    ad4 *= -1;
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, ld0, ad1);
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
    ab1 = !ab2;
    boolean lb0 = false;
    double ld1 = 73.75806403458328;
    ld1 = fd0 - fd1;
if(ao2 != null){
      ld1 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, ld1, fd0);
}
    boolean lb2 = true;
    ab1 = fd1 < ld1;
    fd0 = fd1 - ld1;
    for(int i0=0; i0<10; i0++){
        fd0 *= -1;
        fd1 = ld1 + fd0;
if(ao2 != null){
          ao1 = ao2.m4(ab2, ab3, ab4, fb0);
}
        Output.points[1][8] += fd1;
        fb1 = ld1 < fd0;
if(ao4 != null){
          ao3 = ao4.m4();
}
if(fo0 != null){
          fo0.m3(fd1, ld1, fd0, fd1, lb0, lb2, ab1, ab2);
}
if(fo1 != null){
          ab3 = fo1.m2(ao1, ao2, ao3, ao4);
}
        ld1 *= -1;
        fd0 = fd1 + ld1;
        if (ab4) {
            boolean lb3 = true;
            fd0 = fd1 + ld1;
            fd0 = fd1 - ld1;
            boolean lb4 = true;
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
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fb0 = fo1.m2(ao1, ao2, ao3, ao4, fb1, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
if(fo0 != null){
      fd1 = fo0.m3(ad1, ad2, ad3, ad4);
}
    ab1 = ab2 || ab3;
    Output.points[2][0] -= fd0;
    fd1 = ad1 - ad2;
    ab4 = !fb0;
    fb1 = ab1 && ab2;
if(fo1 != null){
      ab3 = fo1.m2(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1);
}
    ab4 = ad1 < ad2;
    double ld0 = 408.0907747105087;
    ad2 = ad3 - ad4;
    fb0 = fd0 > fd1;
if(fo0 != null){
      ld0 = fo0.m3(fb1, ab1, ab2, ab3);
}
if(ao1 != null){
      fo1 = ao1.m4();
}
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4, ab4, fb0, fb1, ab1);
}
    fd0 = fd1 + ld0;

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
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fd0 *= -1;
    boolean lb0 = false;
    fb0 = fd1 < fd0;
    fd1 *= -1;
    fb1 = lb0 || fb0;
    boolean lb1 = false;
    Output.points[2][1] += fd0;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb1);
}
    fb0 = fb1 && lb0;
    fd1 *= -1;
if(fo0 != null){
      lb1 = fo0.m2(fd0, fd1, fd0, fd1);
}
    boolean lb2 = false;
    fd0 = fd1 + fd0;

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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    boolean lb0 = true;
    ab1 = fd0 < fd1;
    fd0 *= -1;
    ab2 = fd1 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    lb0 = fd1 < fd0;
    Thought lo1 = Thought9.getInstance(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
    boolean lb2 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
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
        boolean lb0 = true;
    boolean lb1 = true;
    Output.points[2][2] += ad2;
    Output.points[2][3] += ad3;
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, lb0, lb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, lb0, lb1, fb0, fb1);
}
    double ld2 = 779.0249111938231;
if(fo0 != null){
      fo0.m3(ad2, ad3, ad4, fd0);
}
    fd1 = ld2 + ad1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    fd1 = ld2 + ad1;
    Output.points[2][4] += ad2;
if(fo1 != null){
      ad3 = fo1.m3(lb0, lb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ld2, lb0, lb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    if (lb0) {
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, lb1, fb0, fb1, lb0);
}
        boolean lb3 = true;
        fd0 = fd1 - ld2;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, lb1, fb0, fb1);
}
        ad1 *= -1;
        Output.points[2][5] -= ad2;
        lb3 = ad3 < ad4;
        boolean lb4 = false;
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, ld2, ad1);
}
        Thought lo5 = Thought87.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
        fd1 = ld2 + ad1;
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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ad1 > ad2;
    ab2 = ad3 < ad4;
    boolean lb0 = true;
if(fo1 != null){
      fo1.m3(ab2, ab3, ab4, fb0);
}
    Thought lo1 = Thought15.getInstance();
if(fo0 != null){
      fo0.m3(fd0, fd1, ad1, ad2, fb1, lb0, ab1, ab2);
}
    ad3 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, ab3, ab4, fb0, fb1);
}
        ad2 = ad3 + ad4;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, ab1, ab2, ab3);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
          fd0 = ao2.m3(fd1, fd0, fd1, fd0);
}
    fb1 = fb0 && fb1;
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      fb0 = ao2.m2(fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0);
}
    Thought lo0 = Thought21.getInstance(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
    double ld1 = 112.84806248782436;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
    fb1 = ld1 < fd0;
if(ao3 != null){
      ao3.m1(fd1, ld1, fd0, fd1);
}
if(ao4 != null){
      fb0 = ao4.m2(fo0, fo1, ao1, ao2, ld1, fd0, fd1, ld1);
}
    fb1 = !fb0;
if(ao3 != null){
      fd0 = ao3.m3(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4();
}
    Output.points[2][6] += fd1;
    double ld2 = 403.85102150546874;
    boolean lb3 = false;
if(ao1 != null){
      fo1 = ao1.m4(ld1, ld2, fd0, fd1, fb0, fb1, lb3, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, ld1, ld2, fd0, fd1, lb3, fb0, fb1, lb3);
}
if(ao1 != null){
      ld1 = ao1.m3(ao2, ao3, ao4, fo0, fb0, fb1, lb3, fb0);
}
    fb1 = !lb3;
    ld2 = fd0 - fd1;
    boolean lb4 = false;
if(ao1 != null){
      fo1 = ao1.m4(ld1, ld2, fd0, fd1);
}

Thought.STACK_COUNTER++;
return lb4;
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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
    fd0 = fd1 + ad1;
    boolean lb0 = false;
if(ao2 != null){
      ad2 = ao2.m3(lb0, fb0, fb1, lb0);
}
    fb0 = fb1 && lb0;
    fb0 = fb1 || lb0;
    ad3 = ad4 - fd0;
if(ao3 != null){
      ao3.m1();
}
    double ld1 = 450.960920659633;
if(ao4 != null){
      ao4.m2(fd0, fd1, ld1, ad1, fb0, fb1, lb0, fb0);
}
    double ld2 = 134.65847747151494;
    Output.points[2][7] -= ad1;
    fb1 = lb0 || fb0;
    Thought lo3 = Thought86.getInstance(fo0, fo1, ao1, ao2);
    fb1 = ad2 > ad3;
    boolean lb4 = true;
    ad4 *= -1;
    fd0 = fd1 + ld1;
    ld2 *= -1;
    ad1 = ad2 - ad3;
    Thought lo5 = Thought82.getInstance(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ld1, lb0, lb4, fb0, fb1);
if(ao1 != null){
      ld2 = ao1.m3(ao2, ao3, ao4, fo0, lb0, lb4, fb0, fb1);
}
    Thought lo6 = Thought66.getInstance(ad1, ad2, ad3, ad4);
        fd0 = fd1 - ld1;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(ao1 != null){
      ao1.m1(ab2, ab3, ab4, fb0);
}
    fb1 = !ab1;
    boolean lb0 = true;
    ab1 = !ab2;
    fd1 = fd0 + fd1;
if(ao3 != null){
      ao2 = ao3.m4();
}
    ab3 = !ab4;
    fb0 = fb1 || lb0;
    ab1 = fd0 < fd1;
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fd0 = fd1 - fd0;
    if (fb1) {
        boolean lb1 = false;
        fd1 = fd0 - fd1;
        lb1 = fd0 > fd1;
        lb0 = fd0 < fd1;
        fd0 = fd1 - fd0;
        ab1 = ab2 || ab3;
        fd1 = fd0 + fd1;
if(fo1 != null){
          ab4 = fo1.m2(ao1, ao2, ao3, ao4);
}
        fd0 *= -1;
if(fo0 != null){
          fo0.m2(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, fb0, fb1, lb1, lb0);
}
        ab1 = ab2 || ab3;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ad2 > ad3;
    ad4 *= -1;
    ab2 = ab3 && ab4;
    fd0 *= -1;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fb1, ab1, ab2, ab3);
}
    fd1 = ad1 + ad2;
    ad3 = ad4 + fd0;
    ab4 = fd1 > ad1;
if(ao1 != null){
      ad2 = ao1.m3(ad3, ad4, fd0, fd1);
}
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(ao1 != null){
      ao1.m3(fb0, fb1, ab1, ab2);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    ab3 = !ab4;
if(ao4 != null){
      ao4.m3(fd0, fd1, ad1, ad2, fb0, fb1, ab1, ab2);
}
    ab3 = ad3 > ad4;
        boolean lb0 = true;
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3);
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 + fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 > fd1;
    fb1 = fb0 || fb1;
    double ld0 = 329.01954638094753;
    fb0 = !fb1;
    Thought lo1 = Thought65.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
if(fo0 != null){
      fb0 = fo0.m2(ld0, fd0, fd1, ld0);
}
    fd0 = fd1 + ld0;
    double ld2 = 820.3411651707205;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld2, fd0, fd1, ld0);
}
    fb1 = fb0 || fb1;
    Output.points[2][8] -= ld2;
    fb0 = fb1 && fb0;
    double ld3 = 443.4844490287846;
    fb1 = ld3 < fd0;
if(fo1 != null){
      fo1.m2(fb0, fb1, fb0, fb1);
}
    Thought lo4 = Thought10.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld0, ld2, ld3, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 - ld0;
    ld2 = ld3 + fd0;
    fd1 = ld0 + ld2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld3, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    ld2 = ld3 - fd0;
    boolean lb5 = false;

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
    Thought lo0 = Thought79.getInstance(fd0, fd1, fd0, fd1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
    if (fb0) {
        fb1 = fd0 < fd1;
        ab1 = !ab2;
        double ld1 = 748.4421639326258;
if(fo0 != null){
          ld1 = fo0.m3();
}
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, ld1, fd0, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
          fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
        fd0 = fd1 - ld1;
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, ld1, fd0);
}
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1);
}
        ld1 = fd0 + fd1;
        ab3 = !ab4;
if(fo0 != null){
          fo1 = fo0.m4(fb0, fb1, ab1, ab2);
}
if(fo1 != null){
          ld1 = fo1.m3();
}
        Thought lo2 = Thought51.getInstance(fd0, fd1, ld1, fd0, ab3, ab4, fb0, fb1);
        boolean lb3 = false;
        fd1 = ld1 - fd0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        Output.points[3][0] += fd1;
        ld1 = fd0 - fd1;
        lb3 = ab1 && ab2;
        double ld4 = 468.40676582276603;
        for(int i0=0; i0<10; i0++){
}}
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
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fb1 = fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
        fd1 *= -1;
if(fo1 != null){
          ad1 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
        Output.points[3][1] += ad2;
        double ld0 = 701.8947357344357;
        fb0 = !fb1;
        Thought lo1 = Thought2.getInstance(ad2, ad3, ad4, fd0);
        Output.points[3][2] -= fd1;
        Thought lo2 = Thought81.getInstance(fo0, fo1, fo0, fo1, ld0, ad1, ad2, ad3);
if(fo0 != null){
          fb0 = fo0.m2(fb1, fb0, fb1, fb0);
}
        if (fb1) {
if(fo1 != null){
              fb0 = fo1.m2();
}
}}
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[3][3] += ad2;
    ab2 = !ab3;
    boolean lb0 = true;
    Thought lo1 = Thought51.getInstance(ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
    lb0 = ab1 || ab2;
    ab3 = ad1 > ad2;
    Thought lo2 = Thought6.getInstance(fo0, fo1, fo0, fo1);
    ad3 *= -1;
    ad4 = fd0 - fd1;
    Thought lo3 = Thought99.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, ab4, fb0, fb1, lb0);
    ab1 = ab2 || ab3;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb0);
}
    boolean lb4 = false;
    lb4 = !ab1;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ad1, ad2, ad3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
if(fo1 != null){
      fo1.m1(ab2, ab3, ab4, fb0);
}
    Thought lo5 = Thought49.getInstance();
if(fo0 != null){
      fb1 = fo0.m2(ad2, ad3, ad4, fd0, lb0, lb4, ab1, ab2);
}
    ab3 = fd1 > ad1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Thought lo6 = Thought7.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, ab4, fb0, fb1, lb0);
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, lb4, ab1, ab2, ab3);
}
if(fo0 != null){
      fo0.m1(fd1, ad1, ad2, ad3);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[3][4] -= fd0;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fb1 = !fb0;
    fb1 = fd0 < fd1;
    fb0 = fd0 > fd1;
if(ao2 != null){
      ao1 = ao2.m4(fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought89.getInstance();
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      fb0 = ao4.m2(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 - fd0;
    fb1 = fb0 && fb1;
    for(int i0=0; i0<10; i0++){
if(ao3 != null){
          fb0 = ao3.m2(fd1, fd0, fd1, fd0);
}
if(ao4 != null){
          ao4.m3(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
        fb1 = fb0 || fb1;
        fb0 = fb1 || fb0;
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
    ad1 *= -1;
    fb1 = fb0 || fb1;
    double ld0 = 934.1314967343983;
    ad1 = ad2 - ad3;
if(ao1 != null){
      fb0 = ao1.m2(fb1, fb0, fb1, fb0);
}
    ad4 = fd0 - fd1;
    fb1 = fb0 || fb1;
        Output.points[3][5] += ld0;
    ad1 = ad2 - ad3;
    fb0 = ad4 < fd0;
    fd1 *= -1;
if(ao3 != null){
      ao2 = ao3.m4();
}
    ld0 = ad1 + ad2;
if(ao4 != null){
      fb1 = ao4.m2(ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3);
}
    ld0 = ad1 - ad2;
    ad3 = ad4 + fd0;
    double ld1 = 237.98935179009305;
    fb0 = fb1 || fb0;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, ld0, ld1, fb1, fb0, fb1, fb0);
}
    boolean lb2 = true;
    fb0 = ad1 < ad2;
    ad3 = ad4 + fd0;
    Output.points[3][6] -= fd1;
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, lb2, fb0, fb1, lb2);
}

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought62.getInstance(fd1, fd0, fd1, fd0);
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      ao1 = ao2.m4(ab2, ab3, ab4, fb0);
}
    boolean lb1 = true;
    boolean lb2 = true;
    fd0 = fd1 - fd0;
    fd1 *= -1;
if(ao3 != null){
      fd0 = ao3.m3();
}
if(ao4 != null){
      fd1 = ao4.m3(fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb1);
}
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    fd1 = fd0 + fd1;
    Thought lo3 = Thought86.getInstance(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, lb2, ab1, ab2, ab3);
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab4, fb0, fb1, lb1);
}
    fd0 = fd1 - fd0;
    boolean lb4 = false;
    lb2 = lb4 && ab1;
    ab2 = fd1 > fd0;
    fd1 = fd0 + fd1;

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
    boolean lb0 = false;
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0);
}
    ab1 = fd1 > ad1;
    ad2 = ad3 - ad4;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2);
}
if(ao4 != null){
      ao3 = ao4.m4(ab2, ab3, ab4, fb0);
}
    fb1 = lb0 || ab1;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(ao1 != null){
      ao1.m1(ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
    Output.points[3][7] -= ad1;
if(ao2 != null){
      ad2 = ao2.m3(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1, lb0, ab1, ab2, ab3);
}
    Thought lo1 = Thought37.getInstance(fo1, ao1, ao2, ao3, ab4, fb0, fb1, lb0);
    ab1 = ab2 && ab3;
    ad1 = ad2 + ad3;
if(ao4 != null){
      ab4 = ao4.m2(ad4, fd0, fd1, ad1);
}
if(fo0 != null){
          ad2 = fo0.m3(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1);
}
if(ao4 != null){
      fb0 = ao4.m2(fb1, lb0, ab1, ab2);
}
    boolean lb2 = true;
    ab2 = !ab3;
    ad1 = ad2 + ad3;
    ab4 = fb0 || fb1;
    lb0 = ad4 < fd0;

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
    boolean lb0 = false;
    fb0 = fb1 && lb0;
    boolean lb1 = true;
if(fo0 != null){
      fo0.m3();
}
    Output.points[3][8] += fd0;
    fd1 = fd0 + fd1;
    fd0 *= -1;
    boolean lb2 = true;
    Output.points[4][0] += fd1;
    Output.points[4][1] -= fd0;
if(fo1 != null){
      fo1.m2(fd1, fd0, fd1, fd0, lb1, lb2, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb3 = true;
    Output.points[4][2] -= fd1;
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb1, lb2, lb3, fb0);
}
    fb1 = fd0 > fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, lb0, lb1, lb2, lb3);
}
    boolean lb4 = false;
if(fo0 != null){
      fo0.m3(fd1, fd0, fd1, fd0);
}
    lb4 = !fb0;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fb1 = lb0 && lb1;
    fd1 = fd0 - fd1;

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
    Output.points[4][3] -= fd0;
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fd0 = fo1.m3();
}
    fb0 = fb1 && ab1;
    ab2 = fd1 > fd0;
    Thought lo0 = Thought4.getInstance(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = !ab1;
    ab2 = ab3 || ab4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
    ab3 = fd0 < fd1;
    ab4 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    fb1 = ab1 || ab2;
if(fo0 != null){
      ab3 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(ab4, fb0, fb1, ab1);
}
    boolean lb1 = true;
    for(int i0=0; i0<10; i0++){
        fd0 = fd1 + fd0;
if(fo0 != null){
          fo1 = fo0.m4();
}
        ab1 = fd1 > fd0;
        boolean lb2 = false;
        ab1 = ab2 && ab3;
if(fo1 != null){
          fo1.m3(fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb2);
}
        lb1 = ab1 && ab2;
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
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ad1, ad2, ad3);
}
    Thought lo0 = Thought85.getInstance(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    ad2 = ad3 + ad4;
    fb0 = fd0 < fd1;
if(fo0 != null){
      fo0.m2(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    Thought lo1 = Thought11.getInstance(fo1, fo0, fo1, fo0);
    fb1 = fd0 < fd1;
    ad1 *= -1;
    fb0 = fb1 || fb0;
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      ad2 = fo1.m3(ad3, ad4, fd0, fd1);
}
    double ld2 = 748.5150909088716;
    Output.points[4][4] += ld2;
    Output.points[4][5] -= ad1;

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
    ab2 = ab3 && ab4;
    double ld0 = 382.0074315604339;
    fb0 = ad4 < fd0;
    Thought lo1 = Thought14.getInstance(fb1, ab1, ab2, ab3);
    Output.points[4][6] -= fd1;
    Thought lo2 = Thought79.getInstance();
if(fo0 != null){
      fo1 = fo0.m4(ld0, ad1, ad2, ad3, ab4, fb0, fb1, ab1);
}
    ad4 = fd0 - fd1;
    ld0 = ad1 - ad2;
    boolean lb3 = false;
    ab1 = ad3 > ad4;
    double ld4 = 405.5351017960215;
    double ld5 = 89.2202258341158;
    ad3 *= -1;
    ad4 = fd0 + fd1;
if(fo1 != null){
      ld0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    ab2 = ld4 > ld5;
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
    double ld6 = 392.96211621547144;
    Thought lo7 = Thought80.getInstance(fo1, fo0, fo1, fo0, lb3, ab1, ab2, ab3);
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, ld4);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ld5, ld6, ad1, ad2);
}
    double ld8 = 256.5169017370003;
if(fo0 != null){
      ab4 = fo0.m2(fb0, fb1, lb3, ab1);
}
if(fo1 != null){
      ad2 = fo1.m3();
}
    ab2 = !ab3;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1, ab4, fb0, fb1, lb3);
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
    double ld0 = 759.7420582003422;
    Thought lo1 = Thought17.getInstance(ao2, ao3, ao4, fo0);
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    boolean lb2 = true;
    Output.points[4][7] += fd0;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb0, fb1, lb2, fb0);
}
    fb1 = fd1 < ld0;
    boolean lb3 = false;
    lb2 = fd0 > fd1;
if(ao1 != null){
      fo1 = ao1.m4(ld0, fd0, fd1, ld0);
}
    double ld4 = 512.3041868526375;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld4, fd0, fd1, ld0);
}
if(ao2 != null){
      ao2.m2(lb3, fb0, fb1, lb2);
}

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ad2 = ao2.m3();
}
    fb1 = !fb0;
    boolean lb0 = true;
    boolean lb1 = true;
if(ao4 != null){
      ao3 = ao4.m4(ad3, ad4, fd0, fd1, lb1, fb0, fb1, lb0);
}
    boolean lb2 = true;
    lb1 = !lb2;
    Output.points[4][8] -= ad1;
    double ld3 = 221.52693006984677;
    ad1 = ad2 - ad3;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    ad4 = fd0 - fd1;
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, ld3, ad1, ad2, ad3, fb0, fb1, lb0, lb1);
}
    lb2 = fb0 && fb1;
    boolean lb4 = true;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, lb0, lb1, lb2, lb4);
}
    boolean lb5 = true;
    Output.points[5][0] -= ad4;
    fd0 *= -1;
    boolean lb6 = false;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = !ab2;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1);
}
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
if(ao3 != null){
      ao3.m1(ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      ao4 = fo0.m4();
}
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
if(ao1 != null){
      fo1 = ao1.m4(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1);
}
    Thought lo0 = Thought20.getInstance(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
    Output.points[5][1] -= fd1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    ab2 = fd0 > fd1;
    ab3 = fd0 > fd1;
    ab4 = fb0 && fb1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      ao1 = ao2.m4(ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      fb0 = ao3.m2();
}
    fd0 *= -1;
    fb1 = fd1 > fd0;
    boolean lb1 = true;
    Thought lo2 = Thought78.getInstance(fd1, fd0, fd1, fd0, lb1, ab1, ab2, ab3);
    ab4 = fd1 > fd0;
    fb0 = fd1 < fd0;

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
    ab1 = ad2 < ad3;
    double ld0 = 792.1767170242855;
if(ao1 != null){
      ab2 = ao1.m2(ao2, ao3, ao4, fo0);
}
    Thought lo1 = Thought77.getInstance(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
    ld0 = ad1 + ad2;
    ab1 = !ab2;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab3, ab4, fb0, fb1);
}
if(ao4 != null){
      ad3 = ao4.m3(ad4, fd0, fd1, ld0);
}
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4);
}
    Thought lo2 = Thought97.getInstance(ab1, ab2, ab3, ab4);
    fb0 = fb1 && ab1;
    ab2 = ab3 && ab4;
    fb0 = fd0 < fd1;
    double ld3 = 490.5066477349994;
    fb1 = !ab1;
    boolean lb4 = true;
if(ao4 != null){
      ld0 = ao4.m3();
}
    ld3 = ad1 + ad2;
    ad3 = ad4 - fd0;

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
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Output.points[5][2] += fd0;
    Thought lo0 = Thought77.getInstance(fo0, fo1, fo0, fo1);
    fb1 = fb0 && fb1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
    fb0 = fd0 < fd1;
    fd0 = fd1 - fd0;
    fb1 = fd1 > fd0;
    fb0 = fb1 && fb0;
    fb1 = fb0 || fb1;
    boolean lb1 = false;

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
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fb1 = fo1.m2(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fb0 = fo0.m2();
}
    fb1 = !fb0;
        fb1 = fd1 > fd0;
if(fo1 != null){
      fb0 = fo1.m2(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    double ld0 = 386.2100145554095;
    fd0 *= -1;
    fb1 = fb0 || fb1;
    double ld1 = 667.9690731518247;
        fb0 = fb1 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Output.points[5][3] -= fd0;

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
    Thought lo0 = Thought36.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
    fd1 = fd0 + fd1;
    Thought lo1 = Thought60.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    fb1 = fd0 < fd1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    fb1 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd0 = fd1 - fd0;
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb0 = fb1 || fb0;
    Thought lo2 = Thought22.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);

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
