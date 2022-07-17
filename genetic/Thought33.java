package genetic;
import java.util.ArrayList;
class Thought33 extends Thought{
private static ArrayList<Thought33> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 549.6584860393142;
private double fd1 = 456.53864990100817;
private Thought fo0 = null;
private Thought fo1 = null;
Thought33 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought33 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought33 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought33 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought33 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought33 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought33 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought33 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought33 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought33 instance = new Thought33 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought33 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought33 instance = new Thought33 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought33 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought33 instance = new Thought33 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought33 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought33 instance = new Thought33 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought33 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought33 instance = new Thought33 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought33 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought33 instance = new Thought33 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought33 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought33 instance = new Thought33 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought33 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought33 instance = new Thought33 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fb1 = !fb0;
    fb1 = fb0 || fb1;
    double ld0 = 9.003320323566122;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb1 = ld0 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1, fb0, fb1, fb0, fb1);
}
    double ld1 = 564.861340202945;
if(fo0 != null){
      fo0.m2(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      ld0 = fo1.m3(fo0, fo1, fo0, fo1);
}
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
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    lb0 = fd0 < fd1;
    ab1 = !ab2;
    boolean lb1 = false;
    Output.points[5][0] += fd0;
    if (ab2) {
        fd1 = fd0 + fd1;
        fd0 = fd1 + fd0;
        boolean lb2 = false;
        ab2 = fd1 < fd0;
        ab3 = fd1 < fd0;
        ab4 = fb0 || fb1;
        boolean lb3 = false;
        lb2 = fd1 < fd0;
        lb3 = lb0 && lb1;
if(fo1 != null){
          fo0 = fo1.m4(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
        fd1 = fd0 - fd1;
        Thought lo4 = Thought33.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, lb2, lb3);
        lb0 = fd0 > fd1;
        Thought lo5 = Thought314.getInstance();
        Thought lo6 = Thought108.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb1, ab1, ab2, ab3);
        Thought lo7 = Thought308.getInstance(ab4, fb0, fb1, lb2);
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
        } else if (lb1) {
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
    fb0 = ad1 > ad2;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
    fb0 = !fb1;
if(fo1 != null){
      fo1.m1(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + ad1;
if(fo1 != null){
      ad2 = fo1.m3();
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m1(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb1 = ad1 > ad2;
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1);
}
    Thought lo1 = Thought243.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ad1, ad2, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fo0.m3();
}
    ad4 *= -1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, fb1, lb0, fb0, fb1);
}
    boolean lb2 = false;
if(fo1 != null){
      fo0 = fo1.m4(lb0, lb2, fb0, fb1);
}
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      lb0 = fo1.m2(fd0, fd1, ad1, ad2);
}
    lb2 = ad3 < ad4;
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
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[5][1] += ad1;
    ad2 = ad3 - ad4;
    boolean lb0 = true;
    fd0 = fd1 + ad1;
    ab1 = ab2 && ab3;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    Thought lo1 = Thought256.getInstance(fd1, ad1, ad2, ad3, ab4, fb0, fb1, lb0);
    ad4 *= -1;
    ab1 = !ab2;
    boolean lb2 = false;
    fd0 = fd1 - ad1;
    ad2 = ad3 - ad4;
    boolean lb3 = true;
    ab1 = fd0 < fd1;
    double ld4 = 238.95617275058072;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    double ld5 = 513.622399873139;
    double ld6 = 150.23900710868747;
    boolean lb7 = false;
    fb0 = fb1 || lb0;
    boolean lb8 = true;
if(fo1 != null){
      fo1.m3();
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld4, ld5, ld6, ad1, lb2, lb3, lb7, lb8);
}
    if (ab1) {
if(fo1 != null){
          fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        fb1 = lb0 && lb2;
        lb3 = ad2 < ad3;
        boolean lb9 = false;
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
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    Output.points[5][2] -= fd0;
    fb0 = fd1 > fd0;
    fb1 = fb0 && fb1;
    fb0 = fd1 < fd0;
if(ao2 != null){
      ao2.m1(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    double ld0 = 257.1873842371159;
    fb1 = fb0 || fb1;
    fb0 = fb1 || fb0;
    double ld1 = 7.9865490195622115;

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
    Thought lo0 = Thought378.getInstance(ao1, ao2, ao3, ao4, fb1, fb0, fb1, fb0);
if(fo1 != null){
      fo0 = fo1.m4();
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
if(ao2 != null){
      ao1 = ao2.m4(fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
    double ld1 = 774.8450026485797;
    double ld2 = 559.8422748534041;
    boolean lb3 = false;
    boolean lb4 = false;
    boolean lb5 = false;
    Output.points[5][3] -= ld1;
    Thought lo6 = Thought74.getInstance(ao3, ao4, fo0, fo1);
    lb4 = ld2 < ad1;
if(ao1 != null){
      ao1.m3(ad2, ad3, ad4, fd0);
}
    lb5 = !fb0;

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
    boolean lb0 = false;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    for(int i0=0; i0<10; i0++){
        Output.points[5][4] += fd1;
        lb0 = !ab1;
if(ao2 != null){
          ab2 = ao2.m2(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
        lb0 = ab1 && ab2;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab3, ab4, fb0, fb1);
}
        lb0 = fd0 < fd1;
if(ao4 != null){
          ao3 = ao4.m4();
}
        ab1 = ab2 || ab3;
        ab4 = fd0 < fd1;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, fb0, fb1, lb0, ab1);
}
        fd0 *= -1;
        fd1 *= -1;
        ab2 = fd0 > fd1;
        Thought lo1 = Thought387.getInstance(ab3, ab4, fb0, fb1);
        lb0 = fd0 > fd1;
        Thought lo2 = Thought184.getInstance(fo0, fo1, ao1, ao2);
        double ld3 = 853.6361821224322;
        ab1 = ab2 && ab3;
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
if(ao1 != null){
      ab1 = ao1.m2(ad1, ad2, ad3, ad4);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2);
}
    double ld0 = 516.1448892353661;
    ab2 = ab3 || ab4;
    ad2 *= -1;
    fb0 = fb1 && ab1;
    ab2 = !ab3;
    ab4 = !fb0;
    fb1 = ab1 || ab2;
    Thought lo1 = Thought377.getInstance(ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
}
if(ao2 != null){
      ao2.m1();
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld0, ad1, ad2, ad3, fb0, fb1, ab1, ab2);
}
    double ld2 = 511.6633956087816;

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
    fb0 = fb1 && fb0;
    Output.points[5][5] -= fd0;
    boolean lb0 = true;
    fd1 = fd0 - fd1;
    Thought lo1 = Thought335.getInstance(fb0, fb1, lb0, fb0);
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fd0 = fd1 - fd0;
    boolean lb2 = true;
    Thought lo3 = Thought37.getInstance(fd1, fd0, fd1, fd0);
    lb0 = !lb2;
    boolean lb4 = false;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    Thought lo5 = Thought339.getInstance(fd0, fd1, fd0, fd1, lb4, fb0, fb1, lb0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb2, lb4, fb0, fb1);
}
    lb0 = lb2 || lb4;
if(fo0 != null){
      fd0 = fo0.m3();
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb2);
}
if(fo1 != null){
      fo1.m1(lb4, fb0, fb1, lb0);
}
    fd1 *= -1;
    double ld6 = 427.1837335536765;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ld6, fd0, fd1, ld6);
}
    lb2 = lb4 || fb0;
    Thought lo7 = Thought87.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld6, fd0);

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
if(fo0 != null){
      fo0.m2(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    double ld0 = 955.811210863515;
        double ld1 = 579.9014281125134;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, ld1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    ld0 = ld1 + fd0;
    ab1 = ab2 && ab3;
if(fo1 != null){
      fd1 = fo1.m3(ab4, fb0, fb1, ab1);
}
    ab2 = !ab3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ld0, ld1, fd0, fd1);
}
    ld0 = ld1 - fd0;
if(fo0 != null){
      ab4 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ld0, ld1, fd0);
}
    fb0 = fd1 > ld0;
if(fo0 != null){
      fo1 = fo0.m4(ld1, fd0, fd1, ld0, fb1, ab1, ab2, ab3);
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
    Output.points[5][6] -= ad2;
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    ad4 *= -1;
    Thought lo0 = Thought80.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
    double ld1 = 627.9807047863898;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    Thought lo2 = Thought76.getInstance(fo0, fo1, fo0, fo1);
    double ld3 = 320.8338392055045;
    fb0 = fb1 && fb0;
    Output.points[5][7] -= ad1;

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
        ab1 = ab2 && ab3;
if(fo0 != null){
      ad2 = fo0.m3(ad3, ad4, fd0, fd1);
}
    ab4 = fb0 || fb1;
    ab1 = ab2 && ab3;
    ad1 = ad2 + ad3;
    Thought lo0 = Thought92.getInstance(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
if(fo1 != null){
      ab4 = fo1.m2(ad2, ad3, ad4, fd0, fb0, fb1, ab1, ab2);
}
    Thought lo1 = Thought382.getInstance(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
    ab1 = fd1 > ad1;
    double ld2 = 552.8009154495492;
    ad1 = ad2 - ad3;
    ad4 *= -1;
if(fo0 != null){
      fo0.m2();
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld2, ad1, ad2, ab2, ab3, ab4, fb0);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fd1 > fd0;
    for(int i0=0; i0<10; i0++){
if(ao2 != null){
          ao1 = ao2.m4(fb1, fb0, fb1, fb0);
}
        Thought lo0 = Thought38.getInstance(ao3, ao4, fo0, fo1);
        Thought lo1 = Thought95.getInstance(fd1, fd0, fd1, fd0);
        Output.points[5][8] -= fd1;
        fd0 *= -1;
        Thought lo2 = Thought209.getInstance(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
        Output.points[6][0] -= fd1;
        fd0 = fd1 - fd0;
        fd1 = fd0 - fd1;
        for(int i1=0; i1<10; i1++){
            Thought lo3 = Thought326.getInstance(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
            boolean lb4 = true;
if(fo0 != null){
              fb0 = fo0.m2(fo1, ao1, ao2, ao3, fb1, lb4, fb0, fb1);
}
            lb4 = fd0 > fd1;
            fd0 = fd1 - fd0;
            double ld5 = 988.065770680509;
            fb0 = fd0 > fd1;
if(fo0 != null){
              ao4 = fo0.m4();
}
            ld5 = fd0 + fd1;
if(fo1 != null){
              ld5 = fo1.m3(ao1, ao2, ao3, ao4, fd0, fd1, ld5, fd0, fb1, lb4, fb0, fb1);
}
            boolean lb6 = true;
if(fo0 != null){
              fd1 = fo0.m3(lb4, lb6, fb0, fb1);
}
if(fo1 != null){
              ld5 = fo1.m3(ao1, ao2, ao3, ao4);
}
            Output.points[6][1] += fd0;
if(fo1 != null){
              fo0 = fo1.m4(fd1, ld5, fd0, fd1);
}
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    Output.points[6][2] += ad1;
    fb0 = ad2 > ad3;
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1);
}
if(fo1 != null){
      fo1.m2(ad2, ad3, ad4, fd0, lb0, fb0, fb1, lb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, lb0, fb0);
}
    Thought lo1 = Thought217.getInstance();
    boolean lb2 = false;
    fd1 = ad1 - ad2;
    ad3 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1, fb0, fb1, lb0, lb2);
}
if(ao1 != null){
      ad2 = ao1.m3(fb0, fb1, lb0, lb2);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    ad3 *= -1;
    fb0 = fb1 && lb0;
    ad4 = fd0 - fd1;
    if (lb2) {
        ad1 *= -1;
        double ld3 = 279.7554700728264;
        fb0 = ad1 < ad2;
if(ao3 != null){
          ao2 = ao3.m4(ad3, ad4, fd0, fd1);
}
        boolean lb4 = false;
        if (fb0) {
}}
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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    boolean lb0 = false;
    Thought lo1 = Thought197.getInstance(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
    double ld2 = 65.49465423700354;
    Output.points[6][3] += ld2;
    fb0 = !fb1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, lb0, ab1, ab2, ab3);
}
    fd0 = fd1 + ld2;
    ab4 = fd0 < fd1;
    double ld3 = 778.2030653173289;

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
    ab1 = ad1 > ad2;
if(ao2 != null){
      ao2.m3();
}
    ad3 *= -1;
    ad4 = fd0 + fd1;
    Output.points[6][4] += ad1;
        boolean lb0 = false;
    double ld1 = 654.5397436985764;
    ad1 = ad2 - ad3;
    Thought lo2 = Thought259.getInstance(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ld1, ab1, ab2, ab3, ab4);
    Output.points[6][5] += ad1;
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, lb0, ab1);
}
    boolean lb3 = false;
    ad2 *= -1;

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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    double ld0 = 879.0235844355811;
    double ld1 = 105.40795009456404;
if(fo0 != null){
      fo0.m3(ld1, fd0, fd1, ld0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld0);
}
if(fo1 != null){
      ld1 = fo1.m3(fd0, fd1, ld0, ld1, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 - ld0;
    fb1 = ld1 < fd0;
    double ld2 = 981.6502994534984;
    fb0 = fb1 && fb0;
    Output.points[6][6] -= fd0;
    fd1 *= -1;
    boolean lb3 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb3, fb0);
}
    fb1 = lb3 || fb0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    ld0 = ld1 + ld2;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld1, lb3, fb0, fb1, lb3);
}
if(fo1 != null){
      fo1.m1(fb0, fb1, lb3, fb0);
}
    Output.points[6][7] -= ld2;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    boolean lb4 = true;
    boolean lb5 = false;
    lb5 = fd0 > fd1;
if(fo1 != null){
      fo1.m2(ld0, ld1, ld2, fd0);
}
    fb0 = fb1 || lb3;

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
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    ab2 = ab3 || ab4;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
    ab3 = !ab4;
    fd1 *= -1;
    for(int i0=0; i0<10; i0++){
        Thought lo0 = Thought198.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
if(fo1 != null){
          fo1.m3();
}
        ab3 = ab4 || fb0;
        boolean lb1 = false;
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, lb1, ab1);
}
        ab2 = fd0 < fd1;
        fd0 = fd1 - fd0;
        double ld2 = 715.0482042495855;
        Output.points[6][8] -= fd0;
        fd1 = ld2 - fd0;
        Thought lo3 = Thought399.getInstance(ab3, ab4, fb0, fb1);
        lb1 = ab1 && ab2;
        fd1 = ld2 - fd0;
        ab3 = fd1 > ld2;
        fd0 = fd1 + ld2;
        fd0 = fd1 - ld2;
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
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ad1 = ad2 + ad3;
    Thought lo0 = Thought280.getInstance(ad4, fd0, fd1, ad1);
    ad2 = ad3 - ad4;
    fb0 = !fb1;
    fd0 *= -1;
    Output.points[7][0] += fd1;
    fb0 = fb1 && fb0;
    ad1 = ad2 + ad3;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
    ad2 = ad3 - ad4;
    fd0 = fd1 + ad1;
if(fo0 != null){
      fo0.m2(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    boolean lb1 = true;
    fb0 = fd1 < ad1;

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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || ab1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    double ld0 = 856.4484405548365;
    ab2 = ab3 && ab4;
    fb0 = ld0 > ad1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      ab4 = fo0.m2(fb0, fb1, ab1, ab2);
}
    ab3 = fd1 > ld0;
    ab4 = ad1 > ad2;
    ad3 *= -1;
    Output.points[7][1] += ad4;
    Output.points[7][2] += fd0;

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
    fd0 = fd1 - fd0;
    fd1 *= -1;
    fd0 *= -1;
    fd1 = fd0 + fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    double ld0 = 64.11138423922833;
    double ld1 = 960.0535621229908;
    fb0 = ld0 < ld1;
    Thought lo2 = Thought128.getInstance(fd0, fd1, ld0, ld1);
    Output.points[7][3] -= fd0;
    boolean lb3 = false;
    if (fb0) {
        fb1 = lb3 && fb0;
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
    ad1 = ad2 - ad3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1);
}
    fb0 = ad2 > ad3;
    ad4 = fd0 + fd1;
    ad1 = ad2 - ad3;
    boolean lb0 = false;
    Output.points[7][4] += ad4;
    boolean lb1 = false;
    boolean lb2 = true;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 || ab4;
    fd1 = fd0 + fd1;
if(ao2 != null){
      fd0 = ao2.m3(fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
    boolean lb0 = false;
    fd1 = fd0 - fd1;
if(ao3 != null){
      ab2 = ao3.m2(ao4, fo0, fo1, ao1, ab3, ab4, fb0, fb1);
}
    fd0 *= -1;
    Thought lo1 = Thought362.getInstance();
    fd1 *= -1;
    lb0 = fd0 < fd1;
    ab1 = ab2 || ab3;
    ab4 = !fb0;
    fb1 = lb0 || ab1;
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = !lb0;
    fd0 = fd1 + fd0;

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
if(ao1 != null){
      ad1 = ao1.m3(ab2, ab3, ab4, fb0);
}
    Thought lo0 = Thought215.getInstance(ao2, ao3, ao4, fo0);
    boolean lb1 = true;
    Output.points[7][5] += ad2;
    fb0 = ad3 > ad4;
    boolean lb2 = false;
    Output.points[7][6] -= fd0;
if(ao1 != null){
      fo1 = ao1.m4(fd1, ad1, ad2, ad3);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1);
}
if(ao3 != null){
      ao2 = ao3.m4(ad2, ad3, ad4, fd0, fb0, fb1, lb1, lb2);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab1, ab2, ab3, ab4);
}
    fd1 = ad1 - ad2;

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
      fd1 = fo1.m3();
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    Thought lo0 = Thought91.getInstance(fb0, fb1, fb0, fb1);
    fb0 = fb1 || fb0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
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
    ab2 = fd1 > fd0;
    ab3 = fd1 < fd0;
    Thought lo0 = Thought82.getInstance();
    ab4 = fd1 < fd0;
    fb0 = fd1 < fd0;
    fd1 *= -1;
    fb1 = fd0 < fd1;
    ab1 = fd0 < fd1;
    boolean lb1 = true;
    Thought lo2 = Thought300.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
    boolean lb3 = true;
if(fo0 != null){
          fd0 = fo0.m3(ab4, fb0, fb1, lb1);
}
    double ld4 = 31.046238305955953;
    Thought lo5 = Thought296.getInstance(fo1, fo0, fo1, fo0);
    Thought lo6 = Thought205.getInstance(fd0, fd1, ld4, fd0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld4, fd0, fd1);
}
if(fo1 != null){
      fo1.m1(ld4, fd0, fd1, ld4, lb3, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
    lb1 = !lb3;
    fd0 = fd1 + ld4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    boolean lb7 = true;
    Thought lo8 = Thought297.getInstance();
    ab4 = !fb0;
    boolean lb9 = false;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld4, fd0, fd1, fb0, fb1, lb1, lb3);
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
    fb0 = ad1 > ad2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Output.points[7][7] -= ad3;
    double ld0 = 75.68274462194847;
    fb1 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
    boolean lb1 = true;
    boolean lb2 = false;
    Thought lo3 = Thought359.getInstance(fo0, fo1, fo0, fo1, ld0, ad1, ad2, ad3);
if(fo0 != null){
      ad4 = fo0.m3(fd0, fd1, ld0, ad1, lb2, fb0, fb1, lb1);
}
    boolean lb4 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb2, lb4, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    double ld5 = 468.04370406507866;
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, lb1, lb2, lb4, fb0);
}
    fb1 = !lb1;
    Thought lo6 = Thought399.getInstance(lb2, lb4, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Output.points[7][8] -= fd1;
if(fo0 != null){
      lb1 = fo0.m2(ld0, ld5, ad1, ad2);
}
    lb2 = lb4 && fb0;
    fb1 = lb1 && lb2;
    ad3 = ad4 + fd0;
if(fo1 != null){
      lb4 = fo1.m2(fo0, fo1, fo0, fo1, fd1, ld0, ld5, ad1);
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
      fo1 = fo0.m4(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    boolean lb0 = true;
    boolean lb1 = false;
    ab4 = !fb0;
    boolean lb2 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb0, lb1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, lb2, ab1, ab2, ab3);
}
    ab4 = ad4 < fd0;
    fd1 = ad1 - ad2;
    boolean lb3 = true;
    if (ab4) {
        ad3 = ad4 + fd0;
        fd1 *= -1;
        ad1 = ad2 + ad3;
        fb0 = fb1 || lb0;
        ad4 *= -1;
if(fo1 != null){
          lb1 = fo1.m2(lb2, lb3, ab1, ab2);
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
    if (fb0) {
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
          ao2 = ao3.m4(fd1, fd0, fd1, fd0);
}
        double ld0 = 521.292802669688;
        double ld1 = 152.91939947334825;
        Thought lo2 = Thought346.getInstance(ao4, fo0, fo1, ao1, ld1, fd0, fd1, ld0);
        Thought lo3 = Thought181.getInstance(ld1, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
        Thought lo4 = Thought108.getInstance(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
        ld1 = fd0 - fd1;
if(fo1 != null){
          fb1 = fo1.m2();
}
if(ao1 != null){
          ld0 = ao1.m3(ao2, ao3, ao4, fo0, ld1, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
          fo1 = ao1.m4(fb0, fb1, fb0, fb1);
}
        fb0 = fb1 && fb0;
        boolean lb5 = false;
        fb0 = ld1 < fd0;
        Thought lo6 = Thought108.getInstance(ao2, ao3, ao4, fo0);
        fd1 = ld0 + ld1;
        boolean lb7 = false;
        fd0 = fd1 - ld0;
        boolean lb8 = false;
        ld1 *= -1;
        lb8 = !fb0;
        fb1 = lb5 || lb7;
        if (lb8) {
            fb0 = fd0 > fd1;
            fb1 = ld0 > ld1;
            double ld9 = 499.16207805424034;
            lb5 = !lb7;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 && fb0;
if(ao1 != null){
      ad1 = ao1.m3(ad2, ad3, ad4, fd0);
}
    double ld0 = 907.4022502292216;
    fb1 = fd0 > fd1;
    fb0 = fb1 || fb0;
    ld0 = ad1 + ad2;
    fb1 = ad3 < ad4;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, ld0, ad1, ad2);
}
    Thought lo1 = Thought7.getInstance(ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
    double ld2 = 985.7745627184707;
    fb0 = ld0 > ld2;
    ad1 *= -1;

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
    ab2 = fd1 > fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab3, ab4, fb0, fb1);
}
    ab1 = !ab2;
    fd1 = fd0 + fd1;
    boolean lb0 = true;
    Output.points[8][0] -= fd0;
    boolean lb1 = true;
    ab1 = fd1 > fd0;
    Thought lo2 = Thought41.getInstance();
    fd1 = fd0 + fd1;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = !lb0;
if(ao2 != null){
      ao1 = ao2.m4(lb1, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1);
}
    double ld3 = 478.42806329882336;
if(ao2 != null){
      ld3 = ao2.m3(fd0, fd1, ld3, fd0);
}
    lb0 = fd1 < ld3;

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
    boolean lb0 = true;
    double ld1 = 151.56805420347953;
    ab1 = ad1 < ad2;
    Output.points[8][1] -= ad3;
    ad4 = fd0 - fd1;
    ld1 = ad1 + ad2;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1);
}
    ld1 *= -1;
if(ao2 != null){
      ab2 = ao2.m2(ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, lb0, ab1, ab2, ab3);
}
    fd0 = fd1 - ld1;
if(ao2 != null){
      ad1 = ao2.m3();
}
if(ao3 != null){
      ab4 = ao3.m2(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, fb0, fb1, lb0, ab1);
}
    Thought lo2 = Thought377.getInstance(ab2, ab3, ab4, fb0);
    if (fb1) {
        double ld3 = 949.5822640316333;
        boolean lb4 = true;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
        fd0 = fd1 - ld3;
        Output.points[8][2] -= ld1;
        Output.points[8][3] += ad1;
        boolean lb5 = false;
        Thought lo6 = Thought399.getInstance(ad2, ad3, ad4, fd0);
        } else if (lb0) {
        ab1 = ld1 > ad1;
        Thought lo7 = Thought12.getInstance(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
if(ao1 != null){
          fo1 = ao1.m4(fd1, ld1, ad1, ad2, ab2, ab3, ab4, fb0);
}
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, lb0, ab1, ab2);
}
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
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb1 = fb0 && fb1;
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    double ld0 = 434.71848475648216;
    boolean lb1 = false;
    Output.points[8][4] += fd0;
    fd1 = ld0 - fd0;
        boolean lb2 = false;
if(fo1 != null){
      fd1 = fo1.m3(lb2, fb0, fb1, lb1);
}
    ld0 = fd0 - fd1;
    ld0 = fd0 - fd1;
    double ld3 = 170.73243788707038;
    Output.points[8][5] += ld0;
    lb2 = ld3 < fd0;
    fd1 = ld0 + ld3;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, ld3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld3);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, ld0, ld3, fd0, fb0, fb1, lb1, lb2);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, lb1, lb2, fb0);
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
if(fo1 != null){
      fo1.m2();
}
        Thought lo0 = Thought19.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    Thought lo1 = Thought176.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fb1 = fd0 > fd1;
    double ld2 = 897.9483753716763;
if(fo0 != null){
      fb0 = fo0.m2(ld2, fd0, fd1, ld2, fb1, fb0, fb1, fb0);
}
    boolean lb3 = false;
    boolean lb4 = true;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, lb4, fb0, fb1, lb3);
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
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Output.points[8][6] += fd0;
    fb1 = !fb0;
    fd1 *= -1;
    fb1 = fb0 || fb1;
    fb0 = fd0 > fd1;
    fb1 = fb0 && fb1;
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
    Thought lo0 = Thought356.getInstance(fo1, fo0, fo1, fo0);
    fb1 = fd0 > fd1;
    fd0 = fd1 + fd0;
    fb0 = fb1 || fb0;
    boolean lb1 = true;
    fd1 = fd0 + fd1;
    boolean lb2 = false;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    Thought lo3 = Thought176.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
    boolean lb4 = false;
if(fo1 != null){
      fo1.m2(fd0, fd1, fd0, fd1, lb2, lb4, fb0, fb1);
}
    boolean lb5 = false;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, lb1, lb2, lb4, lb5);
}
    double ld6 = 623.8095371376755;
    ld6 = fd0 + fd1;
    fb0 = ld6 > fd0;
    fb1 = fd1 > ld6;

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
