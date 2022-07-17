package genetic;
import java.util.ArrayList;
class Thought53 extends Thought{
private static ArrayList<Thought53> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 175.07231984706522;
private double fd1 = 209.6861546920942;
private Thought fo0 = null;
private Thought fo1 = null;
Thought53 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought53 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought53 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought53 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought53 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought53 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought53 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought53 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought53 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought53 instance = new Thought53 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought53 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought53 instance = new Thought53 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought53 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought53 instance = new Thought53 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought53 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought53 instance = new Thought53 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought53 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought53 instance = new Thought53 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought53 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought53 instance = new Thought53 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought53 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought53 instance = new Thought53 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought53 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought53 instance = new Thought53 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
      fb0 = fo1.m2(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo1.m2(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    Output.points[7][1] -= fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
if(fo0 != null){
      fo0.m3();
}
    Output.points[7][2] -= fd0;
    Thought lo1 = Thought201.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
    Output.points[7][3] += fd1;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb0, fb0);
}
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb1 = lb0 || fb0;
    boolean lb2 = true;
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
    Thought lo3 = Thought229.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);

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
    fd0 = fd1 - fd0;
    ab1 = !ab2;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    ab1 = fd1 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fd1 = fd0 - fd1;
    fb1 = fd0 > fd1;
    fd0 = fd1 + fd0;
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4();
}
    lb0 = fd1 < fd0;

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
    Thought lo1 = Thought183.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, lb0, fb0);
    boolean lb2 = false;
    boolean lb3 = true;
    lb3 = fb0 || fb1;
if(fo0 != null){
      lb0 = fo0.m2(lb2, lb3, fb0, fb1);
}
    Thought lo4 = Thought290.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      fo1.m3(fd1, ad1, ad2, ad3);
}
    lb0 = ad4 < fd0;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
    ad4 *= -1;

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
          fo1 = fo0.m4(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    fd0 = fd1 - ad1;
    fb1 = ab1 && ab2;
    ab3 = !ab4;
    Output.points[7][4] -= ad2;
    ad3 = ad4 - fd0;
    fd1 = ad1 - ad2;
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      ab3 = fo0.m2();
}
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, ab4, fb0, fb1, ab1);
}
    ad3 = ad4 + fd0;
    ab2 = fd1 < ad1;
    if (ab3) {
        Thought lo0 = Thought235.getInstance(ab4, fb0, fb1, ab1);
        ad2 = ad3 - ad4;
        ab2 = ab3 || ab4;
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
        fb0 = !fb1;
        fd1 = ad1 + ad2;
        ab1 = ab2 || ab3;
if(fo0 != null){
          fo1 = fo0.m4(ad3, ad4, fd0, fd1);
}
        ab4 = ad1 > ad2;
        fb0 = fb1 || ab1;
        ab2 = ab3 && ab4;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
        double ld1 = 433.1233282672695;
        Thought lo2 = Thought21.getInstance(ld1, ad1, ad2, ad3, fb0, fb1, ab1, ab2);
if(fo1 != null){
          ab3 = fo1.m2(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
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
if(ao1 != null){
      fd0 = ao1.m3();
}
    boolean lb0 = true;
    fb0 = fd1 > fd0;
    boolean lb1 = false;
    double ld2 = 163.10609278332774;
    Thought lo3 = Thought21.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, ld2, fd0, fb0, fb1, lb0, lb1);
if(fo1 != null){
      fb0 = fo1.m2(fb1, lb0, lb1, fb0);
}
    fb1 = fd1 > ld2;
    lb0 = fd0 > fd1;
    ld2 = fd0 + fd1;
    double ld4 = 418.3496581701114;
if(ao1 != null){
      lb1 = ao1.m2(ao2, ao3, ao4, fo0);
}
    ld2 = ld4 - fd0;
    fd1 = ld2 + ld4;
    boolean lb5 = false;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ad2, ad3, ad4, fd0);
}
    boolean lb0 = true;
    lb0 = fb0 && fb1;
    fd1 = ad1 - ad2;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      ao4 = fo0.m4(ad1, ad2, ad3, ad4, lb0, fb0, fb1, lb0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb0, fb1, lb0, fb0);
}
    Output.points[7][5] += fd0;
if(fo1 != null){
      fd1 = fo1.m3();
}
    boolean lb1 = false;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, lb0, lb1);
}
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, lb0, lb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, ad1, ad2);
}
    fb0 = fb1 || lb0;
    lb1 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1);
}
    ad1 = ad2 + ad3;
    fb1 = ad4 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ad1, ad2, ad3, lb0, lb1, fb0, fb1);
}
    ad4 = fd0 + fd1;
    Output.points[7][6] -= ad1;
if(ao1 != null){
      ad2 = ao1.m3(ao2, ao3, ao4, fo0, lb0, lb1, fb0, fb1);
}
if(ao1 != null){
      fo1 = ao1.m4();
}
    boolean lb2 = false;
if(ao2 != null){
      lb0 = ao2.m2(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, lb1, lb2, fb0, fb1);
}
    ad1 *= -1;
    ad2 = ad3 + ad4;
if(ao1 != null){
      ao1.m1(lb0, lb1, lb2, fb0);
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
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1);
}
    ab1 = ab2 && ab3;
if(ao1 != null){
          ao1.m2(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought182.getInstance(fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 || ab2;
if(ao2 != null){
      ao2.m1();
}
    Output.points[7][7] += fd0;
    fd1 *= -1;
    double ld1 = 142.15735757645595;
    ld1 *= -1;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ld1, fd0, ab3, ab4, fb0, fb1);
}
if(ao3 != null){
      ao3.m2(ab1, ab2, ab3, ab4);
}
    fd1 = ld1 - fd0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    fb0 = !fb1;
    fd1 = ld1 + fd0;

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
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ad1, ad2);
}
if(fo0 != null){
      ao4 = fo0.m4(ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
    boolean lb0 = false;
    boolean lb1 = true;
    if (ab3) {
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, ab4, fb0, fb1, lb0);
}
        double ld2 = 82.21173209152349;
        double ld3 = 256.67212536195774;
if(fo1 != null){
          fo1.m1();
}
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld2, ld3, ad1, ad2, lb1, ab1, ab2, ab3);
}
if(ao1 != null){
          ao1.m1(ab4, fb0, fb1, lb0);
}
        ad3 = ad4 - fd0;
        lb1 = !ab1;
if(ao2 != null){
          ao2.m3(ao3, ao4, fo0, fo1);
}
        fd1 = ld2 + ld3;
if(ao2 != null){
          ao1 = ao2.m4(ad1, ad2, ad3, ad4);
}
if(ao3 != null){
          ab2 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, ld2, ld3);
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
    boolean lb0 = true;
    lb0 = !fb0;
    boolean lb1 = false;
if(fo1 != null){
      fb0 = fo1.m2(fd0, fd1, fd0, fd1, fb1, lb0, lb1, fb0);
}
    Output.points[7][8] -= fd0;
    boolean lb2 = true;
    Output.points[8][0] += fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo3 = Thought200.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb2, fb0, fb1, lb0);
    boolean lb4 = true;
if(fo1 != null){
      fo0 = fo1.m4(lb1, lb2, lb4, fb0);
}
    fb1 = lb0 && lb1;
    fd0 = fd1 + fd0;
    lb2 = lb4 && fb0;
    double ld5 = 759.7590274328226;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
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
if(fo1 != null){
      fo1.m3(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    boolean lb0 = false;
    lb0 = ab1 || ab2;
    Thought lo1 = Thought127.getInstance(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
    fd1 = fd0 - fd1;
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo1.m2();
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, lb0, ab1);
}
    Thought lo2 = Thought254.getInstance(ab2, ab3, ab4, fb0);
    fb1 = !lb0;
    ab1 = fd0 > fd1;
    Output.points[8][1] += fd0;
    ab2 = ab3 && ab4;
    fb0 = !fb1;
    lb0 = !ab1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    boolean lb3 = true;

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
    ad2 = ad3 - ad4;
    fb1 = !fb0;
    double ld0 = 979.5852835239793;
    fb1 = !fb0;
    Thought lo1 = Thought73.getInstance(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld0);
    fb1 = ad1 > ad2;
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    ld0 *= -1;
    fb0 = ad1 < ad2;
    ad3 = ad4 + fd0;
    fb1 = fb0 || fb1;
    fb0 = fb1 && fb0;
    fb1 = fb0 && fb1;
    fb0 = fd1 < ld0;
if(fo1 != null){
          fb1 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = ad1 > ad2;
if(fo0 != null){
      fo0.m3();
}
    Thought lo2 = Thought305.getInstance(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
    double ld3 = 997.1818132421856;
    fb1 = ld0 > ld3;
    fb0 = fb1 && fb0;
    boolean lb4 = true;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb1 = !lb4;

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
if(fo1 != null){
      ab1 = fo1.m2(ad1, ad2, ad3, ad4);
}
    fd0 = fd1 + ad1;
    ab2 = ab3 || ab4;
    boolean lb0 = false;
    Output.points[8][2] += ad2;
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
    double ld1 = 787.2134453890969;
    ab4 = fb0 || fb1;
    ad1 *= -1;
if(fo1 != null){
      ad2 = fo1.m3(ad3, ad4, fd0, fd1, lb0, ab1, ab2, ab3);
}
    double ld2 = 912.9021375993542;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1, ld1, ld2, ad1, ad2, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      ad3 = fo0.m3(fb1, lb0, ab1, ab2);
}
    ad4 = fd0 - fd1;
    ab3 = ld1 < ld2;
    ab4 = fb0 || fb1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    if (lb0) {
if(fo0 != null){
          ad1 = fo0.m3(ad2, ad3, ad4, fd0);
}
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 341.9327784669496;
    fd0 = fd1 + ld0;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fd0, fd1, ld0, fd0);
}
    double ld1 = 281.588489627136;
    Thought lo2 = Thought335.getInstance(fd0, fd1, ld0, ld1, fb0, fb1, fb0, fb1);
    fb0 = fd0 < fd1;
    Thought lo3 = Thought281.getInstance(ao1, ao2, ao3, ao4, fb1, fb0, fb1, fb0);
if(fo0 != null){
      fo0.m1();
}
    fb1 = ld0 > ld1;
    fd0 *= -1;
    fb0 = fd1 < ld0;
    if (fb1) {
        ld1 *= -1;
        Output.points[8][3] -= fd0;
        fd1 = ld0 + ld1;
        Thought lo4 = Thought268.getInstance(fo1, ao1, ao2, ao3, fd0, fd1, ld0, ld1, fb0, fb1, fb0, fb1);
        fd0 *= -1;
        fd1 *= -1;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2);
}
    ad1 = ad2 + ad3;
    fb1 = !fb0;
    fb1 = ad4 > fd0;
    Output.points[8][4] -= fd1;
    ad1 = ad2 + ad3;
    ad4 *= -1;
if(ao3 != null){
      ao3.m3(fd0, fd1, ad1, ad2);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      ao4 = fo0.m4(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought252.getInstance(fo1, ao1, ao2, ao3, fb0, fb1, fb0, fb1);
    fd0 = fd1 - ad1;
    if (fb0) {
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
    Output.points[8][5] -= fd1;
    if (ab1) {
        Thought lo0 = Thought347.getInstance();
        fd0 = fd1 - fd0;
        fd1 = fd0 - fd1;
        Thought lo1 = Thought103.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
        Thought lo2 = Thought322.getInstance(fb1, ab1, ab2, ab3);
        ab4 = fd0 > fd1;
        fd0 = fd1 + fd0;
        fd1 = fd0 + fd1;
        Output.points[8][6] += fd0;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
        Output.points[8][7] += fd1;
if(fo1 != null){
          fb0 = fo1.m2(fd0, fd1, fd0, fd1);
}
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
        boolean lb3 = true;
        boolean lb4 = true;
if(ao2 != null){
          ao1 = ao2.m4(fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb3);
}
}
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || ab1;
if(ao1 != null){
      fo1 = ao1.m4();
}
    ad1 = ad2 - ad3;
if(ao2 != null){
      ad4 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(fb1, ab1, ab2, ab3);
}
    ad3 = ad4 - fd0;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1);
}
    ab4 = fb0 || fb1;
    ab1 = fd1 > ad1;
    ad2 = ad3 + ad4;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ad1, ad2);
}
    ab2 = ab3 && ab4;
    Thought lo0 = Thought155.getInstance(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1);
    ad1 = ad2 + ad3;
    fb0 = fb1 && ab1;
if(ao2 != null){
      ab2 = ao2.m2(ad4, fd0, fd1, ad1, ab3, ab4, fb0, fb1);
}
    Thought lo1 = Thought312.getInstance(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
    boolean lb2 = true;

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
if(fo0 != null){
      fb1 = fo0.m2();
}
    fd1 = fd0 + fd1;
    boolean lb0 = false;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fo0.m2(fb0, fb1, lb0, fb0);
}
    fd0 = fd1 - fd0;
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Output.points[8][8] += fd0;
    fb1 = lb0 && fb0;
    Output.points[0][0] += fd1;
    boolean lb1 = true;
    Thought lo2 = Thought112.getInstance(fd0, fd1, fd0, fd1);
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo0.m3(fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb0, lb1);
}
    fb0 = fd0 > fd1;

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
      fo1 = fo0.m4();
}
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = !ab1;
if(fo1 != null){
      fo1.m1(ab2, ab3, ab4, fb0);
}
    Thought lo0 = Thought375.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    fb1 = ab1 || ab2;
    ab3 = fd0 > fd1;
    fd0 = fd1 - fd0;
    boolean lb1 = true;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    Thought lo2 = Thought347.getInstance(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, lb1, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
if(fo0 != null){
      fo0.m3();
}
    fd0 = fd1 - fd0;
    Thought lo3 = Thought326.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb1, ab1, ab2, ab3);
    boolean lb4 = true;
    double ld5 = 59.326658618716294;

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
    ad1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought300.getInstance(fo1, fo0, fo1, fo0);
    fb0 = ad2 > ad3;
    ad4 = fd0 - fd1;
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
    fb0 = !fb1;
    boolean lb2 = true;
    fd0 = fd1 - ad1;
    Thought lo3 = Thought116.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
    boolean lb4 = false;
if(fo1 != null){
      fd1 = fo1.m3(ad1, ad2, ad3, ad4, lb1, lb2, lb4, fb0);
}
    fb1 = fd0 > fd1;
    lb1 = lb2 || lb4;
    ad1 = ad2 + ad3;
        fb0 = ad4 < fd0;
    fd1 = ad1 - ad2;
    boolean lb5 = true;
    double ld6 = 550.0095216390282;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, lb1, lb2, lb4);
}
    ad2 = ad3 + ad4;
    lb5 = !fb0;
if(fo1 != null){
      fb1 = fo1.m2();
}
    fd0 *= -1;
    boolean lb7 = true;
    Thought lo8 = Thought172.getInstance(fo0, fo1, fo0, fo1, fd1, ld6, ad1, ad2, lb1, lb2, lb4, lb5);
    ad3 *= -1;

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
    Output.points[0][1] += ad2;
    ab1 = ab2 && ab3;
    ad3 *= -1;
    double ld0 = 766.4216456032398;
if(fo1 != null){
      fo0 = fo1.m4(ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0);
}
    boolean lb1 = false;
    Output.points[0][2] += ad4;
    fd0 = fd1 + ld0;
    ab1 = ab2 && ab3;
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
    ab4 = fb0 && fb1;
    fd0 *= -1;
    fd1 = ld0 + ad1;
    Thought lo2 = Thought45.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
    boolean lb3 = true;
    fd1 = ld0 + ad1;
    lb1 = ad2 > ad3;
if(fo1 != null){
      ad4 = fo1.m3(fd0, fd1, ld0, ad1, lb3, ab1, ab2, ab3);
}
    Output.points[0][3] -= ad2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb1);
}
if(fo0 != null){
      fo0.m1();
}
    boolean lb4 = true;
    lb3 = lb4 && ab1;
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld0, ab2, ab3, ab4, fb0);
}
    boolean lb5 = true;

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
    fb0 = !fb1;
    boolean lb0 = false;
    fd0 = fd1 + fd0;
    fd1 *= -1;
    for(int i0=0; i0<10; i0++){
        lb0 = fd0 < fd1;
        fb0 = !fb1;
        }
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
if(ao2 != null){
      ao1 = ao2.m4(lb0, fb0, fb1, lb0);
}
    fd0 = fd1 - fd0;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0);
}
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
    fb0 = !fb1;
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
    double ld1 = 4.734105334379799;
    fb0 = ld1 < fd0;
    fb1 = lb0 || fb0;
    boolean lb2 = false;
if(fo0 != null){
      fd1 = fo0.m3(fo1, ao1, ao2, ao3, fb0, fb1, lb0, lb2);
}
    fb0 = !fb1;
if(fo0 != null){
      ao4 = fo0.m4();
}
    lb0 = ld1 > fd0;
        boolean lb3 = false;
    lb2 = !lb3;

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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(fb1, fb0, fb1, fb0);
}
    fb1 = fd0 < fd1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    ad1 = ad2 - ad3;
    double ld0 = 164.50117289859;
    Output.points[0][4] -= ad3;
    Thought lo1 = Thought96.getInstance(ad4, fd0, fd1, ld0);
    boolean lb2 = true;
    lb2 = fb0 || fb1;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4);
}
    lb2 = fd0 > fd1;
    Thought lo3 = Thought57.getInstance(ld0, ad1, ad2, ad3, fb0, fb1, lb2, fb0);
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fb1, lb2, fb0, fb1);
}
if(ao2 != null){
      ao2.m2();
}
    boolean lb4 = true;
    ad4 = fd0 + fd1;
    Thought lo5 = Thought314.getInstance(ao3, ao4, fo0, fo1, ld0, ad1, ad2, ad3, lb2, lb4, fb0, fb1);
    boolean lb6 = true;
    Thought lo7 = Thought33.getInstance(lb2, lb4, lb6, fb0);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    double ld8 = 55.88128533760408;
    ad3 = ad4 - fd0;
    if (fb1) {
        lb2 = fd1 < ld0;
        ld8 *= -1;
        Output.points[0][5] -= ad1;
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
    double ld0 = 208.92161811823433;
    Output.points[0][6] += ld0;
if(ao1 != null){
      fd0 = ao1.m3(fd1, ld0, fd0, fd1);
}
    ab2 = ab3 || ab4;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld0, fd0, fd1, ld0);
}
    Thought lo1 = Thought340.getInstance(fd0, fd1, ld0, fd0, fb0, fb1, ab1, ab2);
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
}
if(ao1 != null){
      ao1.m2();
}
    fd1 *= -1;
    ld0 = fd0 - fd1;
    ab1 = ld0 > fd0;
    Output.points[0][7] += fd1;
    Thought lo2 = Thought253.getInstance(ao2, ao3, ao4, fo0, ld0, fd0, fd1, ld0, ab2, ab3, ab4, fb0);
    fd0 *= -1;
    fb1 = ab1 || ab2;
if(fo1 != null){
      fd1 = fo1.m3(ab3, ab4, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ab1 = ao1.m2(ld0, fd0, fd1, ld0);
}
    ab2 = fd0 > fd1;
    ld0 *= -1;

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
    ad1 = ad2 + ad3;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1);
}
    lb0 = ab1 && ab2;
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
    lb0 = ab1 || ab2;
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, ab3, ab4, fb0, fb1);
}
if(ao2 != null){
      ao2.m2();
}
        lb0 = ad1 < ad2;
    Thought lo1 = Thought383.getInstance(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
if(ao1 != null){
          ad1 = ao1.m3(fb0, fb1, lb0, ab1);
}
    ab2 = ad2 > ad3;
    ab3 = !ab4;
    Thought lo2 = Thought170.getInstance(ao2, ao3, ao4, fo0);
    fb0 = fb1 && lb0;
    boolean lb3 = false;
    ad4 *= -1;

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
    double ld0 = 813.9049843804512;
    Thought lo1 = Thought267.getInstance(fd0, fd1, ld0, fd0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1);
}
    boolean lb2 = true;
    ld0 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(ld0, fd0, fd1, ld0, fb0, fb1, lb2, fb0);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fb1, lb2, fb0, fb1);
}
    lb2 = !fb0;
if(fo0 != null){
      fd0 = fo0.m3();
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1, lb2, fb0, fb1, lb2);
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb2, fb0);
}
    fb1 = !lb2;

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
      fo1.m2(fo0, fo1, fo0, fo1);
}
    ab2 = ab3 || ab4;
    boolean lb0 = false;
    ab4 = fb0 || fb1;
    double ld1 = 177.01490271830113;
    lb0 = ld1 < fd0;
    Thought lo2 = Thought114.getInstance(fd1, ld1, fd0, fd1);
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1);
}
    fd0 = fd1 + ld1;
    Output.points[0][8] += fd0;
if(fo1 != null){
      ab1 = fo1.m2(fd1, ld1, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, lb0, ab1, ab2, ab3);
}
    ld1 *= -1;
    Output.points[1][0] -= fd0;
    Output.points[1][1] += fd1;
    ld1 = fd0 - fd1;
    Thought lo3 = Thought32.getInstance();
    ab4 = ld1 < fd0;
    fb0 = fd1 < ld1;
    fd0 = fd1 - ld1;
    fb1 = lb0 || ab1;
    Output.points[1][2] -= fd0;
    double ld4 = 719.5987795438867;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld1, ld4, ab2, ab3, ab4, fb0);
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
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
    ad1 = ad2 - ad3;
    lb0 = ad4 > fd0;
    fb0 = fd1 < ad1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m3(ad2, ad3, ad4, fd0);
}
    fb1 = fd1 < ad1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    fd1 *= -1;

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
    ab1 = ab2 && ab3;
    if (ab4) {
        fb0 = !fb1;
if(fo0 != null){
          ab1 = fo0.m2(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
        fd0 = fd1 + ad1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
          fo1 = fo0.m4();
}
        for(int i0=0; i0<10; i0++){
if(fo1 != null){
              fo1.m2(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab4, fb0, fb1, ab1);
}
if(fo0 != null){
              ab2 = fo0.m2(ab3, ab4, fb0, fb1);
}
if(fo1 != null){
              ab1 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
              ab2 = fo0.m2(fd1, ad1, ad2, ad3);
}
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
if(fo1 != null){
              fo1.m3(ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
            fd1 = ad1 + ad2;
            ad3 = ad4 + fd0;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    fd0 = fd1 + fd0;
if(ao2 != null){
      fd1 = ao2.m3(fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1);
}
    fd0 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0);
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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
    boolean lb0 = true;
    lb0 = !fb0;
    fb1 = !lb0;
if(ao2 != null){
      ao1 = ao2.m4(fd1, ad1, ad2, ad3, fb0, fb1, lb0, fb0);
}
    double ld1 = 660.8333559661746;
        boolean lb2 = true;
    boolean lb3 = false;
    Thought lo4 = Thought294.getInstance(ao3, ao4, fo0, fo1, lb3, fb0, fb1, lb0);
    Output.points[1][3] -= ad3;
    boolean lb5 = false;
    Thought lo6 = Thought147.getInstance();
    Output.points[1][4] += ad4;
    lb2 = lb3 || lb5;

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
    Thought lo0 = Thought186.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
    Thought lo1 = Thought178.getInstance(fb0, fb1, ab1, ab2);
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    fd1 *= -1;
if(fo1 != null){
      fo1.m3(fd0, fd1, fd0, fd1);
}
    Output.points[1][5] -= fd0;
    Thought lo2 = Thought179.getInstance(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
    boolean lb3 = false;
    fd1 = fd0 - fd1;
    Thought lo4 = Thought180.getInstance(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
    fb1 = !lb3;
    ab1 = ab2 && ab3;
    ab4 = fb0 && fb1;
    fd0 *= -1;
    lb3 = !ab1;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, ao1, ao2, ao3, ab2, ab3, ab4, fb0);
}
    fd1 = fd0 + fd1;
    fd0 *= -1;
        boolean lb5 = true;
    boolean lb6 = false;
    Output.points[1][6] += fd1;

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
    Thought lo0 = Thought367.getInstance();
    ad1 = ad2 - ad3;
    ab1 = ad4 < fd0;
    double ld1 = 357.44799589718764;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ld1, ad1, ab2, ab3, ab4, fb0);
}
if(ao1 != null){
      ad2 = ao1.m3(fb1, ab1, ab2, ab3);
}
        Thought lo2 = Thought125.getInstance(ao2, ao3, ao4, fo0);
    Thought lo3 = Thought6.getInstance(ad3, ad4, fd0, fd1);
    boolean lb4 = true;
    ld1 = ad1 - ad2;
    ad3 *= -1;
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ld1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
    double ld5 = 82.84144662387749;
    boolean lb6 = true;
    ad4 = fd0 + fd1;

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
    fb0 = fd0 < fd1;
    boolean lb0 = false;
    fd0 *= -1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
    fd1 = fd0 - fd1;
    fb1 = fd0 > fd1;
    lb0 = fb0 || fb1;
    Output.points[1][7] -= fd0;
    fd1 = fd0 + fd1;
    boolean lb1 = false;
    Thought lo2 = Thought304.getInstance();
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb0);
}
if(fo1 != null){
      fd0 = fo1.m3(lb1, fb0, fb1, lb0);
}
    lb1 = fb0 || fb1;
    fd1 = fd0 + fd1;
    Thought lo3 = Thought86.getInstance(fo0, fo1, fo0, fo1);
    lb0 = !lb1;
    fb0 = fb1 && lb0;
    fd0 = fd1 - fd0;
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
    Thought lo4 = Thought92.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
    lb1 = fb0 || fb1;
    fd0 *= -1;
if(fo1 != null){
      fo1.m3(fd1, fd0, fd1, fd0, lb0, lb1, fb0, fb1);
}
    Output.points[1][8] -= fd1;
    lb0 = lb1 || fb0;
    fd0 *= -1;
    Thought lo5 = Thought9.getInstance(fo0, fo1, fo0, fo1, fb1, lb0, lb1, fb0);

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
    Thought lo0 = Thought398.getInstance();
    fd0 *= -1;
    boolean lb1 = true;
    fb0 = fd1 > fd0;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb1, fb0, fb1, lb1);
}
if(fo1 != null){
      fd1 = fo1.m3(fb0, fb1, lb1, fb0);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
        Output.points[2][0] += fd1;
        fd0 = fd1 + fd0;
    fb1 = fd1 > fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    lb1 = fd0 > fd1;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, fb0, fb1, lb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb1, fb0, fb1);
}
    lb1 = fb0 && fb1;

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
      fd1 = fo1.m3();
}
    fb0 = fb1 || fb0;
    fb1 = !fb0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    fb0 = fd0 > fd1;
    fd0 = fd1 + fd0;
    double ld0 = 664.3042143151014;
    fd0 = fd1 - ld0;
    fb1 = !fb0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    fd0 = fd1 + ld0;
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld0, fd0, fd1);
}
    double ld1 = 799.6950296705942;
    fb1 = !fb0;
    Thought lo2 = Thought338.getInstance(fo1, fo0, fo1, fo0, ld0, ld1, fd0, fd1);

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
