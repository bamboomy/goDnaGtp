package genetic;
import java.util.ArrayList;
class Thought29 extends Thought{
private static ArrayList<Thought29> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 776.4321504179799;
private double fd1 = 220.92804838394537;
private Thought fo0 = null;
private Thought fo1 = null;
Thought29 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought29 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought29 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought29 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought29 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought29 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought29 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought29 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought29 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought29 instance = new Thought29 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought29 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought29 instance = new Thought29 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought29 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought29 instance = new Thought29 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought29 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought29 instance = new Thought29 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought29 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought29 instance = new Thought29 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought29 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought29 instance = new Thought29 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought29 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought29 instance = new Thought29 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought29 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought29 instance = new Thought29 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    Output.points[2][1] += fd1;
    fd0 *= -1;
    Output.points[2][2] -= fd1;
    boolean lb0 = false;
    Output.points[2][3] -= fd0;
    Thought lo1 = Thought150.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
    boolean lb2 = false;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, lb0, lb2, fb0, fb1);
}
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1, lb2, fb0, fb1, lb0);
}
if(fo0 != null){
      lb2 = fo0.m2();
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb2);
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb0, lb2);
}
    fd0 = fd1 - fd0;
    fb0 = fd1 > fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
        fb1 = lb0 || lb2;
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb2);
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
    fd0 *= -1;
    fd1 = fd0 - fd1;
    ab1 = !ab2;
    boolean lb0 = false;
    ab2 = !ab3;
    ab4 = !fb0;
    fd0 = fd1 - fd0;
    Output.points[2][4] += fd1;
    fb1 = fd0 > fd1;
    fd0 = fd1 - fd0;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} 
}
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought107.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
    ad2 *= -1;
    ad3 = ad4 - fd0;
    boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4();
}
    Output.points[2][5] -= fd1;
    lb1 = fb0 && fb1;
    lb1 = ad1 > ad2;
    fb0 = fb1 || lb1;
    ad3 *= -1;
    ad4 = fd0 - fd1;
    fb0 = !fb1;
if(fo1 != null){
      lb1 = fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, lb1, fb0);
}
if(fo0 != null){
      fo0.m1(fb1, lb1, fb0, fb1);
}
    lb1 = fb0 || fb1;
    lb1 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb0 = ad1 < ad2;
    double ld2 = 815.4660026978818;
    ad2 *= -1;
if(fo1 != null){
      fb1 = fo1.m2(ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld2, ad1, ad2, ad3);
}
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ld2, lb1, fb0, fb1, lb1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, lb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    boolean lb3 = false;
    Thought lo4 = Thought295.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, lb1, lb3, fb0, fb1);
    fd0 *= -1;
if(fo1 != null){
      fo1.m1(lb1, lb3, fb0, fb1);
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
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb0 = false;
    Thought lo1 = Thought345.getInstance(ad1, ad2, ad3, ad4);
    Output.points[2][6] += fd0;
    fd1 *= -1;
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    lb0 = fd1 < ad1;
    boolean lb2 = false;
    boolean lb3 = false;
    lb2 = ad2 > ad3;
    ad4 *= -1;

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
    double ld0 = 961.413589251098;
    Thought lo1 = Thought384.getInstance(ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
    Thought lo2 = Thought58.getInstance();
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      ao2.m2(fb0, fb1, fb0, fb1);
}
    fd1 = ld0 + fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    boolean lb3 = false;
    boolean lb4 = false;
    lb3 = fd1 > ld0;

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
    ad2 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ad3, ad4, fd0, fd1);
}
    Thought lo0 = Thought309.getInstance(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
    fd0 *= -1;
    fd1 *= -1;
    ad1 = ad2 - ad3;
    ad4 = fd0 + fd1;
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
    fd0 *= -1;
if(ao3 != null){
      fb1 = ao3.m2();
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      ao4.m2(fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    fb0 = ad4 < fd0;
    boolean lb1 = false;
    fd1 = ad1 - ad2;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    ad3 = ad4 - fd0;
    fb0 = !fb1;
    for(int i0=0; i0<10; i0++){
        boolean lb2 = false;
if(fo1 != null){
          fo0 = fo1.m4(fd1, ad1, ad2, ad3);
}
        lb2 = !lb1;
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
    ab1 = !ab2;
    ab3 = fd1 < fd0;
    fd1 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    boolean lb0 = true;
if(ao1 != null){
      ao1.m2(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    lb0 = ab1 || ab2;
    Thought lo1 = Thought210.getInstance(ao2, ao3, ao4, fo0, ab3, ab4, fb0, fb1);
if(fo1 != null){
      lb0 = fo1.m2();
}
    ab1 = !ab2;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fd1 = fo1.m3(lb0, ab1, ab2, ab3);
}
    boolean lb2 = false;
    ab3 = fd0 > fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
          ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
    ab4 = !fb0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, fd0, fd1, fb1, lb0, lb2, ab1);
}
    fd0 = fd1 + fd0;
        ab2 = fd1 < fd0;

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
    ab1 = ad2 < ad3;
    ab2 = !ab3;
    Thought lo0 = Thought282.getInstance(ao1, ao2, ao3, ao4, ab4, fb0, fb1, ab1);
    ab2 = !ab3;
    boolean lb1 = true;
if(fo0 != null){
      ab3 = fo0.m2();
}
    Output.points[2][7] += ad4;
    boolean lb2 = false;
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4, fd0, fd1, ad1, ad2, ab3, ab4, fb0, fb1);
}
    ad3 = ad4 - fd0;
    boolean lb3 = true;
    boolean lb4 = true;
    lb1 = lb2 && lb3;
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(lb4, ab1, ab2, ab3);
}
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0);
}
    ab4 = ad1 > ad2;
    boolean lb5 = true;
    ad3 *= -1;
    ab4 = ad4 < fd0;
    fd1 = ad1 - ad2;
    ad3 = ad4 - fd0;
    fb0 = !fb1;
if(ao1 != null){
      fo1 = ao1.m4(fd1, ad1, ad2, ad3);
}
    ad4 = fd0 + fd1;

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
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    boolean lb0 = true;
    double ld1 = 468.21029994198483;
if(fo0 != null){
      fo1 = fo0.m4(ld1, fd0, fd1, ld1, lb0, fb0, fb1, lb0);
}
    fb0 = fd0 < fd1;
    ld1 = fd0 - fd1;
    double ld2 = 872.5888271977058;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
}
if(fo1 != null){
      fo1.m1();
}
    ld1 = ld2 + fd0;
    fd1 *= -1;
    ld1 = ld2 - fd0;
    if (lb0) {
        Output.points[2][8] -= fd1;
if(fo0 != null){
          ld1 = fo0.m3(fo1, fo0, fo1, fo0, ld2, fd0, fd1, ld1, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
          fo1 = fo0.m4(fb1, lb0, fb0, fb1);
}
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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd0 *= -1;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
        Thought lo0 = Thought175.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
        Output.points[3][0] -= fd1;
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
        fd0 = fd1 + fd0;
        Output.points[3][1] += fd1;
        Output.points[3][2] -= fd0;
        fb1 = !ab1;
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
        fd1 = fd0 - fd1;
        fd0 = fd1 - fd0;
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
    double ld0 = 762.0308069218556;
if(fo0 != null){
      fo0.m1();
}
    ad1 *= -1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 < ld0;
if(fo0 != null){
      fo0.m3(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
    fb1 = fd0 < fd1;
    Output.points[3][3] -= ld0;
    boolean lb1 = false;
    Thought lo2 = Thought334.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
if(fo0 != null){
      fo0.m2(fd0, fd1, ld0, ad1, lb1, fb0, fb1, lb1);
}
    fb0 = !fb1;
    ad2 = ad3 - ad4;
    fd0 *= -1;
    lb1 = fb0 && fb1;
    double ld3 = 192.75941416754455;
    for(int i0=0; i0<10; i0++){
        lb1 = !fb0;
        fb1 = !lb1;
        fb0 = fd0 > fd1;
        boolean lb4 = true;
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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      ad1 = fo0.m3();
}
    ad2 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb0, fb1, ab1, ab2);
}
    ab3 = ad1 < ad2;
    ad3 = ad4 - fd0;
    ab4 = fb0 && fb1;
    ab1 = ab2 && ab3;
    double ld0 = 554.7467707105541;
    fd0 = fd1 + ld0;
if(fo1 != null){
      ad1 = fo1.m3(ab4, fb0, fb1, ab1);
}
    ab2 = ad2 < ad3;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    Output.points[3][4] += ad4;
if(fo1 != null){
      fd0 = fo1.m3(fd1, ld0, ad1, ad2);
}
    ad3 *= -1;
        ad4 = fd0 + fd1;
    Thought lo1 = Thought346.getInstance(fo0, fo1, fo0, fo1, ld0, ad1, ad2, ad3);

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 *= -1;
    fd1 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
    Output.points[3][5] += fd1;
        Thought lo0 = Thought73.getInstance();
    Output.points[3][6] -= fd0;
    fd1 *= -1;
    fb1 = !fb0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      fd0 = ao2.m3(fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1);
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
    fb1 = ad2 < ad3;
if(ao3 != null){
      ao2 = ao3.m4(ad4, fd0, fd1, ad1);
}
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0);
}
if(ao4 != null){
      ao3 = ao4.m4(fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    double ld0 = 523.6277991816122;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      ad3 = fo0.m3();
}
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    Thought lo1 = Thought343.getInstance(ao1, ao2, ao3, ao4);
if(fo0 != null){
      fo0.m1(ad1, ad2, ad3, ad4);
}
    boolean lb2 = true;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, ld0, ad1);
}
    double ld3 = 989.7216403467771;
if(ao1 != null){
      fo1 = ao1.m4(ad1, ad2, ad3, ad4, lb2, fb0, fb1, lb2);
}
    fb0 = fb1 || lb2;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fb0, fb1, lb2, fb0);
}
    Thought lo4 = Thought237.getInstance();
    boolean lb5 = true;
    fd0 = fd1 - ld0;
    for(int i0=0; i0<10; i0++){
        Thought lo6 = Thought121.getInstance(ao1, ao2, ao3, ao4, ld3, ad1, ad2, ad3, fb0, fb1, lb2, lb5);
if(fo1 != null){
          fo0 = fo1.m4(fb0, fb1, lb2, lb5);
}
if(ao1 != null){
          fb0 = ao1.m2(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
          fo1 = ao1.m4(ad4, fd0, fd1, ld0);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 + fd1;
    ab1 = fd0 > fd1;
    Thought lo0 = Thought353.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    boolean lb1 = true;
    fd0 *= -1;
    fb0 = fb1 && lb1;
    if (ab1) {
        Thought lo2 = Thought83.getInstance(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
        Output.points[3][7] += fd1;
        fd0 = fd1 + fd0;
        fb1 = !lb1;
        Output.points[3][8] -= fd1;
        boolean lb3 = false;
        lb1 = fd0 > fd1;
        fd0 = fd1 + fd0;
        fd1 = fd0 - fd1;
        fd0 *= -1;
        boolean lb4 = true;
        double ld5 = 133.60576118182067;
        fd0 = fd1 - ld5;
        lb1 = !ab1;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao2.m3();
}
    ab2 = ab3 && ab4;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, fb0, fb1, ab1, ab2);
}
    fd1 = ad1 - ad2;
    Output.points[4][0] += ad3;
    Thought lo0 = Thought372.getInstance(ab3, ab4, fb0, fb1);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(ad4, fd0, fd1, ad1);
}
    ad2 = ad3 - ad4;
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2);
}
if(ao4 != null){
      ao3 = ao4.m4(ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
    ad1 = ad2 - ad3;
    Thought lo1 = Thought398.getInstance(fo0, fo1, ao1, ao2, fb0, fb1, ab1, ab2);
    boolean lb2 = true;
    boolean lb3 = false;
if(ao3 != null){
      ao3.m3();
}
    ab1 = ad4 < fd0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
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
      fd1 = fo1.m3(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    Thought lo0 = Thought60.getInstance(fd0, fd1, fd0, fd1);
    Thought lo1 = Thought237.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 - fd0;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fd1 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
        fb0 = fb1 || fb0;
if(fo0 != null){
          fd0 = fo0.m3();
}
        fd1 = fd0 - fd1;
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
        fd0 = fd1 + fd0;
        Thought lo2 = Thought146.getInstance(fb1, fb0, fb1, fb0);
        for(int i1=0; i1<10; i1++){
            }
        double ld3 = 849.4378282274494;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        fd0 = fd1 + ld3;
        fd0 = fd1 + ld3;
        Thought lo4 = Thought204.getInstance(fd0, fd1, ld3, fd0);
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld3, fd0, fd1);
}
if(fo1 != null){
          fo0 = fo1.m4(ld3, fd0, fd1, ld3, fb1, fb0, fb1, fb0);
}
        fb1 = fd0 < fd1;
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
    Thought lo0 = Thought225.getInstance(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
if(fo0 != null){
      fd1 = fo0.m3();
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      fo0.m1(ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Output.points[4][1] += fd1;
    double ld1 = 776.1745180413826;
    ld1 = fd0 + fd1;
    boolean lb2 = false;
    Output.points[4][2] -= ld1;
    fd0 *= -1;
    fd1 *= -1;
if(fo1 != null){
      lb2 = fo1.m2(ld1, fd0, fd1, ld1);
}
    boolean lb3 = false;
    fd0 = fd1 - ld1;
    fd0 = fd1 + ld1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0);
}
if(fo0 != null){
      lb3 = fo0.m2(fd1, ld1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    Output.points[4][3] -= ld1;
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb2, lb3, ab1, ab2);
}
    double ld4 = 798.6628189468136;
    ld4 = fd0 + fd1;

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
if(fo1 != null){
      fo1.m3();
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m2(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    fd1 = ad1 - ad2;
    Output.points[4][4] += ad3;
    ad4 = fd0 + fd1;
    ad1 = ad2 - ad3;
if(fo1 != null){
      ad4 = fo1.m3(fd0, fd1, ad1, ad2);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
    ad1 = ad2 + ad3;
    boolean lb0 = true;
if(fo1 != null){
      fo1.m2(ad4, fd0, fd1, ad1, fb0, fb1, lb0, fb0);
}
    ad2 = ad3 + ad4;
    fd0 = fd1 - ad1;
    ad2 = ad3 + ad4;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
}
    double ld1 = 282.74844119355083;
if(fo1 != null){
      ad4 = fo1.m3();
}
    Thought lo2 = Thought3.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld1, ad1, lb0, fb0, fb1, lb0);
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb0, fb0);
}
    ad2 = ad3 - ad4;
    Thought lo3 = Thought97.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      fo0.m1(fd0, fd1, ld1, ad1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    for(int i0=0; i0<10; i0++){
        boolean lb4 = true;
if(fo0 != null){
          fo1 = fo0.m4(fd1, ld1, ad1, ad2, fb0, fb1, lb4, lb0);
}
        Thought lo5 = Thought315.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, lb4, lb0);
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
    ad1 = ad2 - ad3;
    ad4 = fd0 - fd1;
    ab1 = ad1 > ad2;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = ad1 > ad2;
if(fo1 != null){
      ad3 = fo1.m3(ab1, ab2, ab3, ab4);
}
    boolean lb0 = true;
    ab4 = fb0 || fb1;
    ad4 = fd0 + fd1;
    if (lb0) {
        ad1 = ad2 + ad3;
        double ld1 = 891.3786491421718;
        ab1 = ad3 < ad4;
        fd0 = fd1 + ld1;
        ab2 = ab3 || ab4;
        if (fb0) {
            boolean lb2 = true;
if(fo0 != null){
              fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
              fo1 = fo0.m4(ad1, ad2, ad3, ad4);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 256.51793666110586;
    boolean lb1 = true;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, ld0, fd0, fd1, ld0);
}
    boolean lb2 = false;
    fd0 = fd1 + ld0;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ld0, fd0, lb1, lb2, fb0, fb1);
}
    lb1 = lb2 && fb0;
    boolean lb3 = false;
    fd1 = ld0 - fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, lb1, lb2);
}
    Output.points[4][5] -= fd1;
if(ao4 != null){
      ao3 = ao4.m4();
}
    boolean lb4 = false;
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3, ld0, fd0, fd1, ld0, lb3, lb4, fb0, fb1);
}
    double ld5 = 285.8340123826123;
    ld5 = fd0 - fd1;
    boolean lb6 = true;
        lb1 = !lb2;
    boolean lb7 = false;
    lb3 = ld0 > ld5;
    lb4 = lb6 && lb7;
    fb0 = fd0 > fd1;
    double ld8 = 550.9117536757316;
    fb1 = lb1 || lb2;
    lb3 = lb4 && lb6;
    ld0 *= -1;
    lb7 = ld5 < ld8;
if(ao4 != null){
      ao4.m2(fb0, fb1, lb1, lb2);
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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    ad1 = ad2 + ad3;
if(ao2 != null){
      ao1 = ao2.m4(ad4, fd0, fd1, ad1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0);
}
    boolean lb0 = true;
    fd1 = ad1 - ad2;
    lb0 = !fb0;
    ad3 = ad4 + fd0;
    fb1 = fd1 < ad1;
    for(int i0=0; i0<10; i0++){
        double ld1 = 21.17752687981516;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, ab1, ab2);
}
    Output.points[4][6] += fd0;
if(ao3 != null){
      fd1 = ao3.m3();
}
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    for(int i0=0; i0<10; i0++){
        fd1 *= -1;
        ab1 = fd0 > fd1;
if(ao3 != null){
          ab2 = ao3.m2(ab3, ab4, fb0, fb1);
}
        Thought lo0 = Thought141.getInstance(ao4, fo0, fo1, ao1);
        ab1 = !ab2;
if(ao3 != null){
          ao2 = ao3.m4(fd0, fd1, fd0, fd1);
}
        fd0 = fd1 + fd0;
        fd1 = fd0 + fd1;
        ab3 = fd0 > fd1;
        ab4 = fd0 < fd1;
if(ao4 != null){
          fd0 = ao4.m3(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
        boolean lb1 = false;
        ab4 = fb0 && fb1;
if(ao4 != null){
          ao3 = ao4.m4(fd1, fd0, fd1, fd0, lb1, ab1, ab2, ab3);
}
        ab4 = fd1 > fd0;
        }
    fb1 = ab1 && ab2;

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
    double ld0 = 751.8380375602178;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(ao1 != null){
      ld0 = ao1.m3();
}
    boolean lb1 = false;
    ad1 *= -1;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, ab4, fb0, fb1, lb1);
}
    for(int i0=0; i0<10; i0++){
        fd1 = ld0 + ad1;
if(ao2 != null){
          ao1 = ao2.m4(ab1, ab2, ab3, ab4);
}
        ad2 = ad3 + ad4;
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    if (fb1) {
if(fo0 != null){
          fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
        double ld0 = 898.7106986251634;
        boolean lb1 = false;
if(fo1 != null){
          fo1.m2(ld0, fd0, fd1, ld0);
}
        double ld2 = 258.9013533761464;
        ld2 *= -1;
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld0, ld2, fd0);
}
if(fo1 != null){
          fb0 = fo1.m2(fd1, ld0, ld2, fd0, fb1, lb1, fb0, fb1);
}
        fd1 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb1);
}
        ld0 = ld2 - fd0;
if(fo0 != null){
          fd1 = fo0.m3();
}
        for(int i0=0; i0<10; i0++){
            Thought lo3 = Thought287.getInstance(fo1, fo0, fo1, fo0, ld0, ld2, fd0, fd1, fb0, fb1, lb1, fb0);
            double ld4 = 297.91189953861846;
            fb1 = !lb1;
if(fo1 != null){
              fo1.m1(fb0, fb1, lb1, fb0);
}
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
            fb1 = !lb1;
            fb0 = fb1 && lb1;
if(fo1 != null){
              fo0 = fo1.m4(ld4, ld0, ld2, fd0);
}
}}
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
    ab2 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    double ld0 = 551.4798497483267;
    ab1 = ld0 > fd0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fb1 = !ab1;
    fd1 *= -1;
    ab2 = ld0 < fd0;
if(fo0 != null){
      fo0.m1();
}
    ab3 = ab4 && fb0;
    fb1 = ab1 || ab2;
if(fo1 != null){
      ab3 = fo1.m2(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1, ab4, fb0, fb1, ab1);
}
    ab2 = ld0 > fd0;
    ab3 = ab4 || fb0;
    fd1 = ld0 + fd0;
    fb1 = !ab1;

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
      ad1 = fo1.m3(fb1, fb0, fb1, fb0);
}
    ad2 *= -1;
    Thought lo0 = Thought110.getInstance(fo0, fo1, fo0, fo1);
    ad3 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1);
}
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
    fb1 = ad1 > ad2;
    fb0 = ad3 < ad4;
if(fo1 != null){
      fo1.m3(fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    double ld1 = 61.58840334725226;

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
    boolean lb0 = true;
    ad1 = ad2 - ad3;
    ab1 = ab2 || ab3;
    ab4 = fb0 && fb1;
    Output.points[4][7] += ad4;
    fd0 = fd1 + ad1;
    ad2 *= -1;
    for(int i0=0; i0<10; i0++){
        lb0 = ad3 > ad4;
        fd0 *= -1;
if(fo0 != null){
          fo0.m1();
}
        Output.points[4][8] += fd1;
        ab1 = ad1 < ad2;
        ab2 = ab3 || ab4;
        fb0 = ad3 < ad4;
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
    fd0 = fd1 + fd0;
    fb0 = fd1 > fd0;
    fb1 = fb0 || fb1;
    Thought lo0 = Thought159.getInstance(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
if(fo0 != null){
      fd1 = fo0.m3(fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    fd0 = fd1 - fd0;
    fd1 *= -1;
    fb0 = !fb1;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    fd0 = fd1 - fd0;
    for(int i0=0; i0<10; i0++){
if(ao3 != null){
          ao2 = ao3.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, lb0, fb0, fb1, lb0);
}
    fb0 = ad2 > ad3;
    fb1 = ad4 < fd0;
    fd1 = ad1 - ad2;
    boolean lb1 = true;
    lb0 = lb1 || fb0;
if(fo1 != null){
      ad3 = fo1.m3();
}
    fb1 = lb0 && lb1;
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1, fb1, lb0, lb1, fb0);
}
if(ao1 != null){
      fo1 = ao1.m4(fb1, lb0, lb1, fb0);
}
if(ao2 != null){
      ad2 = ao2.m3(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ad3 = ao1.m3(ad4, fd0, fd1, ad1);
}
    ad2 *= -1;
        fb1 = ad3 > ad4;
    Thought lo2 = Thought25.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2);
    ad3 = ad4 + fd0;
if(fo1 != null){
      fd1 = fo1.m3(ad1, ad2, ad3, ad4, lb0, lb1, fb0, fb1);
}
    boolean lb3 = true;
    double ld4 = 263.99638305985707;
    lb0 = lb1 && lb3;
    fb0 = ad4 < fd0;
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0, lb0, lb1, lb3, fb0);
}
if(ao1 != null){
      fo1 = ao1.m4();
}
    boolean lb5 = false;

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
    boolean lb0 = false;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, lb0, ab1, ab2, ab3);
}
if(ao1 != null){
      fo1 = ao1.m4(ab4, fb0, fb1, lb0);
}
    boolean lb1 = false;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1);
}
    lb1 = !ab1;
        fd0 = fd1 - fd0;
    ab2 = ab3 || ab4;
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
    fb0 = fd1 > fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    fb1 = lb0 && lb1;
    for(int i0=0; i0<10; i0++){
        ab1 = fd0 > fd1;
        fd0 *= -1;
        boolean lb2 = false;
if(ao3 != null){
          ao3.m1(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, lb2, lb0);
}
if(ao4 != null){
          fd1 = ao4.m3();
}
if(fo0 != null){
          fd0 = fo0.m3(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, lb1, ab1, ab2, ab3);
}
        Thought lo3 = Thought118.getInstance(ab4, fb0, fb1, lb2);
        lb0 = !lb1;
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
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      ab2 = fo1.m2(ad2, ad3, ad4, fd0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3);
}
if(ao1 != null){
      ab3 = ao1.m2(ad4, fd0, fd1, ad1, ab4, fb0, fb1, ab1);
}
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
    ad2 = ad3 + ad4;
    fd0 *= -1;
    fd1 *= -1;
if(ao2 != null){
      ao1 = ao2.m4();
}
    ad1 *= -1;
    ad2 = ad3 + ad4;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2, fb1, ab1, ab2, ab3);
}
    Thought lo0 = Thought287.getInstance(ab4, fb0, fb1, ab1);
    ab2 = !ab3;
if(ao2 != null){
      ad3 = ao2.m3(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ao1.m1(ad4, fd0, fd1, ad1);
}
    ad2 *= -1;
    boolean lb1 = false;
    ab3 = ab4 || fb0;
    Output.points[5][0] += ad3;
    boolean lb2 = true;
    boolean lb3 = true;
    boolean lb4 = false;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1);
}
    ab3 = ad2 < ad3;
    for(int i0=0; i0<10; i0++){
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
    fd1 = fd0 + fd1;
if(fo1 != null){
      fb1 = fo1.m2(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    Output.points[5][1] += fd0;
    boolean lb0 = false;
    lb0 = fd1 > fd0;
    fd1 = fd0 - fd1;
    fd0 *= -1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fo1.m2();
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(lb0, fb0, fb1, lb0);
}
    double ld1 = 680.6374489592714;
    ld1 *= -1;
    Output.points[5][2] += fd0;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    boolean lb2 = false;
    Thought lo3 = Thought33.getInstance(fd1, ld1, fd0, fd1);
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
    Thought lo0 = Thought50.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
    fb0 = fd0 > fd1;
    fd0 = fd1 - fd0;
        fb1 = fd1 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    fd1 = fd0 - fd1;
    fb1 = fd0 < fd1;
    Thought lo1 = Thought392.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
    fd0 = fd1 + fd0;
    Thought lo2 = Thought95.getInstance();
    boolean lb3 = true;
    Thought lo4 = Thought198.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb3, fb0, fb1, lb3);
if(fo1 != null){
      fd1 = fo1.m3(fb0, fb1, lb3, fb0);
}
    fb1 = fd0 < fd1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      lb3 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    boolean lb5 = true;
    boolean lb6 = true;
    lb5 = lb6 || fb0;
if(fo0 != null){
      fb1 = fo0.m2(fd1, fd0, fd1, fd0, lb3, lb5, lb6, fb0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fb1, lb3, lb5, lb6);
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
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    Output.points[5][3] += fd0;
    Output.points[5][4] -= fd1;
if(fo1 != null){
      fd0 = fo1.m3(fb0, fb1, fb0, fb1);
}
        fb0 = fd1 > fd0;
    fd1 = fd0 + fd1;
    Output.points[5][5] += fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    double ld0 = 778.6903516070944;
    fd0 *= -1;
if(fo0 != null){
      fd1 = fo0.m3(ld0, fd0, fd1, ld0);
}
    fb1 = fd0 > fd1;
    ld0 = fd0 + fd1;

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
