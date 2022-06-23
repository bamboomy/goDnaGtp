package genetic;
import java.util.ArrayList;
class Thought42 extends Thought{
private static ArrayList<Thought42> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 610.7647437154992;
private double fd1 = 749.2496064184223;
private Thought fo0 = null;
private Thought fo1 = null;
Thought42 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought42 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought42 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought42 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought42 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought42 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought42 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought42 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought42 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought42 instance = new Thought42 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought42 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought42 instance = new Thought42 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought42 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought42 instance = new Thought42 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought42 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought42 instance = new Thought42 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought42 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought42 instance = new Thought42 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought42 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought42 instance = new Thought42 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought42 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought42 instance = new Thought42 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought42 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought42 instance = new Thought42 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought49.getInstance(fb0, fb1, fb0, fb1);
if(fo1 != null){
          fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fb1 = fb0 || fb1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
        fb1 = fd1 > fd0;
        fd1 = fd0 + fd1;
    boolean lb1 = false;
    lb1 = fb0 && fb1;
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, lb1, fb0, fb1, lb1);
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
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 && ab3;
if(fo1 != null){
      fo1.m2();
}
if(fo0 != null){
      ab4 = fo0.m2(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      ab3 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
    fd0 *= -1;
    ab1 = !ab2;

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
      fo0 = fo1.m4(fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo0 = Thought48.getInstance(ad3, ad4, fd0, fd1);
    Thought lo1 = Thought72.getInstance(fb0, fb1, fb0, fb1);
    ad1 = ad2 + ad3;
    double ld2 = 168.24374273410228;
    Output.points[6][1] += ad3;
    ad4 *= -1;
    fd0 = fd1 - ld2;
    fb0 = ad1 < ad2;
    double ld3 = 39.40562693554768;
    boolean lb4 = false;
    boolean lb5 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    fd1 *= -1;
    Thought lo6 = Thought55.getInstance(fo0, fo1, fo0, fo1, ld2, ld3, ad1, ad2, lb5, fb0, fb1, lb4);
    boolean lb7 = true;
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0, lb5, lb7, fb0, fb1);
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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ab1 = ab2 || ab3;
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0, ab4, fb0, fb1, ab1);
}
    fd1 = ad1 - ad2;
    double ld0 = 353.6934570317671;
if(fo1 != null){
      fo1.m1();
}
    ab2 = !ab3;
    ab4 = ad2 > ad3;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ld0);
}
if(fo0 != null){
      fo0.m3(fb0, fb1, ab1, ab2);
}
    ab3 = ad1 < ad2;
    boolean lb1 = true;
    boolean lb2 = true;
    Output.points[6][2] -= ad3;
    Output.points[6][3] += ad4;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ad1);
}
    boolean lb3 = true;

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
        fb1 = fb0 && fb1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fo1.m1(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought27.getInstance();
    fd1 *= -1;
    fd0 *= -1;
if(ao1 != null){
      fd1 = ao1.m3(fd0, fd1, fd0, fd1);
}
    fb0 = fb1 || fb0;
    Output.points[6][4] += fd0;
if(ao3 != null){
      ao2 = ao3.m4(fb1, fb0, fb1, fb0);
}
    Output.points[6][5] -= fd1;
    Thought lo1 = Thought94.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);

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
    ad1 = ad2 + ad3;
    fb1 = fb0 || fb1;
if(ao2 != null){
      ad4 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
    double ld0 = 411.4588239977731;
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
    ad2 = ad3 - ad4;
if(fo1 != null){
      fd0 = fo1.m3(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
      fo0.m1(fd1, ld0, ad1, ad2, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    Output.points[6][6] -= ad3;
if(ao1 != null){
      fo1 = ao1.m4();
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
    ab1 = ab2 || ab3;
    double ld0 = 369.6274970928603;
    ab4 = fb0 || fb1;
    ab1 = ld0 < fd0;
if(ao2 != null){
      fd1 = ao2.m3(ld0, fd0, fd1, ld0);
}
if(ao3 != null){
      ab2 = ao3.m2(ab3, ab4, fb0, fb1);
}
    ab1 = fd0 > fd1;
    double ld1 = 846.7922974675392;
    ld0 *= -1;
    ab2 = ld1 > fd0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, ld0, ld1, fd0);
}
    fd1 = ld0 + ld1;
    double ld2 = 790.6052671677602;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld2, fd0, fd1, ld0, ab3, ab4, fb0, fb1);
}
    ab1 = ab2 && ab3;
    ld1 *= -1;
    boolean lb3 = false;
    double ld4 = 325.74827132644083;
    ab3 = ld2 < ld4;
    boolean lb5 = false;
    Thought lo6 = Thought14.getInstance(ao4, fo0, fo1, ao1, ab3, ab4, fb0, fb1);
    Thought lo7 = Thought50.getInstance(ao2, ao3, ao4, fo0);
    lb3 = fd0 < fd1;
    lb5 = ab1 && ab2;
if(ao1 != null){
      fo1 = ao1.m4(ld0, ld1, ld2, ld4, ab3, ab4, fb0, fb1);
}
    Thought lo8 = Thought34.getInstance();
    lb3 = fd0 < fd1;
if(ao3 != null){
      ao2 = ao3.m4(ld0, ld1, ld2, ld4);
}
    lb5 = fd0 < fd1;

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
    Output.points[6][7] += ad1;
    ad2 = ad3 + ad4;
    fd0 = fd1 + ad1;
if(ao3 != null){
      ao2 = ao3.m4(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0);
}
if(ao4 != null){
      fb0 = ao4.m2(fo0, fo1, ao1, ao2, fd1, ad1, ad2, ad3, fb1, ab1, ab2, ab3);
}
    Thought lo0 = Thought85.getInstance(ao3, ao4, fo0, fo1, ab4, fb0, fb1, ab1);
    Output.points[6][8] -= ad4;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ab2 = ao1.m2(fd0, fd1, ad1, ad2, ab3, ab4, fb0, fb1);
}
if(ao2 != null){
      ab1 = ao2.m2();
}
if(ao4 != null){
      ao3 = ao4.m4(ad3, ad4, fd0, fd1);
}
    ab2 = ad1 < ad2;
if(fo0 != null){
      ab3 = fo0.m2(ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      ad3 = fo1.m3(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ad1);
}
    ad2 = ad3 - ad4;
if(fo0 != null){
      fd0 = fo0.m3(fo1, ao1, ao2, ao3, fd1, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
    double ld1 = 762.8677541367649;
    fb1 = ad3 < ad4;
    ab1 = fd0 < fd1;
    ab2 = ab3 && ab4;
    double ld2 = 859.4736618890691;
    Thought lo3 = Thought93.getInstance(ao4, fo0, fo1, ao1, fb0, fb1, ab1, ab2);

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
    double ld0 = 186.08499170371192;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb1 = false;
if(fo1 != null){
      ld0 = fo1.m3(fd0, fd1, ld0, fd0, lb1, fb0, fb1, lb1);
}
    boolean lb2 = true;
    lb2 = fb0 && fb1;
    boolean lb3 = false;
    boolean lb4 = false;
    boolean lb5 = false;
if(fo0 != null){
      fo0.m1();
}
    lb1 = lb2 && lb3;
    Thought lo6 = Thought27.getInstance(fd1, ld0, fd0, fd1);
if(fo1 != null){
      fo1.m3(lb4, lb5, fb0, fb1);
}
    ld0 = fd0 + fd1;
if(fo0 != null){
      ld0 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
}
    Output.points[7][0] += fd1;

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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 + fd0;
    fd1 *= -1;
    ab2 = !ab3;
    Thought lo0 = Thought64.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
    Output.points[7][1] -= fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    fd1 = fd0 - fd1;
    double ld1 = 981.2840785574916;
    fb1 = ld1 < fd0;
    Output.points[7][2] += fd1;
    boolean lb2 = false;
    ld1 = fd0 - fd1;
    Thought lo3 = Thought7.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
      fo1 = fo0.m4(ld1, fd0, fd1, ld1, lb2, ab1, ab2, ab3);
}
    ab4 = fd0 < fd1;
    Thought lo4 = Thought14.getInstance();
    ld1 = fd0 - fd1;
    fb0 = fb1 || lb2;

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
    Thought lo0 = Thought23.getInstance(ad1, ad2, ad3, ad4);
    double ld1 = 301.1095141353619;
if(fo1 != null){
      ad4 = fo1.m3(fb0, fb1, fb0, fb1);
}
    boolean lb2 = true;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld1, ad1, ad2);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, lb2, fb0, fb1, lb2);
}
if(fo1 != null){
          fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, lb2, fb0, fb1);
}
    Output.points[7][3] += ld1;
if(fo0 != null){
      lb2 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m2(ad1, ad2, ad3, ad4, fb0, fb1, lb2, fb0);
}
    fb1 = lb2 && fb0;
    boolean lb3 = false;
    double ld4 = 919.5484772242434;
if(fo0 != null){
      fo0.m1();
}
    ad4 = fd0 + fd1;
    fb0 = ld1 < ld4;
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0);
}
    fb1 = lb2 && lb3;
if(fo0 != null){
      fo0.m2(fb0, fb1, lb2, lb3);
}
    fd1 *= -1;
    ld1 = ld4 + ad1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    fb0 = fb1 && lb2;
    fd1 *= -1;
    Thought lo5 = Thought20.getInstance(fo1, fo0, fo1, fo0, ld1, ld4, ad1, ad2, lb3, fb0, fb1, lb2);
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, lb3, fb0, fb1, lb2);
}
    Output.points[7][4] += ad3;
    lb3 = fb0 && fb1;

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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ad2 > ad3;
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ad1, ad2, ab3, ab4, fb0, fb1);
}
    Output.points[7][5] -= ad3;
    Output.points[7][6] -= ad4;
    double ld0 = 811.8140267554597;
    ab1 = !ab2;
    Output.points[7][7] += ad4;
if(fo1 != null){
          fd0 = fo1.m3();
}
    boolean lb1 = true;
    ab2 = fd1 > ld0;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
    ab3 = fd0 < fd1;
    ab4 = fb0 || fb1;
    ld0 = ad1 - ad2;
if(fo1 != null){
      fo0 = fo1.m4(lb1, ab1, ab2, ab3);
}
    if (ab4) {
        double ld2 = 330.6312411760883;
        fb0 = fb1 && lb1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, fd1, ld2, ld0, ad1, ab1, ab2, ab3, ab4);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought8.getInstance(ao2, ao3, ao4, fo0);
if(fo1 != null){
      fb0 = fo1.m2(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      fd1 = ao1.m3();
}
    Output.points[7][8] -= fd0;
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0);
}
    double ld1 = 651.6511797114472;
    fd0 *= -1;
    Thought lo2 = Thought34.getInstance(fb1, fb0, fb1, fb0);
    fb1 = !fb0;
    fb1 = fb0 || fb1;
if(ao4 != null){
      fb0 = ao4.m2(fo0, fo1, ao1, ao2, fd1, ld1, fd0, fd1);
}
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, ld1, fd0, fd1, ld1, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 > fd1;
    fb1 = fb0 && fb1;
    fb0 = ld1 > fd0;
    Output.points[8][0] -= fd1;
    ld1 = fd0 + fd1;
    Thought lo3 = Thought25.getInstance(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
    fb1 = ld1 < fd0;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    fd1 = ld1 + fd0;
    fd1 = ld1 - fd0;
    if (fb0) {
        fb1 = !fb0;
        boolean lb4 = true;
        boolean lb5 = true;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 330.49648777451677;
    fb0 = !fb1;
if(ao2 != null){
      ld0 = ao2.m3(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    Thought lo1 = Thought89.getInstance();
    Output.points[8][1] += fd0;
    fb0 = !fb1;
if(ao3 != null){
      fb0 = ao3.m2(fd1, ld0, ad1, ad2);
}
if(fo0 != null){
      ao4 = fo0.m4(fb1, fb0, fb1, fb0);
}
    if (fb1) {
        Output.points[8][2] -= ad3;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ld0);
}
        ad1 *= -1;
        boolean lb2 = true;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, lb2, fb0, fb1, lb2);
}
        boolean lb3 = true;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, lb3, fb0, fb1, lb2);
}
        Thought lo4 = Thought62.getInstance(fo1, ao1, ao2, ao3);
        Output.points[8][3] += fd1;
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
if(ao2 != null){
      ab1 = ao2.m2(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    boolean lb0 = true;
if(ao3 != null){
      ao3.m3();
}
    fd0 = fd1 - fd0;
if(fo0 != null){
      ao4 = fo0.m4(fd1, fd0, fd1, fd0);
}
    fb0 = fd1 < fd0;
    fb1 = fd1 < fd0;
    double ld1 = 563.1717662455609;
    Output.points[8][4] += fd0;
if(fo1 != null){
      lb0 = fo1.m2(ab1, ab2, ab3, ab4);
}
    double ld2 = 676.0765392493323;
    fb0 = !fb1;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, ld1, ld2, fd0);
}
    fd1 = ld1 - ld2;
    double ld3 = 420.44026451581027;
if(fo1 != null){
      lb0 = fo1.m2(ao1, ao2, ao3, ao4, ld3, fd0, fd1, ld1, ab1, ab2, ab3, ab4);
}
    Output.points[8][5] -= ld2;
    fb0 = fb1 || lb0;
    ld3 = fd0 - fd1;
    Output.points[8][6] += ld1;
if(fo0 != null){
      ab1 = fo0.m2(fo1, ao1, ao2, ao3, ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      ld2 = ao4.m3(fo0, fo1, ao1, ao2);
}
    boolean lb4 = false;
    double ld5 = 318.8394025489336;
    fb0 = !fb1;
if(ao4 != null){
      ao3 = ao4.m4(ld3, ld5, fd0, fd1, lb0, lb4, ab1, ab2);
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
        Output.points[8][7] += ad1;
    Output.points[8][8] -= ad2;
    ab2 = ab3 && ab4;
    boolean lb0 = true;
if(ao1 != null){
      ao1.m2();
}
    ab4 = fb0 && fb1;
    lb0 = ad3 > ad4;
    ab1 = ab2 && ab3;
    fd0 = fd1 + ad1;
    Output.points[0][0] -= ad2;
    ad3 *= -1;

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
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought77.getInstance(fb1, fb0, fb1, fb0);
    fd1 *= -1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fb1 = fb0 || fb1;
    Thought lo1 = Thought66.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
    fb0 = fd0 > fd1;
    fb1 = fd0 < fd1;
    boolean lb2 = false;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb2, fb0, fb1, lb2);
}
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        boolean lb3 = false;
        lb2 = fd1 > fd0;
if(fo1 != null){
          fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb0, fb1, lb3, lb2);
}
        fd1 = fd0 - fd1;
        fb0 = fb1 || lb3;
if(fo0 != null){
          fo0.m1();
}
        lb2 = fd0 < fd1;
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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
    boolean lb0 = false;
    boolean lb1 = false;
    lb0 = fd0 > fd1;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(lb1, ab1, ab2, ab3);
}
    Output.points[0][1] -= fd1;
    ab4 = fd0 < fd1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, lb0, lb1, ab1);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    boolean lb2 = false;
    boolean lb3 = false;
    ab4 = fd1 < fd0;
    fb0 = fb1 || lb0;
    Output.points[0][2] += fd1;
if(fo0 != null){
      lb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fd0 *= -1;
    double ld4 = 701.2402295464286;
if(fo1 != null){
      fd0 = fo1.m3(fd1, ld4, fd0, fd1, lb2, lb3, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    ab3 = ld4 > fd0;
    if (ab4) {
if(fo0 != null){
          fo0.m1(fd1, ld4, fd0, fd1);
}
}
Thought.STACK_COUNTER++;
return ld4;
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
    fb0 = ad2 > ad3;
    double ld0 = 411.3531591735979;
    ad3 = ad4 + fd0;
    fb1 = fd1 > ld0;
    ad1 *= -1;
    boolean lb1 = true;
    lb1 = ad2 > ad3;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb1, fb0);
}
    double ld2 = 816.601879358209;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    ld0 = ld2 - ad1;
    fb1 = ad2 > ad3;
    ad4 *= -1;
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, ld2, ad1, lb1, fb0, fb1, lb1);
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 *= -1;
    ab2 = ad2 > ad3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    ab1 = ad4 > fd0;
    double ld0 = 815.3469627762189;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Thought lo1 = Thought77.getInstance(fd0, fd1, ld0, ad1, ab2, ab3, ab4, fb0);
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb1 = !ab1;
    ad2 = ad3 + ad4;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, ad1);
}
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
    fb1 = ab1 && ab2;
    boolean lb2 = true;
    ab2 = ad2 > ad3;
    ad4 *= -1;
    ab3 = fd0 < fd1;
        boolean lb3 = true;
    ab3 = ld0 < ad1;
    double ld4 = 52.33861511738211;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    ab4 = fb0 || fb1;
    fd0 = fd1 - ld0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ld4, ad1, ad2, ad3, lb2, lb3, ab1, ab2);
}
    Output.points[0][3] -= ad4;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    lb2 = fd1 < ld0;

Thought.STACK_COUNTER++;
return ld4;
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
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ao1.m1(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
    Output.points[0][4] -= fd0;
if(ao3 != null){
      ao2 = ao3.m4();
}
    fb1 = fb0 && fb1;
    fd1 *= -1;
    double ld0 = 544.9213710633139;
if(ao4 != null){
      ld0 = ao4.m3(fd0, fd1, ld0, fd0);
}
    boolean lb1 = true;

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
    ad1 = ad2 + ad3;
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    fb1 = !fb0;
    ad4 = fd0 + fd1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4);
}
    double ld0 = 377.9981507379514;
if(ao3 != null){
      ad4 = ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, ld0, ad1, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
          fb1 = ao2.m2(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
    double ld1 = 452.41898871219047;
if(ao1 != null){
      ad1 = ao1.m3(ao2, ao3, ao4, fo0);
}
    double ld2 = 810.8135984847193;
    boolean lb3 = true;
    lb3 = ad1 > ad2;
if(fo1 != null){
      fb0 = fo1.m2(ad3, ad4, fd0, fd1, fb1, lb3, fb0, fb1);
}
    lb3 = !fb0;
    fb1 = lb3 || fb0;

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
    ab1 = ab2 && ab3;
    ab4 = fd1 < fd0;
    fb0 = fb1 || ab1;
    boolean lb0 = true;
    ab1 = !ab2;
    boolean lb1 = true;
    fd1 = fd0 + fd1;
    ab2 = fd0 < fd1;
if(ao1 != null){
      fd0 = ao1.m3();
}
    ab3 = !ab4;
    Output.points[0][5] -= fd1;
if(ao2 != null){
      fb0 = ao2.m2(fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    Thought lo2 = Thought16.getInstance(fb1, lb0, lb1, ab1);
    ab2 = !ab3;
    boolean lb3 = true;
    Thought lo4 = Thought97.getInstance(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
    double ld5 = 123.36407608204921;
    boolean lb6 = false;
    if (ab2) {
        ab3 = ab4 || fb0;
if(ao1 != null){
          fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, ld5, fd0, fd1, fb1, lb0, lb1, lb3);
}
        lb6 = ld5 > fd0;
        double ld7 = 307.3787616180644;
        fd0 *= -1;
if(fo1 != null){
          ab1 = fo1.m2(ao1, ao2, ao3, ao4, ab2, ab3, ab4, fb0);
}
        fd1 *= -1;
        double ld8 = 834.1328209536288;
}
Thought.STACK_COUNTER++;
return ld5;
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
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(ad4, fd0, fd1, ad1, ab3, ab4, fb0, fb1);
}
    ab1 = !ab2;
if(ao2 != null){
      ao2.m3();
}
if(ao4 != null){
      ao3 = ao4.m4(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo0.m3(ab3, ab4, fb0, fb1);
}
    Output.points[0][6] += fd1;
    ad1 = ad2 - ad3;
    ab1 = !ab2;
    ab3 = ab4 && fb0;
    fb1 = ad4 < fd0;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, ad1, ad2, ad3);
}
if(fo1 != null){
      ab1 = fo1.m2(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ad1, ab2, ab3, ab4, fb0);
}
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb0, fb1, lb0, ab1);
}
if(fo0 != null){
      ad2 = fo0.m3(fo1, ao1, ao2, ao3);
}
    ad3 = ad4 + fd0;

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
    fd0 *= -1;
    Thought lo0 = Thought91.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
if(fo1 != null){
      fd1 = fo1.m3();
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3(fb0, fb1, fb0, fb1);
}
    fb0 = fd0 > fd1;
    Thought lo1 = Thought54.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
    Thought lo2 = Thought64.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
    Output.points[0][7] += fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    if (fb1) {
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0);
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
if(fo0 != null){
      ab1 = fo0.m2(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = fd1 > fd0;
if(fo1 != null){
      fo1.m1();
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
    fb0 = fd1 > fd0;
    fb1 = fd1 > fd0;
    ab1 = ab2 || ab3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought71.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
    fd1 *= -1;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fd1 = fd0 - fd1;
    fd0 *= -1;
    fb1 = fd1 < fd0;

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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Output.points[0][8] += ad2;
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fo1.m3(fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought44.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    ad1 = ad2 - ad3;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb1 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
    boolean lb1 = false;
    ad2 = ad3 + ad4;
    fd0 = fd1 - ad1;
    ad2 = ad3 - ad4;
    fd0 = fd1 + ad1;
    boolean lb2 = false;
    if (lb1) {
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
    ab2 = ab3 || ab4;
    ad2 *= -1;
    fb0 = fb1 && ab1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    ad3 = ad4 + fd0;
if(fo1 != null){
      fo1.m3(fd1, ad1, ad2, ad3);
}
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
    double ld0 = 253.9658081061368;
    Thought lo1 = Thought34.getInstance(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
    fb1 = ab1 && ab2;
    ab3 = !ab4;
        fb0 = !fb1;
    boolean lb2 = false;
    Output.points[1][0] += ld0;
    lb2 = !ab1;
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    Thought lo3 = Thought20.getInstance(fo1, fo0, fo1, fo0, fb1, lb2, ab1, ab2);
    fd1 = ld0 + ad1;
    Thought lo4 = Thought85.getInstance(fo1, fo0, fo1, fo0);
    Thought lo5 = Thought62.getInstance(ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
    Thought lo6 = Thought46.getInstance();
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld0, ad1, ad2);
}
if(fo1 != null){
      fo1.m2(lb2, ab1, ab2, ab3);
}
    ab4 = !fb0;

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
    Thought lo0 = Thought32.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
    Thought lo1 = Thought30.getInstance(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
    fb0 = fd1 > fd0;
    fb1 = fd1 < fd0;
    boolean lb2 = false;
    lb2 = fb0 && fb1;
        Output.points[1][1] -= fd1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, lb2, fb0, fb1, lb2);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb2, fb0);
}
    double ld3 = 392.055670237606;
    fb1 = !lb2;
if(ao1 != null){
      fo1 = ao1.m4();
}
if(ao3 != null){
      ao2 = ao3.m4(ld3, fd0, fd1, ld3);
}
    fd0 = fd1 + ld3;
    fb0 = fd0 > fd1;
    fb1 = lb2 || fb0;
if(fo0 != null){
      ao4 = fo0.m4(fb1, lb2, fb0, fb1);
}
    double ld4 = 544.8254609635674;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ld3, ld4, fd0, fd1);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ld3, ld4, fd0, fd1, lb2, fb0, fb1, lb2);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb0, fb1, lb2, fb0);
}
    fb1 = lb2 || fb0;
    fb1 = lb2 || fb0;
        ld3 *= -1;
    ld4 *= -1;
    fb1 = !lb2;

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
      ad1 = ao1.m3(ao2, ao3, ao4, fo0);
}
    ad2 *= -1;
if(ao1 != null){
      fo1 = ao1.m4(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
if(ao3 != null){
      ao2 = ao3.m4();
}
    boolean lb0 = false;
    fb0 = !fb1;
    ad1 = ad2 - ad3;
    lb0 = fb0 && fb1;
    lb0 = fb0 && fb1;
    boolean lb1 = false;
    lb0 = lb1 || fb0;
    fb1 = ad4 > fd0;
    lb0 = lb1 && fb0;
if(fo0 != null){
      ao4 = fo0.m4(fd1, ad1, ad2, ad3);
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
if(ao1 != null){
      ab2 = ao1.m2(ab3, ab4, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      ab1 = ao2.m2(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    double ld0 = 88.87451280655132;
    Thought lo1 = Thought97.getInstance(ao1, ao2, ao3, ao4, fb1, ab1, ab2, ab3);
    ab4 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    Output.points[1][2] += ld0;
    fd0 = fd1 + ld0;
    fd0 = fd1 - ld0;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, fd0, fb0, fb1, ab1, ab2);
}
    fd1 *= -1;
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao4 != null){
      ao3 = ao4.m4(ld0, fd0, fd1, ld0);
}
    ab3 = fd0 > fd1;
    ab4 = !fb0;
if(fo0 != null){
      ld0 = fo0.m3(fb1, ab1, ab2, ab3);
}
    double ld2 = 869.8289066060217;
    ld2 *= -1;
    Thought lo3 = Thought56.getInstance(fo1, ao1, ao2, ao3, fd0, fd1, ld0, ld2);
    for(int i0=0; i0<10; i0++){
if(ao4 != null){
          ao4.m1(fo0, fo1, ao1, ao2, fd0, fd1, ld0, ld2, ab4, fb0, fb1, ab1);
}
if(ao3 != null){
          ab2 = ao3.m2(ao4, fo0, fo1, ao1, ab3, ab4, fb0, fb1);
}
if(ao2 != null){
          ao2.m1(ao3, ao4, fo0, fo1);
}
        for(int i1=0; i1<10; i1++){
            double ld4 = 323.64519579477417;
if(ao1 != null){
              ao1.m1(ld2, fd0, fd1, ld4, ab1, ab2, ab3, ab4);
}
            Thought lo5 = Thought94.getInstance();
            fb0 = fb1 || ab1;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[1][3] -= ad2;
if(ao2 != null){
      ao1 = ao2.m4(ad3, ad4, fd0, fd1);
}
    Thought lo0 = Thought74.getInstance(ab2, ab3, ab4, fb0);
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3, fb1, ab1, ab2, ab3);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab4, fb0, fb1, ab1);
}
    Output.points[1][4] -= ad4;
    ab2 = fd0 < fd1;
    ad1 = ad2 - ad3;
    boolean lb1 = true;
    ab2 = ab3 && ab4;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0);
}
    ad4 *= -1;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, ad1, ad2, fb0, fb1, lb1, ab1);
}
    Thought lo2 = Thought84.getInstance();
    Output.points[1][5] += ad3;
    ab2 = ab3 || ab4;
    fb0 = !fb1;
    ad4 = fd0 + fd1;
    ad1 *= -1;
    ad2 = ad3 + ad4;
    fd0 = fd1 + ad1;
    boolean lb3 = false;
if(ao2 != null){
      ad2 = ao2.m3(ad3, ad4, fd0, fd1);
}
    Thought lo4 = Thought90.getInstance(lb1, lb3, ab1, ab2);
if(ao3 != null){
      ab3 = ao3.m2(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
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
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    Thought lo0 = Thought81.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fd0 = fo1.m3();
}
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo0.m1(fd0, fd1, fd0, fd1);
}
    fb1 = !fb0;
    fb1 = fd0 > fd1;
    Thought lo1 = Thought38.getInstance(fb0, fb1, fb0, fb1);
    fb0 = !fb1;
    fb0 = fd0 > fd1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    double ld2 = 345.8466077310051;
    fd0 = fd1 + ld2;
    boolean lb3 = true;

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
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought20.getInstance(fo0, fo1, fo0, fo1);
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo0.m3(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
    boolean lb1 = false;
    fb0 = fd0 > fd1;
if(fo1 != null){
      fb1 = fo1.m2();
}
    lb1 = fd0 > fd1;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    fb0 = fd1 > fd0;
if(fo0 != null){
      fd1 = fo0.m3(fb1, lb1, fb0, fb1);
}
    lb1 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    lb1 = fb0 && fb1;
    lb1 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb1);
}
    fb0 = !fb1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb1);
}
    fd1 = fd0 + fd1;
    fb0 = fd0 < fd1;

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
    double ld0 = 376.21063296546475;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb0 = ld0 > fd0;
if(fo0 != null){
      fd1 = fo0.m3(ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    double ld1 = 500.39041662955196;
    Thought lo2 = Thought92.getInstance();
if(fo1 != null){
      ld1 = fo1.m3(fd0, fd1, ld0, ld1);
}
    Output.points[1][6] += fd0;
if(fo0 != null){
      fb1 = fo0.m2(fb0, fb1, fb0, fb1);
}
    fb0 = fd1 < ld0;
    ld1 = fd0 + fd1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ld0, ld1, fd0, fd1);
}
    double ld3 = 289.2229718466328;

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
