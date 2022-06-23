package genetic;
import java.util.ArrayList;
class Thought58 extends Thought{
private static ArrayList<Thought58> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 841.5841520569552;
private double fd1 = 466.5177865244611;
private Thought fo0 = null;
private Thought fo1 = null;
Thought58 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought58 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought58 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought58 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought58 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought58 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought58 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought58 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought58 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought58 instance = new Thought58 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought58 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought58 instance = new Thought58 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought58 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought58 instance = new Thought58 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought58 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought58 instance = new Thought58 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought58 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought58 instance = new Thought58 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought58 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought58 instance = new Thought58 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought58 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought58 instance = new Thought58 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought58 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought58 instance = new Thought58 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    Thought lo1 = Thought73.getInstance(fb0, fb1, lb0, fb0);
    fd0 *= -1;
    Thought lo2 = Thought30.getInstance();
    fb1 = fd1 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    fd1 = fd0 - fd1;
    boolean lb3 = false;
        Thought lo4 = Thought52.getInstance(fo1, fo0, fo1, fo0);
    boolean lb5 = false;
    boolean lb6 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb3, lb5, lb6, fb0);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb1, lb0, lb3, lb5);
}
    Thought lo7 = Thought57.getInstance(fd0, fd1, fd0, fd1);
    Thought lo8 = Thought41.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
if(fo0 != null){
      fo0.m3(lb6, fb0, fb1, lb0);
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
    ab2 = fd0 > fd1;
if(fo1 != null){
      fo1.m2();
}
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo0.m1(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    boolean lb0 = true;
    lb0 = fd1 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ab1 = ab2 && ab3;
    ab4 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb0, ab1, ab2, ab3);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb0);
}
    ab1 = ab2 && ab3;
        for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo0.m3(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
        }
if(fo0 != null){
      fo0.m2(ab4, fb0, fb1, lb0);
}
    boolean lb1 = false;
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo1.m1();
}
    lb1 = ab1 && ab2;
if(fo0 != null){
      fo0.m1(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    lb0 = !lb1;
    fd1 *= -1;
    ab1 = fd0 < fd1;
    ab2 = ab3 && ab4;
    boolean lb2 = true;

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
    ad1 *= -1;
    fb0 = fb1 && fb0;
    fb1 = !fb0;
    fb1 = fb0 && fb1;
    ad2 = ad3 + ad4;
    fb0 = !fb1;
    Thought lo0 = Thought20.getInstance(fo1, fo0, fo1, fo0);
    Output.points[5][1] -= fd0;
    fd1 = ad1 - ad2;
    ad3 = ad4 - fd0;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    boolean lb1 = true;
    ad4 = fd0 - fd1;
    double ld2 = 995.8696371792763;
    lb1 = ld2 > ad1;
    Output.points[5][2] -= ad2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb1, fb0);
}
    fb1 = lb1 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld2, ad1, ad2, ad3);
}
    fb1 = lb1 && fb0;
if(fo0 != null){
      ad4 = fo0.m3(fb1, lb1, fb0, fb1);
}
    lb1 = !fb0;
    Output.points[5][3] += fd0;
    fb1 = lb1 || fb0;
    fd1 *= -1;
if(fo1 != null){
      ld2 = fo1.m3();
}
    boolean lb3 = false;
    Thought lo4 = Thought66.getInstance(ad1, ad2, ad3, ad4, fb0, fb1, lb1, lb3);

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
    ab1 = !ab2;
    ad2 = ad3 - ad4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd0 = fd1 - ad1;
    double ld0 = 519.0759880848517;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld0, ad1, ad2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    Output.points[5][4] -= ld0;
    fb0 = fb1 && ab1;
    Output.points[5][5] -= ad1;

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
    fd0 = fd1 - fd0;
if(ao2 != null){
      ao1 = ao2.m4(fb1, fb0, fb1, fb0);
}
    fd1 = fd0 + fd1;
    fb1 = fb0 && fb1;
    Thought lo0 = Thought92.getInstance();
    fb0 = !fb1;
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3);
}
    fb0 = fd1 > fd0;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
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
    fb0 = fb1 || lb0;
    double ld1 = 767.9403491330472;
        ad1 *= -1;
if(ao1 != null){
      ao1.m1(ad2, ad3, ad4, fd0);
}
    fb0 = fb1 && lb0;
    double ld2 = 143.44840706391096;
    fd0 = fd1 + ld1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld2, ad1, ad2, ad3);
}
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4();
}
if(fo1 != null){
      ad4 = fo1.m3(fd0, fd1, ld1, ld2, fb1, lb0, fb0, fb1);
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
    Thought lo0 = Thought57.getInstance(ao1, ao2, ao3, ao4);
    fd0 = fd1 + fd0;
    ab1 = ab2 && ab3;
    ab4 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
    double ld1 = 32.15691608612798;
    ab4 = fd0 < fd1;
    boolean lb2 = true;
if(fo0 != null){
      ab4 = fo0.m2(fo1, ao1, ao2, ao3, fb0, fb1, lb2, ab1);
}
    Thought lo3 = Thought85.getInstance(ld1, fd0, fd1, ld1);
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, ld1, fd0);
}
    ab2 = fd1 > ld1;
if(ao4 != null){
      ao3 = ao4.m4(ab3, ab4, fb0, fb1);
}
    boolean lb4 = true;
    lb2 = lb4 && ab1;
    fd0 = fd1 - ld1;
    ab2 = ab3 && ab4;
    fd0 *= -1;
    fb0 = fd1 > ld1;
    fb1 = fd0 < fd1;
if(fo0 != null){
      ld1 = fo0.m3();
}
    boolean lb5 = true;
    lb2 = fd0 > fd1;
    ld1 = fd0 + fd1;

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
    ab2 = ab3 || ab4;
    boolean lb0 = false;
    boolean lb1 = true;
    ab3 = !ab4;
    boolean lb2 = true;
    ad1 = ad2 + ad3;
    ab4 = !fb0;
    ad4 *= -1;
if(ao2 != null){
      ao2.m3(fd0, fd1, ad1, ad2, fb1, lb0, lb1, lb2);
}
    boolean lb3 = true;
    for(int i0=0; i0<10; i0++){
        ad3 *= -1;
        boolean lb4 = true;
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
    fd1 *= -1;
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought19.getInstance(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
    fb1 = fb0 || fb1;
    fb0 = fb1 && fb0;
    fb1 = fb0 && fb1;
    fd1 = fd0 + fd1;
    fb0 = fd0 > fd1;
    fb1 = fd0 > fd1;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
    Thought lo1 = Thought90.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
    fd1 *= -1;
    Thought lo2 = Thought77.getInstance(fb0, fb1, fb0, fb1);
    double ld3 = 41.159737355926325;
    ld3 *= -1;
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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
if(fo0 != null){
      fd0 = fo0.m3();
}
        if (lb0) {
        ab1 = !ab2;
        ab3 = ab4 || fb0;
        boolean lb1 = false;
        fd1 = fd0 + fd1;
        Thought lo2 = Thought39.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, lb1, lb0);
        ab1 = fd0 > fd1;
        ab2 = fd0 < fd1;
if(fo1 != null){
          fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
        ab3 = ab4 && fb0;
        fb1 = !lb1;
if(fo0 != null){
          lb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb1, lb0);
}
        boolean lb3 = true;
        Output.points[5][6] += fd1;
        fd0 = fd1 + fd0;
if(fo1 != null){
          fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
        fd0 = fd1 + fd0;
        lb0 = ab1 && ab2;
        Thought lo4 = Thought9.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
        Thought lo5 = Thought71.getInstance(ab3, ab4, fb0, fb1);
if(fo1 != null){
          fo0 = fo1.m4();
}
        lb1 = !lb3;
if(fo1 != null){
          fo0 = fo1.m4(fd1, fd0, fd1, fd0, lb0, ab1, ab2, ab3);
}
        ab4 = fb0 && fb1;
        double ld6 = 284.9567603154013;
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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb0 = false;
    Thought lo1 = Thought92.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, lb0, fb0);
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
}
if(fo1 != null){
      lb0 = fo1.m2(fd1, ad1, ad2, ad3);
}
        ad4 = fd0 - fd1;
    fb0 = !fb1;
    ad1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    boolean lb2 = false;
    Output.points[5][7] += fd1;
    if (lb0) {
if(fo1 != null){
          fo0 = fo1.m4(lb2, fb0, fb1, lb0);
}
if(fo1 != null){
          fo0 = fo1.m4();
}
        boolean lb3 = true;
if(fo0 != null){
          ad1 = fo0.m3(ad2, ad3, ad4, fd0, lb0, lb2, fb0, fb1);
}
        double ld4 = 295.1234088670215;
if(fo1 != null){
          fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
        Thought lo5 = Thought45.getInstance(fo0, fo1, fo0, fo1, fd1, ld4, ad1, ad2, lb3, lb0, lb2, fb0);
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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 141.1650735864174;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo0.m1(ad1, ad2, ad3, ad4);
}
    fb1 = fd0 < fd1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ld0, ad1, ad2, ad3);
}
    ab1 = ab2 && ab3;
    boolean lb1 = false;
    ad4 *= -1;
    ab3 = ab4 && fb0;
    boolean lb2 = true;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb1, lb2);
}
    boolean lb3 = false;
    Thought lo4 = Thought24.getInstance();

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 655.3337739169007;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
}
    boolean lb1 = true;
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1);
}
    fb1 = fd1 > ld0;
    lb1 = !fb0;
    double ld2 = 654.597590880113;
    fb1 = ld2 > fd0;
    lb1 = fb0 && fb1;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fd1, ld0, ld2, fd0, lb1, fb0, fb1, lb1);
}
    fd1 = ld0 + ld2;
    fb0 = !fb1;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, lb1, fb0, fb1, lb1);
}
    fb0 = fd0 < fd1;
    ld0 = ld2 - fd0;
if(ao1 != null){
      fo1 = ao1.m4(fd1, ld0, ld2, fd0);
}
    Thought lo3 = Thought65.getInstance(ao2, ao3, ao4, fo0, fd1, ld0, ld2, fd0);
    Thought lo4 = Thought81.getInstance(fb1, lb1, fb0, fb1);
    fd1 = ld0 - ld2;
    lb1 = fd0 < fd1;
    boolean lb5 = true;
if(fo1 != null){
      fo1.m1();
}
if(ao1 != null){
      lb5 = ao1.m2(ld0, ld2, fd0, fd1, fb0, fb1, lb1, lb5);
}
    ld0 = ld2 - fd0;
    fd1 *= -1;
    fb0 = ld0 > ld2;

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
      ao2.m1(ao3, ao4, fo0, fo1);
}
    fb0 = ad1 < ad2;
    ad3 = ad4 - fd0;
    Thought lo0 = Thought8.getInstance(ao1, ao2, ao3, ao4, fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
    fb1 = fb0 || fb1;
    fb0 = !fb1;
    Output.points[5][8] -= ad4;
    Thought lo1 = Thought56.getInstance(fo0, fo1, ao1, ao2, fb0, fb1, fb0, fb1);
if(ao3 != null){
      ao3.m1(fd0, fd1, ad1, ad2);
}
    double ld2 = 873.0360116895274;
    ad2 = ad3 - ad4;
    fd0 *= -1;
if(ao4 != null){
      fb0 = ao4.m2(fo0, fo1, ao1, ao2, fd1, ld2, ad1, ad2);
}
    fb1 = ad3 > ad4;
    boolean lb3 = false;
if(ao4 != null){
      ao3 = ao4.m4(lb3, fb0, fb1, lb3);
}
if(fo0 != null){
      fd0 = fo0.m3();
}
    fb0 = fb1 && lb3;
    fd1 *= -1;
if(fo1 != null){
      fb0 = fo1.m2(ld2, ad1, ad2, ad3, fb1, lb3, fb0, fb1);
}
    lb3 = fb0 && fb1;
    double ld4 = 340.7351123020524;

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
    Thought lo0 = Thought25.getInstance(ao1, ao2, ao3, ao4);
    Thought lo1 = Thought19.getInstance(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
    fb1 = !ab1;
    ab2 = ab3 || ab4;
    boolean lb2 = true;
    ab4 = fd0 > fd1;
    fb0 = fd0 < fd1;
if(ao3 != null){
          fd0 = ao3.m3(ao4, fo0, fo1, ao1, fb1, lb2, ab1, ab2);
}
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0);
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
    ab1 = ab2 || ab3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4(ab4, fb0, fb1, ab1);
}
    if (ab2) {
        ab3 = !ab4;
        boolean lb0 = false;
        fd1 *= -1;
        ab4 = fb0 || fb1;
if(ao4 != null){
          ao4.m2();
}
if(fo0 != null){
          fo0.m1(ad1, ad2, ad3, ad4, lb0, ab1, ab2, ab3);
}
        Output.points[6][0] += fd0;
        double ld1 = 824.8301667364767;
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb1 = fd1 < fd0;
    fb0 = !fb1;
    boolean lb0 = true;
    lb0 = fd1 > fd0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    fd1 = fd0 + fd1;
    fb1 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
}
    fd0 *= -1;
    Thought lo1 = Thought77.getInstance(fd1, fd0, fd1, fd0);
    double ld2 = 948.058730083385;
    fb0 = fb1 || lb0;
    fd0 = fd1 - ld2;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, ld2, fd0);
}
    fb0 = fb1 || lb0;
    Thought lo3 = Thought34.getInstance(fb0, fb1, lb0, fb0);
    double ld4 = 594.3268147816331;
    Output.points[6][1] -= fd0;
if(fo1 != null){
      fo1.m2();
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
    boolean lb0 = true;
    lb0 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    Thought lo1 = Thought16.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, lb0, ab1, ab2);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    lb0 = fd1 < fd0;
    ab1 = ab2 && ab3;
    boolean lb2 = true;
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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fb0 = fo0.m2(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2();
}
if(fo0 != null){
      ad2 = fo0.m3(ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    Thought lo0 = Thought4.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
    Output.points[6][2] -= fd1;
    fb0 = fb1 && fb0;
    Output.points[6][3] -= ad1;
    Thought lo1 = Thought40.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
    ad2 = ad3 - ad4;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
    ad1 *= -1;
    ad2 = ad3 + ad4;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    Thought lo2 = Thought23.getInstance();
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo1.m1(fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb3 = false;
    ad3 = ad4 - fd0;
    boolean lb4 = true;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, lb4, fb0, fb1, lb3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb4, fb0, fb1, lb3);
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      ab2 = fo1.m2(ad2, ad3, ad4, fd0);
}
    fd1 *= -1;
    ab3 = ad1 < ad2;
    Output.points[6][4] -= ad3;
    ad4 *= -1;
    double ld0 = 481.572791596526;
if(fo0 != null){
      ab4 = fo0.m2(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld0);
}
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo1 = fo0.m4(fb0, fb1, ab1, ab2);
}
        ab3 = !ab4;
        Thought lo1 = Thought9.getInstance();
        boolean lb2 = false;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought59.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1);
}
    fb0 = fb1 || fb0;
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    boolean lb1 = true;
    double ld2 = 340.59317890670826;
    lb1 = fb0 && fb1;
    double ld3 = 540.9446361072103;
    lb1 = fb0 || fb1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, lb1, fb0, fb1, lb1);
}
    fb0 = fb1 || lb1;
if(fo1 != null){
      fb0 = fo1.m2(ld2, ld3, fd0, fd1);
}
    boolean lb4 = false;
    ld2 = ld3 - fd0;
    if (fb0) {
        fd1 = ld2 + ld3;
if(ao1 != null){
          fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, ld2, ld3, fd0);
}
        fb1 = lb1 && lb4;
        boolean lb5 = true;
        lb4 = fb0 || fb1;
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
if(ao2 != null){
      ad1 = ao2.m3(fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    ad2 = ad3 + ad4;
    fd0 = fd1 - ad1;
    ad2 = ad3 - ad4;
    double ld0 = 778.0493273675769;
    Thought lo1 = Thought94.getInstance();
if(ao3 != null){
      fb0 = ao3.m2(ad4, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    fb1 = ad1 > ad2;
    ad3 *= -1;
    fb0 = ad4 > fd0;
    boolean lb2 = false;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2);
}
    double ld3 = 308.08069496887344;
    fb0 = fb1 && lb2;

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
    Thought lo0 = Thought19.getInstance(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fo0.m3(fd1, fd0, fd1, fd0);
}
    ab4 = fb0 && fb1;
    ab1 = ab2 || ab3;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
    ab4 = fd1 < fd0;
    fb0 = fb1 && ab1;
    ab2 = !ab3;
    Thought lo1 = Thought23.getInstance(ab4, fb0, fb1, ab1);
    ab2 = ab3 || ab4;
    Thought lo2 = Thought5.getInstance();
    fb0 = fb1 || ab1;
    fd1 = fd0 + fd1;
    boolean lb3 = true;
    fd0 *= -1;
    Thought lo4 = Thought98.getInstance(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
    fb0 = fd1 < fd0;
    fb1 = !lb3;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    boolean lb5 = false;
    boolean lb6 = false;
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, lb5, lb6, ab1, ab2);
}
    fd1 *= -1;
    double ld7 = 58.919449407620206;
    ld7 = fd0 + fd1;

Thought.STACK_COUNTER++;
return ld7;
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
    Thought lo0 = Thought33.getInstance(ao1, ao2, ao3, ao4, ab2, ab3, ab4, fb0);
    Thought lo1 = Thought66.getInstance(ad2, ad3, ad4, fd0);
    fb1 = ab1 && ab2;
    fd1 = ad1 - ad2;
    double ld2 = 185.98913126290176;
if(fo0 != null){
      ad2 = fo0.m3(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      ao4 = fo0.m4(ab3, ab4, fb0, fb1);
}
    boolean lb3 = true;
    Output.points[6][5] -= ld2;
if(fo1 != null){
      lb3 = fo1.m2();
}
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
        fb0 = fd0 > fd1;
    if (fb1) {
        Thought lo4 = Thought40.getInstance(ao3, ao4, fo0, fo1);
        ld2 *= -1;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, lb3, ab1, ab2, ab3);
}
        boolean lb5 = false;
        ab3 = ab4 || fb0;
        fb1 = lb5 && lb3;
if(ao1 != null){
          ao1.m1(ao2, ao3, ao4, fo0, ab1, ab2, ab3, ab4);
}
        fd0 = fd1 - ld2;
        fb0 = fb1 && lb5;
if(fo1 != null){
          ad1 = fo1.m3(ad2, ad3, ad4, fd0);
}
        lb3 = fd1 > ld2;
        ab1 = ab2 && ab3;
        boolean lb6 = false;
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
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
        fd0 *= -1;
    fb1 = fd1 < fd0;
    Output.points[6][6] += fd1;
    Thought lo0 = Thought65.getInstance(fb0, fb1, fb0, fb1);
    if (fb0) {
        fd0 = fd1 - fd0;
if(fo0 != null){
          fo1 = fo0.m4();
}
        double ld1 = 317.40893509548704;
        fb1 = fb0 && fb1;
        fb0 = fd0 < fd1;
if(fo0 != null){
          fo1 = fo0.m4(ld1, fd0, fd1, ld1, fb1, fb0, fb1, fb0);
}
        double ld2 = 665.1216148083287;
        fb1 = !fb0;
        Output.points[6][7] -= ld2;
        fd0 = fd1 - ld1;
        ld2 = fd0 + fd1;
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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    boolean lb0 = false;
    fd0 *= -1;
    fd1 = fd0 - fd1;
    fd0 *= -1;
    boolean lb1 = true;
    ab3 = fd1 > fd0;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    boolean lb2 = false;
    boolean lb3 = false;
    Thought lo4 = Thought73.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
    double ld5 = 578.220481584113;
        ab2 = ab3 && ab4;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb0, lb1);
}
    lb2 = lb3 && ab1;
    ab2 = ld5 < fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld5, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    lb0 = ld5 > fd0;
if(fo0 != null){
      lb1 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ld5, fd0, fd1, lb2, lb3, ab1, ab2);
}
    ab3 = ab4 && fb0;
    fb1 = ld5 > fd0;

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
    fb0 = ad4 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fd1, ad1, ad2, ad3);
}
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
    for(int i0=0; i0<10; i0++){
        double ld0 = 205.96861979312453;
if(fo0 != null){
          fb0 = fo0.m2(fb1, fb0, fb1, fb0);
}
        fb1 = fb0 || fb1;
        double ld1 = 821.8120282037088;
if(fo1 != null){
          fo1.m2();
}
        Thought lo2 = Thought73.getInstance(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
        fd0 = fd1 - ld0;
        ld1 *= -1;
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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ad1 = ad2 + ad3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
    ab3 = ab4 || fb0;
    ad4 *= -1;
    Output.points[6][8] += fd0;
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fb1, ab1, ab2, ab3);
}
    double ld0 = 560.862463580954;
    ab4 = ld0 > ad1;
    fb0 = fb1 && ab1;
    boolean lb1 = false;
    ad2 *= -1;
    if (ab1) {
if(fo0 != null){
          fo1 = fo0.m4();
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
    fb0 = fb1 || fb0;
    Output.points[7][0] += fd1;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought99.getInstance(ao3, ao4, fo0, fo1);
    fb1 = fb0 && fb1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
    boolean lb1 = true;
    lb1 = fb0 || fb1;
    lb1 = fd0 < fd1;
    fd0 *= -1;
    Output.points[7][1] += fd1;
if(fo1 != null){
      fb0 = fo1.m2(fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      ao1 = ao2.m4(fb1, lb1, fb0, fb1);
}
        double ld2 = 702.7381320160362;
    Output.points[7][2] += ld2;

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
    ad3 = ad4 - fd0;
    Thought lo0 = Thought58.getInstance(fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1);
}
    ad4 = fd0 + fd1;
    ad1 = ad2 - ad3;
    ad4 = fd0 - fd1;
if(ao2 != null){
      ad1 = ao2.m3(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = ad1 > ad2;
if(fo1 != null){
      fb0 = fo1.m2(ad3, ad4, fd0, fd1);
}
    double ld1 = 471.1182584018614;
    boolean lb2 = false;
    Output.points[7][3] += ld1;
    ad1 = ad2 - ad3;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ld1);
}
    double ld3 = 544.8137104830819;
    for(int i0=0; i0<10; i0++){
        fb0 = fb1 && lb2;
        fb0 = ld3 > ad1;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao2.m2(ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      fd1 = ao3.m3();
}
if(ao4 != null){
      fb0 = ao4.m2(fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
    fd0 = fd1 - fd0;
    Output.points[7][4] += fd1;
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
    ab2 = !ab3;
    ab4 = fb0 || fb1;
    fd0 = fd1 - fd0;
    for(int i0=0; i0<10; i0++){
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
    double ld0 = 101.51449891200743;
    double ld1 = 420.7301672427469;
    fb0 = fb1 && ab1;
    ld1 = ad1 - ad2;
if(ao3 != null){
      ao2 = ao3.m4(ad3, ad4, fd0, fd1);
}
if(ao4 != null){
      ld0 = ao4.m3(fo0, fo1, ao1, ao2, ld1, ad1, ad2, ad3);
}
    ad4 = fd0 + fd1;
    Output.points[7][5] += ld0;
if(ao3 != null){
      ab2 = ao3.m2(ab3, ab4, fb0, fb1);
}
    ab1 = ab2 || ab3;
if(ao4 != null){
      ab4 = ao4.m2();
}
if(fo1 != null){
      fo0 = fo1.m4(ld1, ad1, ad2, ad3, fb0, fb1, ab1, ab2);
}
    boolean lb2 = true;
    ab2 = ad4 > fd0;
    ab3 = ab4 || fb0;
    fb1 = fd1 > ld0;
    for(int i0=0; i0<10; i0++){
        lb2 = ld1 > ad1;
        double ld3 = 321.7254001672069;
        double ld4 = 478.3466580136821;
        ab1 = ld1 < ad1;
        ab2 = !ab3;
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
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    fd0 = fd1 - fd0;
    Output.points[7][6] -= fd1;
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
    fd0 = fd1 + fd0;
    boolean lb1 = false;
    fd1 = fd0 - fd1;
    fb0 = fb1 || lb0;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    lb1 = fd1 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb0, lb1);
}
if(fo1 != null){
      fd1 = fo1.m3();
}
    Output.points[7][7] -= fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb1);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb2 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb2, fb0, fb1, lb0);
}
    Thought lo3 = Thought60.getInstance(fo0, fo1, fo0, fo1, lb1, lb2, fb0, fb1);
if(fo0 != null){
      fo0.m1(fd1, fd0, fd1, fd0);
}
        lb0 = !lb1;
if(fo1 != null){
      lb2 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
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
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fd0 = fo0.m3(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
if(fo1 != null){
      fb0 = fo1.m2();
}
    double ld0 = 630.6042412762949;
    double ld1 = 918.7318966238794;
    ld1 = fd0 + fd1;
    double ld2 = 795.5409319188609;
    ld0 = ld1 - ld2;
    double ld3 = 907.9116834556388;
    fb1 = ld3 > fd0;
if(fo0 != null){
      fb0 = fo0.m2(fd1, ld0, ld1, ld2, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      ld3 = fo1.m3(fo0, fo1, fo0, fo1);
}
    fd0 = fd1 - ld0;
    boolean lb4 = true;
    Thought lo5 = Thought6.getInstance(fo0, fo1, fo0, fo1, ld1, ld2, ld3, fd0, fb0, fb1, lb4, fb0);
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, lb4, fb0, fb1, lb4);
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
    boolean lb0 = true;
        fd1 *= -1;
    boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    lb1 = fd0 < fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb0, lb1);
}
    fd1 = fd0 - fd1;
    fb0 = !fb1;
    fd0 *= -1;
        fd1 *= -1;
    fd0 = fd1 + fd0;
    Output.points[7][8] += fd1;
    fd0 *= -1;
if(fo0 != null){
      lb0 = fo0.m2();
}
    lb1 = fd1 < fd0;
    Output.points[8][0] += fd1;
if(fo1 != null){
      fo1.m2(fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb1);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb1);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb0, fb1, lb0, lb1);
}
    double ld2 = 343.0486272094532;
    fb0 = fd0 > fd1;
    ld2 = fd0 - fd1;

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
