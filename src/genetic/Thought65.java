package genetic;
import java.util.ArrayList;
class Thought65 extends Thought{
private static ArrayList<Thought65> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 5.2658576093426115;
private double fd1 = 597.2488200796737;
private Thought fo0 = null;
private Thought fo1 = null;
Thought65 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought65 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought65 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought65 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought65 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought65 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought65 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought65 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought65 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought65 instance = new Thought65 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought65 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought65 instance = new Thought65 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought65 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought65 instance = new Thought65 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought65 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought65 instance = new Thought65 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought65 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought65 instance = new Thought65 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought65 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought65 instance = new Thought65 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought65 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought65 instance = new Thought65 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought65 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought65 instance = new Thought65 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fb0 = fb1 && fb0;
    Thought lo0 = Thought71.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
    fb1 = fd1 < fd0;
if(fo1 != null){
      fb0 = fo1.m2(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    double ld1 = 411.5866183866157;
    double ld2 = 903.4441970004276;
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m1();
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld2, fd0, fd1, ld1, fb1, fb0, fb1, fb0);
}
    ld2 = fd0 + fd1;
    boolean lb3 = true;
    ld1 *= -1;
    fb0 = fb1 || lb3;
    fb0 = ld2 < fd0;
    fd1 *= -1;
    ld1 = ld2 - fd0;
if(fo0 != null){
      fd1 = fo0.m3(fb1, lb3, fb0, fb1);
}
if(fo1 != null){
      ld1 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ld2, fd0, fd1, ld1);
}
    boolean lb4 = false;
    double ld5 = 698.2000207219379;
    lb3 = !lb4;
    ld2 *= -1;
        Thought lo6 = Thought48.getInstance(fo0, fo1, fo0, fo1, ld5, fd0, fd1, ld1);
    fb0 = ld2 > ld5;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld1, ld2, fb1, lb3, lb4, fb0);
}
    ld5 = fd0 - fd1;

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
    double ld0 = 710.4777455439405;
    boolean lb1 = true;
    ab2 = !ab3;
if(fo0 != null){
      ld0 = fo0.m3(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb1);
}
    Output.points[1][3] += fd0;
    Thought lo2 = Thought72.getInstance();
    fd1 *= -1;
    boolean lb3 = true;
    lb3 = ld0 > fd0;
    Thought lo4 = Thought180.getInstance(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1, ab1, ab2, ab3, ab4);
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb1, lb3);
}
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1);
}
    ab2 = ab3 && ab4;
if(fo0 != null){
      fo0.m1(ld0, fd0, fd1, ld0);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1);
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
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    Thought lo1 = Thought113.getInstance(ad1, ad2, ad3, ad4, lb0, fb0, fb1, lb0);
    fb0 = fd0 < fd1;
    fb1 = ad1 < ad2;
    ad3 = ad4 + fd0;
    fd1 *= -1;
    boolean lb2 = true;
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0, lb2, fb0, fb1, lb0);
}
    lb2 = !fb0;
    boolean lb3 = false;
if(fo0 != null){
      fo1 = fo0.m4();
}
    Thought lo4 = Thought231.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb0, fb1, lb0, lb2);
    fd0 = fd1 - ad1;

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
    ab1 = ab2 && ab3;
    double ld0 = 654.6946609492662;
    boolean lb1 = false;
    boolean lb2 = false;
    ab2 = ad1 < ad2;
    ad3 = ad4 + fd0;
if(fo1 != null){
      ab3 = fo1.m2(ab4, fb0, fb1, lb1);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ld0, ad1, ad2, ad3);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld0);
}
    Output.points[1][4] -= ad1;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0, lb2, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb1, lb2, ab1, ab2);
}
    boolean lb3 = false;
    Output.points[1][5] -= fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    ab2 = ld0 > ad1;
    boolean lb4 = true;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fb1, lb1, lb2, lb3);
}
    fd1 = ld0 - ad1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ad2 = ad3 + ad4;
    lb4 = fd0 < fd1;
if(fo1 != null){
      ab1 = fo1.m2(ld0, ad1, ad2, ad3);
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
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    double ld0 = 283.0596812247526;
    fb1 = !fb0;
if(ao1 != null){
      ao1.m3(ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      fd0 = ao1.m3();
}
    fb1 = fb0 && fb1;
    fd1 = ld0 + fd0;
    fd1 *= -1;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 - ld0;
    fd0 *= -1;
    fd1 *= -1;
    boolean lb1 = false;
if(ao1 != null){
      ao1.m1(fb0, fb1, lb1, fb0);
}
    fb1 = lb1 && fb0;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1);
}
    Output.points[1][6] -= ld0;

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
    Output.points[1][7] += ad2;
    fb0 = ad3 < ad4;
    if (fb1) {
        } else if (fb0) {
if(ao1 != null){
          ao1.m2(fd0, fd1, ad1, ad2);
}
        boolean lb0 = false;
        fb0 = fb1 && lb0;
if(ao2 != null){
          ao2.m3(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
}
if(ao2 != null){
          ao1 = ao2.m4(ad1, ad2, ad3, ad4, fb0, fb1, lb0, fb0);
}
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, lb0, fb0, fb1);
}
        fd0 *= -1;
if(ao3 != null){
          fd1 = ao3.m3();
}
        Thought lo1 = Thought335.getInstance(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, lb0, fb0, fb1, lb0);
        fb0 = !fb1;
        fd0 *= -1;
if(ao3 != null){
          ao2 = ao3.m4(lb0, fb0, fb1, lb0);
}
        fd1 = ad1 - ad2;
        ad3 *= -1;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
        double ld2 = 481.21031580981;
        boolean lb3 = false;
if(ao4 != null){
          ao4.m1(ad3, ad4, fd0, fd1);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = fd0 > fd1;
    boolean lb0 = true;
    ab2 = !ab3;
    fd0 = fd1 - fd0;
    ab4 = fb0 || fb1;
    lb0 = !ab1;
    boolean lb1 = true;
    Thought lo2 = Thought50.getInstance(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
        fd1 *= -1;
    boolean lb3 = true;
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
    Thought lo4 = Thought181.getInstance(fd0, fd1, fd0, fd1, lb3, ab1, ab2, ab3);
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, ab4, fb0, fb1, lb0);
}
if(ao4 != null){
      fd0 = ao4.m3();
}
    fd1 = fd0 - fd1;
if(fo0 != null){
      lb1 = fo0.m2(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, lb3, ab1, ab2, ab3);
}
    Output.points[1][8] += fd0;
        boolean lb5 = true;
if(fo0 != null){
      ao4 = fo0.m4(ab3, ab4, fb0, fb1);
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
      ad2 = ao2.m3(ao3, ao4, fo0, fo1);
}
    ab1 = ab2 && ab3;
    ad3 = ad4 + fd0;
    fd1 *= -1;
    Thought lo0 = Thought185.getInstance(ad1, ad2, ad3, ad4);
    ab4 = fb0 || fb1;
    boolean lb1 = false;
    lb1 = ab1 || ab2;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2);
}
    double ld2 = 529.3947831227937;
    ab3 = ab4 || fb0;
    fb1 = !lb1;
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, fb0, fb1, lb1, ab1);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    ab2 = !ab3;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld2, ad1, ad2, ad3, ab4, fb0, fb1, lb1);
}
    double ld3 = 91.42497080205229;
    ab1 = ab2 || ab3;
    ab4 = fb0 || fb1;
    lb1 = ab1 || ab2;

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
      fb1 = fo1.m2(fb0, fb1, fb0, fb1);
}
    Output.points[2][0] -= fd0;
    fb0 = fb1 || fb0;
    fd1 *= -1;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
    boolean lb0 = true;
    lb0 = fd1 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    Output.points[2][1] -= fd1;
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
if(fo0 != null){
      fb0 = fo0.m2(fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
    Output.points[2][2] += fd0;
    boolean lb1 = false;

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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    Output.points[2][3] += fd1;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
        fd0 *= -1;
    boolean lb0 = false;
    ab3 = !ab4;
    boolean lb1 = true;
    fd1 *= -1;
    ab4 = !fb0;
    fd0 = fd1 - fd0;
    boolean lb2 = false;
    boolean lb3 = false;
if(fo1 != null){
      ab4 = fo1.m2(fb0, fb1, lb0, lb1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      lb2 = fo1.m2(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      lb3 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo1.m2(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb1);
}
    fd1 = fd0 - fd1;
if(fo0 != null){
      fd0 = fo0.m3();
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    if (fb1) {
        fb0 = fb1 && fb0;
        boolean lb0 = true;
if(fo1 != null){
          ad2 = fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, lb0, fb0);
}
        ad1 = ad2 - ad3;
        fb1 = lb0 && fb0;
if(fo0 != null){
          ad4 = fo0.m3(fb1, lb0, fb0, fb1);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        double ld1 = 716.1664626708762;
        lb0 = fb0 && fb1;
        ad4 = fd0 + fd1;
        Thought lo2 = Thought174.getInstance(ld1, ad1, ad2, ad3);
        double ld3 = 109.07873570761285;
        ad3 = ad4 + fd0;
        fd1 *= -1;
        ld1 = ld3 + ad1;
if(fo1 != null){
          ad2 = fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
        boolean lb4 = false;
if(fo0 != null){
          lb0 = fo0.m2(ld1, ld3, ad1, ad2, lb4, fb0, fb1, lb0);
}
        double ld5 = 705.9667636688789;
        ad2 *= -1;
        lb4 = !fb0;
        fb1 = lb0 && lb4;
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
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2();
}
    boolean lb0 = true;
    Thought lo1 = Thought103.getInstance(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, lb0, ab1, ab2, ab3);
if(fo1 != null){
      ab4 = fo1.m2(fb0, fb1, lb0, ab1);
}
    ab2 = ab3 && ab4;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    ad1 = ad2 - ad3;
    ad4 *= -1;
if(fo1 != null){
      fb0 = fo1.m2(fd0, fd1, ad1, ad2);
}
    Output.points[2][4] += ad3;
    fb1 = ad4 < fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    lb0 = ab1 && ab2;
if(fo1 != null){
      ab3 = fo1.m2(fd0, fd1, ad1, ad2, ab4, fb0, fb1, lb0);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    Thought lo2 = Thought44.getInstance();
    Output.points[2][5] += ad3;
    boolean lb3 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, ab4, fb0, fb1, lb0);
}
    lb3 = ab1 && ab2;
if(fo0 != null){
      fo1 = fo0.m4(ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1);
}
    ad3 = ad4 - fd0;
if(fo0 != null){
      fo0.m3(fd1, ad1, ad2, ad3);
}
    lb0 = ad4 > fd0;
    Thought lo4 = Thought123.getInstance(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
    Thought lo5 = Thought317.getInstance(ad4, fd0, fd1, ad1, lb3, ab1, ab2, ab3);

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
      ao2.m3(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      ao1.m2();
}
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
if(ao1 != null){
      ao1.m3(fb1, fb0, fb1, fb0);
}
    fd1 = fd0 - fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
if(ao4 != null){
      fb1 = ao4.m2(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
if(ao4 != null){
      ao3 = ao4.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb1, fb0, fb1, fb0);
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
if(ao2 != null){
      ao1 = ao2.m4();
}
    double ld0 = 708.042577857357;
    Thought lo1 = Thought268.getInstance(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
if(ao1 != null){
      fb0 = ao1.m2(fb1, fb0, fb1, fb0);
}
    Thought lo2 = Thought307.getInstance(ao2, ao3, ao4, fo0);
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, ld0, ad1);
}
    ad2 = ad3 + ad4;
    Thought lo3 = Thought96.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, ld0, ad1);
    Thought lo4 = Thought168.getInstance(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
    double ld5 = 479.2875393754455;
    fb1 = !fb0;
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 - ld0;
if(fo0 != null){
      fo0.m3();
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ld5, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    Thought lo6 = Thought71.getInstance(fb1, fb0, fb1, fb0);
    ad4 = fd0 - fd1;
    fb1 = !fb0;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    fb1 = ld0 > ld5;
    double ld7 = 651.4140790787919;

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
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1);
}
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
    ab2 = ab3 || ab4;
    fd0 *= -1;
    double ld0 = 777.3379850823819;
if(ao3 != null){
      fd0 = ao3.m3(fd1, ld0, fd0, fd1, fb0, fb1, ab1, ab2);
}
    ab3 = !ab4;
    fb0 = fb1 && ab1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      ld0 = ao4.m3();
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, ao1, ao2, ao3, fd0, fd1, ld0, fd0, ab1, ab2, ab3, ab4);
}
if(ao4 != null){
      fb0 = ao4.m2(fb1, ab1, ab2, ab3);
}
    ab4 = fd1 > ld0;
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
      ao4.m1(fd0, fd1, ld0, fd0);
}
    fb0 = fb1 && ab1;
    boolean lb1 = false;
    if (ab1) {
        double ld2 = 647.7927559505142;
        for(int i0=0; i0<10; i0++){
            Thought lo3 = Thought172.getInstance(fo0, fo1, ao1, ao2, fd0, fd1, ld2, ld0);
            }
        Output.points[2][6] -= fd0;
        Thought lo4 = Thought88.getInstance(fd1, ld2, ld0, fd0, ab2, ab3, ab4, fb0);
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, lb1, ab1, ab2);
}
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
if(ao2 != null){
      ao1 = ao2.m4();
}
    ab1 = ad1 > ad2;
    for(int i0=0; i0<10; i0++){
if(ao3 != null){
          ao3.m1(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(ao2 != null){
          ad1 = ao2.m3(fb1, ab1, ab2, ab3);
}
        ab4 = ad2 > ad3;
        ad4 *= -1;
if(ao3 != null){
          fd0 = ao3.m3(ao4, fo0, fo1, ao1);
}
        fb0 = fb1 || ab1;
        fd1 = ad1 + ad2;
        }
    boolean lb0 = false;
    ad3 = ad4 - fd0;
    Output.points[2][7] += fd1;
    ab1 = !ab2;
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4);
}
if(ao4 != null){
      ab3 = ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2);
}
    ab4 = fb0 && fb1;
    lb0 = !ab1;
if(ao4 != null){
      ao3 = ao4.m4(ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + fd0;
    fb0 = !fb1;
    double ld0 = 333.394039246912;
    fd0 = fd1 + ld0;
    fd0 = fd1 + ld0;
    double ld1 = 857.8644039855086;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb0 = fb1 && fb0;
    fb1 = !fb0;

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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    double ld1 = 156.83626998329515;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb0, ab1);
}
    ab2 = fd0 < fd1;
    ld1 = fd0 + fd1;
    Thought lo2 = Thought229.getInstance(fo1, fo0, fo1, fo0);
    boolean lb3 = false;
if(fo1 != null){
      fo1.m3(ld1, fd0, fd1, ld1);
}
    boolean lb4 = false;
    Output.points[2][8] += fd0;
    Output.points[3][0] += fd1;
    double ld5 = 290.5072809420586;
if(fo0 != null){
      ld1 = fo0.m3(fo1, fo0, fo1, fo0, ld5, fd0, fd1, ld1);
}
if(fo1 != null){
      ld5 = fo1.m3(fd0, fd1, ld1, ld5, ab1, ab2, ab3, ab4);
}
    fb0 = fd0 < fd1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb0, lb3, lb4);
}
if(fo0 != null){
      ld1 = fo0.m3();
}
    Output.points[3][1] += ld5;
    fd0 = fd1 - ld1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld5, fd0, fd1, ld1, ab1, ab2, ab3, ab4);
}
    fb0 = ld5 > fd0;
    Thought lo6 = Thought164.getInstance(fb1, lb0, lb3, lb4);
    Output.points[3][2] -= fd1;
    ld1 = ld5 + fd0;
    Thought lo7 = Thought170.getInstance(fo1, fo0, fo1, fo0);

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
    ad1 = ad2 + ad3;
    fb1 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ad1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    fd1 = ad1 + ad2;
    Thought lo0 = Thought182.getInstance(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    double ld1 = 395.54082023021596;
if(fo0 != null){
      fo0.m2();
}
if(fo1 != null){
          fb0 = fo1.m2(fo0, fo1, fo0, fo1, ld1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
    Thought lo2 = Thought125.getInstance(fb1, fb0, fb1, fb0);
    fb1 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ld1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    Output.points[3][3] += fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld1, ad1, ad2, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    double ld3 = 322.99199170133835;

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
    boolean lb0 = true;
    double ld1 = 936.9826890646214;
if(fo0 != null){
      fo0.m1();
}
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
    fd0 = fd1 - ld1;
    fb0 = !fb1;
    double ld2 = 485.99715751264245;
    lb0 = !ab1;
        ab2 = ld2 < ad1;
    ab3 = ab4 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(fb1, lb0, ab1, ab2);
}
    double ld3 = 237.8864914397306;
    ab3 = ab4 && fb0;
    boolean lb4 = false;
    ad1 *= -1;
        double ld5 = 623.1089680535749;
    Thought lo6 = Thought314.getInstance(fo0, fo1, fo0, fo1);
    Thought lo7 = Thought173.getInstance(ad1, ad2, ad3, ad4);

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
    for(int i0=0; i0<10; i0++){
        fb0 = !fb1;
        boolean lb0 = true;
        fd1 *= -1;
        boolean lb1 = true;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(ao2 != null){
          ao1 = ao2.m4(fd0, fd1, fd0, fd1, lb0, lb1, fb0, fb1);
}
        lb0 = fd0 < fd1;
        lb1 = fb0 || fb1;
        Output.points[3][4] += fd0;
        }
    boolean lb2 = true;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb2, fb0, fb1, lb2);
}
    fd1 = fd0 + fd1;
if(ao3 != null){
      fb0 = ao3.m2();
}
    boolean lb3 = false;
    fd0 = fd1 + fd0;
    boolean lb4 = true;
    double ld5 = 233.53805058786568;
if(ao4 != null){
      lb4 = ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, ld5, fd0, fb0, fb1, lb2, lb3);
}
    fd1 *= -1;
    ld5 = fd0 - fd1;
if(ao3 != null){
      ao3.m1(lb4, fb0, fb1, lb2);
}
    boolean lb6 = false;
    lb3 = ld5 < fd0;
    double ld7 = 60.29026134655342;
    boolean lb8 = false;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
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
    boolean lb0 = false;
    double ld1 = 808.8660391533648;
    boolean lb2 = true;
    boolean lb3 = false;
    ad1 = ad2 + ad3;
    ad4 *= -1;
    boolean lb4 = false;
    lb0 = !lb2;
    Thought lo5 = Thought332.getInstance(fd0, fd1, ld1, ad1);
    ad2 = ad3 + ad4;
    lb3 = lb4 && fb0;
    Output.points[3][5] -= fd0;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, ld1, ad1, ad2, ad3);
}
if(ao1 != null){
      fb1 = ao1.m2(ad4, fd0, fd1, ld1, lb0, lb2, lb3, lb4);
}
    boolean lb6 = false;
    Output.points[3][6] -= ad1;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, lb6, fb0, fb1, lb0);
}
if(ao1 != null){
      ad2 = ao1.m3();
}
if(ao2 != null){
      ad3 = ao2.m3(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ld1, lb2, lb3, lb4, lb6);
}
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, lb0, lb2);
}
    lb3 = lb4 || lb6;
    for(int i0=0; i0<10; i0++){
        for(int i1=0; i1<10; i1++){
if(ao3 != null){
              fb0 = ao3.m2(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
              ao2 = ao3.m4(ad1, ad2, ad3, ad4);
}
            fd0 *= -1;
            fb1 = fd1 < ld1;
            ad1 *= -1;
}}
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 *= -1;
    Thought lo0 = Thought297.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
    ab1 = !ab2;
    ab3 = fd0 < fd1;
    ab4 = fd0 < fd1;
    fd0 *= -1;
    fb0 = fd1 > fd0;
    double ld1 = 283.21606348427304;
    Thought lo2 = Thought368.getInstance(fd0, fd1, ld1, fd0, fb1, ab1, ab2, ab3);
if(fo1 != null){
      ab4 = fo1.m2(ao1, ao2, ao3, ao4, fb0, fb1, ab1, ab2);
}
    Thought lo3 = Thought78.getInstance();
    ab3 = !ab4;
    boolean lb4 = true;
if(fo0 != null){
      ab4 = fo0.m2(fo1, ao1, ao2, ao3, fd1, ld1, fd0, fd1, fb0, fb1, lb4, ab1);
}
if(fo0 != null){
      ao4 = fo0.m4(ab2, ab3, ab4, fb0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    ld1 = fd0 - fd1;
if(ao1 != null){
      fo1 = ao1.m4(ld1, fd0, fd1, ld1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ld1, fd0);
}
    fd1 = ld1 - fd0;
    fb1 = fd1 < ld1;
    boolean lb5 = false;
    Output.points[3][7] += fd0;
if(ao2 != null){
      fd1 = ao2.m3(ld1, fd0, fd1, ld1, lb4, lb5, ab1, ab2);
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
    for(int i0=0; i0<10; i0++){
        Thought lo0 = Thought358.getInstance(ao1, ao2, ao3, ao4, ab1, ab2, ab3, ab4);
        ad1 = ad2 - ad3;
        ad4 = fd0 - fd1;
        fb0 = fb1 && ab1;
        Thought lo1 = Thought204.getInstance();
if(fo0 != null){
          ad1 = fo0.m3(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
        Thought lo2 = Thought62.getInstance(fb1, ab1, ab2, ab3);
        boolean lb3 = true;
        fd1 = ad1 + ad2;
        ab3 = ab4 && fb0;
if(ao4 != null){
          ad3 = ao4.m3(fo0, fo1, ao1, ao2);
}
if(ao4 != null){
          ao3 = ao4.m4(ad4, fd0, fd1, ad1);
}
        fb1 = ad2 < ad3;
        Thought lo4 = Thought359.getInstance(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ad1);
        lb3 = ad2 > ad3;
        ab1 = !ab2;
        ab3 = ab4 || fb0;
        boolean lb5 = true;
if(ao3 != null){
          ad4 = ao3.m3(fd0, fd1, ad1, ad2, fb0, fb1, lb3, lb5);
}
        boolean lb6 = false;
        Output.points[3][8] -= ad3;
if(ao4 != null){
          lb6 = ao4.m2(fo0, fo1, ao1, ao2, ab1, ab2, ab3, ab4);
}
        fb0 = ad4 > fd0;
        fb1 = fd1 > ad1;
        double ld7 = 662.5567490821421;
        lb3 = ad1 < ad2;
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought61.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    boolean lb1 = true;
    fd0 *= -1;
if(fo0 != null){
      fo0.m2(fb0, fb1, lb1, fb0);
}
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    fb1 = !lb1;
    fd0 = fd1 - fd0;
    fb0 = !fb1;

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
    ab1 = !ab2;
    ab3 = ab4 && fb0;
    double ld0 = 336.57618070212266;
    Thought lo1 = Thought397.getInstance(fd0, fd1, ld0, fd0);
    fb1 = ab1 || ab2;
    fd1 = ld0 + fd0;
    Output.points[4][0] -= fd1;
if(fo1 != null){
      ld0 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
}
if(fo0 != null){
      fo0.m2(fd1, ld0, fd0, fd1, ab3, ab4, fb0, fb1);
}
    boolean lb2 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb2, ab1, ab2, ab3);
}
    Thought lo3 = Thought78.getInstance();
    ld0 *= -1;

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
    ad2 = ad3 + ad4;
    fb0 = fd0 > fd1;
    ad1 *= -1;
    fb1 = ad2 > ad3;
    ad4 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
    fb1 = fd0 < fd1;
    boolean lb0 = false;
    Output.points[4][1] -= ad1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      lb0 = fo0.m2(fd1, ad1, ad2, ad3, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, fb0, fb1, lb0, fb0);
}
    Output.points[4][2] += ad2;
if(fo0 != null){
      fb1 = fo0.m2(lb0, fb0, fb1, lb0);
}
    boolean lb1 = false;
    boolean lb2 = true;
    Thought lo3 = Thought61.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      ad3 = fo1.m3(ad4, fd0, fd1, ad1);
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
    boolean lb0 = false;
    boolean lb1 = false;
    lb1 = ad2 > ad3;
    ab1 = ad4 < fd0;
    boolean lb2 = false;
    ab1 = !ab2;
    boolean lb3 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
    Output.points[4][3] += ad4;
    ab2 = ab3 || ab4;
    double ld4 = 893.1941524550327;
if(fo1 != null){
      ad4 = fo1.m3(fd0, fd1, ld4, ad1, fb0, fb1, lb0, lb1);
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
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought41.getInstance();
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    double ld1 = 602.1677382447232;
    fb0 = fd0 < fd1;
    fb1 = fb0 && fb1;
    Thought lo2 = Thought302.getInstance(fb0, fb1, fb0, fb1);
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4);
}
    fb0 = !fb1;
if(fo0 != null){
      ld1 = fo0.m3(fd0, fd1, ld1, fd0);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 56.62341900195798;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld0, ad1, ad2, ad3);
}
    ad4 = fd0 + fd1;
    Output.points[4][4] -= ld0;
    boolean lb1 = true;
    lb1 = ad1 < ad2;
    ad3 *= -1;
    double ld2 = 12.586114245831745;
    Thought lo3 = Thought267.getInstance(ad3, ad4, fd0, fd1, fb0, fb1, lb1, fb0);
    boolean lb4 = false;
    double ld5 = 29.491458360734672;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fb0, fb1, lb1, lb4);
}
    boolean lb6 = false;
    lb6 = fb0 || fb1;
        ld0 = ld2 + ld5;
    lb1 = !lb4;
        Thought lo7 = Thought161.getInstance();
    ad1 = ad2 + ad3;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ld0, lb6, fb0, fb1, lb1);
}
if(fo1 != null){
      fo1.m1(lb4, lb6, fb0, fb1);
}
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0);
}
    lb1 = !lb4;
    ld2 = ld5 + ad1;
    boolean lb8 = true;
    ad2 = ad3 + ad4;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[4][5] -= fd1;
    double ld0 = 124.02334166974144;
    Thought lo1 = Thought92.getInstance(ld0, fd0, fd1, ld0);
    fd0 *= -1;
    fd1 = ld0 - fd0;
    Output.points[4][6] -= fd1;
    ab1 = ld0 < fd0;
    double ld2 = 464.6473158980015;
    double ld3 = 681.3998196475231;
    Output.points[4][7] += ld3;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, ld0, ld2, ld3);
}
    ab2 = ab3 && ab4;
    fb0 = fd0 < fd1;
    fb1 = ld0 < ld2;
    Thought lo4 = Thought236.getInstance(ld3, fd0, fd1, ld0, ab1, ab2, ab3, ab4);
    ld2 = ld3 + fd0;
    double ld5 = 161.42218115512114;
    fd0 *= -1;
    fb0 = fd1 < ld0;
if(fo1 != null){
      ld2 = fo1.m3(ao1, ao2, ao3, ao4, fb1, ab1, ab2, ab3);
}
    double ld6 = 388.5826722549744;
    ld3 = ld5 - ld6;
if(fo1 != null){
      fo0 = fo1.m4();
}
    ab4 = fd0 > fd1;
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, ld0, ld2, ld3, ld5, fb1, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
    Thought lo7 = Thought238.getInstance(ab1, ab2, ab3, ab4);
    fb0 = fb1 && ab1;

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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4);
}
    Output.points[4][8] += fd0;
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
    ab2 = fd0 > fd1;
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
if(ao4 != null){
      ab1 = ao4.m2(fo0, fo1, ao1, ao2, ab2, ab3, ab4, fb0);
}
if(ao3 != null){
      ao3.m2();
}
if(ao4 != null){
      fb1 = ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && ab1;
    double ld0 = 51.68823320053198;
    ab2 = !ab3;
    ab4 = !fb0;
    ad2 = ad3 + ad4;
    Thought lo1 = Thought211.getInstance(fb1, ab1, ab2, ab3);
    double ld2 = 915.3914643370863;
    ab4 = ad4 < fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
          fd1 = ao3.m3(ld0, ld2, ad1, ad2);
}
    Thought lo3 = Thought51.getInstance(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1);
if(ao3 != null){
      ao2 = ao3.m4(ld0, ld2, ad1, ad2, fb0, fb1, ab1, ab2);
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
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
    fd1 = fd0 + fd1;
    boolean lb1 = true;
if(fo1 != null){
      fd0 = fo1.m3();
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb0, lb1, fb0, fb1);
}
    double ld2 = 390.0706926068473;
    Output.points[5][0] += fd0;
    fd1 = ld2 - fd0;
    Output.points[5][1] -= fd1;
    lb0 = ld2 < fd0;
if(fo0 != null){
      lb1 = fo0.m2(fb0, fb1, lb0, lb1);
}
    fb0 = fb1 && lb0;
    Thought lo3 = Thought327.getInstance(fo1, fo0, fo1, fo0);
    lb1 = fd1 < ld2;

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
    fd1 = fd0 - fd1;
    fb0 = fb1 && fb0;
    fd0 = fd1 - fd0;
    fb1 = fd1 < fd0;
    fb0 = !fb1;
    fb0 = fb1 || fb0;
    fb1 = fd1 < fd0;
    boolean lb0 = true;
        boolean lb1 = false;
    lb0 = lb1 || fb0;
    double ld2 = 109.44401055802255;
if(fo1 != null){
      fb1 = fo1.m2(fd0, fd1, ld2, fd0);
}
    fd1 = ld2 + fd0;
    double ld3 = 438.2370459294913;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld2, ld3);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld2, ld3, lb0, lb1, fb0, fb1);
}
        Thought lo4 = Thought98.getInstance(fo1, fo0, fo1, fo0, lb0, lb1, fb0, fb1);
    Output.points[5][2] -= fd0;
if(fo0 != null){
      fo1 = fo0.m4();
}
    lb0 = fd1 > ld2;
    Output.points[5][3] += ld3;
    boolean lb5 = false;
    double ld6 = 884.5427701715495;
    Thought lo7 = Thought210.getInstance(fo1, fo0, fo1, fo0, ld6, fd0, fd1, ld2, lb1, lb5, fb0, fb1);
    boolean lb8 = true;

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
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4(lb0, fb0, fb1, lb0);
}
    double ld1 = 26.957561902853932;
    fb0 = !fb1;
    Output.points[5][4] -= fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      lb0 = fo0.m2(ld1, fd0, fd1, ld1);
}
    fb0 = fd0 < fd1;
    ld1 = fd0 + fd1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1);
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
