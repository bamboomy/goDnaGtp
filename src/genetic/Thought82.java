package genetic;
import java.util.ArrayList;
class Thought82 extends Thought{
private static ArrayList<Thought82> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 189.27904537554332;
private double fd1 = 703.7238554590864;
private Thought fo0 = null;
private Thought fo1 = null;
Thought82 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought82 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought82 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought82 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought82 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought82 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought82 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought82 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought82 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought82 instance = new Thought82 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought82 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought82 instance = new Thought82 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought82 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought82 instance = new Thought82 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought82 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought82 instance = new Thought82 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought82 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought82 instance = new Thought82 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought82 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought82 instance = new Thought82 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought82 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought82 instance = new Thought82 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought82 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought82 instance = new Thought82 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
        if (fb1) {
        fd0 = fd1 - fd0;
if(fo1 != null){
          fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
          fb0 = fo0.m2();
}
        boolean lb0 = true;
        fb0 = fb1 && lb0;
        boolean lb1 = true;
        Thought lo2 = Thought31.getInstance(fd1, fd0, fd1, fd0, lb1, fb0, fb1, lb0);
        Thought lo3 = Thought59.getInstance(fo1, fo0, fo1, fo0);
        fd1 = fd0 + fd1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb0);
}
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb0);
}
if(fo0 != null){
          fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
        Output.points[0][3] -= fd1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
          lb1 = fo1.m2(fb0, fb1, lb0, lb1);
}
        boolean lb4 = true;
        fd0 = fd1 - fd0;
if(fo1 != null){
          fo0 = fo1.m4();
}
        Thought lo5 = Thought85.getInstance(fd1, fd0, fd1, fd0, lb4, fb0, fb1, lb0);
if(fo0 != null){
          lb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb4, fb0, fb1, lb0);
}
        double ld6 = 915.4432251696466;
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
    fd1 *= -1;
    Output.points[0][4] -= fd0;
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
        fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    ab1 = ab2 && ab3;
if(fo1 != null){
      fo0 = fo1.m4(ab4, fb0, fb1, ab1);
}
    ab2 = ab3 || ab4;
    fb0 = fb1 || ab1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb0 = false;
    ab1 = ab2 && ab3;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
}
    fd1 = fd0 + fd1;
    Output.points[0][5] += fd0;
    Thought lo1 = Thought23.getInstance(fo1, fo0, fo1, fo0);
    fd1 *= -1;
    ab1 = !ab2;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
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
    fb0 = ad2 < ad3;
    double ld0 = 522.7800402271432;
    boolean lb1 = true;
    fb0 = ad3 < ad4;
    fb1 = fd0 > fd1;
    ld0 = ad1 - ad2;
if(fo0 != null){
          ad3 = fo0.m3(fo1, fo0, fo1, fo0, lb1, fb0, fb1, lb1);
}
    ad4 *= -1;
if(fo1 != null){
      fo1.m2(fd0, fd1, ld0, ad1);
}
    fb0 = ad2 > ad3;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld0);
}
    fb1 = !lb1;
    double ld2 = 301.95609844165625;
    boolean lb3 = true;
    lb3 = ld2 < ad1;
    fb0 = ad2 < ad3;
if(fo0 != null){
      fo1 = fo0.m4(fb1, lb1, lb3, fb0);
}
    boolean lb4 = true;
if(fo0 != null){
      fo1 = fo0.m4();
}
    Output.points[0][6] -= ad4;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, ld2, fb0, fb1, lb1, lb3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
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
    Output.points[0][7] -= ad1;
    ab1 = !ab2;
    Thought lo0 = Thought52.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
    ab1 = ab2 && ab3;
if(fo1 != null){
      ab4 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
    fd1 *= -1;
if(fo0 != null){
      fo0.m3(ad1, ad2, ad3, ad4);
}
    boolean lb1 = false;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
if(fo0 != null){
      fo0.m1(ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo1.m2();
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
    boolean lb0 = false;
if(ao1 != null){
      ao1.m3(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
    fb0 = fb1 && lb0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fb0 = !fb1;
    Thought lo1 = Thought47.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4, fb0, fb1, lb0, fb0);
}
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
    fb1 = !lb0;
    boolean lb2 = true;
    fd0 *= -1;
if(fo0 != null){
      fo0.m3(fd1, fd0, fd1, fd0);
}
    lb2 = fb0 && fb1;
    lb0 = fd1 < fd0;
    fd1 *= -1;
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1);
}
    lb2 = fd0 < fd1;
    double ld3 = 485.81755822244054;
if(fo0 != null){
      ld3 = fo0.m3(fb0, fb1, lb0, lb2);
}
if(fo1 != null){
      fd0 = fo1.m3();
}
if(ao2 != null){
      ao1 = ao2.m4(fd1, ld3, fd0, fd1, fb0, fb1, lb0, lb2);
}
    Thought lo4 = Thought93.getInstance(ao3, ao4, fo0, fo1);
    boolean lb5 = false;

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
    ad1 = ad2 - ad3;
    double ld0 = 493.0576296051214;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    boolean lb1 = true;
    ld0 *= -1;
    ad1 = ad2 - ad3;
    ad4 = fd0 + fd1;
    ld0 *= -1;
    ad1 *= -1;
    double ld2 = 474.04446208770213;
    lb1 = fb0 || fb1;
    lb1 = ad1 < ad2;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 990.0400162523656;
if(ao1 != null){
      ld0 = ao1.m3(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
}
    fd0 = fd1 + ld0;
    fb1 = fd0 > fd1;
    double ld1 = 433.79550029055093;
    Thought lo2 = Thought51.getInstance(ld0, ld1, fd0, fd1);
    ab1 = ld0 < ld1;
    ab2 = fd0 > fd1;
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4, ld0, ld1, fd0, fd1);
}
    ab3 = !ab4;
    fb0 = ld0 > ld1;
    fb1 = !ab1;
if(fo0 != null){
      fd0 = fo0.m3(ab2, ab3, ab4, fb0);
}
    fb1 = fd1 > ld0;
    ld1 *= -1;
    ab1 = fd0 < fd1;
    ab2 = ld0 < ld1;

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
if(ao3 != null){
      ao2 = ao3.m4();
}
    Output.points[0][8] += ad2;
if(ao4 != null){
      ao4.m3(ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
    double ld0 = 79.04351010931852;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    Thought lo1 = Thought54.getInstance(fo0, fo1, ao1, ao2, ld0, ad1, ad2, ad3, fb0, fb1, ab1, ab2);
    double ld2 = 807.9328293362814;
if(ao3 != null){
      ab3 = ao3.m2(ao4, fo0, fo1, ao1, ab4, fb0, fb1, ab1);
}
    ab2 = ad3 < ad4;
    Output.points[1][0] -= fd0;
    fd1 = ld0 + ld2;
    ad1 = ad2 - ad3;
if(ao3 != null){
      ao2 = ao3.m4(ad4, fd0, fd1, ld0);
}
    ab3 = ld2 < ad1;
    Thought lo3 = Thought72.getInstance(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
if(ao3 != null){
      ao2 = ao3.m4(ab4, fb0, fb1, ab1);
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
if(fo0 != null){
      fo1 = fo0.m4();
}
    double ld0 = 486.6310196809507;
if(fo1 != null){
      fd0 = fo1.m3(fd1, ld0, fd0, fd1, fb1, fb0, fb1, fb0);
}
    ld0 *= -1;
    boolean lb1 = false;
    Output.points[1][1] -= fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1, fb1, lb1, fb0, fb1);
}
    Thought lo2 = Thought32.getInstance(fo1, fo0, fo1, fo0, lb1, fb0, fb1, lb1);
    Thought lo3 = Thought23.getInstance(ld0, fd0, fd1, ld0);
    fd0 = fd1 + ld0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
}
if(fo0 != null){
      fo0.m1(fb0, fb1, lb1, fb0);
}
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    Thought lo4 = Thought72.getInstance(ld0, fd0, fd1, ld0, fb1, lb1, fb0, fb1);
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, lb1, fb0, fb1, lb1);
}
        double ld5 = 830.3059596318749;
    if (fb0) {
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb1, fb0, fb1);
}
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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 + fd0;
    ab2 = fd1 < fd0;
    ab3 = ab4 || fb0;
    Thought lo0 = Thought0.getInstance(fd1, fd0, fd1, fd0);
    fb1 = !ab1;
    boolean lb1 = true;
    boolean lb2 = false;
    Thought lo3 = Thought36.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
if(fo0 != null){
      fo0.m1(lb2, ab1, ab2, ab3);
}
if(fo1 != null){
      fd1 = fo1.m3();
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb1);
}
    lb2 = ab1 || ab2;
    fd1 = fd0 + fd1;
    Output.points[1][2] -= fd0;

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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = ad2 > ad3;
    fb0 = fb1 || fb0;
    double ld0 = 798.7103394447757;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(ld0, ad1, ad2, ad3);
}
    fb1 = ad4 < fd0;
    fd1 = ld0 + ad1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    fb0 = fd1 < ld0;
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    double ld1 = 628.0432532132439;
    fb1 = ld1 < ad1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb0 = fb1 || fb0;
    double ld2 = 400.4185045524623;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld1, fb1, fb0, fb1, fb0);
}
    double ld3 = 677.4478624701275;

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
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
    Output.points[1][3] -= fd0;
    fb0 = fb1 && ab1;
    ab2 = ab3 || ab4;
    fb0 = !fb1;
    ab1 = fd1 > ad1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    ab2 = ab3 && ab4;
    fb0 = fb1 || ab1;
    ab2 = ab3 && ab4;
if(fo1 != null){
      fo1.m2(fb0, fb1, ab1, ab2);
}
    Thought lo0 = Thought37.getInstance();
if(fo0 != null){
          ab3 = fo0.m2(fd1, ad1, ad2, ad3, ab4, fb0, fb1, ab1);
}
    ab2 = ad4 < fd0;
    Thought lo1 = Thought88.getInstance(fo1, fo0, fo1, fo0);
        if (ab3) {
        ab4 = fd1 > ad1;
        ad2 = ad3 - ad4;
        fb0 = fb1 || ab1;
if(fo1 != null){
          ab2 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, ab3, ab4, fb0, fb1);
}
        ab1 = ad3 < ad4;
if(fo0 != null){
          ab2 = fo0.m2(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
        Output.points[1][4] -= fd0;
if(fo0 != null){
          fo1 = fo0.m4(fd1, ad1, ad2, ad3);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
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
    double ld0 = 444.04778059108577;
    boolean lb1 = true;
if(ao2 != null){
      fb0 = ao2.m2(fb1, lb1, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4();
}
    double ld2 = 241.0390495212572;
    Output.points[1][5] += ld2;
    Output.points[1][6] += fd0;
    lb1 = !fb0;
    double ld3 = 427.3771724033399;
    double ld4 = 786.2927242203708;
if(fo1 != null){
      fo0 = fo1.m4(ld4, fd0, fd1, ld0, fb1, lb1, fb0, fb1);
}
    ld2 = ld3 - ld4;
    double ld5 = 647.227417257963;
    for(int i0=0; i0<10; i0++){
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
        lb1 = ld5 > fd0;
        fd1 = ld0 + ld2;
if(ao1 != null){
          ld3 = ao1.m3(ao2, ao3, ao4, fo0, ld4, ld5, fd0, fd1, fb0, fb1, lb1, fb0);
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
    fb0 = fb1 || fb0;
    fb1 = fb0 || fb1;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = ad1 < ad2;
    ad3 = ad4 - fd0;
    fb0 = fd1 < ad1;
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0);
}
    fb1 = fb0 && fb1;
    fb0 = fd1 < ad1;
    fb1 = !fb0;
    ad2 = ad3 + ad4;
    fd0 = fd1 - ad1;
    ad2 *= -1;
    fb1 = ad3 > ad4;
    fd0 *= -1;
    double ld0 = 730.8352547086917;
    fd0 = fd1 - ld0;
    fb0 = fb1 || fb0;
    boolean lb1 = true;
    ad1 = ad2 + ad3;
    fb0 = fb1 && lb1;
    Output.points[1][7] += ad4;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fd0, fd1, ld0, ad1);
}
    Thought lo2 = Thought31.getInstance(fb0, fb1, lb1, fb0);
if(ao2 != null){
      ad2 = ao2.m3();
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
    boolean lb0 = true;
    lb0 = !ab1;
if(ao1 != null){
      ab2 = ao1.m2(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    lb0 = fd1 > fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fd1 = fd0 - fd1;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, lb0, ab1);
}
    Thought lo1 = Thought16.getInstance(fd0, fd1, fd0, fd1);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    double ld2 = 828.2301559087798;
    for(int i0=0; i0<10; i0++){
        ab2 = ld2 > fd0;
        fd1 = ld2 + fd0;
if(ao1 != null){
          ab3 = ao1.m2(ab4, fb0, fb1, lb0);
}
        ab1 = fd1 < ld2;
if(ao2 != null){
          ab2 = ao2.m2();
}
        }
if(ao3 != null){
      ab3 = ao3.m2(fd0, fd1, ld2, fd0, ab4, fb0, fb1, lb0);
}
    ab1 = fd1 > ld2;
    double ld3 = 892.0605374806062;
    ld3 = fd0 + fd1;

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
    double ld0 = 437.3154755585014;
    ab2 = ld0 > ad1;
    ad2 *= -1;
    Thought lo1 = Thought10.getInstance(ao2, ao3, ao4, fo0);
    ab3 = ad3 < ad4;
if(fo1 != null){
          ab4 = fo1.m2(ao1, ao2, ao3, ao4, fd0, fd1, ld0, ad1, fb0, fb1, ab1, ab2);
}
    Thought lo2 = Thought78.getInstance(fo0, fo1, ao1, ao2, ab3, ab4, fb0, fb1);
    ab1 = ad2 < ad3;
    Thought lo3 = Thought47.getInstance(ad4, fd0, fd1, ld0);
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
if(ao3 != null){
      ao2 = ao3.m4(ab2, ab3, ab4, fb0);
}
    boolean lb4 = false;
if(ao4 != null){
      fb0 = ao4.m2();
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fb0 = fo0.m2(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fd1 = fd0 + fd1;
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    Output.points[1][8] += fd0;
if(fo0 != null){
      fo0.m3(fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought53.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
if(fo1 != null){
      fb0 = fo1.m2(fb1, fb0, fb1, fb0);
}
        fd1 *= -1;
    fb1 = fb0 || fb1;
    Thought lo1 = Thought43.getInstance();
    boolean lb2 = false;
    Thought lo3 = Thought6.getInstance(fd0, fd1, fd0, fd1, lb2, fb0, fb1, lb2);
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
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
    fd1 *= -1;
    fd0 *= -1;
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
    fd1 *= -1;
    ab2 = !ab3;
    Output.points[2][0] += fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = ad2 > ad3;
    Thought lo0 = Thought53.getInstance(ad4, fd0, fd1, ad1);
    fb0 = !fb1;
    fb0 = ad2 > ad3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
    Output.points[2][1] += ad2;
    if (fb1) {
if(fo0 != null){
          fo0.m1(fb0, fb1, fb0, fb1);
}
        ad3 *= -1;
        Thought lo1 = Thought77.getInstance();
        fb0 = !fb1;
        fb0 = ad4 < fd0;
        fb1 = fd1 > ad1;
if(fo1 != null){
          ad2 = fo1.m3(ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
          fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    fd1 = ad1 - ad2;
    fb1 = ab1 || ab2;
    double ld0 = 708.8575496555046;
if(fo0 != null){
      ab3 = fo0.m2(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, ad1, ad2);
}
if(fo1 != null){
      ad3 = fo1.m3(ab2, ab3, ab4, fb0);
}
    ad4 *= -1;
    fb1 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb1 = true;
    boolean lb2 = false;
if(fo0 != null){
      lb1 = fo0.m2(ld0, ad1, ad2, ad3, lb2, ab1, ab2, ab3);
}
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m2(fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    Output.points[2][2] += fd0;
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    fb1 = fb0 && fb1;
    fb0 = fb1 && fb0;
if(ao1 != null){
      fo1 = ao1.m4(fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ao2.m1();
}
if(ao3 != null){
      fb1 = ao3.m2(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fd1 *= -1;
    fb0 = !fb1;
    fb0 = fb1 || fb0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    boolean lb0 = true;
    fb0 = !fb1;
    fd0 *= -1;
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
    Output.points[2][3] -= fd0;
        fd1 *= -1;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, fb0, fb1, lb0, fb0);
}
    boolean lb1 = false;
    for(int i0=0; i0<10; i0++){
        fd0 *= -1;
        fb0 = fb1 || lb0;
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
    Output.points[2][4] += ad1;
    boolean lb0 = false;
if(ao2 != null){
      ao2.m1(ad2, ad3, ad4, fd0);
}
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3);
}
    Thought lo1 = Thought85.getInstance(fb1, lb0, fb0, fb1);
    boolean lb2 = false;
    Thought lo3 = Thought49.getInstance();
    boolean lb4 = true;
    lb0 = lb2 && lb4;
    Output.points[2][5] += ad4;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ad1, ad2, fb0, fb1, lb0, lb2);
}
    double ld5 = 226.5772842707756;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0, lb4, fb0, fb1, lb0);
}
    lb2 = !lb4;
    fd1 *= -1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, lb0, lb2);
}
if(ao4 != null){
      ao4.m3(ld5, ad1, ad2, ad3);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ld5);
}
if(fo0 != null){
      lb4 = fo0.m2(fb0, fb1, lb0, lb2);
}
if(ao1 != null){
      fo1 = ao1.m4();
}
    Output.points[2][6] -= ad1;
    ad2 *= -1;

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
if(ao2 != null){
      ab1 = ao2.m2(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = !ab1;
    ab2 = ab3 && ab4;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    fd0 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
    boolean lb0 = true;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
}
    fb1 = lb0 && ab1;
if(fo0 != null){
      fo0.m2(ab2, ab3, ab4, fb0);
}
if(ao1 != null){
      fo1 = ao1.m4();
}
if(ao2 != null){
      fd1 = ao2.m3(fd0, fd1, fd0, fd1, fb1, lb0, ab1, ab2);
}
    fd0 *= -1;
    Output.points[2][7] -= fd1;
    fd0 *= -1;
    ab3 = ab4 || fb0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    fd1 = fd0 + fd1;
    fb1 = fd0 < fd1;
    fd0 = fd1 - fd0;
    lb0 = !ab1;
    boolean lb1 = false;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, lb0, lb1);
}
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0);
}
    ab1 = ab2 && ab3;
    ab4 = fd1 < fd0;

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
      ab1 = ao2.m2(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
    ab2 = !ab3;
    fd0 = fd1 - ad1;
    ab4 = ad2 > ad3;
    double ld0 = 336.47029961050066;
    double ld1 = 481.6805316911279;
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, ab1, ab2);
}
if(ao3 != null){
      ab3 = ao3.m2();
}
    boolean lb2 = false;
    boolean lb3 = false;
    ad2 = ad3 - ad4;
    ab2 = ab3 && ab4;
if(ao4 != null){
      fd0 = ao4.m3(fd1, ld0, ld1, ad1, fb0, fb1, lb2, lb3);
}
    ab1 = ad2 > ad3;
    Thought lo4 = Thought7.getInstance(fo0, fo1, ao1, ao2);
    double ld5 = 51.83044718929417;
    ad3 *= -1;
    Thought lo6 = Thought30.getInstance(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ld0, ab2, ab3, ab4, fb0);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, lb2, lb3, ab1);
}
    Output.points[2][8] += ld1;
    ab2 = ld5 < ad1;
    ad2 = ad3 + ad4;
    ab3 = ab4 || fb0;
if(ao1 != null){
      fb1 = ao1.m2(fd0, fd1, ld0, ld1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld5, ad1, ad2, ad3);
}
    lb2 = ad4 < fd0;
    Thought lo7 = Thought40.getInstance(lb3, ab1, ab2, ab3);
if(ao3 != null){
      ao2 = ao3.m4();
}
if(ao4 != null){
      ao4.m1(fd1, ld0, ld1, ld5, ab4, fb0, fb1, lb2);
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
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
    double ld0 = 519.6603285862641;
    Output.points[3][0] -= fd0;
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    double ld1 = 958.4677407655449;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    boolean lb2 = false;
if(fo1 != null){
      fo1.m1(ld1, fd0, fd1, ld0);
}
    ld1 = fd0 + fd1;
    double ld3 = 726.8918749829512;
    fb0 = ld0 > ld1;
    fb1 = !lb2;
    double ld4 = 171.13504206942085;
    fb0 = ld3 > ld4;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld1);
}
    boolean lb5 = true;
    ld3 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb2, lb5);
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
    fd1 = fd0 + fd1;
    Thought lo0 = Thought21.getInstance();
    fd0 *= -1;
    fd1 = fd0 + fd1;
    ab1 = !ab2;
    ab3 = ab4 && fb0;
    double ld1 = 439.7611128035774;
    ld1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld1, fd0, fb1, ab1, ab2, ab3);
}
    ab4 = fd1 > ld1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
    ab1 = ab2 && ab3;
    fd1 = ld1 + fd0;
    ab4 = fb0 || fb1;
    fd1 = ld1 - fd0;
    ab1 = fd1 > ld1;
    fd0 = fd1 + ld1;

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
    fb1 = ad2 < ad3;
    fb0 = fb1 || fb0;
    fb1 = ad4 < fd0;
    double ld0 = 248.91110118604507;
if(fo0 != null){
      fo0.m2(fd0, fd1, ld0, ad1);
}
    boolean lb1 = false;
    boolean lb2 = false;
    lb1 = lb2 && fb0;
    fb1 = lb1 || lb2;
    ad2 = ad3 - ad4;
    fd0 = fd1 + ld0;

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
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
    double ld0 = 741.0719629999686;
    ad1 = ad2 - ad3;
    ad4 *= -1;
    fd0 = fd1 + ld0;
    ad1 = ad2 + ad3;
    ab3 = ad4 < fd0;
    fd1 = ld0 + ad1;
    ad2 *= -1;
if(fo1 != null){
      fo1.m1(ab4, fb0, fb1, ab1);
}
    boolean lb1 = true;
    ad3 = ad4 + fd0;
    fd1 *= -1;
    ab1 = ab2 || ab3;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      ld0 = fo0.m3(ad1, ad2, ad3, ad4, ab4, fb0, fb1, lb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ab1 = fd0 > fd1;
    ld0 = ad1 - ad2;
    ab2 = ab3 || ab4;
    if (fb0) {
        Thought lo2 = Thought14.getInstance(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb1, lb1, ab1, ab2);
        ld0 = ad1 + ad2;
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
          fd1 = ao1.m3(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    double ld0 = 990.12557169338;
    fb1 = !fb0;
if(ao1 != null){
      ao1.m1(fb1, fb0, fb1, fb0);
}
    fb1 = ld0 > fd0;
    fd1 = ld0 - fd0;
    fb0 = !fb1;
    fb0 = fb1 || fb0;
    fb1 = fd1 > ld0;
    fb0 = fd0 < fd1;
    Output.points[3][1] += ld0;
if(ao2 != null){
      fd0 = ao2.m3();
}
    boolean lb1 = true;
if(ao3 != null){
      ao3.m2(fd1, ld0, fd0, fd1, fb0, fb1, lb1, fb0);
}
if(ao4 != null){
      ld0 = ao4.m3(fo0, fo1, ao1, ao2);
}
    fb1 = !lb1;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, ld0, fd0, fb0, fb1, lb1, fb0);
}
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, lb1, fb0, fb1, lb1);
}
        if (fb0) {
        boolean lb2 = false;
        fd1 = ld0 + fd0;
if(ao2 != null){
          ao1 = ao2.m4(fd1, ld0, fd0, fd1);
}
        ld0 = fd0 + fd1;
        ld0 = fd0 - fd1;
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
    double ld0 = 885.5402998712988;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ld0, ad1, ad2, ad3);
}
    Thought lo1 = Thought85.getInstance(fb0, fb1, fb0, fb1);
    ad4 = fd0 - fd1;
    ld0 = ad1 - ad2;
    fb0 = fb1 && fb0;
    boolean lb2 = false;
    fb0 = fb1 || lb2;
if(ao2 != null){
      ao1 = ao2.m4();
}
    ad3 = ad4 + fd0;
    for(int i0=0; i0<10; i0++){
if(ao3 != null){
          ao3.m3(fd1, ld0, ad1, ad2, fb0, fb1, lb2, fb0);
}
        ad3 *= -1;
if(ao4 != null){
          ad4 = ao4.m3(fo0, fo1, ao1, ao2);
}
        fb1 = lb2 && fb0;
        fd0 *= -1;
        fb1 = lb2 && fb0;
        fb1 = !lb2;
        fd1 = ld0 - ad1;
        }
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, fb0, fb1, lb2, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, lb2, fb0, fb1);
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
if(ao1 != null){
      ab1 = ao1.m2(fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      ab2 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    boolean lb0 = false;
    ab2 = fd0 < fd1;
    fd0 *= -1;
if(ao1 != null){
      ao1.m3(ab3, ab4, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    double ld1 = 956.543147782582;
    lb0 = ab1 && ab2;
if(ao4 != null){
      fd0 = ao4.m3(fd1, ld1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    Thought lo2 = Thought11.getInstance(fo0, fo1, ao1, ao2);
    ld1 *= -1;
if(ao3 != null){
      lb0 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, ld1, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
    Output.points[3][2] -= fd1;
    lb0 = ab1 && ab2;
    Thought lo3 = Thought73.getInstance(ao2, ao3, ao4, fo0, ab3, ab4, fb0, fb1);
    boolean lb4 = false;
    lb0 = lb4 || ab1;
    boolean lb5 = false;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 55.17834928871217;
    Thought lo1 = Thought14.getInstance(ld0, ad1, ad2, ad3);
    ad4 = fd0 - fd1;
if(ao1 != null){
      ld0 = ao1.m3(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fd0 = fo1.m3(ab2, ab3, ab4, fb0);
}
    fd1 *= -1;
    Thought lo2 = Thought21.getInstance();
    fb1 = ab1 && ab2;
    double ld3 = 851.8030758019194;
        Thought lo4 = Thought2.getInstance(ld0, ld3, ad1, ad2, ab3, ab4, fb0, fb1);
    Output.points[3][3] += ad3;
    ad4 = fd0 + fd1;
if(ao1 != null){
      ld0 = ao1.m3(ao2, ao3, ao4, fo0);
}
        boolean lb5 = true;
    ld3 = ad1 + ad2;
    ad3 = ad4 - fd0;
    Thought lo6 = Thought94.getInstance(fo1, ao1, ao2, ao3, fd1, ld0, ld3, ad1, lb5, ab1, ab2, ab3);
    ab4 = ad2 > ad3;
    fb0 = ad4 > fd0;
    Output.points[3][4] -= fd1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb1, lb5, ab1, ab2);
}
if(ao4 != null){
      ab3 = ao4.m2(ld0, ld3, ad1, ad2);
}
    boolean lb7 = true;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1);
}
    for(int i0=0; i0<10; i0++){
        ab3 = ab4 && fb0;
        fb1 = !lb5;
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
    boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb0, fb0);
}
    Output.points[3][5] += fd0;
    fb1 = !lb0;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb0 = fd1 < fd0;
    fb1 = lb0 && fb0;
if(fo1 != null){
      fo1.m2(fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
    lb0 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd1 *= -1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
    fd1 = fd0 - fd1;
    Thought lo1 = Thought93.getInstance(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
    fd0 = fd1 + fd0;
    boolean lb2 = true;
    fd1 *= -1;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(lb2, fb0, fb1, lb0);
}
    boolean lb3 = true;
        lb2 = lb3 || fb0;
    fb1 = fd1 > fd0;
    fd1 = fd0 - fd1;
    lb0 = lb2 && lb3;
if(fo0 != null){
      fo1 = fo0.m4();
}
    boolean lb4 = true;

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
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb1 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 < fd1;
    Output.points[3][6] += fd0;
    double ld0 = 187.96876577091984;
    fd0 = fd1 + ld0;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1);
}
    Output.points[3][7] += ld0;
    fb1 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    fb0 = ld0 < fd0;
    Thought lo1 = Thought71.getInstance();
    fb1 = fd1 > ld0;

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
        double ld0 = 651.1254821451369;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
    Thought lo1 = Thought49.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 < fd1;
        ld0 = fd0 + fd1;
    ld0 *= -1;
    Thought lo2 = Thought36.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
if(fo0 != null){
          fd0 = fo0.m3(fd1, ld0, fd0, fd1);
}
    ld0 *= -1;
    Thought lo3 = Thought95.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
    fd1 *= -1;
    ld0 = fd0 + fd1;
    Thought lo4 = Thought97.getInstance(fb1, fb0, fb1, fb0);
    Output.points[3][8] -= ld0;
if(fo1 != null){
      fd0 = fo1.m3();
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld0, fd0, fd1, fb1, fb0, fb1, fb0);
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
