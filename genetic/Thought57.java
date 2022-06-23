package genetic;
import java.util.ArrayList;
class Thought57 extends Thought{
private static ArrayList<Thought57> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 971.823128299823;
private double fd1 = 648.1772452703069;
private Thought fo0 = null;
private Thought fo1 = null;
Thought57 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought57 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought57 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought57 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought57 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought57 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought57 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought57 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought57 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought57 instance = new Thought57 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought57 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought57 instance = new Thought57 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought57 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought57 instance = new Thought57 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought57 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought57 instance = new Thought57 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought57 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought57 instance = new Thought57 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought57 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought57 instance = new Thought57 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought57 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought57 instance = new Thought57 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought57 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought57 instance = new Thought57 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fb0 = fd1 > fd0;
    boolean lb0 = false;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    fb0 = !fb1;
    Thought lo1 = Thought86.getInstance(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
if(fo0 != null){
      fo0.m2();
}
if(fo1 != null){
      fo1.m3(fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    fb0 = fd1 < fd0;
        fb1 = fd1 > fd0;
    fd1 = fd0 + fd1;
    fd0 *= -1;
    lb0 = fd1 > fd0;
    Thought lo2 = Thought36.getInstance(fb0, fb1, lb0, fb0);
    fd1 = fd0 - fd1;
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
    boolean lb3 = true;
    Thought lo4 = Thought61.getInstance(fo0, fo1, fo0, fo1, lb0, lb3, fb0, fb1);
    double ld5 = 912.1038267410987;
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0);
}
    lb0 = ld5 > fd0;

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
    boolean lb0 = false;
    double ld1 = 702.2749857112965;
if(fo0 != null){
      fo1 = fo0.m4(ld1, fd0, fd1, ld1, ab1, ab2, ab3, ab4);
}
    double ld2 = 366.6902226090121;
    Thought lo3 = Thought64.getInstance();
    fb0 = !fb1;
if(fo1 != null){
      ld2 = fo1.m3(fd0, fd1, ld1, ld2);
}
if(fo0 != null){
      fo0.m3(lb0, ab1, ab2, ab3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld1, ld2);
}
    Output.points[2][4] += fd0;
    if (ab4) {
        fd1 = ld1 - ld2;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld1, ld2, fb0, fb1, lb0, ab1);
}
        fd0 = fd1 - ld1;
        boolean lb4 = true;
        ab1 = ab2 && ab3;
if(fo1 != null){
          ld2 = fo1.m3(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb4);
}
        lb0 = !ab1;
if(fo0 != null){
          ab2 = fo0.m2(fo1, fo0, fo1, fo0);
}
        ab3 = fd0 > fd1;
if(fo1 != null){
          fo1.m1(ld1, ld2, fd0, fd1, ab4, fb0, fb1, lb4);
}
        lb0 = ld1 > ld2;
        fd0 *= -1;
if(fo0 != null){
          fo0.m2();
}
        ab1 = fd1 < ld1;
        boolean lb5 = true;
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
    fb1 = fb0 && fb1;
    ad2 = ad3 + ad4;
    boolean lb0 = true;
    fd0 = fd1 + ad1;
    Output.points[2][5] += ad2;
    Output.points[2][6] -= ad3;
    lb0 = fb0 || fb1;
    double ld1 = 796.7429944364436;
    double ld2 = 979.3520988859541;
    Output.points[2][7] += ad2;
    lb0 = ad3 > ad4;
    Output.points[2][8] += fd0;
    Thought lo3 = Thought23.getInstance(fd1, ld1, ld2, ad1);
if(fo1 != null){
      fb0 = fo1.m2(fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    boolean lb4 = false;
    double ld5 = 334.57523915717053;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld1, ld2, lb4, fb0, fb1, lb0);
}
    lb4 = !fb0;
    boolean lb6 = false;
    ld5 = ad1 - ad2;
    fb0 = fb1 && lb0;

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
    double ld0 = 414.75746783460386;
    ad1 = ad2 - ad3;
    ab2 = ab3 || ab4;
    fb0 = ad4 > fd0;
    fb1 = !ab1;
    boolean lb1 = false;
    Thought lo2 = Thought6.getInstance(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb0 = fb1 && lb1;
    ab1 = ab2 && ab3;
    fd1 = ld0 - ad1;
    ab4 = ad2 < ad3;
    fb0 = ad4 > fd0;
    fb1 = fd1 < ld0;
    lb1 = ad1 < ad2;
    ab1 = ad3 > ad4;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, ad1, ab2, ab3, ab4, fb0);
}
    Output.points[3][0] += ad2;
if(fo1 != null){
      ad3 = fo1.m3();
}
    ad4 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, ad1);
}
    Output.points[3][1] -= ad2;
    double ld3 = 154.25096351128872;
    boolean lb4 = false;
if(fo0 != null){
      fo0.m3(fb0, fb1, lb1, lb4);
}
    ad2 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
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
    fb0 = fd0 > fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
    fb0 = fd1 > fd0;
    fd1 *= -1;
    fd0 *= -1;
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0);
}
    fb1 = lb0 || fb0;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4();
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
    Thought lo0 = Thought4.getInstance(ad1, ad2, ad3, ad4);
    fb0 = fd0 < fd1;
    fb1 = fb0 || fb1;
    fb0 = fb1 || fb0;
if(ao3 != null){
      ao2 = ao3.m4(fb1, fb0, fb1, fb0);
}
    boolean lb1 = true;
    ad1 = ad2 - ad3;
    Thought lo2 = Thought18.getInstance(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1);
    Thought lo3 = Thought19.getInstance(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, fb0, fb1, lb1, fb0);
    Output.points[3][2] -= fd1;
    ad1 = ad2 - ad3;
    double ld4 = 199.64218518247293;
    fb1 = lb1 || fb0;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb1, lb1, fb0, fb1);
}
    boolean lb5 = true;
    ad3 = ad4 - fd0;
    double ld6 = 595.8395798238628;
    fd0 *= -1;
    double ld7 = 75.43704275943163;

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
    double ld1 = 467.9816833389702;
    lb0 = fd0 < fd1;
    Thought lo2 = Thought74.getInstance(ao2, ao3, ao4, fo0);
    ab1 = ab2 && ab3;
    double ld3 = 224.72936275403998;
    ab4 = !fb0;
if(fo1 != null){
      ld1 = fo1.m3(ld3, fd0, fd1, ld1, fb1, lb0, ab1, ab2);
}
    Output.points[3][3] -= ld3;
    fd0 *= -1;
if(ao2 != null){
      ao1 = ao2.m4();
}
    ab3 = ab4 || fb0;
    fd1 = ld1 + ld3;
if(ao3 != null){
      ao3.m2(fd0, fd1, ld1, ld3);
}
    fb1 = lb0 && ab1;
    fd0 = fd1 + ld1;
    ab2 = ab3 || ab4;
    fb0 = ld3 < fd0;
    fb1 = lb0 && ab1;
if(ao4 != null){
      ab2 = ao4.m2(ab3, ab4, fb0, fb1);
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
      ao1.m2(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
}
    fd1 = ad1 + ad2;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
    boolean lb0 = false;
    ab4 = fb0 && fb1;
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, lb0, ab1, ab2, ab3);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    ab4 = ad1 < ad2;
if(fo0 != null){
      fo0.m2(ad3, ad4, fd0, fd1, fb0, fb1, lb0, ab1);
}
    double ld1 = 853.8261000218682;
    ab2 = ab3 || ab4;
    ld1 *= -1;
    Thought lo2 = Thought26.getInstance();
if(ao1 != null){
      fo1 = ao1.m4(ad1, ad2, ad3, ad4);
}
    double ld3 = 766.8874634630278;
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, lb0, ab1);
}
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ld1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld3, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fb1, lb0, ab1, ab2);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    ad4 = fd0 - fd1;

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
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd0 = fd1 - fd0;
    boolean lb0 = false;
    boolean lb1 = true;
if(fo1 != null){
      fo1.m3(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo0.m1(lb1, fb0, fb1, lb0);
}
    lb1 = fb0 && fb1;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    lb0 = fd0 < fd1;
    lb1 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb0, lb1, fb0, fb1);
}
    lb0 = !lb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb1);
}
    fb0 = fb1 && lb0;
    Output.points[3][4] -= fd0;
    lb1 = !fb0;

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
    boolean lb0 = true;
    lb0 = !ab1;
    ab2 = ab3 || ab4;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    fd1 = fd0 - fd1;
    fb0 = fb1 || lb0;
    boolean lb1 = true;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo1.m2(fd1, fd0, fd1, fd0, lb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fo0.m2(fd1, fd0, fd1, fd0);
}
    ab4 = !fb0;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo1.m2(fb1, lb0, lb1, ab1);
}
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    Thought lo2 = Thought9.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, lb1, ab1, ab2);
}
    ab3 = !ab4;
    fd0 = fd1 - fd0;
    fb0 = fd1 < fd0;
    Output.points[3][5] -= fd1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, ad1, ad2, ad3);
}
    double ld1 = 952.0017409079201;
    fb0 = ad3 > ad4;
    boolean lb2 = true;
    boolean lb3 = true;
    lb3 = fd0 < fd1;
    boolean lb4 = false;
    Thought lo5 = Thought65.getInstance(lb4, fb0, fb1, lb0);
if(fo1 != null){
      ld1 = fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    fd0 *= -1;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, fd1, ld1, ad1, ad2, lb2, lb3, lb4, fb0);
}
        ad3 *= -1;
        ad4 = fd0 - fd1;
        ld1 *= -1;
        ad1 = ad2 - ad3;
        fb1 = ad4 < fd0;
        double ld6 = 676.8112876236271;
        lb0 = fd0 < fd1;
        lb2 = ld6 > ld1;
if(fo1 != null){
          ad1 = fo1.m3(fo0, fo1, fo0, fo1, lb3, lb4, fb0, fb1);
}
        ad2 *= -1;
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
    ab2 = !ab3;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
    lb0 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0);
}
    double ld1 = 746.5361269539079;
    ab1 = !ab2;
    Output.points[3][6] += fd0;
    ab3 = fd1 < ld1;
    double ld2 = 295.14494284162316;
    Output.points[3][7] -= ld2;

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
      ao1 = ao2.m4(fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    fb1 = fb0 || fb1;
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought44.getInstance(ao2, ao3, ao4, fo0);
    Output.points[3][8] -= fd1;
    fd0 *= -1;
if(fo1 != null){
      fo1.m3(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      fb1 = ao1.m2();
}
if(ao2 != null){
      ao2.m1(fd1, fd0, fd1, fd0);
}
    fb0 = fb1 || fb0;
    fb1 = fb0 || fb1;
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    Thought lo1 = Thought78.getInstance(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);

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
    boolean lb0 = false;
    fb0 = fb1 || lb0;
    Output.points[4][0] += ad2;
if(ao2 != null){
      ad3 = ao2.m3(ao3, ao4, fo0, fo1);
}
    ad4 *= -1;
    boolean lb1 = false;
    lb1 = fb0 && fb1;
    fd0 = fd1 + ad1;
    lb0 = lb1 && fb0;
if(ao1 != null){
      ao1.m3(ad2, ad3, ad4, fd0, fb1, lb0, lb1, fb0);
}
    fb1 = fd1 < ad1;
    Thought lo2 = Thought79.getInstance();
    boolean lb3 = false;
    Thought lo4 = Thought66.getInstance(ad2, ad3, ad4, fd0);
if(ao3 != null){
      ao2 = ao3.m4(lb0, lb1, lb3, fb0);
}
    fb1 = !lb0;
    for(int i0=0; i0<10; i0++){
        Output.points[4][1] += fd1;
        lb1 = ad1 > ad2;
        lb3 = fb0 || fb1;
if(ao4 != null){
          ao4.m1(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1);
}
        Output.points[4][2] += ad1;
        lb0 = ad2 > ad3;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = fd1 > fd0;
    boolean lb0 = true;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = fd1 > fd0;
    fd1 = fd0 + fd1;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fb1, lb0, ab1, ab2);
}
    ab3 = fd1 < fd0;
    ab4 = fb0 || fb1;
    fd1 = fd0 - fd1;
if(fo1 != null){
      lb0 = fo1.m2(ao1, ao2, ao3, ao4);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(ao1 != null){
      fd0 = ao1.m3();
}
    boolean lb1 = false;
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0);
}
    ab4 = fd1 > fd0;
if(ao4 != null){
      fb0 = ao4.m2(fb1, lb0, lb1, ab1);
}
    Thought lo2 = Thought46.getInstance(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);

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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, ab1, ab2);
}
    boolean lb0 = false;
    Output.points[4][3] += fd1;
        ab2 = ab3 && ab4;
    double ld1 = 780.6615760067352;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(ld1, ad1, ad2, ad3, fb0, fb1, lb0, ab1);
}
    ab2 = ad4 < fd0;
    Thought lo2 = Thought0.getInstance();
    Output.points[4][4] -= fd1;
    ab3 = ab4 || fb0;
if(ao3 != null){
      fb1 = ao3.m2(ld1, ad1, ad2, ad3);
}
    lb0 = ab1 || ab2;
    Output.points[4][5] += ad4;
    fd0 = fd1 + ld1;
if(ao4 != null){
      ad1 = ao4.m3(ab3, ab4, fb0, fb1);
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = !fb0;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fb1 = fd1 < fd0;
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd0 = fd1 + fd0;
if(fo0 != null){
      fb0 = fo0.m2(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fb1, lb0, fb0, fb1);
}
    fd1 = fd0 + fd1;
    fd0 *= -1;
    lb0 = !fb0;
    fb1 = lb0 || fb0;

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
    Output.points[4][6] += fd0;
    ab1 = !ab2;
    fd1 *= -1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || ab1;
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    Output.points[4][7] += fd1;
    Thought lo0 = Thought28.getInstance();
    boolean lb1 = false;
    fb0 = fb1 || lb1;
    Thought lo2 = Thought39.getInstance(fd0, fd1, fd0, fd1);
    ab1 = ab2 || ab3;
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;

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
    ad2 = ad3 + ad4;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    fd0 *= -1;
    fb0 = fb1 && fb0;
    boolean lb0 = true;
    for(int i0=0; i0<10; i0++){
        Output.points[4][8] -= fd1;
        for(int i1=0; i1<10; i1++){
            Thought lo1 = Thought70.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
if(fo1 != null){
              fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, fb0, fb1, lb0, fb0);
}
            Thought lo2 = Thought97.getInstance(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
            lb0 = fb0 || fb1;
if(fo0 != null){
              ad3 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
              ad4 = fo1.m3(fd0, fd1, ad1, ad2, lb0, fb0, fb1, lb0);
}
            ad3 = ad4 + fd0;
            Output.points[5][0] -= fd1;
            double ld3 = 489.6817068852576;
            fb0 = fb1 && lb0;
if(fo1 != null){
              fo0 = fo1.m4();
}
            }
if(fo1 != null){
          fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
        fd0 = fd1 + ad1;
if(fo1 != null){
          fo0 = fo1.m4(fb0, fb1, lb0, fb0);
}
        Thought lo4 = Thought44.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, fb1, lb0, fb0, fb1);
}
        lb0 = ad4 < fd0;
        fb0 = fd1 > ad1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
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
if(fo1 != null){
      fo1.m3(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fd0 = fo0.m3();
}
if(fo1 != null){
      fb0 = fo1.m2(fd1, ad1, ad2, ad3);
}
    ad4 = fd0 + fd1;
if(fo0 != null){
      ad1 = fo0.m3(fb1, ab1, ab2, ab3);
}
    Output.points[5][1] -= ad2;
    double ld0 = 341.707704778946;
if(fo1 != null){
      ab4 = fo1.m2(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    fb0 = fd1 > ld0;
    if (fb1) {
        ad1 *= -1;
        ad2 = ad3 + ad4;
        ab1 = fd0 < fd1;
        ld0 = ad1 + ad2;
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
        fb1 = ld0 > ad1;
if(fo1 != null){
          ab1 = fo1.m2(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
        double ld1 = 474.7686003741153;
        boolean lb2 = false;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought70.getInstance(ao1, ao2, ao3, ao4);
    Thought lo1 = Thought64.getInstance(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
    fd1 = fd0 - fd1;
    fb1 = fb0 || fb1;
    fb0 = fd0 < fd1;
    fb1 = fd0 < fd1;
    boolean lb2 = false;
if(fo0 != null){
      fo0.m2();
}
    boolean lb3 = false;
    boolean lb4 = false;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1);
}
    lb2 = !lb3;
if(ao3 != null){
      ao2 = ao3.m4(lb4, fb0, fb1, lb2);
}
    fd0 = fd1 + fd0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0);
}
    lb3 = !lb4;
    boolean lb5 = true;
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, lb5, fb0, fb1, lb2);
}
    if (lb3) {
        lb4 = !lb5;
        boolean lb6 = true;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb5, fb0, fb1, lb6);
}
        lb2 = fd1 > fd0;
if(ao3 != null){
          fd1 = ao3.m3(ao4, fo0, fo1, ao1);
}
        lb3 = !lb4;
        fd0 = fd1 - fd0;
        fd1 = fd0 - fd1;
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
if(ao3 != null){
      ao2 = ao3.m4(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = ad1 + ad2;
if(ao4 != null){
      ad3 = ao4.m3();
}
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1);
}
    Thought lo0 = Thought52.getInstance(fb0, fb1, fb0, fb1);
    ad2 = ad3 + ad4;
    boolean lb1 = false;
    lb1 = fd0 > fd1;
    fb0 = fb1 || lb1;
    boolean lb2 = true;
if(ao1 != null){
      lb2 = ao1.m2(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2, fb0, fb1, lb1, lb2);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb0, fb1, lb1, lb2);
}
    ad3 = ad4 + fd0;
    fb0 = !fb1;
        if (lb1) {
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
        lb2 = fb0 || fb1;
        boolean lb3 = true;
        lb3 = lb1 || lb2;
        fd1 *= -1;
        for(int i0=0; i0<10; i0++){
            ad1 = ad2 - ad3;
            fb0 = ad4 > fd0;
if(fo1 != null){
              fd1 = fo1.m3(ad1, ad2, ad3, ad4, fb1, lb3, lb1, lb2);
}
if(ao2 != null){
              ao1 = ao2.m4();
}
if(ao3 != null){
              fb0 = ao3.m2(fd0, fd1, ad1, ad2);
}
            Output.points[5][2] -= ad3;
}}
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 && ab3;
    ab4 = fd0 < fd1;
if(ao2 != null){
      ao2.m1(fb0, fb1, ab1, ab2);
}
    ab3 = ab4 || fb0;
    fb1 = fd0 > fd1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, fb0, fb1, ab1, ab2);
}
    Thought lo0 = Thought81.getInstance(ao2, ao3, ao4, fo0);
if(fo1 != null){
      fo1.m3(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    fd0 = fd1 - fd0;
    ab1 = fd1 < fd0;
if(ao1 != null){
      ao1.m3();
}
    ab2 = !ab3;

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
      ao2 = ao3.m4(ad1, ad2, ad3, ad4);
}
    fd0 = fd1 + ad1;
    ad2 = ad3 - ad4;
if(ao4 != null){
      ao4.m3(ab2, ab3, ab4, fb0);
}
    fb1 = ab1 || ab2;
    ab3 = fd0 > fd1;
    ab4 = fb0 && fb1;
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4);
}
    boolean lb0 = true;
    Thought lo1 = Thought22.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2, lb0, ab1, ab2, ab3);
    boolean lb2 = true;
    double ld3 = 328.0924258136699;
    double ld4 = 332.2909450631716;
    ab3 = ad1 < ad2;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, ab4, fb0, fb1, lb0);
}
    lb2 = !ab1;
    ab2 = ab3 && ab4;

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
    double ld0 = 774.2210342461473;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo1.m3(fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd1 *= -1;
    boolean lb1 = false;
if(fo0 != null){
      ld0 = fo0.m3(fd0, fd1, ld0, fd0);
}
    fd1 = ld0 + fd0;
    Output.points[5][3] += fd1;
    fb0 = fb1 && lb1;
    double ld2 = 750.7034147737297;
    Output.points[5][4] += ld0;
if(fo1 != null){
      ld2 = fo1.m3(fb0, fb1, lb1, fb0);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld0, ld2, fd0);
}
    fd1 = ld0 + ld2;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld2, lb1, fb0, fb1, lb1);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, lb1, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m3(fd1, ld0, ld2, fd0, lb1, fb0, fb1, lb1);
}
    fb0 = fb1 && lb1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb0 = fd1 < ld0;
    boolean lb3 = true;

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
      ab1 = fo0.m2(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      ab2 = fo1.m2(ab3, ab4, fb0, fb1);
}
    fd1 = fd0 + fd1;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
        Thought lo0 = Thought71.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
        fb0 = fb1 || ab1;
        ab2 = ab3 && ab4;
        fb0 = fd0 < fd1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
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
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 || fb1;
    boolean lb0 = false;
    lb0 = ad1 > ad2;
    fb0 = !fb1;
    lb0 = ad3 < ad4;
    Output.points[5][5] -= fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    double ld1 = 98.365526956695;
    boolean lb2 = false;
if(fo0 != null){
      lb2 = fo0.m2(fd0, fd1, ld1, ad1, fb0, fb1, lb0, lb2);
}
    Thought lo3 = Thought58.getInstance();
    double ld4 = 768.5123025829938;
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0);
}
    fb0 = fb1 || lb0;
    boolean lb5 = false;
    Output.points[5][6] += fd1;
    lb2 = lb5 || fb0;
    fb1 = ld1 < ld4;
if(fo0 != null){
      ad1 = fo0.m3(lb0, lb2, lb5, fb0);
}
    boolean lb6 = true;
    ad2 *= -1;
    ad3 = ad4 - fd0;

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
    ab1 = ad2 > ad3;
    ab2 = ab3 && ab4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, ab1, ab2);
}
    fd1 = ad1 + ad2;
    boolean lb0 = true;
    ab2 = !ab3;
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && lb0;
    ab1 = !ab2;
    ab3 = ad2 < ad3;
    Output.points[5][7] += ad4;
    ab4 = fb0 && fb1;
    Output.points[5][8] += fd0;
    boolean lb1 = false;
    double ld2 = 300.06379301988005;
    lb0 = !lb1;
    boolean lb3 = false;
    fd0 = fd1 - ld2;
    ad1 = ad2 - ad3;

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
    double ld0 = 543.033710831556;
    Thought lo1 = Thought63.getInstance();
    for(int i0=0; i0<10; i0++){
if(ao1 != null){
          ld0 = ao1.m3(fd0, fd1, ld0, fd0);
}
        fb0 = fd1 > ld0;
if(ao2 != null){
          ao2.m2(fb1, fb0, fb1, fb0);
}
        fb1 = fb0 || fb1;
if(ao3 != null){
          ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, ld0, fd0);
}
        fd1 *= -1;
        Thought lo2 = Thought45.getInstance(ao2, ao3, ao4, fo0, ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
        fb0 = fd0 > fd1;
        Thought lo3 = Thought49.getInstance(fo1, ao1, ao2, ao3, fb1, fb0, fb1, fb0);
        }
if(ao4 != null){
      ld0 = ao4.m3(fo0, fo1, ao1, ao2);
}
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
}
    boolean lb4 = false;
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb5 = true;
    lb5 = fb0 || fb1;
if(ao1 != null){
      ao1.m2(fd1, ld0, fd0, fd1);
}
    lb4 = ld0 > fd0;
if(ao3 != null){
      ao2 = ao3.m4(lb5, fb0, fb1, lb4);
}
if(ao4 != null){
      lb5 = ao4.m2(fo0, fo1, ao1, ao2, fd1, ld0, fd0, fd1);
}
    for(int i1=0; i1<10; i1++){
if(ao3 != null){
          ao3.m2(ao4, fo0, fo1, ao1, ld0, fd0, fd1, ld0, fb0, fb1, lb4, lb5);
}
        boolean lb6 = true;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, lb5, fb0, fb1, lb6);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 *= -1;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    ad1 = ad2 - ad3;
if(ao4 != null){
      ao3 = ao4.m4();
}
if(fo0 != null){
      fo0.m2(ad4, fd0, fd1, ad1);
}
    fb1 = ad2 < ad3;
    ad4 = fd0 - fd1;
    for(int i0=0; i0<10; i0++){
        fb0 = !fb1;
        ad1 = ad2 - ad3;
if(ao1 != null){
          fo1 = ao1.m4(fb0, fb1, fb0, fb1);
}
        boolean lb0 = false;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1);
}
        ad2 *= -1;
        ad3 = ad4 + fd0;
        lb0 = !fb0;
if(ao2 != null){
          fb1 = ao2.m2(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3, lb0, fb0, fb1, lb0);
}
if(ao1 != null){
          ao1.m2(ao2, ao3, ao4, fo0, fb0, fb1, lb0, fb0);
}
        fb1 = lb0 || fb0;
        fb1 = ad4 > fd0;
        Thought lo1 = Thought18.getInstance(fo1, ao1, ao2, ao3);
        lb0 = fb0 && fb1;
if(fo0 != null){
          ao4 = fo0.m4(fd1, ad1, ad2, ad3, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
          fo1.m1();
}
if(ao2 != null){
          ao1 = ao2.m4(ad4, fd0, fd1, ad1);
}
        fb0 = !fb1;
        ad2 = ad3 + ad4;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
    Output.points[6][0] -= fd1;
    boolean lb0 = false;
    Output.points[6][1] -= fd0;
    ab2 = ab3 || ab4;
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2, fb0, fb1, lb0, ab1);
}
    ab2 = !ab3;
    double ld1 = 880.0535193662142;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1);
}
    ab4 = !fb0;
    fb1 = lb0 || ab1;
    ab2 = ab3 || ab4;
    Thought lo2 = Thought97.getInstance(ld1, fd0, fd1, ld1, fb0, fb1, lb0, ab1);
if(ao2 != null){
      fd0 = ao2.m3();
}
    boolean lb3 = true;
    ab1 = !ab2;
if(ao3 != null){
      fd1 = ao3.m3(ld1, fd0, fd1, ld1);
}
if(ao4 != null){
      ao4.m3(ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, ao1, ao2, ao3, fd1, ld1, fd0, fd1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld1, fd0, fd1, ld1, lb0, lb3, ab1, ab2);
}
    for(int i0=0; i0<10; i0++){
        ab3 = fd0 > fd1;
if(ao4 != null){
          ld1 = ao4.m3(fo0, fo1, ao1, ao2, ab4, fb0, fb1, lb0);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ab2 = ao2.m2(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ab3 = ao1.m2(ad2, ad3, ad4, fd0, ab4, fb0, fb1, ab1);
}
if(ao2 != null){
      ab2 = ao2.m2();
}
    fd1 *= -1;
    ab3 = ad1 > ad2;
    Output.points[6][2] += ad3;
    ad4 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, ad1, ad2);
}
if(fo1 != null){
      fo0 = fo1.m4(ab4, fb0, fb1, ab1);
}
        ab2 = !ab3;
    ab4 = ad3 > ad4;
    fd0 = fd1 - ad1;
    Thought lo0 = Thought24.getInstance(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0);
    Output.points[6][3] += fd1;
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
    Output.points[6][4] += fd0;
    Output.points[6][5] -= fd1;
    Output.points[6][6] += fd0;
    double ld0 = 864.5462309285698;
    boolean lb1 = true;
    lb1 = !fb0;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, fb1, lb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        fb0 = fd1 > ld0;
    fd0 = fd1 - ld0;
    fd0 = fd1 + ld0;
    fd0 = fd1 - ld0;

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
    fb0 = fb1 && fb0;
    fb1 = fd1 > fd0;
    fd1 *= -1;
    fb0 = fd0 < fd1;
    Output.points[6][7] += fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fd1 = fd0 + fd1;
if(fo0 != null){
      fd0 = fo0.m3();
}
    fb1 = fd1 > fd0;
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
    double ld0 = 100.0969728248468;
    ld0 = fd0 - fd1;
if(fo0 != null){
      ld0 = fo0.m3(fb0, fb1, fb0, fb1);
}
    double ld1 = 513.6690281642834;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld0);
}
    Thought lo2 = Thought74.getInstance(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
    ld1 *= -1;
    fb0 = fb1 || fb0;
    fb1 = fb0 || fb1;
    fd0 *= -1;
    fd1 = ld0 - ld1;
    fd0 = fd1 + ld0;
    ld1 *= -1;
    fb0 = fd0 < fd1;
    ld0 = ld1 - fd0;
    fb1 = fb0 && fb1;

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
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fb0 = fo0.m2(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    double ld0 = 893.3942002227;
    fd0 = fd1 - ld0;
if(fo1 != null){
      fd0 = fo1.m3();
}
    fb1 = fd1 > ld0;
    fd0 *= -1;
    boolean lb1 = true;
    boolean lb2 = true;
        lb1 = lb2 && fb0;
    double ld3 = 684.7992098561251;
    Thought lo4 = Thought91.getInstance(fd0, fd1, ld0, ld3);
        fb1 = lb1 || lb2;
if(fo0 != null){
      fo0.m3(fb0, fb1, lb1, lb2);
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
