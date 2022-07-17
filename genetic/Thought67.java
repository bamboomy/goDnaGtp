package genetic;
import java.util.ArrayList;
class Thought67 extends Thought{
private static ArrayList<Thought67> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 398.9717823837143;
private double fd1 = 477.69485623730765;
private Thought fo0 = null;
private Thought fo1 = null;
Thought67 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought67 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought67 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought67 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought67 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought67 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought67 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought67 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought67 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought67 instance = new Thought67 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought67 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought67 instance = new Thought67 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought67 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought67 instance = new Thought67 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought67 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought67 instance = new Thought67 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought67 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought67 instance = new Thought67 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought67 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought67 instance = new Thought67 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought67 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought67 instance = new Thought67 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought67 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought67 instance = new Thought67 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2();
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fd1 = fo0.m3(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
    Thought lo0 = Thought242.getInstance(fd0, fd1, fd0, fd1);
    fd0 *= -1;
    fd1 *= -1;
    fb1 = fb0 && fb1;
    Thought lo1 = Thought156.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
    fb0 = fd0 > fd1;
    fb1 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 - fd0;
    fb0 = fd1 < fd0;
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
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[0][1] += fd1;
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo0.m3();
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, lb0, ab1);
}
    double ld1 = 859.5785969829063;
if(fo0 != null){
      fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      ld1 = fo1.m3(fd0, fd1, ld1, fd0);
}
    double ld2 = 372.4807952664377;
    fb1 = lb0 || ab1;
    Thought lo3 = Thought219.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld1, ld2);
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld1, ld2, ab2, ab3, ab4, fb0);
}
    fb1 = lb0 || ab1;
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fd1 = ld1 + ld2;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld1, ld2, fd0, fb1, lb0, ab1, ab2);
}
if(fo0 != null){
      ab3 = fo0.m2(ab4, fb0, fb1, lb0);
}
    fd1 = ld1 - ld2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Thought lo4 = Thought340.getInstance(fd0, fd1, ld1, ld2);
    ab1 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld1, ld2, fd0, fd1);
}
    ab2 = ab3 && ab4;
if(fo1 != null){
      fo1.m1(ld1, ld2, fd0, fd1, fb0, fb1, lb0, ab1);
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
    ad1 = ad2 - ad3;
    ad4 *= -1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fd1 = ad1 - ad2;
    Output.points[0][2] += ad3;
    fb0 = ad4 > fd0;
    boolean lb0 = false;
    Thought lo1 = Thought79.getInstance();
    fd1 = ad1 + ad2;
    fb0 = ad3 < ad4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, fb1, lb0, fb0, fb1);
}
    lb0 = fb0 && fb1;
    lb0 = ad3 > ad4;
    fd0 = fd1 - ad1;
    fb0 = fb1 && lb0;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb0, fb0);
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
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1);
}
    ab1 = !ab2;
if(fo0 != null){
      ad3 = fo0.m3(ad4, fd0, fd1, ad1);
}
    double ld0 = 370.4156812044896;
    Thought lo1 = Thought252.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
    ab3 = ab4 || fb0;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, ad1, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      ab2 = fo1.m2();
}
    boolean lb2 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    Output.points[0][3] += fd1;
    fb1 = lb2 && ab1;
    ld0 = ad1 + ad2;
    ad3 *= -1;
    double ld3 = 86.58306336246353;
if(fo0 != null){
      ad3 = fo0.m3(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fb1 = fo1.m2(ad4, fd0, fd1, ld0);
}
    Output.points[0][4] += ld3;
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    fd1 = ld0 - ld3;
    ad1 = ad2 - ad3;
if(fo1 != null){
      fo1.m1(ad4, fd0, fd1, ld0, lb2, ab1, ab2, ab3);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 - fd1;
    fb0 = fb1 && fb0;
    fb1 = !fb0;
    fd0 *= -1;
    fb1 = fd1 < fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      ao1.m1();
}
    fd1 = fd0 - fd1;
    double ld0 = 822.7198094121421;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
    boolean lb1 = false;
if(ao2 != null){
      lb1 = ao2.m2(fb0, fb1, lb1, fb0);
}
        fb1 = lb1 || fb0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    fb1 = lb1 || fb0;
    fd0 = fd1 + ld0;
    fd0 = fd1 + ld0;
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, ld0, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, ld0, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(ld0, fd0, fd1, ld0, fb1, lb1, fb0, fb1);
}
    double ld2 = 596.3855267150724;
    Thought lo3 = Thought19.getInstance(ao1, ao2, ao3, ao4, lb1, fb0, fb1, lb1);
    ld2 *= -1;
    fd0 *= -1;
    if (fb0) {
if(fo0 != null){
          fd1 = fo0.m3();
}
        double ld4 = 251.7277994027936;
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
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      fb0 = ao1.m2(fb1, fb0, fb1, fb0);
}
    Output.points[0][5] += fd0;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ao1.m2(ad1, ad2, ad3, ad4);
}
    Thought lo0 = Thought196.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2);
    ad3 *= -1;
if(fo1 != null){
      fo1.m2(ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
    fb1 = ad2 > ad3;
    fb0 = fb1 || fb0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = ad4 > fd0;
if(ao1 != null){
      ao1.m1();
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, fb0, fb1);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 *= -1;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1);
}
    Output.points[0][6] += fd0;
    Thought lo0 = Thought205.getInstance(fd1, fd0, fd1, fd0);
    ab1 = fd1 < fd0;
if(ao1 != null){
      ab2 = ao1.m2(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
    ab3 = ab4 || fb0;
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
    ab4 = fd0 > fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, ab1, ab2);
}
    ab3 = fd0 < fd1;
if(ao1 != null){
      fd0 = ao1.m3();
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
    fd1 *= -1;
    ab2 = fd0 < fd1;
    fd0 = fd1 + fd0;
if(ao2 != null){
      fd1 = ao2.m3(ab3, ab4, fb0, fb1);
}
    boolean lb1 = false;
    lb1 = !ab1;
    ab2 = ab3 || ab4;
    fb0 = fd0 > fd1;
    fb1 = lb1 && ab1;
    Output.points[0][7] += fd0;
    Thought lo2 = Thought220.getInstance(ao3, ao4, fo0, fo1);
    ab2 = ab3 || ab4;
    fd1 = fd0 + fd1;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 + ad3;
if(ao1 != null){
      ad4 = ao1.m3(fd0, fd1, ad1, ad2);
}
    Thought lo0 = Thought154.getInstance(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1);
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
    fd1 = ad1 - ad2;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, ab1, ab2, ab3, ab4);
}
    Thought lo1 = Thought325.getInstance();
    ad3 = ad4 - fd0;
    fb0 = !fb1;
    Output.points[0][8] += fd1;
    Thought lo2 = Thought246.getInstance(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
    Thought lo3 = Thought362.getInstance(fb0, fb1, ab1, ab2);
    Thought lo4 = Thought396.getInstance(ao4, fo0, fo1, ao1);
if(ao2 != null){
      ab3 = ao2.m2(fd0, fd1, ad1, ad2);
}
    Thought lo5 = Thought105.getInstance(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
    Output.points[1][0] -= ad1;
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0, ab4, fb0, fb1, ab1);
}
if(ao3 != null){
      ab2 = ao3.m2(ao4, fo0, fo1, ao1, ab3, ab4, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    ab1 = ab2 && ab3;

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
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fd1 *= -1;
if(fo0 != null){
      fd0 = fo0.m3(fb0, fb1, fb0, fb1);
}
    Output.points[1][1] += fd1;
    fd0 *= -1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought177.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
    double ld1 = 89.31472895287312;
    boolean lb2 = false;
    Thought lo3 = Thought370.getInstance();
if(fo0 != null){
      lb2 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0, fb0, fb1, lb2, fb0);
}
if(fo1 != null){
      fo1.m2(fb1, lb2, fb0, fb1);
}
    lb2 = !fb0;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    boolean lb4 = true;
    fb0 = fd1 > ld1;
if(fo1 != null){
      fo1.m1(fd0, fd1, ld1, fd0);
}
    Thought lo5 = Thought294.getInstance(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1);
    Thought lo6 = Thought6.getInstance(ld1, fd0, fd1, ld1, fb1, lb2, lb4, fb0);
    fb1 = fd0 < fd1;
    Thought lo7 = Thought1.getInstance(fo0, fo1, fo0, fo1, lb2, lb4, fb0, fb1);
    ld1 = fd0 + fd1;
if(fo0 != null){
      lb2 = fo0.m2();
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1, lb4, fb0, fb1, lb2);
}
    fd0 = fd1 + ld1;

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
    double ld0 = 407.543056095192;
    boolean lb1 = false;
if(fo1 != null){
      fo1.m2(lb1, ab1, ab2, ab3);
}
    double ld2 = 601.1773841194517;
    ld2 *= -1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    double ld3 = 724.4880830130561;
if(fo1 != null){
      fo1.m3(fd0, fd1, ld0, ld2);
}
    ab4 = fb0 && fb1;
    Output.points[1][2] -= ld3;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld0, ld2, ld3);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, ld2, lb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb1);
}
    ld3 *= -1;
        Output.points[1][3] -= fd0;
if(fo0 != null){
      fo1 = fo0.m4();
}
    ab1 = ab2 && ab3;
    ab4 = fd1 > ld0;
    ld2 = ld3 - fd0;
    double ld4 = 190.02016511103147;

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
    ad1 *= -1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fb1 = fd1 > ad1;
    ad2 = ad3 + ad4;
    lb0 = fb0 && fb1;
    Output.points[1][4] -= fd0;
    Thought lo1 = Thought320.getInstance(fd1, ad1, ad2, ad3);
    boolean lb2 = true;
    lb0 = ad4 > fd0;
    lb2 = !fb0;
    boolean lb3 = false;
    fb0 = fb1 || lb0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
    Thought lo4 = Thought337.getInstance(ad4, fd0, fd1, ad1, lb2, lb3, fb0, fb1);
    lb0 = ad2 > ad3;
    Thought lo5 = Thought131.getInstance(fo0, fo1, fo0, fo1, lb2, lb3, fb0, fb1);

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
if(fo0 != null){
      fo0.m2();
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    Thought lo0 = Thought217.getInstance(fb1, ab1, ab2, ab3);
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      ab4 = fo1.m2(ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    ad1 = ad2 - ad3;
    boolean lb1 = false;
if(fo0 != null){
      ad4 = fo0.m3();
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, lb1, ab1, ab2, ab3);
}
    ab4 = ad4 > fd0;
        fd1 *= -1;
    fb0 = ad1 > ad2;
    boolean lb2 = true;
    ad3 *= -1;
    double ld3 = 24.984402784784955;
    double ld4 = 343.9844638862146;
    fb0 = !fb1;
if(fo0 != null){
      lb1 = fo0.m2(lb2, ab1, ab2, ab3);
}
    ad2 *= -1;
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought343.getInstance(fd1, fd0, fd1, fd0);
    fb0 = fd1 > fd0;
    fd1 = fd0 + fd1;
    fb1 = fb0 && fb1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    Thought lo1 = Thought126.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 > fd0;
    fd1 = fd0 - fd1;
    Thought lo2 = Thought362.getInstance();
    fd0 = fd1 + fd0;
    boolean lb3 = false;

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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, fb0, fb1);
}
    fd1 = ad1 + ad2;
    Thought lo0 = Thought359.getInstance(ao4, fo0, fo1, ao1);
    fb0 = ad3 > ad4;
    fb1 = !fb0;
    fd0 *= -1;
    double ld1 = 924.9062717863143;
    fd0 = fd1 + ld1;
    double ld2 = 348.52582019497356;
    boolean lb3 = true;
if(ao3 != null){
      ao2 = ao3.m4(ld2, ad1, ad2, ad3);
}
    fb0 = ad4 > fd0;
    Output.points[1][5] -= fd1;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld1, ld2, ad1, ad2);
}
        if (fb1) {
if(ao4 != null){
              lb3 = ao4.m2(ad3, ad4, fd0, fd1, fb0, fb1, lb3, fb0);
}
            ld1 = ld2 + ad1;
if(fo0 != null){
              ad2 = fo0.m3(fo1, ao1, ao2, ao3, fb1, lb3, fb0, fb1);
}
            Output.points[1][6] -= ad3;
            } else if (lb3) {
if(fo0 != null){
              ao4 = fo0.m4();
}
            Thought lo4 = Thought21.getInstance(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ld1, fb0, fb1, lb3, fb0);
            } else {
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = fd1 < fd0;
    double ld0 = 621.4619538184369;
    Output.points[1][7] -= fd0;
    fd1 *= -1;
    ab2 = ld0 > fd0;
    fd1 = ld0 - fd0;
    ab3 = ab4 || fb0;
    fd1 = ld0 + fd0;
    fb1 = fd1 > ld0;
    boolean lb1 = false;
    lb1 = fd0 > fd1;
if(ao3 != null){
      ao2 = ao3.m4(ab1, ab2, ab3, ab4);
}
    boolean lb2 = true;
    boolean lb3 = true;
    ld0 = fd0 + fd1;
    boolean lb4 = false;
    ab2 = ld0 > fd0;
    ab3 = ab4 && fb0;
    fb1 = fd1 < ld0;
    fd0 = fd1 - ld0;
    Output.points[1][8] += fd0;
    fd1 *= -1;
    lb1 = ld0 > fd0;
    fd1 = ld0 - fd0;
    lb2 = !lb3;
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    if (ab1) {
if(ao1 != null){
          ao1.m1(ad1, ad2, ad3, ad4);
}
if(ao2 != null){
          ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2);
}
        ab2 = !ab3;
        ad3 *= -1;
if(ao1 != null){
          ab4 = ao1.m2(ad4, fd0, fd1, ad1, fb0, fb1, ab1, ab2);
}
        ab3 = ab4 && fb0;
        ad2 = ad3 - ad4;
        for(int i0=0; i0<10; i0++){
            fb1 = fd0 < fd1;
            ab1 = !ab2;
if(ao3 != null){
              ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab3, ab4, fb0, fb1);
}
if(ao2 != null){
              ao2.m3();
}
            boolean lb0 = true;
            boolean lb1 = false;
            lb0 = lb1 && ab1;
}}
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
    double ld0 = 728.2919229518019;
if(fo0 != null){
          ld0 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    boolean lb1 = true;
    for(int i0=0; i0<10; i0++){
        fb0 = !fb1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
          fd1 = fo1.m3(ld0, fd0, fd1, ld0);
}
        lb1 = !fb0;
        fd0 = fd1 - ld0;
        fb1 = lb1 && fb0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
}
        }
if(fo0 != null){
      fo0.m1(fd1, ld0, fd0, fd1, fb1, lb1, fb0, fb1);
}
    Output.points[2][0] += ld0;
    lb1 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb1, fb0, fb1);
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
    ab1 = ab2 || ab3;
    ab4 = fd0 < fd1;
    fb0 = fb1 && ab1;
    fd0 = fd1 + fd0;
    Output.points[2][1] += fd1;
    ab2 = !ab3;
if(fo0 != null){
      fo1 = fo0.m4();
}
    ab4 = fb0 && fb1;
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = !ab1;
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
    fb1 = !ab1;
    ab2 = !ab3;
    ab4 = !fb0;
    double ld0 = 534.6282673618198;
if(fo0 != null){
      ld0 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, ld0, fd0, fd1);
}
    ld0 = fd0 + fd1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
}
    fd0 = fd1 - ld0;
    boolean lb1 = false;

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
    ad1 = ad2 + ad3;
if(fo1 != null){
      fo1.m2(ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
    ad2 = ad3 + ad4;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
if(fo1 != null){
      ad1 = fo1.m3();
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, ad1, ad2, ad3);
}
    boolean lb0 = false;
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}

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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo0.m2(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
        boolean lb0 = false;
if(fo1 != null){
          ab3 = fo1.m2();
}
        double ld1 = 200.11857479450484;
        fd0 *= -1;
        Thought lo2 = Thought238.getInstance(fo0, fo1, fo0, fo1, fd1, ld1, ad1, ad2, ab4, fb0, fb1, lb0);
        Output.points[2][2] -= ad3;
if(fo0 != null){
          fo0.m3(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        fb0 = fb1 || lb0;
if(fo1 != null){
          ab1 = fo1.m2(ad4, fd0, fd1, ld1);
}
        ab2 = ad1 > ad2;
        ad3 = ad4 + fd0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld1, ad1, ad2);
}
        ab3 = ab4 || fb0;
if(fo0 != null){
          fo0.m2(ad3, ad4, fd0, fd1, fb1, lb0, ab1, ab2);
}
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
          fo0.m2();
}
        ld1 = ad1 - ad2;
        lb0 = ad3 > ad4;
        double ld3 = 951.1799921761665;
if(fo1 != null){
          ad4 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld1, ld3, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
          fo0 = fo1.m4(fb0, fb1, lb0, ab1);
}
}
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1);
}
    fb0 = fd0 < fd1;
    boolean lb0 = false;
    Thought lo1 = Thought60.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    fb1 = !lb0;
    fb0 = fb1 && lb0;
    boolean lb2 = false;
    lb2 = fd1 < fd0;
    double ld3 = 581.983232712577;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, lb0, lb2);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
    boolean lb4 = true;
    lb4 = !fb0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ld3, fd0, fb1, lb0, lb2, lb4);
}
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, lb0, lb2);
}
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3);
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
      ad1 = ao2.m3(ad2, ad3, ad4, fd0);
}
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3);
}
    ad4 = fd0 - fd1;
    ad1 *= -1;
    ad2 *= -1;
    fb0 = ad3 < ad4;
    double ld0 = 437.43449167788384;
if(ao3 != null){
      ao2 = ao3.m4(ad4, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    ad1 = ad2 + ad3;
    ad4 = fd0 + fd1;
    double ld1 = 871.9061558879486;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    fb0 = fb1 || fb0;

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
    ab2 = fd1 < fd0;
if(ao2 != null){
      ao2.m3();
}
    fd1 *= -1;
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    Thought lo0 = Thought36.getInstance(ab1, ab2, ab3, ab4);
    fd1 = fd0 - fd1;
    Output.points[2][3] += fd0;
    Output.points[2][4] -= fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1);
}
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    fb0 = fd1 > fd0;
if(ao3 != null){
      fb1 = ao3.m2(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, ab1, ab2);
}
    ab3 = fd1 > fd0;
    ab4 = !fb0;
    fb1 = fd1 < fd0;
if(fo0 != null){
      ao4 = fo0.m4();
}
if(fo1 != null){
      fd1 = fo1.m3(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ad2 < ad3;
    ab2 = ad4 > fd0;
if(ao1 != null){
      fd1 = ao1.m3(ab3, ab4, fb0, fb1);
}
    boolean lb0 = false;
    lb0 = ad1 > ad2;
if(ao2 != null){
      ab1 = ao2.m2(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(ad3, ad4, fd0, fd1);
}
if(ao3 != null){
      ad1 = ao3.m3(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
    Output.points[2][5] -= fd1;
    Output.points[2][6] += ad1;
    ad2 = ad3 - ad4;
    ab2 = ab3 || ab4;
    fd0 = fd1 - ad1;
if(ao3 != null){
      ao2 = ao3.m4(ad2, ad3, ad4, fd0, fb0, fb1, lb0, ab1);
}
    fd1 *= -1;
    Output.points[2][7] -= ad1;
    double ld1 = 529.9200551675426;
if(ao4 != null){
      ab2 = ao4.m2(fo0, fo1, ao1, ao2, ab3, ab4, fb0, fb1);
}
    double ld2 = 748.0719616098314;
    boolean lb3 = false;
if(ao3 != null){
      ld2 = ao3.m3();
}
    Thought lo4 = Thought302.getInstance(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, lb0, lb3, ab1, ab2);
    double ld5 = 142.0360404724242;
if(ao3 != null){
      ao2 = ao3.m4(ab3, ab4, fb0, fb1);
}
    ad4 = fd0 + fd1;

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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 || fb0;
    if (fb1) {
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        fd1 = fd0 - fd1;
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
        fb0 = fd0 < fd1;
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
          fb1 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
        fd0 *= -1;
        fb0 = !fb1;
        fb0 = fb1 && fb0;
if(fo0 != null){
          fo1 = fo0.m4();
}
        boolean lb0 = true;
        fb0 = !fb1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
        double ld1 = 870.0634030518286;
        fd0 = fd1 + ld1;
        boolean lb2 = false;
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
    Output.points[2][8] += fd0;
    double ld0 = 454.2554058697964;
if(fo0 != null){
      ab2 = fo0.m2(ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ab1 = !ab2;
    ab3 = fd0 > fd1;
    Thought lo1 = Thought1.getInstance(ld0, fd0, fd1, ld0);
    fd0 *= -1;
    Thought lo2 = Thought384.getInstance(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1);
    boolean lb3 = false;

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
    ad1 *= -1;
    ad2 = ad3 - ad4;
    double ld0 = 906.3587658997274;
if(fo0 != null){
      fo0.m2(ad4, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    boolean lb1 = false;
    fb0 = fb1 && lb1;
    fb0 = fb1 || lb1;
    boolean lb2 = false;
    ad1 = ad2 + ad3;
    double ld3 = 389.806784754581;

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
    ab2 = ad1 < ad2;
    ad3 *= -1;
    ad4 = fd0 - fd1;
    ab3 = ad1 < ad2;
    ad3 = ad4 + fd0;
    boolean lb0 = true;
    double ld1 = 162.27368201596013;
    Thought lo2 = Thought285.getInstance(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4();
}
    lb0 = ab1 && ab2;
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld1, ad1, ad2, ab3, ab4, fb0, fb1);
}
    boolean lb3 = true;
    ad3 *= -1;
    ad4 *= -1;
    fd0 = fd1 - ld1;
    lb0 = !lb3;
if(fo0 != null){
      fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
    for(int i0=0; i0<10; i0++){
        double ld4 = 52.563348075157194;
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1);
}
        ld1 *= -1;
        ad1 *= -1;
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
    Output.points[3][0] += fd1;
    fd0 = fd1 + fd0;
    boolean lb0 = false;
if(ao2 != null){
      ao2.m1(fd1, fd0, fd1, fd0);
}
    double ld1 = 826.4168235331091;
    fd0 *= -1;
    lb0 = fd1 < ld1;
    fb0 = fd0 < fd1;
    Thought lo2 = Thought248.getInstance(ao3, ao4, fo0, fo1, ld1, fd0, fd1, ld1);
    boolean lb3 = true;
    fb0 = fd0 < fd1;
if(ao1 != null){
      ao1.m3(ld1, fd0, fd1, ld1, fb1, lb0, lb3, fb0);
}
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fb1, lb0, lb3, fb0);
}
    fd0 = fd1 - ld1;
if(ao1 != null){
      ao1.m2();
}
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, ld1, fd0, lb0, lb3, fb0, fb1);
}
    lb0 = !lb3;
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, lb0, lb3);
}
if(ao3 != null){
          ao3.m3(ao4, fo0, fo1, ao1);
}
    fb0 = fd1 < ld1;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ld1, fd0);
}
    fd1 = ld1 - fd0;

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
    ad1 *= -1;
if(ao1 != null){
      ad2 = ao1.m3(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1);
}
    boolean lb0 = true;
    ad1 = ad2 - ad3;
if(fo1 != null){
      fo1.m1(ad4, fd0, fd1, ad1, fb0, fb1, lb0, fb0);
}
    for(int i0=0; i0<10; i0++){
        fb1 = !lb0;
        fb0 = fb1 || lb0;
if(ao1 != null){
          ad2 = ao1.m3(ao2, ao3, ao4, fo0, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
          fb1 = fo1.m2();
}
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, lb0, fb0, fb1, lb0);
}
if(ao1 != null){
          ad1 = ao1.m3(fb0, fb1, lb0, fb0);
}
if(ao2 != null){
          fb1 = ao2.m2(ao3, ao4, fo0, fo1);
}
        Output.points[3][1] -= ad2;
if(ao2 != null){
          ao1 = ao2.m4(ad3, ad4, fd0, fd1);
}
        lb0 = fb0 || fb1;
        ad1 *= -1;
        Output.points[3][2] -= ad2;
        double ld1 = 927.0069315265808;
        Output.points[3][3] += ad2;
        ad3 = ad4 + fd0;
        lb0 = fb0 && fb1;
        lb0 = fd1 > ld1;
if(ao3 != null){
          ao3.m3(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
        fd0 = fd1 - ld1;
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
    fd1 = fd0 - fd1;
    boolean lb0 = false;
    boolean lb1 = false;
    Thought lo2 = Thought191.getInstance(fd0, fd1, fd0, fd1, lb1, ab1, ab2, ab3);
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, ab4, fb0, fb1, lb0);
}
if(ao1 != null){
      fo1 = ao1.m4();
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, lb1, ab1, ab2, ab3);
}
if(ao2 != null){
      ab4 = ao2.m2(fb0, fb1, lb0, lb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
if(ao3 != null){
      fd1 = ao3.m3(fd0, fd1, fd0, fd1);
}
    ab1 = ab2 && ab3;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
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
    Thought lo0 = Thought370.getInstance(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
    Thought lo1 = Thought151.getInstance(ao1, ao2, ao3, ao4, fb1, ab1, ab2, ab3);
    ab4 = !fb0;
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fd1, ad1, ad2, ad3, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      ad4 = fo1.m3(ab4, fb0, fb1, ab1);
}
if(ao1 != null){
      ab2 = ao1.m2(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fo1.m2(fd0, fd1, ad1, ad2);
}
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1);
}
    ad1 *= -1;
    ad2 = ad3 + ad4;
    boolean lb2 = true;

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
    boolean lb0 = false;
    lb0 = fd0 > fd1;
    Output.points[3][4] += fd0;
    fb0 = fb1 || lb0;
        fb0 = fb1 && lb0;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo0.m3(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    fd0 *= -1;
    fb1 = fd1 > fd0;
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fo0.m1();
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fb1, lb0, fb0, fb1);
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
    fd0 = fd1 - fd0;
    boolean lb0 = false;
    fd1 = fd0 - fd1;
    lb0 = fd0 < fd1;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    Thought lo1 = Thought221.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
if(fo0 != null){
      fo0.m1(fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    fd1 *= -1;
    fb1 = lb0 && fb0;
    boolean lb2 = false;
    fb0 = fb1 && lb0;
    double ld3 = 816.4305286399006;
    Thought lo4 = Thought350.getInstance(fo1, fo0, fo1, fo0, lb2, fb0, fb1, lb0);
if(fo0 != null){
      fo1 = fo0.m4();
}
    lb2 = fb0 || fb1;

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
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought291.getInstance(fb0, fb1, fb0, fb1);
    fb0 = fd0 > fd1;
    fb1 = fd0 > fd1;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
    fd1 *= -1;
if(fo0 != null){
      fb0 = fo0.m2(fd0, fd1, fd0, fd1);
}
    fb1 = fd0 < fd1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    Thought lo1 = Thought98.getInstance(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
    fd0 *= -1;

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
