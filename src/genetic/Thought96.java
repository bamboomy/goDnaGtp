package genetic;
import java.util.ArrayList;
class Thought96 extends Thought{
private static ArrayList<Thought96> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 67.6459438972483;
private double fd1 = 385.89348385107854;
private Thought fo0 = null;
private Thought fo1 = null;
Thought96 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought96 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought96 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought96 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought96 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought96 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought96 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought96 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought96 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought96 instance = new Thought96 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought96 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought96 instance = new Thought96 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought96 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought96 instance = new Thought96 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought96 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought96 instance = new Thought96 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought96 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought96 instance = new Thought96 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought96 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought96 instance = new Thought96 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought96 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought96 instance = new Thought96 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought96 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought96 instance = new Thought96 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fb1 = fd1 > fd0;
    fb0 = fb1 && fb0;
if(fo1 != null){
      fd1 = fo1.m3();
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    boolean lb0 = true;
if(fo0 != null){
      fd0 = fo0.m3(lb0, fb0, fb1, lb0);
}
    boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd1 = fd0 + fd1;
    lb1 = fb0 || fb1;
    lb0 = fd0 < fd1;
    lb1 = fd0 > fd1;
    Output.points[2][7] -= fd0;
    fb0 = fb1 || lb0;
    lb1 = fd1 < fd0;
if(fo1 != null){
      fb0 = fo1.m2(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1, fb1, lb0, lb1, fb0);
}
    fd0 *= -1;
    fb1 = lb0 && lb1;
    double ld2 = 586.867199174171;
        fd0 = fd1 + ld2;

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
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
        fd1 = fd0 - fd1;
    fd0 *= -1;
    fb0 = fb1 || ab1;
if(fo1 != null){
      fd1 = fo1.m3();
}
    ab2 = fd0 < fd1;
    Thought lo0 = Thought266.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
    Output.points[2][8] += fd0;
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
    boolean lb1 = true;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m3(fd0, fd1, fd0, fd1);
}
    boolean lb2 = true;
    fd0 = fd1 - fd0;
    ab3 = !ab4;
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fb0 = fo0.m2(fd1, fd0, fd1, fd0, fb1, lb1, lb2, ab1);
}
    boolean lb3 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
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
    ad2 = ad3 - ad4;
if(fo1 != null){
      fb1 = fo1.m2();
}
    fb0 = fd0 < fd1;
    Thought lo0 = Thought294.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
    if (fb1) {
        fb0 = !fb1;
        fb0 = fb1 || fb0;
        fb1 = fd0 < fd1;
        ad1 *= -1;
if(fo0 != null){
          fo0.m2(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        fb0 = fb1 && fb0;
if(fo1 != null){
          fo1.m3(ad2, ad3, ad4, fd0);
}
        fb1 = !fb0;
        fb1 = fb0 || fb1;
        fb0 = fd1 < ad1;
        ad2 *= -1;
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
        Output.points[3][0] += ad1;
        fb1 = !fb0;
        Output.points[3][1] -= ad2;
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
    ad1 = ad2 - ad3;
    ab2 = ad4 < fd0;
    ab3 = !ab4;
    fb0 = !fb1;
    Thought lo0 = Thought219.getInstance(fd1, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
    fb0 = fb1 && ab1;
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    double ld1 = 685.6603749205434;
    ab1 = ad3 < ad4;
    boolean lb2 = false;
    double ld3 = 393.6763602057575;

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
    fd1 = fd0 + fd1;
    fb1 = fb0 && fb1;
if(ao2 != null){
      ao1 = ao2.m4();
}
    boolean lb0 = true;
    boolean lb1 = false;
    lb0 = lb1 && fb0;
    fb1 = !lb0;
    lb1 = fb0 && fb1;
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, lb0, lb1, fb0, fb1);
}
    lb0 = fd1 > fd0;
    lb1 = fd1 < fd0;
    fb0 = !fb1;
    lb0 = lb1 || fb0;
        if (fb1) {
        boolean lb2 = false;
        boolean lb3 = true;
        fd1 *= -1;
if(ao3 != null){
          ao2 = ao3.m4(lb2, lb3, lb0, lb1);
}
        fb0 = fb1 || lb2;
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
    boolean lb0 = false;
    boolean lb1 = false;
    ad1 = ad2 - ad3;
    lb1 = fb0 || fb1;
    lb0 = !lb1;
    fb0 = ad4 > fd0;
    boolean lb2 = false;
    fb0 = !fb1;
    lb0 = lb1 && lb2;
    boolean lb3 = true;
    boolean lb4 = false;
    fd1 *= -1;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1);
}
    ad1 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0);
}
    Output.points[3][2] -= fd1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4);
}
if(ao3 != null){
      fd0 = ao3.m3(fd1, ad1, ad2, ad3, lb3, lb4, fb0, fb1);
}
    ad4 = fd0 + fd1;
if(ao4 != null){
      ad1 = ao4.m3(fo0, fo1, ao1, ao2, lb0, lb1, lb2, lb3);
}
    lb4 = ad2 > ad3;
    ad4 = fd0 + fd1;
    Thought lo5 = Thought130.getInstance();
    double ld6 = 733.2696769588664;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ab1 = ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fd0 = fd1 - fd0;
if(fo1 != null){
      fd1 = fo1.m3(fb1, ab1, ab2, ab3);
}
    ab4 = !fb0;
    fb1 = fd0 < fd1;
    ab1 = fd0 > fd1;
    fd0 *= -1;
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0);
}
    Thought lo0 = Thought273.getInstance(fd0, fd1, fd0, fd1);
    ab2 = ab3 || ab4;
    fd0 = fd1 + fd0;
    Output.points[3][3] -= fd1;
    fd0 = fd1 - fd0;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    fb0 = fb1 && ab1;
    Thought lo1 = Thought184.getInstance(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
    double ld2 = 938.0537259663558;
    double ld3 = 260.5284436619999;
    fb1 = ld2 > ld3;
    Thought lo4 = Thought200.getInstance(fo1, ao1, ao2, ao3, ab1, ab2, ab3, ab4);
if(fo0 != null){
      ao4 = fo0.m4();
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, ld2, ld3, fb0, fb1, ab1, ab2);
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
if(ao2 != null){
      ab1 = ao2.m2(ab2, ab3, ab4, fb0);
}
if(ao3 != null){
      ad1 = ao3.m3(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(ad2, ad3, ad4, fd0);
}
    double ld0 = 305.6685503143293;
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2, fd1, ld0, ad1, ad2);
}
    Thought lo1 = Thought373.getInstance(ad3, ad4, fd0, fd1, fb1, ab1, ab2, ab3);
    double ld2 = 308.34410281817514;
    ab4 = !fb0;
    fb1 = ab1 || ab2;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab3, ab4, fb0, fb1);
}
    ab1 = ab2 || ab3;
    double ld3 = 794.1417978964192;
    ab4 = !fb0;
    fb1 = !ab1;
if(ao4 != null){
      ao3 = ao4.m4();
}
    boolean lb4 = false;

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
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m3(fb1, fb0, fb1, fb0);
}
    double ld0 = 720.6279742722242;
if(fo1 != null){
      ld0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    boolean lb1 = true;
    double ld2 = 661.4776790216348;
    if (fb0) {
if(fo0 != null){
          fb1 = fo0.m2(ld2, fd0, fd1, ld0);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld2, fd0, fd1, ld0);
}
        lb1 = ld2 < fd0;
        Output.points[3][4] -= fd1;
        double ld3 = 278.7515372959211;
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
    fd0 = fd1 - fd0;
    ab1 = fd1 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
}
        ab4 = fb0 || fb1;
    Thought lo0 = Thought112.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
          fo0 = fo1.m4(fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    double ld1 = 274.0416434116197;
    ab3 = ld1 > fd0;
    double ld2 = 380.1762120289261;
    Thought lo3 = Thought103.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld1, ld2);
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld1, ld2, ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fb1 = !ab1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb4 = false;
    ab1 = ab2 && ab3;
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, ld2, fd0, fd1, ab4, fb0, fb1, lb4);
}
    ab1 = ab2 && ab3;
if(fo0 != null){
      ab4 = fo0.m2(fb0, fb1, lb4, ab1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 && fb1;
        ad1 *= -1;
    Thought lo0 = Thought87.getInstance(ad2, ad3, ad4, fd0);
    Output.points[3][5] += fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    Thought lo1 = Thought130.getInstance(fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    ad4 = fd0 + fd1;
    double ld2 = 723.3635222553115;
if(fo0 != null){
      fo0.m2();
}
    boolean lb3 = false;
    ld2 = ad1 - ad2;

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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought333.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
    if (fb1) {
        ab1 = fd1 < ad1;
if(fo1 != null){
          fo1.m1(ab2, ab3, ab4, fb0);
}
        fb1 = ad2 > ad3;
        boolean lb1 = true;
if(fo0 != null){
          ad4 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
          lb1 = fo1.m2(fd0, fd1, ad1, ad2);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
        boolean lb2 = true;
if(fo1 != null){
          fo0 = fo1.m4(ad1, ad2, ad3, ad4, lb2, ab1, ab2, ab3);
}
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb1);
}
if(fo0 != null){
          fo1 = fo0.m4();
}
        lb2 = ab1 && ab2;
        fd1 = ad1 + ad2;
        ab3 = ad3 > ad4;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, ab4, fb0, fb1, lb1);
}
        lb2 = ab1 || ab2;
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
      ao2 = ao3.m4(fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2);
}
    fb1 = !fb0;
    fb1 = fd0 < fd1;
    fb0 = fd0 > fd1;
    fd0 *= -1;
    fd1 *= -1;
    Thought lo0 = Thought108.getInstance(fd0, fd1, fd0, fd1);
    fd0 *= -1;
    Thought lo1 = Thought56.getInstance(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
    boolean lb2 = true;
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0, fb0, fb1, lb2, fb0);
}
    fb1 = lb2 && fb0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, lb2, fb0, fb1);
}
    boolean lb3 = false;

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
            boolean lb0 = true;
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, fb0, fb1, lb0, fb0);
}
if(ao2 != null){
      fb1 = ao2.m2(lb0, fb0, fb1, lb0);
}
    fb0 = fd1 < ad1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao4 != null){
      ao3 = ao4.m4(ad2, ad3, ad4, fd0);
}
    fd1 = ad1 + ad2;
    ad3 *= -1;
    ad4 = fd0 + fd1;
    for(int i0=0; i0<10; i0++){
        ad1 *= -1;
if(fo0 != null){
          fo0.m3(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0);
}
if(ao4 != null){
          fb1 = ao4.m2(fd1, ad1, ad2, ad3, lb0, fb0, fb1, lb0);
}
        fb0 = !fb1;
        ad4 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
          fo0 = fo1.m4();
}
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2, fb0, fb1, lb0, fb0);
}
        ad3 *= -1;
        ad4 = fd0 - fd1;
if(ao1 != null){
          ao1.m3(fb1, lb0, fb0, fb1);
}
if(ao2 != null){
          ao2.m3(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
          ad1 = ao1.m3(ad2, ad3, ad4, fd0);
}
        double ld1 = 362.2599905123767;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = fd1 < fd0;
    boolean lb0 = false;
    ab2 = ab3 || ab4;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    fb0 = fd1 < fd0;
    boolean lb1 = true;
    fd1 = fd0 - fd1;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb1);
}
    ab1 = fd0 < fd1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab2, ab3, ab4, fb0);
}
    fb1 = lb0 || lb1;
if(ao3 != null){
      ao3.m1();
}
if(ao4 != null){
      ab1 = ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = !lb0;
        lb1 = fd0 < fd1;
if(ao3 != null){
      ab1 = ao3.m2(ab2, ab3, ab4, fb0);
}
    fd0 = fd1 + fd0;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 632.873363872878;
    boolean lb1 = false;
    Thought lo2 = Thought109.getInstance(ao2, ao3, ao4, fo0);
    Thought lo3 = Thought124.getInstance(ad1, ad2, ad3, ad4);
    Output.points[3][6] -= fd0;
if(fo1 != null){
      lb1 = fo1.m2(ao1, ao2, ao3, ao4, fd1, ld0, ad1, ad2);
}
    boolean lb4 = false;
    ad3 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ld0, lb4, ab1, ab2, ab3);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab4, fb0, fb1, lb1);
}
    boolean lb5 = true;
if(ao2 != null){
      ao1 = ao2.m4();
}
    double ld6 = 995.1485115118618;
    lb4 = ld6 < ad1;
    double ld7 = 800.4184562816783;
    boolean lb8 = false;
    lb5 = !lb8;

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
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 > fd0;
if(fo0 != null){
      fo0.m2(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Thought lo0 = Thought24.getInstance(fd1, fd0, fd1, fd0);
    Thought lo1 = Thought60.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
    fb0 = fb1 || fb0;
    Thought lo2 = Thought382.getInstance(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 < fd1;
if(fo0 != null){
      fb0 = fo0.m2();
}
    fb1 = fd0 < fd1;
    boolean lb3 = true;
    Thought lo4 = Thought11.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb3, fb0, fb1, lb3);
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb3, fb0);
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
    ab1 = fd1 > fd0;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    ab2 = ab3 || ab4;
    Output.points[3][7] -= fd1;
    Thought lo0 = Thought390.getInstance(fd0, fd1, fd0, fd1);
    fd0 = fd1 - fd0;
    fb0 = fd1 > fd0;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    double ld1 = 396.1665237960288;
if(fo1 != null){
      fo1.m3(fd0, fd1, ld1, fd0, fb1, ab1, ab2, ab3);
}
    fd1 = ld1 - fd0;
    double ld2 = 447.24299658864044;
if(fo0 != null){
      ab4 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
    Thought lo3 = Thought143.getInstance();
    ab3 = ab4 || fb0;
    Output.points[3][8] -= fd0;
    fb1 = ab1 || ab2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld1, ld2, fd0, ab3, ab4, fb0, fb1);
}
    Output.points[4][0] -= fd1;

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
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1);
}
    Thought lo0 = Thought322.getInstance(ad3, ad4, fd0, fd1);
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    Output.points[4][1] += ad4;
    fd0 = fd1 - ad1;
    Thought lo1 = Thought145.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fb0 = fo0.m2(ad1, ad2, ad3, ad4);
}
    Thought lo2 = Thought45.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    double ld3 = 349.63929082188093;

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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    boolean lb0 = false;
    ad3 = ad4 + fd0;
    boolean lb1 = true;
if(fo0 != null){
      fo0.m2();
}
    fd1 = ad1 + ad2;
    ab4 = fb0 || fb1;
    lb0 = lb1 && ab1;
    Thought lo2 = Thought13.getInstance(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
    ad1 = ad2 + ad3;
    Thought lo3 = Thought378.getInstance(fb1, lb0, lb1, ab1);
    Output.points[4][2] -= ad4;
    fd0 *= -1;
    ab2 = fd1 > ad1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ab3 = ad2 < ad3;
    Output.points[4][3] += ad4;
    fd0 = fd1 + ad1;
    Thought lo4 = Thought189.getInstance(ad2, ad3, ad4, fd0);
    Thought lo5 = Thought37.getInstance(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);

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
if(ao2 != null){
      ao2.m3(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    fb1 = lb0 && fb0;
    fb1 = fd0 < fd1;
    Output.points[4][4] -= fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb0, fb0, fb1, lb0);
}
    Thought lo1 = Thought63.getInstance();
    double ld2 = 255.29449253501414;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ld2, fd0, fb0, fb1, lb0, fb0);
}
        fb1 = fd1 > ld2;
if(ao3 != null){
      fd0 = ao3.m3(lb0, fb0, fb1, lb0);
}
if(ao4 != null){
      fb0 = ao4.m2(fo0, fo1, ao1, ao2);
}
    boolean lb3 = true;
if(ao3 != null){
      ao3.m3(fd1, ld2, fd0, fd1);
}
if(ao4 != null){
      ld2 = ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, ld2, fd0);
}
if(ao4 != null){
      ao3 = ao4.m4(fd1, ld2, fd0, fd1, fb0, fb1, lb0, lb3);
}
    fb0 = fb1 && lb0;
if(fo0 != null){
      ld2 = fo0.m3(fo1, ao1, ao2, ao3, lb3, fb0, fb1, lb0);
}
    lb3 = fd0 < fd1;
    fb0 = !fb1;
    lb0 = !lb3;
    ld2 *= -1;
if(ao4 != null){
      fb0 = ao4.m2();
}
    Thought lo4 = Thought32.getInstance(fo0, fo1, ao1, ao2, fd0, fd1, ld2, fd0, fb1, lb0, lb3, fb0);
    fd1 = ld2 - fd0;
    for(int i0=0; i0<10; i0++){
if(ao3 != null){
          ao3.m2(fb1, lb0, lb3, fb0);
}
        fd1 = ld2 + fd0;
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
    fb1 = !fb0;
    Thought lo0 = Thought282.getInstance(ao2, ao3, ao4, fo0);
    double ld1 = 319.5006947112448;
    Thought lo2 = Thought1.getInstance(ld1, ad1, ad2, ad3);
    Output.points[4][5] -= ad4;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, ld1, ad1);
}
if(ao1 != null){
      fo1 = ao1.m4(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    Output.points[4][6] += fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ao2.m3();
}
if(ao3 != null){
      ld1 = ao3.m3(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    Thought lo3 = Thought139.getInstance(fb1, fb0, fb1, fb0);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      ab1 = ao2.m2(fd0, fd1, fd0, fd1);
}
        double ld1 = 514.3361892747201;
if(ao3 != null){
      ab2 = ao3.m2(ao4, fo0, fo1, ao1, ld1, fd0, fd1, ld1);
}
    Thought lo2 = Thought22.getInstance(fd0, fd1, ld1, fd0, ab3, ab4, fb0, fb1);
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, lb0, ab1, ab2, ab3);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
    ab4 = fb0 && fb1;
    double ld3 = 315.7723769203721;
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, ld1, ld3, fd0, lb0, ab1, ab2, ab3);
}
    boolean lb4 = false;

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
      ao2.m2(ab1, ab2, ab3, ab4);
}
    ad1 *= -1;
    boolean lb0 = false;
    ab4 = ad2 > ad3;
if(ao3 != null){
      ad4 = ao3.m3(ao4, fo0, fo1, ao1);
}
    fb0 = fd0 < fd1;
    boolean lb1 = true;
if(ao2 != null){
      ad1 = ao2.m3(ad2, ad3, ad4, fd0);
}
    fd1 = ad1 - ad2;
    Output.points[4][7] += ad3;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ad1);
}
    ad2 *= -1;
if(ao3 != null){
      ao3.m2(ad3, ad4, fd0, fd1, fb0, fb1, lb0, lb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      ao4 = fo0.m4();
}
    fb0 = ad1 > ad2;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1, fb1, lb0, lb1, ab1);
}
    ad1 = ad2 - ad3;
    Thought lo2 = Thought162.getInstance(ab2, ab3, ab4, fb0);
    Thought lo3 = Thought33.getInstance(fo1, ao1, ao2, ao3);
if(ao4 != null){
      ao4.m3(ad4, fd0, fd1, ad1);
}
    ad2 = ad3 - ad4;
    boolean lb4 = false;
    double ld5 = 552.1461478425348;

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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
        fb1 = fb0 || fb1;
    fb0 = fd1 < fd0;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
          fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = fd0 - fd1;
    Thought lo0 = Thought223.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    Output.points[4][8] -= fd0;

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
    for(int i0=0; i0<10; i0++){
        fd1 = fd0 + fd1;
        Thought lo0 = Thought56.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
        boolean lb1 = true;
if(fo1 != null){
          fo0 = fo1.m4(ab4, fb0, fb1, lb1);
}
        fd0 = fd1 - fd0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        fd1 *= -1;
        ab1 = ab2 && ab3;
if(fo0 != null){
          ab4 = fo0.m2(fd0, fd1, fd0, fd1);
}
        fb0 = fd0 > fd1;
        Thought lo2 = Thought264.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
        fd0 = fd1 - fd0;
        fd1 = fd0 + fd1;
        fd0 = fd1 - fd0;
        fb1 = fd1 < fd0;
        fd1 = fd0 - fd1;
        Thought lo3 = Thought270.getInstance(fd0, fd1, fd0, fd1, lb1, ab1, ab2, ab3);
        Output.points[5][0] += fd0;
        double ld4 = 866.7742367210465;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb1);
}
        ab1 = ab2 && ab3;
if(fo1 != null){
          ab4 = fo1.m2();
}
        }
    fd1 = fd0 - fd1;
    fb1 = ab1 && ab2;

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
    fb0 = ad1 < ad2;
    Thought lo0 = Thought307.getInstance(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
    fb1 = fb0 || fb1;
if(fo1 != null){
      ad1 = fo1.m3(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    fb0 = fb1 && fb0;
if(fo1 != null){
      fb1 = fo1.m2(ad2, ad3, ad4, fd0);
}
    Thought lo1 = Thought246.getInstance(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
    ad4 = fd0 + fd1;
    boolean lb2 = false;

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
    ab1 = ab2 && ab3;
    ad1 = ad2 + ad3;
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ad1, ab4, fb0, fb1, ab1);
}
    double ld0 = 679.0411708870662;
    ab2 = ab3 && ab4;
    boolean lb1 = true;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb1);
}
if(fo1 != null){
          fo1.m3();
}
        ad1 = ad2 + ad3;
        for(int i1=0; i1<10; i1++){
            ab1 = !ab2;
            ab3 = ab4 && fb0;
            ad4 = fd0 - fd1;
            ld0 = ad1 + ad2;
if(fo0 != null){
              ad3 = fo0.m3(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld0, fb1, lb1, ab1, ab2);
}
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
        boolean lb0 = true;
    Thought lo1 = Thought228.getInstance(fd1, fd0, fd1, fd0);
    Thought lo2 = Thought275.getInstance(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
    fb0 = fd1 < fd0;
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
if(ao3 != null){
      lb0 = ao3.m2(ao4, fo0, fo1, ao1, fb0, fb1, lb0, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    fd1 *= -1;
    Output.points[5][1] += fd0;
    fd1 *= -1;
if(ao4 != null){
          ao4.m1(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
    Thought lo3 = Thought50.getInstance(lb0, fb0, fb1, lb0);
    boolean lb4 = true;
    Output.points[5][2] -= fd0;
    double ld5 = 92.39666534721486;
    Thought lo6 = Thought282.getInstance(ao3, ao4, fo0, fo1);
if(ao1 != null){
      ao1.m3(fd0, fd1, ld5, fd0);
}
    Thought lo7 = Thought270.getInstance(ao2, ao3, ao4, fo0, fd1, ld5, fd0, fd1);
    Thought lo8 = Thought76.getInstance(ld5, fd0, fd1, ld5, lb4, fb0, fb1, lb0);

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
    fb1 = fb0 && fb1;
    fb0 = fb1 && fb0;
    boolean lb0 = true;
    Thought lo1 = Thought2.getInstance(ao1, ao2, ao3, ao4, fb0, fb1, lb0, fb0);
if(fo1 != null){
      fo0 = fo1.m4();
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, fb1, lb0, fb0, fb1);
}
    Output.points[5][3] += fd1;
    lb0 = fb0 || fb1;
    Thought lo2 = Thought173.getInstance(lb0, fb0, fb1, lb0);
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fo1.m3(ad1, ad2, ad3, ad4);
}
    double ld3 = 863.0448324635431;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ld3);
}
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4, fb1, lb0, fb0, fb1);
}
    Thought lo4 = Thought174.getInstance(ao3, ao4, fo0, fo1, lb0, fb0, fb1, lb0);
    fb0 = fd0 > fd1;

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
    boolean lb0 = false;
    fd0 *= -1;
if(ao2 != null){
      fd1 = ao2.m3();
}
if(ao3 != null){
          lb0 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fd0 = fd1 + fd0;
if(ao2 != null){
      ao2.m3(fb0, fb1, lb0, ab1);
}
    fd1 = fd0 + fd1;
    double ld1 = 334.95427324731753;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    ab2 = ab3 || ab4;
if(ao4 != null){
      ao3 = ao4.m4(ld1, fd0, fd1, ld1);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 *= -1;
    Thought lo0 = Thought377.getInstance(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1);
if(fo1 != null){
      fo1.m3(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fd1 = fo1.m3();
}
    ad1 = ad2 - ad3;
    ab4 = !fb0;
    double ld1 = 962.1086865703458;
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
    boolean lb2 = false;
    ab4 = !fb0;
    fb1 = ld1 < ad1;
if(fo1 != null){
      lb2 = fo1.m2(ab1, ab2, ab3, ab4);
}
    boolean lb3 = false;
    Output.points[5][4] -= ad2;
    double ld4 = 449.4739917262637;
    ad2 *= -1;
    ab4 = !fb0;
    Output.points[5][5] -= ad3;
    fb1 = ad4 > fd0;
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fo1.m1(ld1, ld4, ad1, ad2);
}
    lb2 = !lb3;

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
    double ld0 = 230.97850692597726;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
}
    boolean lb1 = true;
    boolean lb2 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb2, fb0, fb1, lb1);
}
    fd1 = ld0 + fd0;
    fd1 = ld0 + fd0;
    lb2 = fb0 && fb1;
if(fo0 != null){
      lb1 = fo0.m2();
}
    Thought lo3 = Thought281.getInstance(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1, lb2, fb0, fb1, lb1);
    lb2 = ld0 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb1, lb2);
}
    fb0 = fb1 && lb1;
    fd1 = ld0 + fd0;
if(fo1 != null){
      lb2 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m3(fd1, ld0, fd0, fd1);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, fd0, fb0, fb1, lb1, lb2);
}
    fb0 = fd1 < ld0;
    fd0 = fd1 + ld0;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, lb1, lb2, fb0, fb1);
}
    double ld4 = 740.3499292676166;
    double ld5 = 101.19448061382215;
    boolean lb6 = false;

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
      fo1 = fo0.m4();
}
    fb0 = fd1 < fd0;
    fb1 = fb0 || fb1;
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fd0 = fo1.m3(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fb0 = !fb1;
    fd1 *= -1;
    double ld0 = 732.0820036361902;
if(fo0 != null){
      fo1 = fo0.m4(ld0, fd0, fd1, ld0);
}
    boolean lb1 = false;
    double ld2 = 883.5253365178802;
    double ld3 = 134.5293729893637;
    lb1 = !fb0;
    double ld4 = 563.4298170748145;
    ld2 *= -1;
    fb1 = !lb1;
if(fo1 != null){
      ld3 = fo1.m3(fo0, fo1, fo0, fo1, ld4, fd0, fd1, ld0);
}
    ld2 *= -1;
    boolean lb5 = true;
    Thought lo6 = Thought358.getInstance(ld3, ld4, fd0, fd1, lb5, fb0, fb1, lb1);
    ld0 = ld2 + ld3;
    ld4 = fd0 + fd1;
    lb5 = fb0 || fb1;
if(fo0 != null){
      lb1 = fo0.m2(fo1, fo0, fo1, fo0, lb5, fb0, fb1, lb1);
}
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
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought73.getInstance(fo1, fo0, fo1, fo0);
    fd1 = fd0 - fd1;
    boolean lb1 = true;
    lb1 = fb0 && fb1;
    fd0 *= -1;
    lb1 = !fb0;
    fd1 = fd0 - fd1;
    fb1 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    Thought lo2 = Thought189.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
    Output.points[5][6] += fd0;
if(fo0 != null){
          fo1 = fo0.m4(fd1, fd0, fd1, fd0, lb1, fb0, fb1, lb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb1, fb0);
}
    fd1 *= -1;
if(fo1 != null){
      fd0 = fo1.m3();
}
    fd1 = fd0 + fd1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, lb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(lb1, fb0, fb1, lb1);
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
