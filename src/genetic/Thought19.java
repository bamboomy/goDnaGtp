package genetic;
import java.util.ArrayList;
class Thought19 extends Thought{
private static ArrayList<Thought19> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 162.17895274589424;
private double fd1 = 240.36027700261158;
private Thought fo0 = null;
private Thought fo1 = null;
Thought19 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought19 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought19 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought19 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought19 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought19 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought19 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought19 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought19 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought19 instance = new Thought19 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought19 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought19 instance = new Thought19 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought19 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought19 instance = new Thought19 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought19 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought19 instance = new Thought19 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought19 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought19 instance = new Thought19 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought19 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought19 instance = new Thought19 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought19 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought19 instance = new Thought19 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought19 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought19 instance = new Thought19 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fb0 = fb1 && fb0;
    fd0 *= -1;
    fb1 = fd1 < fd0;
    fb0 = fb1 || fb0;
    Thought lo0 = Thought96.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    double ld1 = 24.639385326834866;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0);
}
if(fo0 != null){
      fo0.m2(fd1, ld1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Thought lo2 = Thought375.getInstance(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
if(fo1 != null){
      fb1 = fo1.m2();
}
    fb0 = ld1 < fd0;
    fd1 = ld1 - fd0;
    boolean lb3 = true;
    fd1 = ld1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1, fb0, fb1, lb3, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(lb3, fb0, fb1, lb3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
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
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
    ab1 = fd1 > fd0;
    fd1 *= -1;
    ab2 = fd0 > fd1;
    ab3 = ab4 && fb0;
    fb1 = fd0 > fd1;
    double ld0 = 518.2597305996763;
    double ld1 = 490.0608928709608;
    Thought lo2 = Thought233.getInstance(fo0, fo1, fo0, fo1, ld0, ld1, fd0, fd1);
if(fo0 != null){
      ld0 = fo0.m3(ld1, fd0, fd1, ld0, ab1, ab2, ab3, ab4);
}
    Thought lo3 = Thought393.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
    boolean lb4 = true;
    ld1 = fd0 + fd1;
    ld0 = ld1 + fd0;
    fd1 = ld0 - ld1;
    fd0 = fd1 - ld0;
    boolean lb5 = true;
    ld1 *= -1;
    ab1 = fd0 > fd1;
    ab2 = ab3 && ab4;
    Thought lo6 = Thought356.getInstance();
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, ld1, fd0, fd1, fb0, fb1, lb4, lb5);
}
    ab1 = ab2 || ab3;
if(fo0 != null){
      fo1 = fo0.m4(ab4, fb0, fb1, lb4);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    boolean lb7 = false;
if(fo1 != null){
      fo0 = fo1.m4(ld0, ld1, fd0, fd1);
}
    lb5 = ld0 < ld1;
    boolean lb8 = false;

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
        double ld0 = 964.527792886128;
    fb0 = ld0 < ad1;
    double ld1 = 294.4682858869434;
    ad1 *= -1;
    Thought lo2 = Thought321.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld0, ld1, ad1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    boolean lb3 = false;
    lb3 = ad2 > ad3;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb0 = !fb1;
    double ld4 = 496.7861282015485;
    lb3 = fb0 || fb1;
    double ld5 = 88.97824697534293;

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
    ad2 = ad3 - ad4;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, ab1, ab2);
}
    ab3 = ad4 < fd0;
    boolean lb0 = true;
    fd1 = ad1 - ad2;
    ab3 = ab4 || fb0;
    ad3 *= -1;
    ad4 *= -1;
    double ld1 = 311.2927726982221;
    ad4 = fd0 - fd1;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ld1, ad1, ad2, ad3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld1);
}
    Thought lo2 = Thought241.getInstance(ad1, ad2, ad3, ad4, lb0, ab1, ab2, ab3);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb0);
}
    ab1 = !ab2;
    ab3 = fd0 < fd1;
    Output.points[6][2] += ld1;
if(fo1 != null){
      ad1 = fo1.m3();
}
    ab4 = ad2 < ad3;
    ad4 *= -1;
    fb0 = !fb1;
    Thought lo3 = Thought192.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld1, ad1, lb0, ab1, ab2, ab3);
    double ld4 = 440.87516152541735;

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
    fb0 = !fb1;
    fb0 = fb1 || fb0;
    fb1 = fb0 || fb1;
        fb0 = fb1 && fb0;
if(ao1 != null){
      fd0 = ao1.m3(fb1, fb0, fb1, fb0);
}
    fb1 = fd1 > fd0;
    boolean lb0 = false;
    if (lb0) {
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
        Thought lo1 = Thought53.getInstance(fd1, fd0, fd1, fd0);
        fb0 = fb1 && lb0;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
        boolean lb2 = false;
        } else if (fb0) {
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
    lb0 = ad2 < ad3;
    Thought lo1 = Thought202.getInstance(ad4, fd0, fd1, ad1, fb0, fb1, lb0, fb0);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, lb0, fb0, fb1);
}
    boolean lb2 = false;
    boolean lb3 = true;
if(ao2 != null){
      ad2 = ao2.m3();
}
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, lb0, lb2, lb3, fb0);
}
    double ld4 = 755.1625666462432;
if(ao2 != null){
      ao2.m2(fb1, lb0, lb2, lb3);
}
    Thought lo5 = Thought373.getInstance(ao3, ao4, fo0, fo1);

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
    ab2 = !ab3;
    double ld0 = 338.6820495581566;
    double ld1 = 574.6656507318692;
if(ao1 != null){
      ld0 = ao1.m3(ld1, fd0, fd1, ld0);
}
    ld1 *= -1;
    ab4 = fd0 < fd1;
    ld0 = ld1 - fd0;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fd1, ld0, ld1, fd0);
}
    boolean lb2 = false;
if(ao1 != null){
      ao1.m2(fd1, ld0, ld1, fd0, fb0, fb1, lb2, ab1);
}
    boolean lb3 = true;
    ab1 = fd1 > ld0;
    if (ab2) {
        ld1 = fd0 - fd1;
if(ao2 != null){
          ao2.m1(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
}
        double ld4 = 176.21173992826095;
        Thought lo5 = Thought193.getInstance();
if(ao1 != null){
          ld4 = ao1.m3(ao2, ao3, ao4, fo0, ld0, ld1, fd0, fd1, lb2, lb3, ab1, ab2);
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
if(ao3 != null){
      ao2 = ao3.m4(ab1, ab2, ab3, ab4);
}
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2);
}
if(ao4 != null){
      ao3 = ao4.m4(ad1, ad2, ad3, ad4);
}
    boolean lb0 = false;
if(fo0 != null){
      fd0 = fo0.m3(fo1, ao1, ao2, ao3, fd1, ad1, ad2, ad3);
}
if(fo0 != null){
      ao4 = fo0.m4(ad4, fd0, fd1, ad1, ab4, fb0, fb1, lb0);
}
    ab1 = ad2 < ad3;
    double ld1 = 509.28767087587414;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
}
    double ld2 = 866.702372921083;
if(fo1 != null){
      fo1.m2();
}
    double ld3 = 147.86598388990032;

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
    Output.points[6][3] -= fd1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought60.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
    boolean lb1 = false;
    boolean lb2 = false;
    lb1 = fd0 < fd1;
    double ld3 = 32.190696474748705;
    ld3 = fd0 + fd1;
    Thought lo4 = Thought311.getInstance(fo0, fo1, fo0, fo1, lb2, fb0, fb1, lb1);
    lb2 = fb0 || fb1;
if(fo0 != null){
      lb1 = fo0.m2();
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld3, fd0, fd1, ld3, lb2, fb0, fb1, lb1);
}
    fd0 *= -1;
    Thought lo5 = Thought338.getInstance(lb2, fb0, fb1, lb1);
if(fo1 != null){
          fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}

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
        fd0 = fd1 + fd0;
    Thought lo0 = Thought113.getInstance(fd1, fd0, fd1, fd0);
    ab1 = ab2 && ab3;
    boolean lb1 = false;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    ab3 = ab4 && fb0;
    if (fb1) {
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, fd0, fd1, lb1, ab1, ab2, ab3);
}
        ab4 = fb0 || fb1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb1, ab1, ab2, ab3);
}
if(fo0 != null){
          fo1 = fo0.m4();
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb1);
}
        ab1 = ab2 && ab3;
        double ld2 = 82.99204368250186;
if(fo0 != null){
          fo1 = fo0.m4(ab4, fb0, fb1, lb1);
}
        Output.points[6][4] += ld2;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        ab1 = fd0 > fd1;
        double ld3 = 992.4478792661508;
if(fo0 != null){
          fo1 = fo0.m4(ld2, ld3, fd0, fd1);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld2, ld3, fd0, fd1);
}
        ab2 = ab3 || ab4;
        Thought lo4 = Thought248.getInstance(ld2, ld3, fd0, fd1, fb0, fb1, lb1, ab1);
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
          fo0 = fo1.m4();
}
if(fo0 != null){
          ld2 = fo0.m3(fo1, fo0, fo1, fo0, ld3, fd0, fd1, ld2, fb1, lb1, ab1, ab2);
}
        ab3 = ld3 < fd0;
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
    ad2 = ad3 + ad4;
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    if (fb1) {
        Thought lo0 = Thought337.getInstance(fo1, fo0, fo1, fo0);
        Output.points[6][5] += fd0;
if(fo0 != null){
          fo1 = fo0.m4(fd1, ad1, ad2, ad3);
}
if(fo1 != null){
          ad4 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
if(fo0 != null){
          fo0.m3(ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
        ad1 *= -1;
        if (fb0) {
            boolean lb1 = false;
}}
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
      fo1.m3(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    ad2 = ad3 + ad4;
    Output.points[6][6] += fd0;
    double ld0 = 418.8213769031992;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb0 = fb1 || ab1;
    ab2 = ab3 || ab4;
        boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ad1, ab4, fb0, fb1, lb1);
}
    Thought lo2 = Thought321.getInstance(ab1, ab2, ab3, ab4);
    fb0 = ad2 < ad3;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    fb1 = ad4 > fd0;
    boolean lb3 = false;
    lb1 = fd1 < ld0;
    Thought lo4 = Thought58.getInstance(ad1, ad2, ad3, ad4);
    lb3 = !ab1;
    ab2 = !ab3;

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
    fb0 = fb1 && fb0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    fb1 = fb0 || fb1;
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought119.getInstance(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
if(ao2 != null){
      ao2.m2();
}
    fd1 = fd0 + fd1;
        fd0 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    fb0 = fb1 && fb0;
    fb1 = fb0 && fb1;
    Thought lo1 = Thought15.getInstance(fb0, fb1, fb0, fb1);
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      fb0 = ao3.m2(fd1, fd0, fd1, fd0);
}
    Output.points[6][7] -= fd1;
if(ao4 != null){
      fb1 = ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
    Output.points[6][8] += fd0;
    double ld2 = 575.0106693131937;
    Thought lo3 = Thought344.getInstance(fd0, fd1, ld2, fd0, fb0, fb1, fb0, fb1);
    Thought lo4 = Thought342.getInstance(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
    fd1 = ld2 - fd0;
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fd1, ld2, fd0, fd1, fb0, fb1, fb0, fb1);
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
if(ao2 != null){
      fb1 = ao2.m2(fb0, fb1, fb0, fb1);
}
    ad1 *= -1;
    Output.points[7][0] -= ad2;
    fb0 = fb1 && fb0;
    boolean lb0 = true;
    fb0 = fb1 && lb0;
        boolean lb1 = false;
    Thought lo2 = Thought263.getInstance(ao3, ao4, fo0, fo1);
if(ao1 != null){
      ad3 = ao1.m3(ad4, fd0, fd1, ad1);
}
    lb1 = !fb0;
    ad2 *= -1;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
}
if(ao1 != null){
      fb1 = ao1.m2(ad1, ad2, ad3, ad4, lb0, lb1, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, lb0, lb1, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    lb0 = lb1 || fb0;
    fb1 = lb0 && lb1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ad1, ad2, fb0, fb1, lb0, lb1);
}
if(ao4 != null){
      ao4.m2(fb0, fb1, lb0, lb1);
}
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
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
    fd0 = fd1 + fd0;
    ab2 = fd1 < fd0;
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    Thought lo0 = Thought72.getInstance(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
    Output.points[7][1] += fd0;
    if (ab1) {
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab2, ab3, ab4, fb0);
}
if(ao3 != null){
          ao3.m3();
}
        Thought lo1 = Thought292.getInstance(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
        Thought lo2 = Thought35.getInstance(ab4, fb0, fb1, ab1);
        fd1 = fd0 - fd1;
        boolean lb3 = false;
        ab1 = fd0 > fd1;
if(ao2 != null){
          ao2.m2(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
          fd0 = ao1.m3(fd1, fd0, fd1, fd0);
}
if(ao2 != null){
          ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
        double ld4 = 869.7378519780397;
        ab2 = !ab3;
if(ao1 != null){
          ab4 = ao1.m2(fd0, fd1, ld4, fd0, fb0, fb1, lb3, ab1);
}
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
}
        fd1 *= -1;
        ld4 = fd0 - fd1;
if(ao2 != null){
          ld4 = ao2.m3();
}
        fb1 = fd0 < fd1;
        ld4 = fd0 - fd1;
        Thought lo5 = Thought5.getInstance(ao3, ao4, fo0, fo1, ld4, fd0, fd1, ld4, lb3, ab1, ab2, ab3);
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
if(ao1 != null){
      ao1.m3(ab2, ab3, ab4, fb0);
}
    Thought lo0 = Thought1.getInstance(ao2, ao3, ao4, fo0);
if(fo1 != null){
      fo1.m2(ad2, ad3, ad4, fd0);
}
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
}
    Output.points[7][2] += fd0;
    fd1 *= -1;
    ad1 = ad2 - ad3;
    ad4 = fd0 + fd1;
    Output.points[7][3] -= ad1;
if(fo1 != null){
      ad2 = fo1.m3(ad3, ad4, fd0, fd1, fb1, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
    ad1 = ad2 - ad3;
        ad4 *= -1;
    boolean lb1 = false;
    fd0 = fd1 - ad1;
    Thought lo2 = Thought395.getInstance(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, ab4, fb0, fb1, lb1);
if(ao2 != null){
      ao1 = ao2.m4(ab1, ab2, ab3, ab4);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    fd1 = ad1 + ad2;
    double ld3 = 808.0943823787304;
if(ao3 != null){
      ao3.m1(ad2, ad3, ad4, fd0);
}
    fb0 = !fb1;
    lb1 = !ab1;
    fd1 = ld3 - ad1;

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
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    boolean lb0 = true;
    boolean lb1 = false;
    boolean lb2 = true;
    lb0 = !lb1;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, lb2, fb0, fb1, lb0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, lb1, lb2, fb0, fb1);
}
    fd0 = fd1 - fd0;
if(fo1 != null){
      fd1 = fo1.m3();
}
    fd0 = fd1 + fd0;
    double ld3 = 97.34380064556701;
    Thought lo4 = Thought237.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld3, fd0, lb0, lb1, lb2, fb0);
        for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(fb1, lb0, lb1, lb2);
}
        fd1 *= -1;
        ld3 *= -1;
if(fo0 != null){
          fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
        boolean lb5 = false;
        fd0 *= -1;
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
    boolean lb0 = false;
    fd0 *= -1;
if(fo1 != null){
      fo1.m2(fd1, fd0, fd1, fd0);
}
    Output.points[7][4] += fd1;
    fd0 = fd1 - fd0;
    fd1 *= -1;
    boolean lb1 = false;
    fd0 = fd1 - fd0;
    boolean lb2 = false;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    Thought lo3 = Thought282.getInstance(fd0, fd1, fd0, fd1, lb0, lb1, lb2, ab1);
    double ld4 = 461.1686050235283;
if(fo1 != null){
      ld4 = fo1.m3(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    double ld5 = 334.7962254921347;
if(fo0 != null){
      fo0.m3();
}
    Thought lo6 = Thought193.getInstance(fo1, fo0, fo1, fo0, ld5, fd0, fd1, ld4, fb1, lb0, lb1, lb2);
    ab1 = ld5 < fd0;
    double ld7 = 152.15338616777873;
    fd0 *= -1;
    ab2 = ab3 || ab4;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb0, lb1);
}
    lb2 = ab1 && ab2;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    Output.points[7][5] += fd1;
    Thought lo8 = Thought45.getInstance(ld4, ld5, ld7, fd0);
    fd1 = ld4 + ld5;
    Output.points[7][6] -= ld7;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld4, ld5);
}

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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 && fb1;
    ad2 = ad3 + ad4;
if(fo0 != null){
      fo0.m1(fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
    ad3 *= -1;
    Output.points[7][7] += ad4;
    fd0 = fd1 + ad1;
    fb0 = ad2 > ad3;
    Output.points[7][8] += ad4;
    fb1 = !fb0;
    Thought lo0 = Thought285.getInstance(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
    fb1 = fd0 > fd1;
    ad1 = ad2 - ad3;
    Thought lo1 = Thought236.getInstance();
        boolean lb2 = true;
    ad4 *= -1;
    lb2 = fd0 > fd1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, lb2, fb0);
}
    boolean lb3 = true;
    fb0 = fd0 > fd1;
    boolean lb4 = false;
    boolean lb5 = true;
    ad1 = ad2 + ad3;
if(fo0 != null){
      fo0.m2(lb5, fb0, fb1, lb2);
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    ad2 = ad3 - ad4;
    ab2 = ab3 || ab4;
    boolean lb0 = false;
if(fo0 != null){
      ab4 = fo0.m2(fd0, fd1, ad1, ad2);
}
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
if(fo0 != null){
      ad2 = fo0.m3(ad3, ad4, fd0, fd1, fb0, fb1, lb0, ab1);
}
    for(int i0=0; i0<10; i0++){
        boolean lb1 = true;
        boolean lb2 = false;
        boolean lb3 = false;
        ad1 = ad2 - ad3;
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1, lb3, lb0, ab1, ab2);
}
if(fo0 != null){
          ad4 = fo0.m3();
}
        boolean lb4 = true;
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
          fo0 = fo1.m4(fb1, lb1, lb2, lb3);
}
        boolean lb5 = true;
        double ld6 = 373.8901988151029;
        boolean lb7 = true;
        boolean lb8 = false;
if(fo0 != null){
          lb4 = fo0.m2(fo1, fo0, fo1, fo0);
}
        ad2 *= -1;
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
    boolean lb0 = false;
    if (lb0) {
        fb0 = fd0 < fd1;
        Output.points[8][0] += fd0;
if(ao2 != null){
          ao2.m2(fd1, fd0, fd1, fd0);
}
        fd1 = fd0 - fd1;
        Thought lo1 = Thought374.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
        double ld2 = 960.7385142313491;
if(ao1 != null){
          ao1.m2(ld2, fd0, fd1, ld2, fb1, lb0, fb0, fb1);
}
        boolean lb3 = false;
        fd0 = fd1 + ld2;
        fd0 *= -1;
if(ao2 != null){
          lb3 = ao2.m2(ao3, ao4, fo0, fo1, lb0, fb0, fb1, lb3);
}
        fd1 = ld2 + fd0;
        Thought lo4 = Thought245.getInstance();
        lb0 = fd1 > ld2;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ld2, fd0, fb0, fb1, lb3, lb0);
}
if(ao2 != null){
          ao1 = ao2.m4(fb0, fb1, lb3, lb0);
}
        fb0 = fd1 < ld2;
        fb1 = lb3 && lb0;
        fb0 = !fb1;
        boolean lb5 = true;
        Thought lo6 = Thought357.getInstance(ao3, ao4, fo0, fo1);
        Thought lo7 = Thought271.getInstance(fd0, fd1, ld2, fd0);
        Output.points[8][1] -= fd1;
        lb3 = lb5 || lb0;
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
      ao1.m1(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
}
if(ao1 != null){
      fo1 = ao1.m4(fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    ad4 *= -1;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      ao1.m1();
}
    fb1 = fb0 && fb1;
    fb0 = fd0 < fd1;
        Thought lo0 = Thought199.getInstance(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
if(ao1 != null){
      fo1 = ao1.m4(fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      fd0 = ao2.m3(fd1, ad1, ad2, ad3);
}
    ad4 *= -1;
    fb1 = fb0 && fb1;

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
    fd1 = fd0 + fd1;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
    boolean lb0 = true;
if(fo1 != null){
      fo1.m3(fd1, fd0, fd1, fd0, lb0, ab1, ab2, ab3);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab4, fb0, fb1, lb0);
}
    fd1 = fd0 - fd1;
    ab1 = ab2 && ab3;
    ab4 = fd0 < fd1;
    fb0 = fb1 && lb0;
    ab1 = ab2 && ab3;
    Thought lo1 = Thought177.getInstance();
    Output.points[8][2] += fd0;
    fd1 *= -1;

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
    Thought lo0 = Thought94.getInstance(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
    Output.points[8][3] -= fd1;
    double ld1 = 581.1346046053383;
if(fo0 != null){
      fo0.m1(fb0, fb1, ab1, ab2);
}
    Output.points[8][4] -= ld1;
    ab3 = ad1 > ad2;
    Thought lo2 = Thought67.getInstance(fo1, ao1, ao2, ao3);
    ab4 = fb0 && fb1;
if(ao4 != null){
      ab1 = ao4.m2(ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ld1, ad1, ad2, ad3);
}
if(fo0 != null){
      fo0.m1(ad4, fd0, fd1, ld1, ab2, ab3, ab4, fb0);
}
    Thought lo3 = Thought371.getInstance(fo1, ao1, ao2, ao3, fb1, ab1, ab2, ab3);
    boolean lb4 = false;
    ab3 = !ab4;
    double ld5 = 946.783180858655;
    fb0 = fb1 && lb4;
    Thought lo6 = Thought175.getInstance();
    ab1 = ld5 < ad1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      fb1 = ao4.m2(lb4, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
    lb4 = ab1 || ab2;

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
    fb1 = fd0 > fd1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fb0 = fo1.m2(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
    lb0 = fd1 > fd0;
    Output.points[8][5] -= fd1;
    fb0 = fb1 && lb0;
    fb0 = !fb1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
}
    Output.points[8][6] += fd0;
    fd1 = fd0 + fd1;
        Thought lo1 = Thought201.getInstance();
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fd0 = fo1.m3(fb1, lb0, fb0, fb1);
}
    Thought lo2 = Thought100.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
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
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    boolean lb0 = false;
    fd0 *= -1;
    Output.points[8][7] -= fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb0);
}
    fd0 *= -1;
    fd1 *= -1;
if(fo1 != null){
      ab1 = fo1.m2();
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = !lb0;
    for(int i0=0; i0<10; i0++){
        fd0 *= -1;
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
if(fo1 != null){
      fo1.m3(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    Thought lo0 = Thought13.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      fo0.m1(ad2, ad3, ad4, fd0);
}
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    double ld1 = 8.619487798741764;
if(fo1 != null){
      fb0 = fo1.m2(ad4, fd0, fd1, ld1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    ad1 *= -1;
    ad2 *= -1;
    fb0 = ad3 > ad4;
    double ld2 = 215.2689686054294;

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
    ad2 *= -1;
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    ad4 *= -1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, fb1, ab1, ab2, ab3);
}
        ab4 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Output.points[8][8] -= ad4;
    fb0 = fb1 || ab1;
    boolean lb0 = true;
    double ld1 = 907.7491074486569;
    ab1 = ad4 < fd0;
if(fo1 != null){
      ab2 = fo1.m2(fd1, ld1, ad1, ad2);
}
    double ld2 = 771.2622458045134;
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
    ab3 = ab4 || fb0;
    ld1 = ld2 - ad1;
    Thought lo3 = Thought243.getInstance(ad2, ad3, ad4, fd0, fb1, lb0, ab1, ab2);
    Output.points[0][0] -= fd1;
    ld1 = ld2 + ad1;
    ad2 = ad3 + ad4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld1, ld2, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb0, ab1);
}
    Thought lo4 = Thought276.getInstance(fo0, fo1, fo0, fo1);

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
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1);
}
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
if(ao3 != null){
      fd1 = ao3.m3(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    double ld0 = 0.6855691642196745;
    ld0 = fd0 - fd1;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    ld0 = fd0 - fd1;
if(ao3 != null){
      fb1 = ao3.m2();
}
    boolean lb1 = false;
    boolean lb2 = true;
    ld0 = fd0 + fd1;
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, ld0, fd0, fd1, ld0, lb1, lb2, fb0, fb1);
}
    for(int i0=0; i0<10; i0++){
        Thought lo3 = Thought247.getInstance(lb1, lb2, fb0, fb1);
        double ld4 = 537.4165767371289;
        Thought lo5 = Thought354.getInstance(ao3, ao4, fo0, fo1);
        Thought lo6 = Thought4.getInstance(ld0, fd0, fd1, ld4);
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld0, fd0, fd1, ld4);
}
        double ld7 = 738.4240845468461;
if(ao2 != null){
          ao1 = ao2.m4(ld7, ld0, fd0, fd1, lb1, lb2, fb0, fb1);
}
if(ao3 != null){
          ld4 = ao3.m3(ao4, fo0, fo1, ao1, lb1, lb2, fb0, fb1);
}
        Output.points[0][1] -= ld7;
        boolean lb8 = false;
if(ao2 != null){
          ao2.m2();
}
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
    fb0 = ad1 < ad2;
    ad3 *= -1;
if(ao2 != null){
      ad4 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
    fb1 = ad3 > ad4;
    double ld0 = 952.3761692947377;
    Thought lo1 = Thought331.getInstance(fb0, fb1, fb0, fb1);
    double ld2 = 579.3913857139563;
    double ld3 = 161.19048709391356;
    boolean lb4 = false;
    ad2 *= -1;
    double ld5 = 858.6835210919395;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    lb4 = fb0 && fb1;

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
    boolean lb0 = true;
    boolean lb1 = true;
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0);
}
    boolean lb2 = false;
if(fo0 != null){
      ao4 = fo0.m4(fd1, fd0, fd1, fd0, lb0, lb1, lb2, ab1);
}
    ab2 = ab3 || ab4;
    fb0 = fd1 > fd0;
    fb1 = fd1 > fd0;
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, lb0, lb1, lb2, ab1);
}
    Thought lo3 = Thought152.getInstance();
if(fo0 != null){
      fd1 = fo0.m3(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
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
if(ao2 != null){
      ao1 = ao2.m4(ab1, ab2, ab3, ab4);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    ad1 = ad2 + ad3;
if(ao3 != null){
      ao3.m3(ad4, fd0, fd1, ad1);
}
    fb0 = ad2 > ad3;
    fb1 = ad4 < fd0;
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, fd1, ad1, ad2, ad3);
}
    ab1 = ab2 && ab3;
    double ld0 = 954.8529628249983;
    Thought lo1 = Thought247.getInstance(ad3, ad4, fd0, fd1, ab4, fb0, fb1, ab1);
        ld0 = ad1 + ad2;
    boolean lb2 = true;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab1, ab2, ab3, ab4);
}
    double ld3 = 433.8450574571292;
if(ao4 != null){
      ao3 = ao4.m4();
}
    ad2 = ad3 + ad4;
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, ld0, ld3, ad1, fb0, fb1, lb2, ab1);
}
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0);
}
    Output.points[0][2] += ad2;
    double ld4 = 388.09163198477654;
    ad2 = ad3 - ad4;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, ld0, ld3);
}
    fb1 = !lb2;

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
    double ld0 = 920.3393709923747;
    Thought lo1 = Thought187.getInstance(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0);
    fb1 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 > fd1;
    fb1 = fb0 || fb1;
    fb0 = fb1 && fb0;
    ld0 = fd0 - fd1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m1();
}
    fb1 = ld0 < fd0;
    fd1 = ld0 + fd0;
    Thought lo2 = Thought316.getInstance(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1, fb0, fb1, fb0, fb1);
    boolean lb3 = true;
    lb3 = fb0 && fb1;
    Output.points[0][3] -= ld0;
if(fo0 != null){
      fd0 = fo0.m3(lb3, fb0, fb1, lb3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld0, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
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
    boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb0, lb1);
}
    fb0 = fb1 || lb0;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb1, fb0, fb1, lb0);
}
    boolean lb2 = false;
    fd1 *= -1;
    boolean lb3 = false;
    double ld4 = 547.5787113473466;
if(fo0 != null){
      fo1 = fo0.m4(lb1, lb2, lb3, fb0);
}
if(fo1 != null){
      ld4 = fo1.m3(fo0, fo1, fo0, fo1);
}
    fb1 = fd0 > fd1;
    boolean lb5 = true;
if(fo0 != null){
      lb0 = fo0.m2(ld4, fd0, fd1, ld4);
}
    Thought lo6 = Thought363.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld4, fd0);
    lb1 = fd1 > ld4;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld4, fd0, lb2, lb3, lb5, fb0);
}
    double ld7 = 207.99169966154972;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, lb0, lb1, lb2, lb3);
}
        fd0 = fd1 - ld4;
    ld7 = fd0 + fd1;
if(fo1 != null){
          fo0 = fo1.m4();
}
    Thought lo8 = Thought62.getInstance(fo0, fo1, fo0, fo1, ld4, ld7, fd0, fd1, lb5, fb0, fb1, lb0);
    lb1 = ld4 > ld7;
    boolean lb9 = true;

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
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
    fb0 = fb1 && fb0;
if(fo0 != null){
      fd0 = fo0.m3(fb1, fb0, fb1, fb0);
}
    fb1 = fd1 > fd0;
    fb0 = fb1 || fb0;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    fb1 = fd1 > fd0;
    Output.points[0][4] += fd1;
    fd0 = fd1 + fd0;
    fb0 = !fb1;
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
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
