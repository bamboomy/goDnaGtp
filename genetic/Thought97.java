package genetic;
import java.util.ArrayList;
class Thought97 extends Thought{
private static ArrayList<Thought97> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 646.1214719786593;
private double fd1 = 8.977546271251303;
private Thought fo0 = null;
private Thought fo1 = null;
Thought97 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought97 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought97 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought97 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought97 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought97 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought97 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought97 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought97 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought97 instance = new Thought97 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought97 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought97 instance = new Thought97 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought97 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought97 instance = new Thought97 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought97 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought97 instance = new Thought97 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought97 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought97 instance = new Thought97 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought97 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought97 instance = new Thought97 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought97 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought97 instance = new Thought97 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought97 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought97 instance = new Thought97 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fb1 = fb0 || fb1;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fb0 = fo1.m2(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    fd1 = fd0 + fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    Output.points[6][1] -= fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fb1 = fb0 && fb1;
    boolean lb0 = true;
    lb0 = fd0 > fd1;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb0, fb0);
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
      fo0 = fo1.m4();
}
    Thought lo0 = Thought29.getInstance(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
    Output.points[6][2] -= fd1;
    Thought lo1 = Thought48.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo1.m1(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    boolean lb2 = false;
    Output.points[6][3] += fd1;
    Output.points[6][4] -= fd0;
    Output.points[6][5] += fd1;
if(fo0 != null){
      lb2 = fo0.m2(ab1, ab2, ab3, ab4);
}
    boolean lb3 = true;
if(fo1 != null){
      fd0 = fo1.m3();
}
    ab4 = fb0 || fb1;
    boolean lb4 = true;
    lb2 = fd1 < fd0;
    fd1 *= -1;
    lb3 = lb4 || ab1;
    fd0 = fd1 + fd0;
    fd1 *= -1;
    ab2 = !ab3;

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
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 < fd1;
    ad1 = ad2 + ad3;
    boolean lb0 = false;
    double ld1 = 745.5346161427316;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    fb0 = fb1 || lb0;
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld1, fb0, fb1, lb0, fb0);
}
    fb1 = lb0 || fb0;
    Thought lo2 = Thought73.getInstance(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
    boolean lb3 = false;

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
    ad2 = ad3 + ad4;
    ab1 = ab2 && ab3;
    ab4 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
    Thought lo0 = Thought1.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      fo0.m1();
}
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
    ab1 = ad1 < ad2;
    Output.points[6][6] -= ad3;
    ad4 *= -1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    ab2 = fd0 < fd1;
    Thought lo1 = Thought75.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
    boolean lb2 = true;
    Output.points[6][7] -= fd0;
    Output.points[6][8] += fd1;
    boolean lb3 = false;
    for(int i0=0; i0<10; i0++){
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
    boolean lb0 = true;
    lb0 = fd0 > fd1;
    fb0 = fb1 || lb0;
    Output.points[7][0] -= fd0;
        fb0 = fb1 || lb0;
    fb0 = fd1 < fd0;
    fb1 = lb0 || fb0;
    fd1 = fd0 + fd1;
if(ao1 != null){
          fd0 = ao1.m3(ao2, ao3, ao4, fo0, fb1, lb0, fb0, fb1);
}
if(fo1 != null){
      lb0 = fo1.m2(fd1, fd0, fd1, fd0);
}
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
    Output.points[7][1] += fd1;
if(ao1 != null){
      fo1 = ao1.m4(fb1, lb0, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    fd0 = fd1 - fd0;
    Output.points[7][2] += fd1;
if(ao4 != null){
      ao4.m1(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
    fd0 *= -1;
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3);
}
    fb0 = fd1 < fd0;

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
      ao2.m3(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    if (fb1) {
        Thought lo0 = Thought76.getInstance(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
        fb0 = fb1 && fb0;
if(fo1 != null){
          fo0 = fo1.m4(fd1, ad1, ad2, ad3);
}
        ad4 *= -1;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2);
}
        ad3 = ad4 + fd0;
        fb1 = fb0 || fb1;
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
      ao1 = ao2.m4(ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || ab1;
if(ao4 != null){
      ao3 = ao4.m4();
}
    ab2 = ab3 && ab4;
    Thought lo0 = Thought47.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
    ab3 = fd1 < fd0;
    double ld1 = 25.463860601404875;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    double ld2 = 777.9878508423394;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ld2, fd0, fd1, ld1, ab4, fb0, fb1, ab1);
}
    ld2 = fd0 + fd1;
if(fo0 != null){
      ab2 = fo0.m2(fo1, ao1, ao2, ao3, ab3, ab4, fb0, fb1);
}
    ld1 = ld2 - fd0;
    ab1 = fd1 > ld1;
if(ao4 != null){
      ao4.m1(ld2, fd0, fd1, ld1);
}
    Output.points[7][3] -= ld2;
    fd0 = fd1 - ld1;
    boolean lb3 = false;
    ld2 = fd0 + fd1;
    boolean lb4 = true;
if(fo0 != null){
      ld1 = fo0.m3(fo1, ao1, ao2, ao3, ld2, fd0, fd1, ld1);
}
    lb4 = ld2 < fd0;
    for(int i0=0; i0<10; i0++){
        boolean lb5 = true;
        fd1 = ld1 - ld2;
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
    ad1 *= -1;
    ab1 = ab2 && ab3;
    boolean lb0 = false;
    ab3 = ad2 < ad3;
    ab4 = !fb0;
if(ao2 != null){
      ao2.m3(fb1, lb0, ab1, ab2);
}
    ab3 = ad4 > fd0;
    Thought lo1 = Thought91.getInstance();
if(ao4 != null){
      ao3 = ao4.m4(fd1, ad1, ad2, ad3, ab4, fb0, fb1, lb0);
}
    ad4 = fd0 - fd1;
if(fo0 != null){
          ad1 = fo0.m3(fo1, ao1, ao2, ao3);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    double ld2 = 849.6237660555628;
    fb0 = fd0 < fd1;
    ld2 *= -1;
    Thought lo3 = Thought85.getInstance(ao4, fo0, fo1, ao1, fb1, lb0, ab1, ab2);
if(ao2 != null){
      ab3 = ao2.m2(ad1, ad2, ad3, ad4);
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, ld2, ad1);
}
    ad2 *= -1;
    double ld4 = 296.1054888770744;
if(ao2 != null){
      ao2.m2(ab4, fb0, fb1, lb0);
}
    Thought lo5 = Thought5.getInstance();
if(ao3 != null){
      ab1 = ao3.m2(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = fd1 < ld2;
    lb0 = ab1 || ab2;
    double ld6 = 570.7967791347652;

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
    fb1 = fb0 && fb1;
    fd1 *= -1;
    fb0 = !fb1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 > fd1;
    fb1 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    boolean lb0 = true;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    double ld1 = 152.15115909821733;
    ld1 = fd0 + fd1;
    lb0 = ld1 < fd0;
if(fo0 != null){
      fo0.m3(fb0, fb1, lb0, fb0);
}
    boolean lb2 = false;
if(fo0 != null){
      fo1 = fo0.m4();
}
    double ld3 = 720.8415668298255;
if(fo1 != null){
      fb0 = fo1.m2(fd0, fd1, ld1, ld3, fb1, lb0, lb2, fb0);
}
    double ld4 = 683.1294168047255;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld4, fd0, fd1, ld1, fb1, lb0, lb2, fb0);
}
        fb1 = ld3 > ld4;
    lb0 = lb2 && fb0;
    fb1 = !lb0;

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
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    fb0 = !fb1;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
        fb0 = fd0 > fd1;
    Output.points[7][4] -= fd0;
    fb1 = ab1 || ab2;
    ab3 = fd1 > fd0;
    ab4 = fd1 > fd0;
    fd1 = fd0 + fd1;
    boolean lb0 = false;
if(fo1 != null){
      fo1.m1();
}
    ab4 = fb0 || fb1;
    lb0 = ab1 || ab2;
if(fo0 != null){
      fo0.m3(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb1 = false;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb0, lb1, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[7][5] -= ad1;
    boolean lb0 = true;
    fb0 = !fb1;
    double ld1 = 619.819874224431;
    ad1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld1, ad1, ad2);
}
        lb0 = ad3 < ad4;
if(fo1 != null){
          fo0 = fo1.m4(fb0, fb1, lb0, fb0);
}
        fb1 = !lb0;
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
    ab1 = ad2 < ad3;
    Output.points[7][6] -= ad4;
    fd0 = fd1 - ad1;
    boolean lb0 = true;
    ab1 = ab2 && ab3;
    Output.points[7][7] += ad2;
    Output.points[7][8] += ad3;
if(fo0 != null){
      ab4 = fo0.m2();
}
    fb0 = !fb1;
    lb0 = ab1 || ab2;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 || fb0;
if(ao2 != null){
      fd1 = ao2.m3(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 < fd1;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1);
}
    Output.points[8][0] -= fd0;
    fd1 = fd0 + fd1;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    Output.points[8][1] += fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    Output.points[8][2] += fd1;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
if(ao3 != null){
      fd1 = ao3.m3(fb1, fb0, fb1, fb0);
}
    fd0 *= -1;
    fd1 *= -1;
if(fo0 != null){
      ao4 = fo0.m4();
}
    fb1 = fd0 < fd1;
    fd0 = fd1 + fd0;
    boolean lb0 = false;
    lb0 = fd1 > fd0;

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
    Output.points[8][3] += ad2;
    double ld0 = 808.6566973901316;
    fb0 = fb1 || fb0;
if(ao3 != null){
      ao2 = ao3.m4(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    Output.points[8][4] -= fd1;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, ld0, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
    fb1 = ad4 < fd0;
    fb0 = !fb1;
    fb0 = fd1 < ld0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
    double ld1 = 940.0431103515033;
    fb1 = ld1 > ad1;
if(ao2 != null){
      fb0 = ao2.m2(ad2, ad3, ad4, fd0);
}
    fb1 = !fb0;
    double ld2 = 579.4675675319654;

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
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo1.m2(ab1, ab2, ab3, ab4);
}
if(ao1 != null){
      fd1 = ao1.m3();
}
if(ao2 != null){
      fb0 = ao2.m2(fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
if(ao3 != null){
      ab4 = ao3.m2(ao4, fo0, fo1, ao1);
}
    fb0 = fb1 || ab1;
    double ld0 = 77.23578618140525;
    boolean lb1 = true;
    Output.points[8][5] -= ld0;
    double ld2 = 46.83672302373259;
    double ld3 = 154.88509562514847;
    boolean lb4 = false;
    Thought lo5 = Thought47.getInstance(ao2, ao3, ao4, fo0, ld2, ld3, fd0, fd1, lb4, ab1, ab2, ab3);
    double ld6 = 638.8335538529741;
    double ld7 = 414.6141504433945;
    boolean lb8 = false;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ab3, ab4, fb0, fb1);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 - ad3;
    ad4 *= -1;
    fd0 *= -1;
    ab2 = fd1 > ad1;
if(ao3 != null){
      ao2 = ao3.m4(ad2, ad3, ad4, fd0);
}
    ab3 = ab4 || fb0;
    Output.points[8][6] -= fd1;
    ad1 = ad2 - ad3;
    boolean lb0 = true;
    double ld1 = 250.3703783344341;
    fb0 = fb1 || lb0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1);
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 + fd0;
    fb0 = fd1 > fd0;
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fd0 = fo1.m3();
}
if(fo0 != null){
      fo0.m3(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    Output.points[8][7] -= fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    Thought lo0 = Thought80.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
    boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    fb0 = !fb1;
    boolean lb2 = true;
    boolean lb3 = false;
    fd1 *= -1;
if(fo1 != null){
      fo1.m1(lb1, lb2, lb3, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb4 = true;

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
    double ld0 = 524.5646365682145;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = fd1 < ld0;
    boolean lb1 = false;
    double ld2 = 660.3462714150919;
    ld2 = fd0 - fd1;
    double ld3 = 103.24124195482152;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Output.points[8][8] -= ld0;
    fb0 = fb1 && lb1;
    ab1 = !ab2;
    ld2 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld3, fd0, fd1, ld0, ab3, ab4, fb0, fb1);
}
    Output.points[0][0] -= ld2;
    Output.points[0][1] += ld3;
    lb1 = ab1 || ab2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo0.m1(fd0, fd1, ld0, ld2);
}
if(fo1 != null){
      ld3 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld2);
}
if(fo1 != null){
          fo0 = fo1.m4(lb1, ab1, ab2, ab3);
}

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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 && fb0;
    fb1 = fb0 || fb1;
    double ld0 = 567.2313993314243;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    boolean lb1 = false;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    lb1 = fb0 || fb1;
    lb1 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ad1, lb1, fb0, fb1, lb1);
}
    fb0 = fb1 || lb1;
    fb0 = ad2 < ad3;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb1);
}
    Thought lo2 = Thought3.getInstance(ad4, fd0, fd1, ld0);
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fo1.m3(fb0, fb1, lb1, fb0);
}
    Output.points[0][2] -= fd1;
    fb1 = !lb1;
    Output.points[0][3] += ld0;
    Thought lo3 = Thought59.getInstance();
    ad1 *= -1;
    fb0 = !fb1;
    ad2 = ad3 - ad4;
        lb1 = fd0 > fd1;

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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ad2 < ad3;
    ad4 = fd0 - fd1;
    Thought lo0 = Thought50.getInstance(ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
    fd0 = fd1 - ad1;
    boolean lb1 = true;
    lb1 = !ab1;
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0);
}
    Thought lo2 = Thought58.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
    for(int i0=0; i0<10; i0++){
        double ld3 = 506.0325298886129;
        for(int i1=0; i1<10; i1++){
if(fo1 != null){
              fo1.m1(fo0, fo1, fo0, fo1, lb1, ab1, ab2, ab3);
}
            boolean lb4 = true;
            ab3 = fd0 < fd1;
            Thought lo5 = Thought14.getInstance(ld3, ad1, ad2, ad3);
            ad4 = fd0 + fd1;
if(fo0 != null){
              ld3 = fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
if(fo1 != null){
              fo1.m3(ab4, fb0, fb1, lb4);
}
            lb1 = ab1 && ab2;
if(fo1 != null){
              fo0 = fo1.m4();
}
if(fo0 != null){
              ab3 = fo0.m2(fd0, fd1, ld3, ad1, ab4, fb0, fb1, lb4);
}
            lb1 = ab1 || ab2;
if(fo1 != null){
              fo1.m3(fo0, fo1, fo0, fo1);
}
            double ld6 = 836.2830606911384;
if(fo0 != null){
              ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
            fd1 *= -1;
            Thought lo7 = Thought36.getInstance(fo1, fo0, fo1, fo0, lb4, lb1, ab1, ab2);
            ld6 = ld3 + ad1;
            ad2 *= -1;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      fd1 = ao2.m3(fd0, fd1, fd0, fd1);
}
    fb0 = fb1 || fb0;
    fd0 = fd1 + fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
if(ao4 != null){
      ao3 = ao4.m4(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
        fb1 = fb0 || fb1;
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1);
}
    double ld0 = 883.7061733138762;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
    double ld1 = 539.3983014600194;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
    Output.points[0][4] -= fd0;
    fb0 = fb1 && fb0;
    fb1 = fb0 && fb1;
    fd1 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ld0, ld1, fd0, fd1);
}
if(ao3 != null){
      ld0 = ao3.m3(ao4, fo0, fo1, ao1, ld1, fd0, fd1, ld0);
}
    ld1 = fd0 - fd1;
    ld0 = ld1 + fd0;
        fb0 = fb1 || fb0;

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
    Thought lo0 = Thought68.getInstance(fb1, fb0, fb1, fb0);
    fb1 = !fb0;
if(ao2 != null){
      fb1 = ao2.m2();
}
    ad1 = ad2 + ad3;
    ad4 = fd0 - fd1;
    ad1 *= -1;
    Thought lo1 = Thought30.getInstance(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
    fd1 = ad1 + ad2;
    fb0 = fb1 || fb0;
    ad3 *= -1;
    fb1 = ad4 > fd0;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1);
}
    boolean lb2 = false;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3, lb2, fb0, fb1, lb2);
}
    ad4 = fd0 + fd1;
    ad1 = ad2 - ad3;
    ad4 = fd0 + fd1;
if(ao1 != null){
      ad1 = ao1.m3(ao2, ao3, ao4, fo0, fb0, fb1, lb2, fb0);
}
if(ao1 != null){
      fo1 = ao1.m4(ad2, ad3, ad4, fd0);
}
    double ld3 = 36.372249912138095;
    Output.points[0][5] += fd0;
    Thought lo4 = Thought37.getInstance(ao2, ao3, ao4, fo0, fd1, ld3, ad1, ad2);
if(ao1 != null){
      fo1 = ao1.m4(fb1, lb2, fb0, fb1);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 *= -1;
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
    ab1 = ab2 && ab3;
    boolean lb0 = true;
if(ao2 != null){
      ab3 = ao2.m2();
}
    Thought lo1 = Thought30.getInstance(fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    boolean lb2 = false;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab4, fb0, fb1, lb0);
}
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
    fd1 *= -1;
    double ld3 = 9.414355976110736;
    ld3 = fd0 - fd1;
    Thought lo4 = Thought97.getInstance(ld3, fd0, fd1, ld3);

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
    ad1 *= -1;
    ad2 = ad3 + ad4;
    Output.points[0][6] += fd0;
    ab2 = ab3 && ab4;
    fb0 = fd1 < ad1;
    fb1 = ab1 && ab2;
    ab3 = ad2 < ad3;
    Output.points[0][7] += ad4;
    boolean lb0 = false;
if(ao1 != null){
      ab3 = ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2);
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo1.m3(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fb0 = fo0.m2();
}
if(fo1 != null){
      fb1 = fo1.m2(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 > fd0;
    fb1 = fd1 < fd0;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
    boolean lb0 = true;
    fb0 = fb1 && lb0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo1.m1(fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd1 = fd0 - fd1;
    boolean lb1 = false;
    fb0 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb1, lb0, lb1, fb0);
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
    ab2 = ab3 || ab4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd0 = fd1 + fd0;
    double ld0 = 803.8210421453994;
    Thought lo1 = Thought28.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, fb0, fb1, ab1, ab2);
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    ld0 *= -1;
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld0, fd0, fd1);
}
    ld0 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
}
    Thought lo2 = Thought42.getInstance(ab1, ab2, ab3, ab4);
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd0 = fd1 - ld0;
if(fo1 != null){
      fo1.m2(fd0, fd1, ld0, fd0, fb0, fb1, ab1, ab2);
}
    double ld3 = 882.4463540910956;
    boolean lb4 = true;
    fd0 = fd1 - ld0;
    ab2 = ld3 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, ld3, fd0, fd1, ab3, ab4, fb0, fb1);
}
    ld0 = ld3 - fd0;
    fd1 *= -1;
    Output.points[0][8] -= ld0;
    ld3 = fd0 + fd1;
    lb4 = ld0 < ld3;
    fd0 = fd1 + ld0;
    ab1 = ab2 && ab3;
    ab4 = ld3 > fd0;

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
    fb1 = ad2 < ad3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
    ad4 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
    lb0 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(lb0, fb0, fb1, lb0);
}
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1, lb1, fb0, fb1, lb0);
}
    Output.points[1][0] -= ad2;
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, lb1, fb0, fb1, lb0);
}
    lb1 = !fb0;
    boolean lb2 = false;
    boolean lb3 = false;
    boolean lb4 = true;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, lb3, lb4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    fd0 = fd1 - ad1;
    lb0 = lb1 || lb2;
    lb3 = ad2 > ad3;
    boolean lb5 = false;
    boolean lb6 = true;

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
    boolean lb0 = true;
if(fo0 != null){
      lb0 = fo0.m2(ab1, ab2, ab3, ab4);
}
    boolean lb1 = false;
    ab4 = ad2 < ad3;
    Output.points[1][1] += ad4;
if(fo0 != null){
      fo1 = fo0.m4();
}
    double ld2 = 366.75603382316586;
    fb0 = ad4 > fd0;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo1.m1(fd1, ld2, ad1, ad2, fb1, lb0, lb1, ab1);
}
        double ld3 = 856.486389543172;
if(fo0 != null){
          ab2 = fo0.m2(fo1, fo0, fo1, fo0);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought57.getInstance(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
    Output.points[1][2] -= fd1;
    fb0 = fb1 && fb0;
    fb1 = fd0 > fd1;
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m3(fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
if(fo1 != null){
      fd1 = fo1.m3(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1);
}
    fb0 = fb1 && fb0;
if(fo0 != null){
      fd0 = fo0.m3(fb1, fb0, fb1, fb0);
}
    fd1 = fd0 - fd1;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m3();
}
if(ao2 != null){
      ao2.m1(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
    double ld1 = 364.63555968185125;
    Thought lo2 = Thought59.getInstance(ao3, ao4, fo0, fo1);
    fb0 = !fb1;
    Output.points[1][3] -= ad4;
    if (lb0) {
if(ao1 != null){
          fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, ld1, ad1, ad2, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
          ad3 = fo1.m3(ao1, ao2, ao3, ao4, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
          ad4 = fo0.m3(fd0, fd1, ld1, ad1);
}
        boolean lb3 = true;
        ad2 = ad3 - ad4;
        fd0 *= -1;
        fd1 = ld1 - ad1;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo1.m2(lb0, ab1, ab2, ab3);
}
if(ao2 != null){
          ao1 = ao2.m4();
}
        ab4 = !fb0;
        boolean lb1 = true;
if(ao4 != null){
          ao3 = ao4.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb1, lb0);
}
        if (ab1) {
            Output.points[1][4] -= fd0;
            Thought lo2 = Thought86.getInstance(fo0, fo1, ao1, ao2);
}}
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ab2 = ao2.m2(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || ab1;
if(ao1 != null){
      fo1 = ao1.m4(fd1, ad1, ad2, ad3);
}
    ad4 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2);
}
if(ao2 != null){
      ao2.m1(ab2, ab3, ab4, fb0);
}
    fb1 = ad3 < ad4;
    ab1 = !ab2;
if(ao3 != null){
      ao3.m2();
}
if(ao4 != null){
      ao4.m1(fd0, fd1, ad1, ad2, ab3, ab4, fb0, fb1);
}
    boolean lb0 = true;
    boolean lb1 = false;
    ad3 = ad4 + fd0;
    Thought lo2 = Thought92.getInstance(fo0, fo1, ao1, ao2);
    lb0 = lb1 || ab1;
if(ao3 != null){
      ab2 = ao3.m2(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
    Output.points[1][5] -= ad4;
    double ld3 = 728.381070690212;

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
    double ld0 = 354.0246238375977;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    ld0 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(ld0, fd0, fd1, ld0);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1);
}
    ld0 = fd0 + fd1;
    Thought lo1 = Thought45.getInstance(fb1, fb0, fb1, fb0);
    fb1 = ld0 < fd0;
    boolean lb2 = true;
if(fo0 != null){
      fo0.m1();
}
    fd1 = ld0 - fd0;
    fd1 = ld0 + fd0;
    fd1 = ld0 + fd0;
    boolean lb3 = false;
    double ld4 = 556.5347382377112;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, ld4, lb2, lb3, fb0, fb1);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    Output.points[1][6] -= fd1;
    ld0 = ld4 - fd0;
    lb2 = fd1 < ld0;
    boolean lb5 = false;
    lb3 = !lb5;
    ld4 *= -1;
    double ld6 = 415.29791620913204;
    ld6 *= -1;
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld4, lb2, lb3, lb5, fb0);
}
    fb1 = lb2 && lb3;

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
    boolean lb0 = false;
    fd0 *= -1;
    Thought lo1 = Thought7.getInstance(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
    boolean lb2 = true;
    Output.points[1][7] -= fd1;
    double ld3 = 161.86504207858306;
    ld3 *= -1;
    lb2 = fd0 < fd1;
if(fo0 != null){
      ld3 = fo0.m3(fd0, fd1, ld3, fd0);
}
    fb0 = !fb1;
    fd1 *= -1;
    boolean lb4 = false;
    boolean lb5 = true;
    lb0 = !lb2;
if(fo1 != null){
      lb4 = fo1.m2(fo0, fo1, fo0, fo1, ld3, fd0, fd1, ld3);
}
    lb5 = fd0 < fd1;
    fb0 = fb1 || lb0;
if(fo0 != null){
      ld3 = fo0.m3(lb2, lb4, lb5, fb0);
}
    fb1 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    ld3 = fd0 - fd1;
    boolean lb6 = false;
if(fo0 != null){
      fo1 = fo0.m4(ld3, fd0, fd1, ld3, lb0, lb2, lb4, lb5);
}
    fd0 = fd1 - ld3;
    lb6 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb7 = true;
    lb7 = fb0 || fb1;

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
    double ld0 = 915.678116265491;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    Output.points[1][8] += fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld0, fd0, fd1);
}
    ld0 *= -1;
        fb0 = fb1 && fb0;
    fd0 *= -1;
    fb1 = fd1 > ld0;
    fd0 = fd1 + ld0;
    fd0 *= -1;
    fd1 = ld0 + fd0;
    Output.points[2][0] -= fd1;
    fb0 = fb1 && fb0;

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
