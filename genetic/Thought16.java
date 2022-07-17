package genetic;
import java.util.ArrayList;
class Thought16 extends Thought{
private static ArrayList<Thought16> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 176.69153335811433;
private double fd1 = 653.8175098146381;
private Thought fo0 = null;
private Thought fo1 = null;
Thought16 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought16 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought16 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought16 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought16 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought16 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought16 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought16 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought16 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought16 instance = new Thought16 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought16 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought16 instance = new Thought16 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought16 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought16 instance = new Thought16 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought16 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought16 instance = new Thought16 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought16 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought16 instance = new Thought16 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought16 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought16 instance = new Thought16 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought16 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought16 instance = new Thought16 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought16 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought16 instance = new Thought16 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
if(fo1 != null){
      fb1 = fo1.m2(fd0, fd1, fd0, fd1);
}
    fb0 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo0.m1(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2();
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 - fd0;
    fb0 = fb1 || fb0;
if(fo0 != null){
      fd1 = fo0.m3(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd0 *= -1;
if(fo1 != null){
      fb1 = fo1.m2(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    if (fb1) {
if(fo1 != null){
          fb0 = fo1.m2(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
        fd0 = fd1 - fd0;
        double ld0 = 530.9508791285874;
        Thought lo1 = Thought35.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
        fb1 = fd0 < fd1;
        ld0 = fd0 + fd1;
        fb0 = ld0 > fd0;
        boolean lb2 = true;
if(fo0 != null){
          fb0 = fo0.m2();
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
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    double ld0 = 159.73828496645964;
    fd0 = fd1 + ld0;
    fb0 = fb1 && ab1;
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    double ld1 = 0.08636905568791786;
    ab1 = !ab2;
    double ld2 = 30.709121972356808;
if(fo1 != null){
      fo1.m3(ld1, ld2, fd0, fd1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ld0, ld1, ld2, fd0);
}
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(ld0, ld1, ld2, fd0, ab3, ab4, fb0, fb1);
}
    ab1 = ab2 || ab3;
    double ld3 = 336.000794894448;
    boolean lb4 = false;
    Thought lo5 = Thought84.getInstance(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);

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
        double ld0 = 272.70534953617795;
    ld0 = ad1 - ad2;
    boolean lb1 = true;
    ad3 = ad4 + fd0;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd1 = ld0 - ad1;
    ad2 = ad3 + ad4;
    fd0 = fd1 - ld0;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, lb1, fb0, fb1, lb1);
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
    ad2 = ad3 + ad4;
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
    Thought lo0 = Thought399.getInstance(fo0, fo1, fo0, fo1);
    fb1 = ab1 || ab2;
    ab3 = fd0 > fd1;
    ab4 = !fb0;
if(fo0 != null){
      fb1 = fo0.m2(ad1, ad2, ad3, ad4);
}
    ab1 = ab2 || ab3;
    Thought lo1 = Thought159.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
    ab4 = fb0 && fb1;
    double ld2 = 355.1353754246671;
    Thought lo3 = Thought232.getInstance(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
    fb0 = fd1 < ld2;
    fb1 = ab1 || ab2;

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
    Thought lo0 = Thought387.getInstance(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
    fb0 = fd1 > fd0;
    fb1 = fd1 > fd0;
if(ao1 != null){
      fo1 = ao1.m4();
}
    fb0 = !fb1;
    fb0 = fb1 && fb0;
    fd1 = fd0 + fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    double ld1 = 822.3089274726354;
    fb1 = !fb0;
    boolean lb2 = false;
if(ao2 != null){
      ao2.m1(fb0, fb1, lb2, fb0);
}
if(ao3 != null){
      ld1 = ao3.m3(ao4, fo0, fo1, ao1);
}
    fb1 = lb2 && fb0;
    fb1 = lb2 || fb0;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ld1, fd0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, ld1, fd0, fd1);
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
    fb0 = fb1 || fb0;
    fb1 = fb0 && fb1;
if(ao2 != null){
      ad1 = ao2.m3(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 < ad1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4();
}
    double ld0 = 852.058493431207;
    fb1 = ad1 < ad2;
    ad3 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
    ad1 *= -1;
if(fo0 != null){
      fo0.m3(fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    ad2 *= -1;
    ad3 *= -1;
    double ld1 = 500.48465464830457;
    ad3 = ad4 - fd0;
if(fo1 != null){
      fd1 = fo1.m3(ld0, ld1, ad1, ad2);
}
    fb0 = fb1 || fb0;
if(ao1 != null){
      ad3 = ao1.m3(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ld0);
}
if(ao1 != null){
      fo1 = ao1.m4(ld1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
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
    double ld0 = 420.46847623776193;
    boolean lb1 = true;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
}
    boolean lb2 = false;
    ab4 = fb0 || fb1;
    boolean lb3 = true;
    fd0 = fd1 - ld0;
if(ao3 != null){
      ao2 = ao3.m4();
}
    lb1 = fd0 < fd1;
    ld0 = fd0 - fd1;
    boolean lb4 = true;
    lb2 = !lb3;

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
      ab2 = ao2.m2(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4(ab1, ab2, ab3, ab4);
}
    boolean lb0 = false;
    boolean lb1 = false;
    ab3 = ab4 && fb0;
    double ld2 = 320.1807488735361;
    fb1 = ad4 > fd0;
    lb0 = fd1 > ld2;
    lb1 = ad1 > ad2;
if(ao3 != null){
      ad3 = ao3.m3(ao4, fo0, fo1, ao1);
}
    Thought lo3 = Thought311.getInstance(ad4, fd0, fd1, ld2);
    Thought lo4 = Thought326.getInstance(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
    fd0 *= -1;
    Thought lo5 = Thought71.getInstance(fd1, ld2, ad1, ad2, ab1, ab2, ab3, ab4);
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb0, fb1, lb0, lb1);
}
    ad3 = ad4 + fd0;
if(fo1 != null){
      fo1.m3();
}
    boolean lb6 = true;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ld2, ad1, ad2, lb6, ab1, ab2, ab3);
}
if(ao1 != null){
      ao1.m3(ab4, fb0, fb1, lb0);
}
if(ao2 != null){
      ad3 = ao2.m3(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ad4 = ao1.m3(fd0, fd1, ld2, ad1);
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
    fb1 = !fb0;
    fd0 *= -1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fb1 = fo0.m2(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fd1 *= -1;
    fd0 *= -1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    double ld0 = 674.2941600097513;
    fb0 = fd0 > fd1;
    fb1 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
        fb0 = fb1 || fb0;

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
    double ld0 = 628.0504072279757;
if(fo1 != null){
          fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m2(fd0, fd1, ld0, fd0);
}
    boolean lb1 = true;
    ab4 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(ld0, fd0, fd1, ld0, lb1, ab1, ab2, ab3);
}
    fd0 = fd1 - ld0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb1);
}
    ab1 = ab2 || ab3;
if(fo1 != null){
      fo1.m1();
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, ab4, fb0, fb1, lb1);
}
        ab1 = !ab2;
    fd1 = ld0 - fd0;
    fd1 = ld0 + fd0;
    boolean lb2 = false;
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    fd1 *= -1;
    Output.points[2][5] -= ld0;
if(fo1 != null){
      fo1.m3(fd0, fd1, ld0, fd0);
}
    fb1 = fd1 < ld0;
    Output.points[2][6] += fd0;
    lb1 = fd1 > ld0;
    lb2 = ab1 && ab2;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fb1 = fo1.m2(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    double ld0 = 722.5829043553168;
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd0 = fd1 + ld0;
    ad1 = ad2 - ad3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
    double ld1 = 964.5685233257824;
    boolean lb2 = false;
    Output.points[2][7] += ld1;
if(fo1 != null){
      ad1 = fo1.m3(lb2, fb0, fb1, lb2);
}
    Thought lo3 = Thought270.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      ad2 = fo0.m3(ad3, ad4, fd0, fd1);
}
    fb0 = !fb1;
    lb2 = ld0 > ld1;
    fb0 = ad1 < ad2;

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
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(fo0 != null){
          fd0 = fo0.m3(fd1, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
        boolean lb0 = true;
        ad4 *= -1;
if(fo1 != null){
          fd0 = fo1.m3(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb0);
}
if(fo0 != null){
          fo0.m1();
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
        Output.points[2][8] -= ad4;
        double ld1 = 412.7519082618202;
        fb0 = ad4 < fd0;
if(fo0 != null){
          fo1 = fo0.m4(fb1, lb0, ab1, ab2);
}
        Output.points[3][0] += fd1;
        boolean lb2 = true;
        if (ab2) {
            ld1 *= -1;
            Thought lo3 = Thought222.getInstance(fo1, fo0, fo1, fo0);
            boolean lb4 = false;
            Thought lo5 = Thought53.getInstance(ad1, ad2, ad3, ad4);
            boolean lb6 = true;
            fd0 *= -1;
            ab1 = fd1 > ld1;
if(fo1 != null){
              ad1 = fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
            fd1 = ld1 - ad1;
            ab2 = ab3 && ab4;
            fb0 = !fb1;
            lb4 = ad2 < ad3;
            lb6 = lb0 && lb2;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought135.getInstance(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
    fb1 = !fb0;
    fd0 = fd1 + fd0;
    boolean lb1 = true;
    double ld2 = 388.2305768525826;
    fb0 = fd0 > fd1;
    Output.points[3][1] += ld2;
    fd0 = fd1 + ld2;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, lb1, fb0, fb1);
}
    Output.points[3][2] -= fd0;
if(ao2 != null){
      ao1 = ao2.m4();
}
    Output.points[3][3] += fd1;
    Output.points[3][4] += ld2;
    lb1 = fd0 > fd1;
    double ld3 = 775.2930221689677;
    ld2 *= -1;
    Thought lo4 = Thought254.getInstance(ao3, ao4, fo0, fo1, ld3, fd0, fd1, ld2, fb0, fb1, lb1, fb0);
    fb1 = lb1 && fb0;

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
if(ao1 != null){
      ao1.m2(fb0, fb1, fb0, fb1);
}
    fb0 = ad2 > ad3;
    if (fb1) {
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
        ad4 = fd0 + fd1;
        fb0 = ad1 < ad2;
        Thought lo0 = Thought181.getInstance(ad3, ad4, fd0, fd1);
if(ao2 != null){
          fb1 = ao2.m2(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
        fb0 = !fb1;
        Output.points[3][5] -= fd0;
        fb0 = fd1 > ad1;
        ad2 *= -1;
if(ao2 != null){
          ao1 = ao2.m4(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
        Thought lo1 = Thought71.getInstance(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
        Thought lo2 = Thought127.getInstance();
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
          fb1 = ao1.m2(fb0, fb1, fb0, fb1);
}
if(ao2 != null){
          fb0 = ao2.m2(ao3, ao4, fo0, fo1);
}
        fb1 = fb0 && fb1;
        fd0 *= -1;
        boolean lb3 = true;
if(ao2 != null){
          ao1 = ao2.m4(fd1, ad1, ad2, ad3);
}
if(ao3 != null){
          ao3.m3(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      fd1 = ao2.m3(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    double ld0 = 14.114618163172638;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fb1, ab1, ab2, ab3);
}
    double ld1 = 537.9683156502356;
    Output.points[3][6] += ld0;
if(ao2 != null){
      ao2.m1();
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld1, fd0, fd1, ld0, ab4, fb0, fb1, ab1);
}
if(ao3 != null){
      ao3.m2(ab2, ab3, ab4, fb0);
}
    Thought lo2 = Thought387.getInstance(ao4, fo0, fo1, ao1);
    boolean lb3 = true;
    boolean lb4 = false;
    ab4 = fb0 && fb1;
    lb3 = !lb4;
    ld1 = fd0 - fd1;
    ab1 = ab2 || ab3;
    ab4 = fb0 || fb1;
    Thought lo5 = Thought242.getInstance(ld0, ld1, fd0, fd1);
    lb3 = !lb4;
    Output.points[3][7] += ld0;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 + ad4;
    ab2 = !ab3;
        Output.points[3][8] -= fd0;
    for(int i0=0; i0<10; i0++){
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3);
}
        ad4 *= -1;
if(ao3 != null){
          ao2 = ao3.m4(fd0, fd1, ad1, ad2, ab4, fb0, fb1, ab1);
}
        }
    boolean lb0 = true;
    ab1 = ad3 < ad4;
    boolean lb1 = false;
    ab1 = !ab2;
    boolean lb2 = false;
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    Output.points[4][0] -= fd1;
    fd0 = fd1 - fd0;
    fb0 = fb1 || fb0;
    fb1 = fb0 || fb1;
    fb0 = fb1 || fb0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd1 = fd0 + fd1;
    fb1 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fd0 = fo0.m3(fb0, fb1, fb0, fb1);
}
    fb0 = fd1 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb1 = fd1 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    if (fb0) {
        Thought lo0 = Thought234.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
        boolean lb1 = true;
if(fo1 != null){
          fo1.m3(fd1, fd0, fd1, fd0, fb0, fb1, lb1, fb0);
}
        fb1 = fd1 < fd0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb1);
}
if(fo0 != null){
          fo0.m2();
}
        for(int i0=0; i0<10; i0++){
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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = !ab3;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
    ab2 = ab3 || ab4;
    fb0 = !fb1;
if(fo0 != null){
      ab1 = fo0.m2(ab2, ab3, ab4, fb0);
}
    Output.points[4][1] -= fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m3(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    fb1 = ab1 && ab2;
    ab3 = fd0 < fd1;
    ab4 = fd0 < fd1;
    fb0 = fd0 < fd1;
    fb1 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought298.getInstance(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
    fd0 *= -1;
    Output.points[4][2] -= fd1;
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb1);
}
    boolean lb2 = true;
    lb2 = !ab1;
    ab2 = !ab3;
    ab4 = fb0 && fb1;
    Thought lo3 = Thought155.getInstance();
    lb1 = lb2 && ab1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
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
    fb1 = fb0 && fb1;
if(fo1 != null){
      fb0 = fo1.m2(fb1, fb0, fb1, fb0);
}
    ad1 = ad2 + ad3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb1 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    fb0 = ad4 < fd0;
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    ad1 = ad2 + ad3;
    ad4 *= -1;
    double ld0 = 974.035094104499;
        Thought lo1 = Thought149.getInstance();
    fb1 = fb0 && fb1;
    boolean lb2 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld0, lb2, fb0, fb1, lb2);
}
    ad1 *= -1;
    double ld3 = 425.76705905831534;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb2, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb1 = !lb2;
if(fo0 != null){
      ad1 = fo0.m3(ad2, ad3, ad4, fd0);
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought157.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
}
    ad3 = ad4 - fd0;
    for(int i0=0; i0<10; i0++){
        ab4 = fd1 < ad1;
if(fo0 != null){
          fo0.m1();
}
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
          fo0 = fo1.m4(ab3, ab4, fb0, fb1);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
          fo0.m2(fd1, ad1, ad2, ad3);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
        ad2 = ad3 + ad4;
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
}
        Output.points[4][3] += ad3;
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
    for(int i0=0; i0<10; i0++){
        boolean lb0 = false;
        boolean lb1 = true;
        Thought lo2 = Thought375.getInstance(ao2, ao3, ao4, fo0, lb0, lb1, fb0, fb1);
        lb0 = lb1 && fb0;
if(fo1 != null){
          fb1 = fo1.m2();
}
        fd0 = fd1 + fd0;
        Output.points[4][4] -= fd1;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, lb0, lb1, fb0, fb1);
}
        double ld3 = 475.56593049132454;
        ld3 *= -1;
        lb0 = lb1 && fb0;
        fd0 *= -1;
        fb1 = lb0 && lb1;
        fb0 = fd1 > ld3;
        fb1 = fd0 > fd1;
        lb0 = lb1 && fb0;
if(ao1 != null){
          ld3 = ao1.m3(fb1, lb0, lb1, fb0);
}
        Output.points[4][5] -= fd0;
        fb1 = fd1 < ld3;
        lb0 = lb1 && fb0;
        if (fb1) {
            fd0 *= -1;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    ad2 = ad3 - ad4;
    fb0 = !fb1;
    for(int i0=0; i0<10; i0++){
        double ld0 = 349.81127619968265;
        ad4 = fd0 + fd1;
        ld0 = ad1 + ad2;
        fb0 = fb1 || fb0;
if(ao2 != null){
          ad3 = ao2.m3(ad4, fd0, fd1, ld0);
}
        double ld1 = 33.8460843361643;
if(ao3 != null){
          ao3.m1(ao4, fo0, fo1, ao1, ld1, ad1, ad2, ad3);
}
        Output.points[4][6] += ad4;
        fd0 = fd1 - ld0;
if(ao2 != null){
          ao2.m2(ld1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
        fb1 = fb0 && fb1;
        ad4 *= -1;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, fb0, fb1);
}
        fb0 = fb1 || fb0;
if(ao4 != null){
          ao3 = ao4.m4();
}
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, ld0, ld1, fb1, fb0, fb1, fb0);
}
        fb1 = ad1 > ad2;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ab1, ab2, ab3, ab4);
}
    fd1 = fd0 + fd1;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1);
}
    boolean lb0 = true;
if(ao2 != null){
      fd0 = ao2.m3(fd1, fd0, fd1, fd0);
}
    boolean lb1 = false;
    boolean lb2 = true;
    boolean lb3 = true;
    ab1 = fd1 < fd0;
    fd1 = fd0 + fd1;
    ab2 = fd0 < fd1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
    ab3 = ab4 || fb0;
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, fd0, fd1, fb1, lb0, lb1, lb2);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, lb3, ab1, ab2, ab3);
}
if(fo0 != null){
      fo0.m3();
}
    ab4 = fd0 < fd1;
    double ld4 = 50.86820523190426;
    ld4 = fd0 + fd1;
    for(int i0=0; i0<10; i0++){
        fb0 = ld4 > fd0;
        fb1 = !lb0;
if(fo1 != null){
          fd1 = fo1.m3(ao1, ao2, ao3, ao4, ld4, fd0, fd1, ld4, lb1, lb2, lb3, ab1);
}
        Thought lo5 = Thought200.getInstance(ab2, ab3, ab4, fb0);
        fb1 = fd0 < fd1;
        double ld6 = 827.4209986443416;
        lb0 = ld6 < ld4;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    ab1 = ab2 && ab3;
    ab4 = fb0 || fb1;
    boolean lb1 = true;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    ad1 *= -1;
    double ld2 = 549.0219668252084;
    ad1 *= -1;
    double ld3 = 243.40777941455158;
    lb0 = lb1 || ab1;
    Thought lo4 = Thought87.getInstance(ad1, ad2, ad3, ad4);
    ab2 = fd0 < fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld2, ld3, ad1, ad2);
}
    ad3 *= -1;
    ab3 = ad4 < fd0;

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
    Thought lo0 = Thought53.getInstance(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
    fd0 = fd1 + fd0;
    double ld1 = 455.79398644741616;
    boolean lb2 = true;
    boolean lb3 = true;
    Output.points[4][7] += fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb3, fb0, fb1, lb2);
}
    lb3 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd1 *= -1;
    boolean lb4 = true;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1, lb2, lb3, lb4, fb0);
}
    fb1 = lb2 && lb3;
    fd0 = fd1 + ld1;
    Thought lo5 = Thought277.getInstance(lb4, fb0, fb1, lb2);
    fd0 = fd1 - ld1;
    Output.points[4][8] -= fd0;
    boolean lb6 = true;
    fd1 *= -1;
    ld1 = fd0 + fd1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    lb3 = lb4 || lb6;
    fb0 = fb1 || lb2;

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
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
    Output.points[5][0] -= fd0;
    Output.points[5][1] -= fd1;
if(fo1 != null){
      ab2 = fo1.m2(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    double ld0 = 825.1515751629743;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
}
    Thought lo1 = Thought252.getInstance(fd1, ld0, fd0, fd1, ab3, ab4, fb0, fb1);
    ld0 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    Output.points[5][2] += ld0;
    fd0 = fd1 - ld0;
    boolean lb2 = true;
    Thought lo3 = Thought266.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, ab4, fb0, fb1, lb2);
    Thought lo4 = Thought322.getInstance(ab1, ab2, ab3, ab4);
    fd1 = ld0 - fd0;
    boolean lb5 = true;
    boolean lb6 = false;
    boolean lb7 = true;
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1);
}
    ab3 = ab4 || fb0;
    double ld8 = 441.6071542439587;
    double ld9 = 925.7994060545745;
if(fo1 != null){
      fo0 = fo1.m4(ld9, fd0, fd1, ld0);
}
if(fo0 != null){
      ld8 = fo0.m3(fo1, fo0, fo1, fo0, ld9, fd0, fd1, ld0);
}
if(fo0 != null){
      fo1 = fo0.m4(ld8, ld9, fd0, fd1, fb1, lb2, lb5, lb6);
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
    boolean lb0 = false;
    ad1 *= -1;
    ad2 *= -1;
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
    ad4 *= -1;
    fb1 = lb0 || fb0;
    fb1 = !lb0;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, fb0, fb1, lb0, fb0);
}
    double ld1 = 490.674346629949;
    boolean lb2 = false;
    fb0 = !fb1;
    ad3 = ad4 + fd0;
if(fo0 != null){
      fd1 = fo0.m3(lb0, lb2, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    lb0 = !lb2;
    ld1 = ad1 + ad2;

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
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
    ab1 = ab2 && ab3;
        Thought lo0 = Thought240.getInstance(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1, ab4, fb0, fb1, ab1);
}
    if (ab2) {
        Thought lo1 = Thought292.getInstance(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
        Thought lo2 = Thought372.getInstance();
        double ld3 = 898.1759541956642;
        ab1 = !ab2;
        Output.points[5][3] += ad1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
        ab1 = fd1 < ld3;
        ab2 = ab3 && ab4;
        for(int i0=0; i0<10; i0++){
if(fo1 != null){
              fo0 = fo1.m4(fb0, fb1, ab1, ab2);
}
            ab3 = ad1 > ad2;
            ad3 = ad4 - fd0;
            ab4 = !fb0;
            }
        fb1 = fd1 > ld3;
if(fo0 != null){
          ad1 = fo0.m3(fo1, fo0, fo1, fo0);
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
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      fd0 = ao2.m3(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
    Output.points[5][4] += fd0;
    Output.points[5][5] -= fd1;
    boolean lb0 = false;
if(ao2 != null){
      fd0 = ao2.m3();
}
    Thought lo1 = Thought48.getInstance(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
if(ao2 != null){
      ao1 = ao2.m4(fb1, lb0, fb0, fb1);
}
    Output.points[5][6] -= fd1;
    double ld2 = 132.03509044298264;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      ld2 = ao3.m3(fd0, fd1, ld2, fd0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, ld2, fd0, fd1);
}
    Thought lo3 = Thought384.getInstance(ld2, fd0, fd1, ld2, lb0, fb0, fb1, lb0);
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, fb0, fb1, lb0, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4();
}
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3, fd0, fd1, ld2, fd0, fb1, lb0, fb0, fb1);
}
        Thought lo4 = Thought394.getInstance(lb0, fb0, fb1, lb0);
    fb0 = fb1 || lb0;
    boolean lb5 = true;
    lb5 = fb0 || fb1;
    lb0 = fd1 < ld2;

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
    boolean lb0 = true;
    fb0 = !fb1;
    lb0 = fb0 && fb1;
    double ld1 = 864.4724864068786;
    boolean lb2 = false;
    Output.points[5][7] += ad1;
    ad2 *= -1;
    lb0 = ad3 > ad4;
    fd0 = fd1 + ld1;
    Output.points[5][8] -= ad1;
    boolean lb3 = false;
    boolean lb4 = false;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ad2 = ao1.m3(ad3, ad4, fd0, fd1);
}
if(ao2 != null){
      ld1 = ao2.m3(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
    Thought lo5 = Thought304.getInstance(fd0, fd1, ld1, ad1, lb2, lb3, lb4, fb0);
    Output.points[6][0] -= ad2;
    double ld6 = 828.1371790529025;
    fb1 = lb0 || lb2;
    lb3 = lb4 && fb0;
    fb1 = lb0 && lb2;

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
      ab1 = ao2.m2(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
    boolean lb0 = true;
if(ao2 != null){
      ao1 = ao2.m4();
}
    fd1 = fd0 - fd1;
    fb0 = fb1 && lb0;
    ab1 = ab2 || ab3;
    ab4 = !fb0;
    fb1 = fd0 < fd1;
    lb0 = fd0 > fd1;
    if (ab1) {
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
    boolean lb0 = true;
    double ld1 = 120.97049303681416;
    lb0 = ld1 < ad1;
if(ao2 != null){
      ad2 = ao2.m3(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
    double ld2 = 10.01898027954454;
    Thought lo3 = Thought245.getInstance(fb0, fb1, lb0, ab1);
    ab2 = ab3 && ab4;
    ld1 = ld2 + ad1;
    if (fb0) {
        double ld4 = 707.5911872550097;
        double ld5 = 709.7911327837423;
        double ld6 = 488.3217339767813;
        boolean lb7 = false;
        Thought lo8 = Thought2.getInstance(ao1, ao2, ao3, ao4);
if(fo1 != null){
          fo0 = fo1.m4(ld1, ld2, ad1, ad2);
}
        boolean lb9 = true;
        ad3 *= -1;
if(ao1 != null){
          ao1.m3(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ld4);
}
        Thought lo10 = Thought299.getInstance(ld5, ld6, ld1, ld2, ab4, fb0, fb1, lb7);
        lb9 = lb0 || ab1;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
}
        double ld11 = 239.53202186419534;
if(ao1 != null){
          fo1 = ao1.m4();
}
        ld2 = ad1 - ad2;
        Thought lo12 = Thought330.getInstance(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1, fb1, lb7, lb9, lb0);
        ab1 = !ab2;
        ab3 = ab4 || fb0;
        boolean lb13 = false;
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
    fb1 = !fb0;
    fd0 = fd1 - fd0;
    fb1 = fb0 && fb1;
    fd1 *= -1;
if(fo0 != null){
      fb0 = fo0.m2(fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought350.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    fb1 = !fb0;
    fd0 = fd1 + fd0;
    boolean lb1 = false;
    boolean lb2 = true;
    Thought lo3 = Thought275.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
    boolean lb4 = true;
    double ld5 = 772.8220502715773;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld5, fd0, lb2, lb4, fb0, fb1);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, lb1, lb2, lb4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ld5, fd0, fd1, ld5, fb1, lb1, lb2, lb4);
}
if(fo1 != null){
      fo1.m2(fb0, fb1, lb1, lb2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb6 = true;
    lb4 = lb6 || fb0;
    fb1 = fd0 > fd1;
    ld5 = fd0 + fd1;
if(fo0 != null){
      lb1 = fo0.m2(ld5, fd0, fd1, ld5);
}
    fd0 = fd1 - ld5;

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
    fb1 = fd1 > fd0;
    fb0 = fd1 > fd0;
    boolean lb0 = true;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    Output.points[6][1] -= fd1;
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    double ld1 = 682.1789268310715;
if(fo0 != null){
      fd0 = fo0.m3(fb1, lb0, fb0, fb1);
}
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
    fd1 = ld1 + fd0;
    fb0 = fd1 > ld1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld1, fd0);
}
    fb1 = lb0 || fb0;
    fb1 = lb0 || fb0;
    fb1 = !lb0;
    fd1 = ld1 + fd0;
    Output.points[6][2] += fd1;
    ld1 = fd0 + fd1;
    boolean lb2 = false;
    Output.points[6][3] += ld1;
        fd0 *= -1;
    fd1 = ld1 + fd0;
    lb2 = fd1 > ld1;

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
      fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo1.m2(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
}
    fd1 *= -1;
if(fo0 != null){
      fo0.m2();
}
    Output.points[6][4] -= fd0;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      fo0.m3(lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    fd0 = fd1 + fd0;
    boolean lb1 = false;
if(fo0 != null){
      lb1 = fo0.m2(fd1, fd0, fd1, fd0);
}
    fb0 = fd1 < fd0;
    double ld2 = 105.49063402698086;
    fb1 = lb0 || lb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld2, fd0);
}
    fd1 = ld2 - fd0;

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
