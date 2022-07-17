package genetic;
import java.util.ArrayList;
class Thought32 extends Thought{
private static ArrayList<Thought32> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 652.5218986015246;
private double fd1 = 459.55964424825265;
private Thought fo0 = null;
private Thought fo1 = null;
Thought32 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought32 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought32 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought32 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought32 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought32 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought32 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought32 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought32 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought32 instance = new Thought32 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought32 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought32 instance = new Thought32 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought32 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought32 instance = new Thought32 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought32 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought32 instance = new Thought32 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought32 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought32 instance = new Thought32 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought32 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought32 instance = new Thought32 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought32 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought32 instance = new Thought32 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought32 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought32 instance = new Thought32 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fd0 *= -1;
    boolean lb0 = false;
if(fo1 != null){
      fb0 = fo1.m2(fb1, lb0, fb0, fb1);
}
    Thought lo1 = Thought369.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      lb0 = fo0.m2(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    boolean lb2 = false;
    Output.points[2][3] -= fd1;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, lb2, fb0, fb1, lb0);
}
    lb2 = fb0 && fb1;
    double ld3 = 259.33871141760653;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb0, lb2, fb0, fb1);
}
    Thought lo4 = Thought104.getInstance();
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld3, fd0, lb2, fb0, fb1, lb0);
}
    lb2 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(lb0, lb2, fb0, fb1);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
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
    ab1 = !ab2;
    ab3 = fd0 < fd1;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
    Output.points[2][4] -= fd1;
    boolean lb0 = false;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    double ld1 = 787.933077737;
if(fo0 != null){
      fo0.m1(ld1, fd0, fd1, ld1, ab3, ab4, fb0, fb1);
}
    lb0 = !ab1;
    ab2 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
    ld1 *= -1;
    fd0 = fd1 + ld1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    Thought lo2 = Thought288.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0, lb0, ab1, ab2, ab3);
    boolean lb3 = false;
    boolean lb4 = true;
    fd1 = ld1 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
    Output.points[2][5] += fd1;
    ld1 = fd0 - fd1;
    fb1 = lb0 && lb3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    lb4 = ab1 || ab2;
if(fo0 != null){
      fo1 = fo0.m4(ld1, fd0, fd1, ld1);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1);
}
    ab3 = !ab4;

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
        double ld0 = 316.3866528345292;
    fb1 = !fb0;
    Thought lo1 = Thought127.getInstance(ld0, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
    ad4 = fd0 + fd1;
    ld0 = ad1 + ad2;
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    boolean lb2 = true;
    lb2 = fb0 || fb1;
    lb2 = fb0 && fb1;
    Thought lo3 = Thought152.getInstance();
    lb2 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, lb2, fb0, fb1, lb2);
}
    ld0 = ad1 + ad2;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb2, fb0);
}
    fb1 = ad3 < ad4;
    if (lb2) {
        boolean lb4 = false;
        Output.points[2][6] -= fd0;
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
          fo0.m2(fd1, ld0, ad1, ad2);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
        double ld5 = 355.79330177630635;
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
    ab2 = !ab3;
    ab4 = fb0 || fb1;
    ad1 = ad2 - ad3;
    ab1 = ab2 && ab3;
if(fo1 != null){
      ab4 = fo1.m2(ad4, fd0, fd1, ad1, fb0, fb1, ab1, ab2);
}
    ad2 = ad3 - ad4;
if(fo0 != null){
      ab3 = fo0.m2(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    ab2 = !ab3;
if(fo1 != null){
          fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, ab4, fb0, fb1, ab1);
}
    ad4 = fd0 + fd1;
    ad1 = ad2 - ad3;
    boolean lb0 = true;
    Thought lo1 = Thought385.getInstance(ab1, ab2, ab3, ab4);
    Thought lo2 = Thought371.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
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
if(ao2 != null){
      ao2.m2(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fd1 = fd0 - fd1;
    Output.points[2][7] -= fd0;
    fb1 = fb0 && fb1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
if(ao4 != null){
      ao3 = ao4.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    Thought lo1 = Thought25.getInstance(fb0, fb1, lb0, fb0);
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    Thought lo2 = Thought127.getInstance(fd1, fd0, fd1, fd0);
    fb1 = !lb0;

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
    Thought lo0 = Thought215.getInstance(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0);
    fd1 = ad1 - ad2;
    fb1 = ad3 > ad4;
    boolean lb1 = false;
    lb1 = fb0 && fb1;
    Output.points[2][8] += fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ad1, ad2, ad3, lb1, fb0, fb1, lb1);
}
    fb0 = fb1 || lb1;
if(ao1 != null){
      ad4 = ao1.m3(ao2, ao3, ao4, fo0, fb0, fb1, lb1, fb0);
}
if(ao1 != null){
      fo1 = ao1.m4();
}
    fb1 = fd0 > fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, lb1, fb0, fb1, lb1);
}
    Thought lo2 = Thought172.getInstance(fb0, fb1, lb1, fb0);
    fd0 = fd1 + ad1;
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1);
}
    lb1 = ad2 < ad3;
    fb0 = ad4 > fd0;
    fd1 = ad1 - ad2;
    boolean lb3 = true;
    fb0 = ad3 < ad4;
    double ld4 = 535.142911341968;
if(ao1 != null){
      ao1.m3(ad4, fd0, fd1, ld4);
}
    fb1 = ad1 > ad2;
if(ao2 != null){
      lb1 = ao2.m2(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
}
    Thought lo5 = Thought233.getInstance(ld4, ad1, ad2, ad3, lb3, fb0, fb1, lb1);
    lb3 = ad4 < fd0;
    fb0 = !fb1;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, lb1, lb3, fb0, fb1);
}
    double ld6 = 252.89730384044026;

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
      ao2 = ao3.m4();
}
    boolean lb0 = true;
    lb0 = ab1 || ab2;
    if (ab3) {
        fd0 *= -1;
        ab4 = !fb0;
        Output.points[3][0] += fd1;
        fb1 = fd0 < fd1;
if(ao4 != null){
          lb0 = ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
        fb0 = fb1 && lb0;
if(ao4 != null){
          ao3 = ao4.m4(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
          fd0 = fo0.m3(fo1, ao1, ao2, ao3);
}
        fb0 = fb1 && lb0;
        ab1 = ab2 || ab3;
if(ao4 != null){
          ao4.m2(fd1, fd0, fd1, fd0);
}
        fd1 *= -1;
        fd0 = fd1 - fd0;
        fd1 *= -1;
        } else if (ab4) {
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
    fd0 = fd1 + ad1;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fb0, fb1, lb0, ab1);
}
    Thought lo1 = Thought353.getInstance();
    ad2 = ad3 - ad4;
    Thought lo2 = Thought61.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
    boolean lb3 = false;
    fb0 = fb1 && lb0;
    boolean lb4 = true;
    boolean lb5 = false;
if(ao1 != null){
      fo1 = ao1.m4(lb3, lb4, lb5, ab1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
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
    fb1 = fd0 > fd1;
if(fo1 != null){
      fo1.m1(fd0, fd1, fd0, fd1);
}
    fb0 = fd0 > fd1;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fb0 = fo1.m2(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fd0 *= -1;
    fd1 = fd0 + fd1;
    double ld0 = 760.1496074282155;
    Output.points[3][1] += ld0;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m3();
}
    fb0 = fd0 > fd1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    Thought lo1 = Thought50.getInstance(fb1, fb0, fb1, fb0);
    Thought lo2 = Thought98.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      fo1.m2(fd0, fd1, ld0, fd0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
}
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = ld0 - fd0;
    Thought lo3 = Thought96.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
    Output.points[3][2] -= fd1;

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
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo1 = fo0.m4();
}
    double ld0 = 535.0263779322547;
    ab2 = ab3 && ab4;
    fb0 = fb1 && ab1;
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1, ab2, ab3, ab4, fb0);
}
    boolean lb1 = true;
    boolean lb2 = false;
    Output.points[3][3] += ld0;
if(fo1 != null){
      ab4 = fo1.m2(fb0, fb1, lb1, lb2);
}
    ab1 = !ab2;
    ab3 = fd0 < fd1;
if(fo0 != null){
      ld0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    ab4 = fb0 && fb1;
if(fo1 != null){
      fo1.m2(fd0, fd1, ld0, fd0);
}
    lb1 = lb2 && ab1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1);
}
if(fo1 != null){
      fo1.m2(ld0, fd0, fd1, ld0, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb1, lb1, lb2, ab1);
}
        Thought lo3 = Thought302.getInstance();
    boolean lb4 = true;

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
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    fd1 = ad1 - ad2;
    fb0 = ad3 < ad4;
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    fd0 *= -1;
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb0 = fb1 || lb0;
if(fo0 != null){
      fo0.m3(fd1, ad1, ad2, ad3);
}
    fb0 = !fb1;
    ad4 *= -1;
    lb0 = fd0 < fd1;
    fb0 = fb1 && lb0;
    fb0 = fb1 && lb0;
    Output.points[3][4] += ad1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    boolean lb1 = false;
if(fo1 != null){
      fo1.m3(fd1, ad1, ad2, ad3, lb1, fb0, fb1, lb0);
}
    lb1 = !fb0;
    ad4 = fd0 - fd1;
    ad1 *= -1;
    fb1 = !lb0;
    Output.points[3][5] -= ad2;
    ad3 *= -1;
    boolean lb2 = true;
    lb1 = ad4 > fd0;
    double ld3 = 410.52803488352663;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, lb2, fb0, fb1, lb0);
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
    ab1 = !ab2;
    ab3 = ad1 < ad2;
    ab4 = fb0 || fb1;
    ad3 *= -1;
    ad4 *= -1;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
    boolean lb0 = true;
    fb0 = ad3 > ad4;
    boolean lb1 = true;
    fb0 = fb1 || lb0;
    lb1 = ab1 || ab2;
    ab3 = fd0 < fd1;
    ad1 *= -1;
    Thought lo2 = Thought179.getInstance(ab4, fb0, fb1, lb0);
    Thought lo3 = Thought256.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      ad2 = fo0.m3(ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    Output.points[3][6] += fd1;
    lb1 = ab1 || ab2;

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
    fb1 = !fb0;
    fb1 = fb0 && fb1;
    if (fb0) {
        boolean lb0 = false;
        fd0 = fd1 - fd0;
        fb0 = fd1 > fd0;
        fd1 = fd0 + fd1;
if(ao1 != null){
          fb1 = ao1.m2(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
        double ld1 = 605.3195717689018;
        fb0 = ld1 < fd0;
        fb1 = fd1 < ld1;
        fd0 = fd1 - ld1;
if(ao2 != null){
          fd0 = ao2.m3(ao3, ao4, fo0, fo1, lb0, fb0, fb1, lb0);
}
        fb0 = fd1 < ld1;
        fd0 = fd1 - ld1;
if(ao1 != null){
          ao1.m2();
}
if(ao2 != null){
          fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, ld1, fd0, fd1, fb1, lb0, fb0, fb1);
}
        lb0 = ld1 < fd0;
        fd1 *= -1;
        fb0 = fb1 && lb0;
if(ao2 != null){
          ao1 = ao2.m4(fb0, fb1, lb0, fb0);
}
        boolean lb2 = true;
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
if(ao1 != null){
      ad1 = ao1.m3(ao2, ao3, ao4, fo0);
}
    ad2 = ad3 + ad4;
    fb1 = fb0 || fb1;
    fb0 = fd0 < fd1;
    fb1 = ad1 < ad2;
    Thought lo0 = Thought260.getInstance(ad3, ad4, fd0, fd1);
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4);
}
    fb0 = !fb1;
    fd0 *= -1;
    fb0 = fd1 > ad1;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    Thought lo1 = Thought209.getInstance(ao1, ao2, ao3, ao4, fb1, fb0, fb1, fb0);
    fb1 = !fb0;
if(fo0 != null){
      fb1 = fo0.m2();
}
    Thought lo2 = Thought31.getInstance(fo1, ao1, ao2, ao3, fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
    Thought lo3 = Thought264.getInstance(fb0, fb1, fb0, fb1);
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
      ao4.m2(ad4, fd0, fd1, ad1);
}
    double ld4 = 760.2114621868158;

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
    Thought lo0 = Thought30.getInstance(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo0.m1(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(ao1, ao2, ao3, ao4, ab1, ab2, ab3, ab4);
}
        for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4();
}
        fb0 = !fb1;
        boolean lb1 = true;
        Thought lo2 = Thought99.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, lb1, ab1, ab2, ab3);
        boolean lb3 = true;
        fd0 = fd1 - fd0;
        fd1 = fd0 - fd1;
        boolean lb4 = false;
        if (ab2) {
if(fo0 != null){
              ab3 = fo0.m2(ab4, fb0, fb1, lb1);
}
}}
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
    Thought lo0 = Thought9.getInstance(ao2, ao3, ao4, fo0);
if(fo1 != null){
      ab1 = fo1.m2(ad1, ad2, ad3, ad4);
}
    double ld1 = 376.548467697695;
    ab2 = ad4 < fd0;
    Thought lo2 = Thought114.getInstance(ao1, ao2, ao3, ao4, fd1, ld1, ad1, ad2);
    ab3 = !ab4;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1, fb0, fb1, ab1, ab2);
}
    ld1 *= -1;
    ab3 = !ab4;
    ad1 *= -1;
    boolean lb3 = false;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab4, fb0, fb1, lb3);
}
    ab1 = ab2 && ab3;
    ab4 = fb0 && fb1;
    lb3 = !ab1;
    ad2 = ad3 + ad4;
    fd0 *= -1;

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
if(fo0 != null){
      fd0 = fo0.m3();
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 > fd1;
    double ld0 = 610.4339066339442;
    fb0 = !fb1;
    ld0 *= -1;
    double ld1 = 704.9246741347645;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    boolean lb2 = true;
        lb2 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    lb2 = ld1 > fd0;
if(fo0 != null){
      fb0 = fo0.m2(fd1, ld0, ld1, fd0);
}
    boolean lb3 = false;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, ld0, ld1, fd0);
}
    fb0 = fd1 > ld0;
if(fo0 != null){
      ld1 = fo0.m3(fd0, fd1, ld0, ld1, fb1, lb2, lb3, fb0);
}
    fd0 *= -1;

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
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 && ab2;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd1 = fd0 - fd1;
    fd0 *= -1;
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    ab1 = fd0 > fd1;
    ab2 = ab3 && ab4;
    fd0 = fd1 - fd0;
    double ld0 = 91.34428418183586;
    boolean lb1 = false;
    fd0 = fd1 + ld0;
if(fo0 != null){
      fo1 = fo0.m4(ab4, fb0, fb1, lb1);
}
    ab1 = ab2 || ab3;
    Thought lo2 = Thought262.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, fd0);
}
    ab4 = !fb0;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1);
}
    ld0 *= -1;
    fb1 = fd0 > fd1;
    lb1 = !ab1;
    ld0 = fd0 + fd1;
    ab2 = ld0 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld0, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      lb1 = fo0.m2(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    Output.points[3][7] -= ld0;
    boolean lb3 = false;

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
        boolean lb0 = true;
if(fo1 != null){
      fo1.m1();
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb1, lb0, fb0, fb1);
}
    boolean lb1 = false;
if(fo1 != null){
      fd0 = fo1.m3(lb0, lb1, fb0, fb1);
}
    fd1 = ad1 + ad2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    lb0 = ad3 > ad4;
if(fo0 != null){
      lb1 = fo0.m2(fd0, fd1, ad1, ad2);
}
    double ld2 = 840.0347655875377;
    ad2 = ad3 + ad4;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld2, ad1);
}
if(fo0 != null){
      ad2 = fo0.m3(ad3, ad4, fd0, fd1, fb1, lb0, lb1, fb0);
}

Thought.STACK_COUNTER++;
return ld2;
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
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      ad2 = fo1.m3();
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb1, ab1, ab2, ab3);
}
    ad1 = ad2 + ad3;
if(fo0 != null){
      fo1 = fo0.m4(ab4, fb0, fb1, ab1);
}
    ad4 = fd0 + fd1;
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    double ld0 = 772.7326613272779;
    ad1 = ad2 - ad3;
    ab2 = !ab3;
    ab4 = fb0 && fb1;
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ld0);
}
    ad1 = ad2 - ad3;
    lb1 = ad4 > fd0;
    fd1 = ld0 - ad1;
    ab1 = ab2 && ab3;
    ab4 = !fb0;
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
    ld0 *= -1;
    Output.points[3][8] += ad1;
    ad2 = ad3 + ad4;
    fb1 = lb1 || ab1;

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
        fb0 = fb1 || fb0;
    boolean lb0 = true;
    fb0 = fd0 < fd1;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2, lb0, fb0, fb1, lb0);
}
    fd1 = fd0 - fd1;
if(ao4 != null){
      ao3 = ao4.m4();
}
    fb0 = fd0 < fd1;
if(fo0 != null){
      fb1 = fo0.m2(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fb0, fb1, lb0, fb0);
}
    Thought lo1 = Thought42.getInstance(fo1, ao1, ao2, ao3);
    double ld2 = 55.63394828604187;
    Thought lo3 = Thought241.getInstance(ld2, fd0, fd1, ld2);
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ld2, fd0);
}
    fd1 = ld2 + fd0;
    fd1 = ld2 + fd0;
    fd1 = ld2 + fd0;
    boolean lb4 = false;
    Output.points[4][0] += fd1;
    if (fb0) {
        Thought lo5 = Thought137.getInstance(ld2, fd0, fd1, ld2, fb1, lb0, lb4, fb0);
        fb1 = lb0 || lb4;
        boolean lb6 = true;
if(ao4 != null){
          fd0 = ao4.m3(fo0, fo1, ao1, ao2, lb4, fb0, fb1, lb6);
}
if(ao4 != null){
          ao3 = ao4.m4();
}
        lb0 = fd1 < ld2;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      fo1 = ao1.m4(fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1);
}
    Thought lo0 = Thought102.getInstance(fd1, ad1, ad2, ad3);
    ad4 = fd0 - fd1;
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
}
    Thought lo1 = Thought399.getInstance(fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
    boolean lb2 = true;
    lb2 = fb0 && fb1;
    Thought lo3 = Thought301.getInstance(fo1, ao1, ao2, ao3, lb2, fb0, fb1, lb2);
    fb0 = fb1 && lb2;

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
    fd1 *= -1;
if(ao2 != null){
      ab2 = ao2.m2();
}
    boolean lb0 = false;
    ab2 = fd0 > fd1;
        ab3 = ab4 && fb0;
    fd0 = fd1 - fd0;
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, lb0, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
    lb0 = !ab1;
    ab2 = fd1 < fd0;
    ab3 = fd1 < fd0;
if(ao3 != null){
      ao2 = ao3.m4(ab4, fb0, fb1, lb0);
}
    boolean lb1 = true;
    Output.points[4][1] += fd1;
    boolean lb2 = false;
    fd0 *= -1;
    fd1 = fd0 + fd1;
    boolean lb3 = false;
    lb1 = lb2 || lb3;
    ab1 = ab2 && ab3;
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2);
}
    ab4 = fb0 && fb1;

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
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4);
}
    boolean lb0 = true;
    fd0 = fd1 + ad1;
    ad2 = ad3 + ad4;
    boolean lb1 = true;
    fd0 = fd1 + ad1;
    for(int i0=0; i0<10; i0++){
        boolean lb2 = true;
        Output.points[4][2] -= ad2;
        lb2 = ad3 < ad4;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2);
}
if(ao3 != null){
          ao3.m1(ad3, ad4, fd0, fd1, lb0, lb1, ab1, ab2);
}
        Thought lo3 = Thought54.getInstance(ao4, fo0, fo1, ao1, ab3, ab4, fb0, fb1);
        ad1 = ad2 - ad3;
if(ao3 != null){
          ao2 = ao3.m4();
}
        lb2 = lb0 && lb1;
if(ao4 != null){
          ad4 = ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
}
        double ld4 = 450.6151910192764;
        ad2 = ad3 + ad4;
if(ao4 != null){
          ao3 = ao4.m4(fb0, fb1, lb2, lb0);
}
        lb1 = fd0 < fd1;
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd1 *= -1;
    fd0 = fd1 + fd0;
    fb1 = fd1 < fd0;
    fb0 = fd1 > fd0;
    fb1 = fb0 || fb1;
    double ld0 = 832.906225230461;
    fb0 = fd0 < fd1;
    ld0 *= -1;
if(fo0 != null){
      fo0.m3(fd0, fd1, ld0, fd0);
}
    double ld1 = 281.2778831641561;
    Thought lo2 = Thought275.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld1);
    fb1 = !fb0;
    fd0 = fd1 + ld0;
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(ld1, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      ld1 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fb0 = fo0.m2();
}
    Thought lo3 = Thought26.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld1, fb1, fb0, fb1, fb0);
    fb1 = fb0 || fb1;
    double ld4 = 411.1966983484995;
if(fo1 != null){
      ld4 = fo1.m3(fb0, fb1, fb0, fb1);
}
    fb0 = fd0 > fd1;
    fb1 = !fb0;
    Thought lo5 = Thought91.getInstance(fo0, fo1, fo0, fo1);

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
    boolean lb0 = false;
    Thought lo1 = Thought88.getInstance(fd0, fd1, fd0, fd1);
    ab1 = ab2 || ab3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb0);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb2 = true;
        ab4 = fd0 > fd1;
    fd0 *= -1;
    Thought lo3 = Thought112.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb2);
    ab1 = fd1 > fd0;
    ab2 = fd1 < fd0;

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
    double ld0 = 509.40624492728165;
if(fo1 != null){
      fb0 = fo1.m2(fb1, fb0, fb1, fb0);
}
    double ld1 = 111.46395860376707;
if(fo0 != null){
      ld1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fb1 = ad1 < ad2;
    ad3 = ad4 - fd0;
    fb0 = !fb1;
if(fo1 != null){
      fd1 = fo1.m3(ld0, ld1, ad1, ad2);
}
    fb0 = !fb1;
    Thought lo2 = Thought238.getInstance(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
    ld0 = ld1 + ad1;
    boolean lb3 = false;
    for(int i0=0; i0<10; i0++){
        lb3 = ad2 < ad3;
        Thought lo4 = Thought320.getInstance(ad4, fd0, fd1, ld0, fb0, fb1, lb3, fb0);
if(fo0 != null){
          fb1 = fo0.m2(fo1, fo0, fo1, fo0, lb3, fb0, fb1, lb3);
}
if(fo0 != null){
          fo1 = fo0.m4();
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld1, ad1, ad2, ad3, fb0, fb1, lb3, fb0);
}
        double ld5 = 361.89987863265446;
        if (fb1) {
            lb3 = ad3 < ad4;
if(fo1 != null){
              fd0 = fo1.m3(fb0, fb1, lb3, fb0);
}
            fb1 = fd1 > ld5;
            lb3 = !fb0;
if(fo0 != null){
              fo0.m3(fo1, fo0, fo1, fo0);
}
            boolean lb6 = true;
            boolean lb7 = false;
            ld0 *= -1;
if(fo1 != null){
              fo1.m3(ld1, ad1, ad2, ad3);
}
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
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ad1 > ad2;
    boolean lb0 = true;
    ab1 = ab2 && ab3;
    boolean lb1 = true;
    ad3 = ad4 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ad1, ab3, ab4, fb0, fb1);
}
    lb0 = lb1 && ab1;
    ad2 *= -1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb1 = ad3 < ad4;
    fd0 = fd1 - ad1;
    lb0 = lb1 || ab1;
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
        boolean lb2 = true;
if(fo0 != null){
      fo1 = fo0.m4(lb0, lb1, lb2, ab1);
}
    Thought lo3 = Thought41.getInstance(fo1, fo0, fo1, fo0);
    boolean lb4 = true;
    boolean lb5 = false;
    fd1 = ad1 + ad2;
    lb5 = !ab1;
    ad3 *= -1;
    double ld6 = 336.10342508203706;
    boolean lb7 = false;
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1);
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
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
    fb0 = fb1 || fb0;
    fb1 = fd0 < fd1;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      ao2.m3();
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
if(ao3 != null){
      ao3.m2(fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
    fb0 = fd0 < fd1;
    Thought lo1 = Thought91.getInstance(ao4, fo0, fo1, ao1);
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1);
}
    double ld2 = 721.840150759364;
    ld2 = fd0 + fd1;
    double ld3 = 273.2603008717464;
    Output.points[4][3] -= ld2;
    Thought lo4 = Thought2.getInstance(ao4, fo0, fo1, ao1, ld3, fd0, fd1, ld2);
    Thought lo5 = Thought41.getInstance(ld3, fd0, fd1, ld2, fb1, lb0, fb0, fb1);
    lb0 = fb0 || fb1;
    lb0 = fb0 || fb1;
        Output.points[4][4] -= ld3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, lb0, fb0, fb1, lb0);
}
if(ao2 != null){
      fb0 = ao2.m2();
}
    double ld6 = 363.21873435242645;
    fb1 = !lb0;

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
    Output.points[4][5] += ad1;
    boolean lb0 = false;
    ad2 = ad3 + ad4;
    boolean lb1 = false;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2, lb1, fb0, fb1, lb0);
}
    boolean lb2 = false;
    Thought lo3 = Thought81.getInstance(lb1, lb2, fb0, fb1);
if(ao2 != null){
      ad3 = ao2.m3(ao3, ao4, fo0, fo1);
}
    boolean lb4 = false;
if(ao2 != null){
      ao1 = ao2.m4(ad4, fd0, fd1, ad1);
}
    lb0 = !lb1;
    lb2 = !lb4;
    fb0 = ad2 > ad3;
    fb1 = ad4 < fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ad1, ad2, ad3);
}
if(ao4 != null){
      ao3 = ao4.m4(ad4, fd0, fd1, ad1, lb0, lb1, lb2, lb4);
}
        for(int i0=0; i0<10; i0++){
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ab1 = ao2.m2(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 && ab2;
    ab3 = ab4 || fb0;
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
    boolean lb0 = false;
    fd1 = fd0 + fd1;
if(ao3 != null){
      fd0 = ao3.m3(ab3, ab4, fb0, fb1);
}
    fd1 = fd0 - fd1;
    lb0 = fd0 < fd1;
if(ao4 != null){
      ab1 = ao4.m2(fo0, fo1, ao1, ao2);
}
    boolean lb1 = false;
    ab1 = !ab2;
    ab3 = fd0 > fd1;
if(ao3 != null){
      ao3.m3(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
}
if(ao4 != null){
      fd0 = ao4.m3(fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
}
    double ld2 = 850.6629067420162;
    boolean lb3 = false;
    lb1 = lb3 || ab1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ab2, ab3, ab4, fb0);
}
    Thought lo4 = Thought32.getInstance();
    Thought lo5 = Thought397.getInstance(fo0, fo1, ao1, ao2, fd0, fd1, ld2, fd0, fb1, lb0, lb1, lb3);
    ab1 = ab2 && ab3;
if(ao4 != null){
      ao3 = ao4.m4(ab4, fb0, fb1, lb0);
}
    boolean lb6 = true;
    lb1 = lb3 && lb6;
    double ld7 = 481.152258874182;
if(fo0 != null){
      ab1 = fo0.m2(fo1, ao1, ao2, ao3);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 && ab4;
    ad1 = ad2 - ad3;
    fb0 = ad4 < fd0;
    fb1 = ab1 && ab2;
    boolean lb0 = true;
if(ao2 != null){
      ao1 = ao2.m4(fd1, ad1, ad2, ad3);
}
    Thought lo1 = Thought113.getInstance(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1);
    boolean lb2 = false;
if(ao1 != null){
      ad2 = ao1.m3(ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
    ad1 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, lb0, lb2);
}
    boolean lb3 = true;
    Thought lo4 = Thought58.getInstance();
    lb3 = ad2 > ad3;
    Output.points[4][6] += ad4;
        ab1 = ab2 && ab3;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2, ab4, fb0, fb1, lb0);
}
    Thought lo5 = Thought358.getInstance(lb2, lb3, ab1, ab2);
    ad3 = ad4 - fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ao1.m3(fd1, ad1, ad2, ad3);
}
    Thought lo6 = Thought382.getInstance(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1);
    ab3 = ad2 > ad3;
        ab4 = fb0 && fb1;

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
if(fo0 != null){
      fo0.m3(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo1.m3();
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 < fd1;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo1.m2(fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb0 = fb1 || lb0;
    Thought lo1 = Thought202.getInstance(fd0, fd1, fd0, fd1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fb0 = !fb1;
    lb0 = fd0 < fd1;
    fb0 = fb1 || lb0;
    Thought lo2 = Thought235.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
}
    boolean lb3 = true;
    double ld4 = 942.2259334721116;
if(fo1 != null){
      ld4 = fo1.m3();
}
    lb0 = lb3 || fb0;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld4, fd0, fd1, fb1, lb0, lb3, fb0);
}
    Output.points[4][7] += ld4;
    fb1 = lb0 && lb3;
    boolean lb5 = true;
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
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = !fb0;
    fd0 = fd1 + fd0;
    double ld0 = 649.8251426735256;
    fb1 = fd0 > fd1;
    fb0 = !fb1;
if(fo1 != null){
      fb0 = fo1.m2(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ld0, fd0, fd1, ld0);
}
    fb1 = !fb0;
    fb1 = fd0 < fd1;
    ld0 = fd0 - fd1;
    boolean lb1 = false;
if(fo1 != null){
      lb1 = fo1.m2(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0);
}
    fd0 *= -1;
    fd1 = ld0 + fd0;
    fb0 = !fb1;
    fd1 = ld0 + fd0;
if(fo0 != null){
      fd1 = fo0.m3(ld0, fd0, fd1, ld0, lb1, fb0, fb1, lb1);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb1, fb0);
}
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo2 = Thought109.getInstance(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, fb1, lb1, fb0, fb1);
    Output.points[4][8] += fd0;
if(fo0 != null){
      fo0.m3(lb1, fb0, fb1, lb1);
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
    fb1 = fd0 > fd1;
    fb0 = fb1 && fb0;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo0.m3(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fb0 = fd1 > fd0;
    fb1 = fd1 > fd0;
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
    fd0 *= -1;
    fb1 = fb0 || fb1;
    fb0 = fb1 && fb0;
    fd1 *= -1;
    double ld0 = 263.6519222798636;
    ld0 = fd0 - fd1;
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
}
