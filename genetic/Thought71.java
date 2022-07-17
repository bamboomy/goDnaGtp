package genetic;
import java.util.ArrayList;
class Thought71 extends Thought{
private static ArrayList<Thought71> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 885.3815274049339;
private double fd1 = 231.55522494186306;
private Thought fo0 = null;
private Thought fo1 = null;
Thought71 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought71 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought71 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought71 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought71 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought71 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought71 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought71 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought71 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought71 instance = new Thought71 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought71 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought71 instance = new Thought71 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought71 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought71 instance = new Thought71 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought71 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought71 instance = new Thought71 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought71 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought71 instance = new Thought71 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought71 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought71 instance = new Thought71 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought71 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought71 instance = new Thought71 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought71 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought71 instance = new Thought71 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    Thought lo0 = Thought75.getInstance(fb0, fb1, fb0, fb1);
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    fb0 = !fb1;
    fb0 = fd1 < fd0;
    fb1 = fd1 < fd0;
    fb0 = fd1 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fb1 = !fb0;

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
    Output.points[6][3] -= fd1;
    boolean lb0 = true;
    double ld1 = 463.1070677574494;
if(fo0 != null){
      fo0.m2(ld1, fd0, fd1, ld1, ab1, ab2, ab3, ab4);
}
    fd0 = fd1 + ld1;
    fb0 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb0, ab1, ab2);
}
    boolean lb2 = false;
    Output.points[6][4] -= ld1;
    ab2 = ab3 && ab4;
    boolean lb3 = false;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1, ab4, fb0, fb1, lb0);
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
    double ld0 = 453.8482003487241;
    ld0 *= -1;
if(fo0 != null){
      fo0.m1(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ad1 = ad2 + ad3;
    ad4 *= -1;
    boolean lb1 = false;
    lb1 = fd0 < fd1;
    fb0 = !fb1;
    Output.points[6][5] -= ld0;
    lb1 = ad1 < ad2;
    fb0 = !fb1;
    lb1 = ad3 > ad4;
    boolean lb2 = true;
    Thought lo3 = Thought307.getInstance(fd0, fd1, ld0, ad1);
    ad2 = ad3 - ad4;
    boolean lb4 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ad1);
}
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0, lb2, lb4, fb0, fb1);
}
    lb1 = lb2 && lb4;
    boolean lb5 = true;
    lb5 = fb0 || fb1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, lb1, lb2, lb4, lb5);
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
    ad1 = ad2 + ad3;
        double ld0 = 52.40899567897486;
    ab1 = ad3 > ad4;
if(fo0 != null){
      ab2 = fo0.m2();
}
if(fo1 != null){
      ab3 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ad1, ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      fo0.m3(ab2, ab3, ab4, fb0);
}
    ad2 = ad3 - ad4;
    fb1 = ab1 || ab2;
        fd0 = fd1 - ld0;
    ad1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ad2 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1);
}
    double ld1 = 288.7401618645966;
    ab3 = !ab4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, ld1, ad1, ad2);
}
    boolean lb2 = true;
    boolean lb3 = false;
    boolean lb4 = false;
    ad3 = ad4 - fd0;

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
    fb0 = fd0 > fd1;
    fb1 = fd0 < fd1;
if(ao2 != null){
      fd0 = ao2.m3(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought132.getInstance(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
    fb0 = !fb1;
    Thought lo1 = Thought88.getInstance();
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fd1 = fo1.m3(fb0, fb1, fb0, fb1);
}
    fb0 = fd0 < fd1;
    boolean lb2 = false;
    fd0 = fd1 - fd0;
    fb0 = !fb1;
    double ld3 = 418.5964775263387;
    fd0 = fd1 + ld3;
    lb2 = fd0 > fd1;
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0);
}
    fb1 = ld3 < fd0;
    fd1 = ld3 + fd0;
    fd1 = ld3 + fd0;

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
    boolean lb0 = false;
    double ld1 = 608.14306840128;
    lb0 = !fb0;
if(ao2 != null){
      fb1 = ao2.m2(ld1, ad1, ad2, ad3);
}
    boolean lb2 = false;
if(ao3 != null){
      ad4 = ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, ld1, ad1);
}
    lb0 = lb2 || fb0;
    ad2 = ad3 + ad4;
    fb1 = lb0 || lb2;
    fb0 = fb1 || lb0;
    lb2 = fd0 > fd1;
if(ao2 != null){
      fb0 = ao2.m2(ld1, ad1, ad2, ad3, fb1, lb0, lb2, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, lb0, lb2, fb0);
}
    ad4 *= -1;
if(ao3 != null){
      fd0 = ao3.m3();
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, ld1, ad1, ad2, fb1, lb0, lb2, fb0);
}
    fb1 = !lb0;
    lb2 = fb0 && fb1;
if(ao4 != null){
      ao4.m2(lb0, lb2, fb0, fb1);
}
    lb0 = ad3 > ad4;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
        fd0 = fd1 + ld1;

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
    ab2 = fd1 < fd0;
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    Thought lo0 = Thought81.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
    Thought lo1 = Thought118.getInstance(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
        ab1 = ab2 && ab3;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, ab4, fb0, fb1, ab1);
}
if(ao1 != null){
      fo1 = ao1.m4();
}
    Thought lo2 = Thought347.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
    fd1 = fd0 - fd1;
    boolean lb3 = true;
    fd0 = fd1 - fd0;
    fb0 = fb1 || lb3;
    ab1 = fd1 < fd0;
    double ld4 = 280.8684237463307;
    boolean lb5 = false;
if(ao1 != null){
      fo1 = ao1.m4(ab1, ab2, ab3, ab4);
}
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1);
}
    double ld6 = 272.1888970123268;
if(ao2 != null){
      ao1 = ao2.m4(ld6, fd0, fd1, ld4);
}
    boolean lb7 = true;
    ab4 = ld6 > fd0;

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
      ad2 = ao1.m3(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      fo1.m2(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    boolean lb0 = false;
    boolean lb1 = false;
        fd0 = fd1 - ad1;
    ab4 = !fb0;
    fb1 = ad2 > ad3;
    lb0 = lb1 && ab1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
    Thought lo2 = Thought100.getInstance();
    fb1 = lb0 || lb1;
    ab1 = ad4 > fd0;

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
    double ld0 = 769.2016020510727;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fb0 = fo1.m2(fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
    ld0 = fd0 - fd1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb1 = ld0 > fd0;
    Thought lo1 = Thought339.getInstance(fd1, ld0, fd0, fd1);
    fb0 = ld0 > fd0;
    Thought lo2 = Thought282.getInstance(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1);
    Thought lo3 = Thought352.getInstance(ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
    Output.points[6][6] -= fd0;
    fb1 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    boolean lb4 = true;
    fd1 = ld0 + fd0;
if(fo0 != null){
      fd1 = fo0.m3();
}
if(fo1 != null){
      lb4 = fo1.m2(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, fb0, fb1, lb4, fb0);
}
    fd0 = fd1 - ld0;
    fd0 *= -1;
    fb1 = lb4 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(fb1, lb4, fb0, fb1);
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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fd1 = fd0 + fd1;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
    ab2 = fd1 > fd0;
    ab3 = !ab4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fb0 = fb1 && ab1;
    ab2 = !ab3;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
    ab2 = !ab3;
    fd1 = fd0 + fd1;
    ab4 = fb0 && fb1;
    Output.points[6][7] -= fd0;
    for(int i0=0; i0<10; i0++){
        boolean lb0 = true;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb0, ab1, ab2, ab3);
}
if(fo0 != null){
          fd1 = fo0.m3();
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 && fb1;
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = ad1 - ad2;
    double ld0 = 686.2159990217625;
    fb0 = fb1 || fb0;
    ad2 = ad3 - ad4;
    Thought lo1 = Thought272.getInstance(fb1, fb0, fb1, fb0);
    fb1 = fb0 || fb1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fb1 = fd0 < fd1;
    Output.points[6][8] -= ld0;
    ad1 = ad2 + ad3;
if(fo1 != null){
      fb0 = fo1.m2(ad4, fd0, fd1, ld0);
}
    boolean lb2 = true;
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
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
if(fo1 != null){
      fo1.m1(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
          fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo1 = fo0.m4();
}
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
}
        fb0 = ad3 > ad4;
        Thought lo0 = Thought115.getInstance(fb1, ab1, ab2, ab3);
if(fo0 != null){
          ab4 = fo0.m2(fo1, fo0, fo1, fo0);
}
        fd0 = fd1 - ad1;
        ad2 = ad3 - ad4;
        double ld1 = 40.391374195485184;
        ad4 *= -1;
if(fo1 != null){
          fd0 = fo1.m3(fd1, ld1, ad1, ad2);
}
        ad3 *= -1;
        ad4 = fd0 + fd1;
        boolean lb2 = false;
        ld1 = ad1 - ad2;
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
        boolean lb3 = false;
        ab3 = ab4 && fb0;
        ld1 = ad1 + ad2;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    double ld0 = 870.0469915913415;
    if (fb0) {
if(ao4 != null){
          fd0 = ao4.m3(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
        } else {
        boolean lb1 = true;
if(ao4 != null){
          ao3 = ao4.m4();
}
        fb0 = fb1 && lb1;
        fd1 = ld0 - fd0;
if(fo0 != null){
          fb0 = fo0.m2(fo1, ao1, ao2, ao3, fd1, ld0, fd0, fd1, fb1, lb1, fb0, fb1);
}
        Output.points[7][0] -= ld0;
                boolean lb2 = false;
if(fo0 != null){
          ao4 = fo0.m4(lb1, lb2, fb0, fb1);
}
        fd0 = fd1 - ld0;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
        fd0 = fd1 - ld0;
        Thought lo3 = Thought308.getInstance(fd0, fd1, ld0, fd0);
        fd1 *= -1;
        boolean lb4 = false;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, ld0, fd0, fd1, ld0);
}
        lb1 = lb2 && lb4;
if(fo1 != null){
          fb0 = fo1.m2(fd0, fd1, ld0, fd0, fb1, lb1, lb2, lb4);
}
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
    Thought lo0 = Thought166.getInstance(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
    ad1 = ad2 - ad3;
    fb0 = fb1 && fb0;
    Output.points[7][1] += ad4;
    fb1 = fb0 || fb1;
    boolean lb1 = false;
    lb1 = fb0 && fb1;
    boolean lb2 = false;
    lb1 = !lb2;
    fd0 = fd1 + ad1;
if(fo0 != null){
      ad2 = fo0.m3();
}
if(fo1 != null){
      ad3 = fo1.m3(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ad1, fb0, fb1, lb1, lb2);
}
    ad2 = ad3 - ad4;
    boolean lb3 = false;
    Thought lo4 = Thought53.getInstance(lb3, fb0, fb1, lb1);
    lb2 = fd0 > fd1;
    lb3 = ad1 < ad2;
    fb0 = fb1 || lb1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    lb2 = lb3 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
    boolean lb5 = false;
if(ao1 != null){
      ad1 = ao1.m3(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
}
    boolean lb6 = true;
    lb6 = !fb0;
    Thought lo7 = Thought20.getInstance(fd1, ad1, ad2, ad3, fb1, lb1, lb2, lb3);
        lb5 = ad4 > fd0;
    fd1 = ad1 + ad2;

Thought.STACK_COUNTER++;
return lb6;
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
    double ld0 = 663.5762226595647;
    ld0 = fd0 + fd1;
    boolean lb1 = false;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
}
if(ao2 != null){
      fb0 = ao2.m2();
}
    Thought lo2 = Thought44.getInstance(ao3, ao4, fo0, fo1, ld0, fd0, fd1, ld0, fb1, lb1, ab1, ab2);
    double ld3 = 118.8924375124346;
    boolean lb4 = false;
        ld3 *= -1;
    boolean lb5 = true;
    boolean lb6 = false;
    lb6 = ab1 && ab2;

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
if(ao2 != null){
      ao1 = ao2.m4(ab2, ab3, ab4, fb0);
}
    ad1 = ad2 + ad3;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      ad4 = ao2.m3(fd0, fd1, ad1, ad2);
}
    fb1 = ab1 || ab2;
    ab3 = ab4 && fb0;
    ad3 *= -1;
    ad4 = fd0 - fd1;
    fb1 = !ab1;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = !fb1;
if(fo1 != null){
      fo1.m2(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4();
}
    lb0 = fb0 || fb1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    fb0 = fb1 || lb0;
    Thought lo1 = Thought68.getInstance(fb0, fb1, lb0, fb0);
    fd1 *= -1;
    fb1 = !lb0;
    fb0 = !fb1;
    double ld2 = 893.7027693471233;
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      ld2 = fo0.m3(fd0, fd1, ld2, fd0);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd1, ld2, fd0, fd1);
}
    fb1 = ld2 > fd0;
    fd1 = ld2 - fd0;
    boolean lb3 = true;
    boolean lb4 = true;

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
      fo0.m1(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    boolean lb0 = false;
    fd0 = fd1 - fd0;
    double ld1 = 485.77997664612485;
    ab4 = fd0 < fd1;
    fb0 = fb1 || lb0;
    ld1 = fd0 + fd1;
    boolean lb2 = true;
    ld1 = fd0 - fd1;
    lb2 = !ab1;
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      ld1 = fo0.m3();
}
    lb0 = lb2 || ab1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = lb0 && lb2;

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
    fb0 = ad1 < ad2;
    fb1 = ad3 > ad4;
    fd0 = fd1 + ad1;
if(fo1 != null){
      fo1.m2(fb0, fb1, fb0, fb1);
}
    ad2 = ad3 - ad4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    double ld0 = 528.0183386917975;
    ad4 *= -1;
    fd0 = fd1 - ld0;
    ad1 = ad2 - ad3;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ld0);
}
    boolean lb1 = false;
    ad1 = ad2 + ad3;
    lb1 = ad4 < fd0;
    fd1 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, ad1, ad2, ad3);
}
    fb0 = ad4 > fd0;
    fd1 = ld0 - ad1;

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
    ad2 *= -1;
    boolean lb0 = true;
if(fo0 != null){
      lb0 = fo0.m2(ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
    if (fb0) {
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb0, ab1, ab2);
}
if(fo0 != null){
          fo1 = fo0.m4();
}
        ab3 = ab4 || fb0;
        Output.points[7][2] += ad1;
        fb1 = !lb0;
        ad2 *= -1;
        Thought lo1 = Thought264.getInstance(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
        fb0 = fb1 && lb0;
        double ld2 = 338.20273768579335;
if(fo0 != null){
          fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
if(fo1 != null){
          ld2 = fo1.m3(fo0, fo1, fo0, fo1);
}
        fb0 = ad1 > ad2;
        ad3 *= -1;
        fb1 = ad4 < fd0;
if(fo1 != null){
          fo0 = fo1.m4(fd1, ld2, ad1, ad2);
}
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
    boolean lb0 = true;
if(ao1 != null){
      lb0 = ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
    boolean lb1 = true;
    double ld2 = 921.1111595034691;
    Thought lo3 = Thought5.getInstance(ld2, fd0, fd1, ld2, lb1, fb0, fb1, lb0);
    fd0 = fd1 - ld2;
    boolean lb4 = true;
    lb1 = lb4 && fb0;
    fb1 = lb0 || lb1;
    lb4 = fd0 < fd1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb0, fb1, lb0, lb1);
}
if(fo1 != null){
      ld2 = fo1.m3();
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ld2, fd0, lb4, fb0, fb1, lb0);
}
    lb1 = fd1 > ld2;
if(ao1 != null){
      lb4 = ao1.m2(fb0, fb1, lb0, lb1);
}
    lb4 = fb0 || fb1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    boolean lb5 = false;
    Thought lo6 = Thought278.getInstance(fd0, fd1, ld2, fd0);
if(ao2 != null){
      lb0 = ao2.m2(ao3, ao4, fo0, fo1, fd1, ld2, fd0, fd1);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ad2 = ao1.m3(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    if (fb1) {
        ad1 = ad2 + ad3;
if(ao2 != null){
          ad4 = ao2.m3(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
        Output.points[7][3] -= fd0;
        fb0 = fb1 || fb0;
        boolean lb0 = false;
        fd1 = ad1 - ad2;
        fb0 = fb1 || lb0;
if(ao1 != null){
          ao1.m3();
}
if(ao2 != null){
          ao2.m3(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, lb0, fb0);
}
        fb1 = ad1 > ad2;
        lb0 = fb0 || fb1;
if(ao2 != null){
          ao1 = ao2.m4(lb0, fb0, fb1, lb0);
}
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
        ad3 = ad4 - fd0;
        fd1 = ad1 + ad2;
        ad3 = ad4 - fd0;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 + fd0;
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
    if (ab2) {
        boolean lb0 = true;
        for(int i0=0; i0<10; i0++){
            ab2 = fd1 < fd0;
if(ao3 != null){
              ao3.m3(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
            ab3 = !ab4;
            Thought lo1 = Thought366.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, lb0, ab1);
            ab2 = !ab3;
            Output.points[7][4] -= fd1;
            double ld2 = 561.1519594511152;
            ab4 = fb0 && fb1;
if(ao2 != null){
              ao2.m2(ao3, ao4, fo0, fo1, lb0, ab1, ab2, ab3);
}
if(ao2 != null){
              ao1 = ao2.m4();
}
if(ao3 != null){
              ao3.m1(ao4, fo0, fo1, ao1, ld2, fd0, fd1, ld2, ab4, fb0, fb1, lb0);
}
            fd0 = fd1 - ld2;
            Thought lo3 = Thought218.getInstance(ab1, ab2, ab3, ab4);
            double ld4 = 639.6776569781443;
            ld4 = fd0 - fd1;
            fb0 = fb1 && lb0;
            boolean lb5 = true;
            lb0 = ld2 > ld4;
if(ao3 != null){
              ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
            ab1 = !ab2;
            Thought lo6 = Thought155.getInstance(fd0, fd1, ld2, ld4);
if(ao2 != null){
              fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, ld2, ld4, fd0);
}
if(ao1 != null){
              ao1.m1(fd1, ld2, ld4, fd0, ab3, ab4, fb0, fb1);
}
}}
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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
}
    if (fb0) {
if(ao3 != null){
          ao2 = ao3.m4();
}
        boolean lb0 = true;
        double ld1 = 962.9172342092918;
        Thought lo2 = Thought251.getInstance(ao4, fo0, fo1, ao1, ld1, ad1, ad2, ad3, fb0, fb1, lb0, ab1);
if(ao2 != null){
          ab2 = ao2.m2(ab3, ab4, fb0, fb1);
}
        lb0 = ab1 || ab2;
if(ao3 != null){
          ao3.m3(ao4, fo0, fo1, ao1);
}
        ab3 = ad4 < fd0;
        Thought lo3 = Thought396.getInstance(fd1, ld1, ad1, ad2);
        ab4 = !fb0;
        Output.points[7][5] -= ad3;
        fb1 = !lb0;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ld1);
}
if(ao3 != null){
          ao2 = ao3.m4(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
        fb0 = fd0 < fd1;
if(ao4 != null){
          ao4.m1(fo0, fo1, ao1, ao2, fb1, lb0, ab1, ab2);
}
        for(int i0=0; i0<10; i0++){
            Output.points[7][6] += ld1;
            Output.points[7][7] += ad1;
            ab3 = ad2 < ad3;
if(ao3 != null){
              ab4 = ao3.m2();
}
            ad4 = fd0 - fd1;
            fb0 = !fb1;
            if (lb0) {
                boolean lb4 = false;
if(fo0 != null){
                  ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld1, ad1, ad2, ad3, lb0, ab1, ab2, ab3);
}
if(fo0 != null){
                  ao4 = fo0.m4(ab4, fb0, fb1, lb4);
}
}}}
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
    fb1 = fd1 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb0 = fd1 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fb0 = fb1 || fb0;
    fb1 = fd1 < fd0;
    Output.points[7][8] -= fd1;
    fb0 = fd0 < fd1;
    fb1 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    Output.points[8][0] += fd0;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fd1 = fo1.m3();
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m1(fb1, fb0, fb1, fb0);
}
    fd0 *= -1;
    fb1 = !fb0;
    fb1 = fd1 < fd0;

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
    ab1 = !ab2;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    double ld0 = 554.3025339185493;
    ab3 = ab4 || fb0;
    fb1 = ld0 > fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0);
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld0, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = ld0 < fd0;
    fd1 *= -1;
    double ld1 = 986.9021275521885;
    fb1 = ab1 || ab2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
    Output.points[8][1] -= ld0;
    for(int i0=0; i0<10; i0++){
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
    Thought lo0 = Thought364.getInstance();
    fb0 = ad2 > ad3;
    boolean lb1 = true;
    fb0 = ad4 < fd0;
    fd1 = ad1 + ad2;
    boolean lb2 = true;
    ad3 = ad4 + fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb0, fb1, lb1, lb2);
}
    boolean lb3 = false;
    fd0 = fd1 + ad1;
    ad2 = ad3 + ad4;
    Output.points[8][2] -= fd0;
    fd1 = ad1 - ad2;
if(fo0 != null){
      fo1 = fo0.m4(lb3, fb0, fb1, lb1);
}
    ad3 = ad4 - fd0;
    lb2 = lb3 && fb0;
    fb1 = lb1 && lb2;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    ad1 = ad2 - ad3;
    lb3 = fb0 || fb1;
    double ld4 = 582.8025697646008;
if(fo0 != null){
      fo0.m3(ad3, ad4, fd0, fd1);
}
    boolean lb5 = true;
    boolean lb6 = true;
    lb1 = lb2 && lb3;

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
    ad1 = ad2 - ad3;
    ad4 = fd0 + fd1;
    ad1 = ad2 - ad3;
    ab2 = !ab3;
    ab4 = !fb0;
    fb1 = ab1 || ab2;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
    boolean lb0 = false;
    Output.points[8][3] -= ad2;
    ab2 = ab3 && ab4;
    fb0 = fb1 || lb0;
if(fo1 != null){
      fo1.m1(ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
    double ld1 = 466.2360246292776;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, lb0, ab1, ab2);
}
    Output.points[8][4] -= ld1;

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
    fd1 *= -1;
    fb1 = fd0 < fd1;
    fb0 = fd0 > fd1;
    fb1 = !fb0;
if(ao2 != null){
      ao1 = ao2.m4();
}
    boolean lb0 = false;
    fb0 = fb1 || lb0;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    fd0 = fd1 - fd0;
    boolean lb1 = false;
    boolean lb2 = true;
    lb2 = !fb0;
if(ao2 != null){
      fd1 = ao2.m3(fb1, lb0, lb1, lb2);
}
    fb0 = !fb1;
    fd0 *= -1;
    Thought lo3 = Thought40.getInstance(ao3, ao4, fo0, fo1);
    fd1 = fd0 + fd1;
if(ao1 != null){
      ao1.m1(fd0, fd1, fd0, fd1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1, lb0, lb1, lb2, fb0);
}
    fb1 = !lb0;

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
    Thought lo0 = Thought107.getInstance(ao1, ao2, ao3, ao4, fb1, fb0, fb1, fb0);
if(fo0 != null){
      fo0.m1();
}
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          ad1 = fo1.m3(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
        boolean lb1 = true;
if(fo1 != null){
          fo0 = fo1.m4(fb0, fb1, lb1, fb0);
}
        fb1 = lb1 && fb0;
        fd1 = ad1 + ad2;
        boolean lb2 = true;
        Output.points[8][5] += ad3;
if(ao1 != null){
          ao1.m1(ao2, ao3, ao4, fo0);
}
        }
    ad4 = fd0 - fd1;
    boolean lb3 = false;
if(ao1 != null){
      fo1 = ao1.m4(ad1, ad2, ad3, ad4);
}
if(ao2 != null){
      lb3 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2);
}
    Thought lo4 = Thought151.getInstance(ad3, ad4, fd0, fd1, fb0, fb1, lb3, fb0);
    ad1 = ad2 + ad3;
    boolean lb5 = true;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, lb3, lb5);
}
if(ao1 != null){
      fb0 = ao1.m2();
}
    ad4 *= -1;
    fd0 = fd1 - ad1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, fb1, lb3, lb5, fb0);
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
    Output.points[8][6] += fd1;
    ab2 = ab3 || ab4;
if(ao1 != null){
      fd0 = ao1.m3(fb0, fb1, ab1, ab2);
}
    Thought lo0 = Thought201.getInstance(ao2, ao3, ao4, fo0);
    ab3 = ab4 || fb0;
    fd1 = fd0 - fd1;
    fb1 = !ab1;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    boolean lb1 = true;
    fb0 = !fb1;
    boolean lb2 = false;
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, lb1, lb2, ab1, ab2);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(ao4 != null){
      fd0 = ao4.m3(lb1, lb2, ab1, ab2);
}
    ab3 = ab4 || fb0;
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3);
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
    ab2 = ad2 > ad3;
    double ld0 = 313.90025719020827;
if(ao1 != null){
      ad3 = ao1.m3(ad4, fd0, fd1, ld0);
}
    double ld1 = 669.6116591302429;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, ld1, ad1, ad2, ad3);
}
    ad4 *= -1;
    fd0 *= -1;
    double ld2 = 5.274256904553962;
if(ao1 != null){
      fd0 = ao1.m3(fd1, ld0, ld1, ld2, ab3, ab4, fb0, fb1);
}
    ad1 = ad2 - ad3;
    double ld3 = 246.2792938312423;
    boolean lb4 = true;

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
    fb0 = !fb1;
    Thought lo0 = Thought367.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
    fb0 = fd0 < fd1;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb1, fb0);
}
    fd1 = fd0 - fd1;
    fb1 = lb1 || fb0;

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
    Thought lo0 = Thought112.getInstance(fo1, fo0, fo1, fo0);
    fb0 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    fb1 = fd0 < fd1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fd0 *= -1;
    fb1 = fb0 || fb1;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    Thought lo1 = Thought337.getInstance();
    double ld2 = 408.71995402102124;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld2, fd0, fd1, ld2, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb1 = fb0 && fb1;
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
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 *= -1;
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
        boolean lb0 = false;
    Thought lo1 = Thought392.getInstance(fd1, fd0, fd1, fd0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fb0 = fb1 || lb0;
if(fo0 != null){
      fb0 = fo0.m2(fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
}
    fd1 = fd0 + fd1;
    fb0 = fd0 > fd1;
    double ld2 = 955.2802038953115;
    fb1 = lb0 || fb0;
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
