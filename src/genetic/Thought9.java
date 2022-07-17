package genetic;
import java.util.ArrayList;
class Thought9 extends Thought{
private static ArrayList<Thought9> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 214.1418082325231;
private double fd1 = 828.7949034192417;
private Thought fo0 = null;
private Thought fo1 = null;
Thought9 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought9 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought9 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought9 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought9 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought9 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought9 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought9 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought9 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought9 instance = new Thought9 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought9 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought9 instance = new Thought9 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought9 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought9 instance = new Thought9 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought9 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought9 instance = new Thought9 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought9 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought9 instance = new Thought9 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought9 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought9 instance = new Thought9 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought9 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought9 instance = new Thought9 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought9 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought9 instance = new Thought9 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    boolean lb0 = true;
        lb0 = fb0 || fb1;
    lb0 = !fb0;
    boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb1);
}
    fb0 = !fb1;
    lb0 = lb1 && fb0;
    Output.points[5][1] -= fd0;
    fb1 = lb0 && lb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb0, lb1);
}
if(fo1 != null){
      fo1.m3();
}
    Output.points[5][2] -= fd1;
    fb0 = fd0 > fd1;
    boolean lb2 = true;
    fb0 = fb1 && lb0;
    boolean lb3 = false;
    Thought lo4 = Thought224.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb1, lb2, lb3, fb0);
    Output.points[5][3] += fd0;
    boolean lb5 = false;
    Thought lo6 = Thought94.getInstance(fb0, fb1, lb0, lb1);
    fd1 = fd0 - fd1;

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
    Thought lo0 = Thought233.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    boolean lb1 = false;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    Output.points[5][4] -= fd1;
    double ld2 = 736.298638901735;
if(fo1 != null){
      lb1 = fo1.m2(ld2, fd0, fd1, ld2, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb1, ab1);
}
    ab2 = ab3 && ab4;
    if (fb0) {
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
if(fo1 != null){
      fo0 = fo1.m4();
}
    double ld0 = 693.075300698282;
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = ld0 - ad1;
    boolean lb1 = true;
    lb1 = ad2 > ad3;
    boolean lb2 = true;
if(fo1 != null){
      fo1.m1(lb2, fb0, fb1, lb1);
}
    Thought lo3 = Thought27.getInstance(fo0, fo1, fo0, fo1);
    Output.points[5][5] -= ad4;
    lb2 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, ad1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      lb1 = fo1.m2(fd1, ld0, ad1, ad2, lb2, fb0, fb1, lb1);
}
    lb2 = ad3 < ad4;
    boolean lb4 = true;
    boolean lb5 = true;
    fd0 *= -1;
    double ld6 = 79.7778935201483;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, lb4, lb5, fb0, fb1);
}
    fd0 *= -1;
    Thought lo7 = Thought324.getInstance();
    boolean lb8 = true;
if(fo1 != null){
      lb1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, ld0, ld6, ad1, lb2, lb4, lb5, lb8);
}
    ad2 = ad3 - ad4;

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
    ab2 = !ab3;
    ab4 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
    boolean lb0 = true;
    Output.points[5][6] += ad1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    lb0 = !ab1;
    ab2 = ab3 && ab4;
    double ld1 = 640.5827355280898;
    ad1 = ad2 + ad3;
if(fo1 != null){
      ad4 = fo1.m3(fd0, fd1, ld1, ad1);
}
    Output.points[5][7] -= ad2;
    boolean lb2 = false;
    ad3 = ad4 - fd0;
    ab4 = fd1 > ld1;
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    fb0 = fd1 < ld1;
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0, fb1, lb0, lb2, ab1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo0.m1();
}
    fb1 = fd1 > ld1;

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
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    Output.points[5][8] += fd1;
    fd0 = fd1 + fd0;
    boolean lb0 = true;
    double ld1 = 406.63440554810506;
    fd0 *= -1;
    boolean lb2 = false;
    double ld3 = 680.0398474665958;
    lb2 = !fb0;
if(ao1 != null){
      ao1.m2(fb1, lb0, lb2, fb0);
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
    fb1 = ad1 > ad2;
    fb0 = ad3 < ad4;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1);
}
    Thought lo0 = Thought45.getInstance(fd0, fd1, ad1, ad2);
    ad3 = ad4 + fd0;
    fd1 = ad1 - ad2;
    boolean lb1 = true;
    boolean lb2 = true;
    lb2 = fb0 && fb1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
}
    lb1 = lb2 || fb0;
    fb1 = ad1 > ad2;
if(ao2 != null){
      ao1 = ao2.m4(ad3, ad4, fd0, fd1, lb1, lb2, fb0, fb1);
}
    boolean lb3 = true;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, lb1, lb2, lb3, fb0);
}
if(ao2 != null){
      fb1 = ao2.m2();
}
    lb1 = !lb2;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, lb3, fb0, fb1, lb1);
}
    lb2 = fd0 > fd1;
if(ao2 != null){
      ad1 = ao2.m3(lb3, fb0, fb1, lb1);
}
    lb2 = ad2 < ad3;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    Output.points[6][0] += ad4;
    double ld4 = 532.0133965348829;
    double ld5 = 769.1941002035093;
if(ao4 != null){
      ao3 = ao4.m4(ad3, ad4, fd0, fd1);
}
    ld4 *= -1;

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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    boolean lb0 = true;
    fd1 = fd0 - fd1;
    double ld1 = 246.9513435666738;
    boolean lb2 = true;
if(ao2 != null){
      ao1 = ao2.m4(ld1, fd0, fd1, ld1, lb0, lb2, ab1, ab2);
}
    ab3 = fd0 > fd1;
if(ao3 != null){
      ld1 = ao3.m3(ao4, fo0, fo1, ao1, ab4, fb0, fb1, lb0);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    double ld3 = 317.8665949567425;
    double ld4 = 547.7290932952276;
    lb2 = !ab1;

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
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    double ld0 = 52.29143349662148;
    Thought lo1 = Thought111.getInstance(fb1, ab1, ab2, ab3);
    boolean lb2 = false;
    ab3 = ab4 || fb0;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1);
}
    Thought lo3 = Thought90.getInstance(fd0, fd1, ld0, ad1);
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
}
if(ao1 != null){
      fo1 = ao1.m4(fd1, ld0, ad1, ad2, lb2, ab1, ab2, ab3);
}
    boolean lb4 = false;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab3, ab4, fb0, fb1);
}
if(ao2 != null){
      ad3 = ao2.m3();
}
    Output.points[6][1] += ad4;
    lb2 = fd0 < fd1;
    double ld5 = 577.6055751113906;
    lb4 = !ab1;
    ab2 = ab3 && ab4;
    Thought lo6 = Thought129.getInstance(ao3, ao4, fo0, fo1, ld0, ld5, ad1, ad2, fb0, fb1, lb2, lb4);
    double ld7 = 185.09034330424728;
if(ao1 != null){
      ad2 = ao1.m3(ab1, ab2, ab3, ab4);
}
    ad3 *= -1;
if(ao2 != null){
      ad4 = ao2.m3(ao3, ao4, fo0, fo1);
}
    fb0 = fd0 > fd1;
    ld0 = ld5 - ld7;
if(ao1 != null){
      ad1 = ao1.m3(ad2, ad3, ad4, fd0);
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
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
    Thought lo0 = Thought283.getInstance(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb1 = !lb1;
    fd0 *= -1;
    fb0 = fb1 || lb1;
    boolean lb2 = true;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb2, fb0, fb1, lb1);
}
if(fo0 != null){
      fo1 = fo0.m4(lb2, fb0, fb1, lb1);
}
    Output.points[6][2] -= fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, lb2, fb0, fb1, lb1);
}
    Thought lo3 = Thought156.getInstance(fo1, fo0, fo1, fo0, lb2, fb0, fb1, lb1);
    fd1 = fd0 + fd1;
    boolean lb4 = true;
    boolean lb5 = false;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd0 *= -1;
    lb2 = lb4 || lb5;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb1, lb2);
}
    lb4 = !lb5;

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
    ab2 = ab3 || ab4;
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
    Output.points[6][3] += fd1;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, ab1, ab2);
}
    double ld0 = 678.7654113346158;
    ab3 = ab4 || fb0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    double ld1 = 430.71743336218225;
    if (fb1) {
        ab1 = ab2 && ab3;
if(fo0 != null){
          fo0.m1(ld0, ld1, fd0, fd1);
}
if(fo1 != null){
          ld0 = fo1.m3(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld0);
}
if(fo0 != null){
          fo0.m1(ld1, fd0, fd1, ld0, ab4, fb0, fb1, ab1);
}
        ab2 = ld1 > fd0;
if(fo1 != null){
          ab3 = fo1.m2(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
}
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
        fb0 = ad2 < ad3;
    ad4 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb1 = ad1 > ad2;
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    Output.points[6][4] -= ad2;
    Output.points[6][5] += ad3;
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb0, fb0);
}
    fb1 = lb0 || fb0;
    double ld1 = 4.669257248306097;
    double ld2 = 47.9049572283013;
    double ld3 = 506.0301549390201;
    ad1 = ad2 + ad3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ad4 *= -1;
if(fo1 != null){
          fo1.m1(fd0, fd1, ld1, ld2);
}
    fb1 = lb0 || fb0;
    Thought lo4 = Thought198.getInstance(fo0, fo1, fo0, fo1, ld3, ad1, ad2, ad3);
    Output.points[6][6] += ad4;

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
    ab4 = ad2 < ad3;
    Output.points[6][7] -= ad4;
    fb0 = fb1 || ab1;
    boolean lb0 = true;
    Thought lo1 = Thought287.getInstance(fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
    fb0 = !fb1;
    if (lb0) {
        ab1 = !ab2;
        ab3 = ab4 && fb0;
        Thought lo2 = Thought51.getInstance(fo0, fo1, fo0, fo1, fb1, lb0, ab1, ab2);
        ab3 = ab4 && fb0;
        ad3 = ad4 + fd0;
        fb1 = lb0 && ab1;
        boolean lb3 = true;
if(fo1 != null){
          fo0 = fo1.m4();
}
        ab1 = !ab2;
        ab3 = ab4 && fb0;
        double ld4 = 413.627995149789;
        fd0 = fd1 - ld4;
        boolean lb5 = false;
        boolean lb6 = true;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought273.getInstance(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
    boolean lb1 = true;
    fb0 = fd1 > fd0;
if(fo0 != null){
      fb1 = fo0.m2(lb1, fb0, fb1, lb1);
}
    double ld2 = 156.7478846829529;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    fb0 = fd0 < fd1;
        ld2 = fd0 + fd1;
if(ao1 != null){
      fo1 = ao1.m4(ld2, fd0, fd1, ld2);
}
    fd0 = fd1 - ld2;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fd0, fd1, ld2, fd0);
}
    Thought lo3 = Thought167.getInstance(fd1, ld2, fd0, fd1, fb1, lb1, fb0, fb1);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, lb1, fb0, fb1, lb1);
}
    ld2 *= -1;
    fd0 = fd1 + ld2;
    Output.points[6][8] += fd0;
if(ao2 != null){
      ao1 = ao2.m4();
}
    fb0 = !fb1;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 + ad3;
    fb1 = ad4 < fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      ao1.m3(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
        Thought lo0 = Thought124.getInstance(ao2, ao3, ao4, fo0);
if(fo1 != null){
      ad4 = fo1.m3(fd0, fd1, ad1, ad2);
}
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1);
}
    fb1 = ad1 < ad2;
if(fo1 != null){
      ad3 = fo1.m3(ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
    double ld1 = 680.6466739432034;
if(fo1 != null){
      fo1.m3();
}
    fb0 = fb1 && fb0;
    fb1 = ad1 > ad2;
    fb0 = fb1 && fb0;
    fb1 = ad3 > ad4;

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
    if (ab2) {
if(ao1 != null){
          ao1.m1(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
        fd1 = fd0 + fd1;
        boolean lb0 = false;
        fd0 = fd1 + fd0;
        boolean lb1 = false;
        double ld2 = 18.042139425200677;
        Output.points[7][0] += fd0;
        fd1 = ld2 + fd0;
if(ao1 != null){
          fo1 = ao1.m4(lb0, lb1, ab1, ab2);
}
        fd1 = ld2 + fd0;
        fd1 = ld2 + fd0;
if(ao2 != null){
          fd1 = ao2.m3(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
          ao1 = ao2.m4(ld2, fd0, fd1, ld2);
}
        Output.points[7][1] -= fd0;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ld2, fd0, fd1);
}
        ab3 = !ab4;
if(ao3 != null){
          ao3.m2(ld2, fd0, fd1, ld2, fb0, fb1, lb0, lb1);
}
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab1, ab2, ab3, ab4);
}
        fd0 = fd1 + ld2;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 || ab4;
    if (fb0) {
        } else if (fb1) {
        Output.points[7][2] += ad2;
        ab1 = ad3 > ad4;
        fd0 = fd1 - ad1;
        Thought lo0 = Thought286.getInstance();
        ad2 *= -1;
        boolean lb1 = true;
if(ao2 != null){
          ao2.m3(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
        Thought lo2 = Thought29.getInstance(fb0, fb1, lb1, ab1);
        } else {
        ad1 = ad2 - ad3;
        boolean lb3 = true;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
        Output.points[7][3] += ad4;
if(ao1 != null){
          fd0 = ao1.m3(fd1, ad1, ad2, ad3);
}
        boolean lb4 = true;
        ab1 = !ab2;
        ab3 = ad4 < fd0;
        ab4 = fd1 > ad1;
        Thought lo5 = Thought381.getInstance(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
        fd1 = ad1 + ad2;
if(fo1 != null){
          fb0 = fo1.m2(ad3, ad4, fd0, fd1, fb1, lb3, lb4, ab1);
}
        double ld6 = 758.8405801618233;
if(ao1 != null){
          ab2 = ao1.m2(ao2, ao3, ao4, fo0, ab3, ab4, fb0, fb1);
}
        boolean lb7 = false;
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
if(fo1 != null){
      fo1.m3();
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    fb1 = lb0 || fb0;
    Thought lo1 = Thought355.getInstance(fb1, lb0, fb0, fb1);
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    Output.points[7][4] -= fd0;
    fd1 = fd0 + fd1;
    fb0 = fb1 || lb0;
    if (fb0) {
        boolean lb2 = true;
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
        Thought lo3 = Thought258.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
if(fo1 != null){
          fo1.m1(fd0, fd1, fd0, fd1, fb0, fb1, lb2, lb0);
}
        for(int i0=0; i0<10; i0++){
            fd0 = fd1 + fd0;
            fd1 = fd0 + fd1;
            Output.points[7][5] += fd0;
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
    ab1 = ab2 && ab3;
    ab4 = fb0 || fb1;
    Thought lo0 = Thought282.getInstance(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
    Thought lo1 = Thought75.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      ab3 = fo0.m2(ab4, fb0, fb1, ab1);
}
    ab2 = fd0 > fd1;
        boolean lb2 = true;
    fd0 = fd1 + fd0;
    Output.points[7][6] -= fd1;
    ab2 = !ab3;
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
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
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0);
}
    fb0 = fd1 < ad1;
    fb1 = fb0 || fb1;
    Thought lo0 = Thought176.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
    fd1 = ad1 + ad2;
    double ld1 = 536.7679070685992;
    Thought lo2 = Thought20.getInstance(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
    Thought lo3 = Thought219.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
    fd1 = ld1 - ad1;
    ad2 *= -1;
    ad3 = ad4 - fd0;
    boolean lb4 = false;
    Thought lo5 = Thought63.getInstance();

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
    boolean lb0 = true;
    double ld1 = 408.7720813234621;
    lb0 = ld1 < ad1;
    ab1 = !ab2;
if(fo0 != null){
      ab3 = fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, ab4, fb0, fb1, lb0);
}
if(fo0 != null){
      fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
    fb0 = fd1 > ld1;
    ad1 = ad2 - ad3;
    double ld2 = 387.0846673928239;
    double ld3 = 277.252834128655;
    ad2 = ad3 - ad4;

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
    Thought lo0 = Thought39.getInstance(ao2, ao3, ao4, fo0);
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1);
}
    if (fb0) {
        double ld1 = 767.7708147023922;
        ld1 *= -1;
        Thought lo2 = Thought262.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, ld1, fd0);
        fd1 = ld1 + fd0;
        double ld3 = 375.5918462366892;
        fb1 = fd0 > fd1;
if(ao1 != null){
          fo1 = ao1.m4(ld1, ld3, fd0, fd1, fb0, fb1, fb0, fb1);
}
        double ld4 = 670.7202169726763;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
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
      fb0 = ao2.m2();
}
    ad2 = ad3 - ad4;
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
if(ao2 != null){
      lb0 = ao2.m2(fb0, fb1, lb0, fb0);
}
    double ld1 = 295.4497944737259;
    ad2 = ad3 - ad4;
    fd0 = fd1 + ld1;
    ad1 = ad2 - ad3;
    Thought lo2 = Thought26.getInstance(ao3, ao4, fo0, fo1);
if(ao1 != null){
      ad4 = ao1.m3(fd0, fd1, ld1, ad1);
}
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
if(ao2 != null){
      ao1 = ao2.m4(fd1, ld1, ad1, ad2, fb1, lb0, fb0, fb1);
}
if(ao3 != null){
      ad3 = ao3.m3(ao4, fo0, fo1, ao1, lb0, fb0, fb1, lb0);
}
    fb0 = ad4 < fd0;
    boolean lb3 = false;

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
    if (ab1) {
        ab2 = !ab3;
        ab4 = fd0 > fd1;
        fb0 = !fb1;
        ab1 = fd0 < fd1;
        fd0 = fd1 + fd0;
        ab2 = ab3 && ab4;
if(ao2 != null){
          fb0 = ao2.m2();
}
        double ld0 = 711.2890812861776;
if(ao3 != null){
          fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, ld0, fd0, fd1, fb1, ab1, ab2, ab3);
}
        ld0 *= -1;
        ab4 = fd0 > fd1;
if(ao3 != null){
          ao2 = ao3.m4(fb0, fb1, ab1, ab2);
}
        boolean lb1 = true;
        ab2 = ld0 < fd0;
if(ao4 != null){
          fd1 = ao4.m3(fo0, fo1, ao1, ao2);
}
        boolean lb2 = false;
        ab2 = ld0 < fd0;
        boolean lb3 = false;
        ab2 = fd1 > ld0;
if(ao4 != null){
          ao3 = ao4.m4(fd0, fd1, ld0, fd0);
}
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, ld0, fd0, fd1);
}
if(fo0 != null){
          fo0.m2(ld0, fd0, fd1, ld0, ab3, ab4, fb0, fb1);
}
        lb1 = !lb2;
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
    ad1 = ad2 + ad3;
    ad4 = fd0 - fd1;
    ab1 = ab2 && ab3;
    ad1 = ad2 + ad3;
    double ld0 = 885.9742368177566;
    double ld1 = 965.8270538515618;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab4, fb0, fb1, ab1);
}
    ad2 *= -1;
    ab2 = ad3 < ad4;
if(ao3 != null){
      ao2 = ao3.m4();
}
    ab3 = fd0 < fd1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld0, ld1, ad1, ad2, ab4, fb0, fb1, ab1);
}
if(ao4 != null){
      ad3 = ao4.m3(ab2, ab3, ab4, fb0);
}
    ad4 = fd0 + fd1;
    ld0 = ld1 - ad1;
    ad2 = ad3 + ad4;
if(fo0 != null){
      fd0 = fo0.m3(fo1, ao1, ao2, ao3);
}
    fb1 = fd1 > ld0;
if(ao4 != null){
      ld1 = ao4.m3(ad1, ad2, ad3, ad4);
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
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    Output.points[7][7] -= fd1;
    Thought lo0 = Thought183.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    double ld1 = 784.2206075308368;
    fb0 = !fb1;
if(fo0 != null){
      fd0 = fo0.m3();
}
    fb0 = fb1 || fb0;
    fb1 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m3(fb0, fb1, fb0, fb1);
}
    boolean lb2 = true;
    Thought lo3 = Thought180.getInstance(fo0, fo1, fo0, fo1);
    Output.points[7][8] -= ld1;
    lb2 = fb0 && fb1;
        Output.points[8][0] += fd0;
    lb2 = fb0 || fb1;
    lb2 = fd1 > ld1;
    fb0 = fd0 < fd1;
    ld1 = fd0 - fd1;
    fb1 = ld1 > fd0;
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ld1, fd0, fd1, ld1);
}
    Output.points[8][1] += fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1);
}
    lb2 = fb0 || fb1;
    Thought lo4 = Thought26.getInstance(ld1, fd0, fd1, ld1, lb2, fb0, fb1, lb2);

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
    boolean lb0 = false;
    ab1 = ab2 && ab3;
    Thought lo1 = Thought326.getInstance(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb0);
    Thought lo2 = Thought275.getInstance();
if(fo1 != null){
          ab1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    boolean lb3 = true;
    fb0 = fd1 > fd0;
        boolean lb4 = true;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb0, lb3);
}
    fd0 = fd1 + fd0;
    boolean lb5 = false;
    lb4 = fd1 < fd0;
if(fo0 != null){
      lb5 = fo0.m2(fo1, fo0, fo1, fo0);
}
    ab1 = fd1 > fd0;
    double ld6 = 890.4526945705453;
    boolean lb7 = true;
    fd0 *= -1;
    fd1 *= -1;
    Thought lo8 = Thought374.getInstance(ld6, fd0, fd1, ld6);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld6, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3(ld6, fd0, fd1, ld6, ab1, ab2, ab3, ab4);
}
    fd0 *= -1;
    fd1 = ld6 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb3);
}
    Thought lo9 = Thought380.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld6, fd0, fd1, lb4, lb5, lb7, ab1);
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
      ad1 = fo1.m3(fb0, fb1, fb0, fb1);
}
    fb0 = ad2 < ad3;
    ad4 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Thought lo0 = Thought336.getInstance(fd0, fd1, ad1, ad2);
    double ld1 = 90.82520002461612;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    fd1 *= -1;
    fb1 = !fb0;
    double ld2 = 332.13832451677615;
    boolean lb3 = false;
    fb0 = ld1 > ld2;
    ad1 = ad2 + ad3;
if(fo0 != null){
      fo0.m1(ad4, fd0, fd1, ld1, fb1, lb3, fb0, fb1);
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
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 && ab3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
}
    double ld0 = 929.8133457849076;
    Output.points[8][2] += ad1;
if(fo0 != null){
      ad2 = fo0.m3();
}
    Thought lo1 = Thought81.getInstance(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
    ld0 *= -1;
    Output.points[8][3] -= ad1;
    Thought lo2 = Thought276.getInstance(fb1, ab1, ab2, ab3);
    for(int i0=0; i0<10; i0++){
        Thought lo3 = Thought284.getInstance(fo1, fo0, fo1, fo0);
        double ld4 = 935.3943265768811;
        ab4 = fb0 || fb1;
        boolean lb5 = true;
        lb5 = ab1 || ab2;
        boolean lb6 = true;
        ab2 = ad1 > ad2;
        ab3 = !ab4;
        boolean lb7 = false;
if(fo0 != null){
          fo1 = fo0.m4(ad3, ad4, fd0, fd1);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld4, ld0, ad1, ad2);
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
    fb0 = !fb1;
    fd0 = fd1 - fd0;
    fb0 = fb1 || fb0;
    fd1 *= -1;
    boolean lb0 = true;
if(ao1 != null){
      ao1.m1(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    fd0 = fd1 - fd0;
    fb1 = fd1 > fd0;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, lb0, fb0, fb1, lb0);
}
if(ao1 != null){
      fd1 = ao1.m3();
}
    fb0 = fd0 < fd1;
    fb1 = fd0 < fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
    Output.points[8][4] -= fd0;
    fd1 *= -1;
    fd0 = fd1 - fd0;
if(ao2 != null){
      ao2.m3(fb0, fb1, lb0, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    fd1 = fd0 - fd1;
    double ld1 = 862.6846292147766;
    ld1 *= -1;
    fd0 *= -1;
    for(int i0=0; i0<10; i0++){
        fd1 = ld1 + fd0;
        fd1 = ld1 + fd0;
if(ao4 != null){
          ao3 = ao4.m4(fd1, ld1, fd0, fd1);
}
        fb1 = ld1 < fd0;
        lb0 = !fb0;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 180.29568786615707;
    ld0 = ad1 - ad2;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1);
}
    Thought lo1 = Thought16.getInstance(ld0, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    fb0 = ad4 > fd0;
    Output.points[8][5] += fd1;
    Output.points[8][6] -= ld0;
if(ao1 != null){
      ad1 = ao1.m3();
}
    fb1 = ad2 > ad3;
if(ao2 != null){
      ad4 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, ld0, ad1, fb0, fb1, fb0, fb1);
}
    ad2 = ad3 - ad4;
    fb0 = fb1 && fb0;
if(ao1 != null){
      fb1 = ao1.m2(fb0, fb1, fb0, fb1);
}
    fd0 = fd1 - ld0;
    boolean lb2 = true;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4);
}
    double ld3 = 384.4881983361945;
    boolean lb4 = false;

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
    ab1 = ab2 && ab3;
    ab4 = fb0 || fb1;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    ab1 = fd0 < fd1;
if(ao1 != null){
      ab2 = ao1.m2(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    fd0 = fd1 + fd0;
    ab1 = fd1 < fd0;
    double ld0 = 18.299245678297787;
    ab2 = ab3 && ab4;
    for(int i0=0; i0<10; i0++){
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, ab1, ab2);
}
if(ao3 != null){
          ao2 = ao3.m4();
}
        ab3 = !ab4;
if(ao4 != null){
          fd0 = ao4.m3(fo0, fo1, ao1, ao2, fd1, ld0, fd0, fd1, fb0, fb1, ab1, ab2);
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
if(ao3 != null){
      ao2 = ao3.m4(ab1, ab2, ab3, ab4);
}
    if (fb0) {
        fb1 = !ab1;
        Output.points[8][7] += ad1;
        ab2 = ad2 > ad3;
        ad4 = fd0 + fd1;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
          ao4.m2(ad1, ad2, ad3, ad4);
}
        Thought lo0 = Thought138.getInstance(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2);
        ad3 = ad4 + fd0;
if(ao4 != null){
          ao3 = ao4.m4(fd1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
        ab1 = ad4 > fd0;
        } else {
        Thought lo1 = Thought162.getInstance(fo0, fo1, ao1, ao2, ab2, ab3, ab4, fb0);
        fd1 = ad1 - ad2;
        fb1 = !ab1;
if(ao4 != null){
          ao3 = ao4.m4();
}
        Thought lo2 = Thought96.getInstance(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
        if (fb1) {
            ad1 = ad2 + ad3;
if(ao4 != null){
              ao3 = ao4.m4(ab1, ab2, ab3, ab4);
}
            fb0 = ad4 > fd0;
            boolean lb3 = false;
            fb0 = fb1 && lb3;
if(fo0 != null){
              fd1 = fo0.m3(fo1, ao1, ao2, ao3);
}
            ad1 = ad2 + ad3;
}}
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
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo0.m3(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 < fd0;
    boolean lb0 = true;
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb1 = lb0 && fb0;
    fd1 = fd0 - fd1;
    fd0 *= -1;
    boolean lb1 = false;
    fb0 = fd1 > fd0;

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
    fd0 *= -1;
    fd1 *= -1;
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fb1, lb0, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m1(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
    fb1 = lb0 || fb0;
if(fo1 != null){
      fb1 = fo1.m2();
}
    Output.points[8][8] -= fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb0, fb0);
}
    fb1 = !lb0;
    fb0 = !fb1;
    boolean lb1 = true;
    Thought lo2 = Thought4.getInstance(fo0, fo1, fo0, fo1);

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
    boolean lb0 = true;
if(fo0 != null){
      fo0.m3(fd0, fd1, fd0, fd1);
}
    Thought lo1 = Thought351.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
    lb0 = fb0 || fb1;
    Thought lo2 = Thought158.getInstance(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
    fd0 *= -1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    Thought lo3 = Thought193.getInstance(fb0, fb1, lb0, fb0);
    Thought lo4 = Thought317.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
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
