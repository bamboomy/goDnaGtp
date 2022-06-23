package genetic;
import java.util.ArrayList;
class Thought30 extends Thought{
private static ArrayList<Thought30> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 290.4988648974433;
private double fd1 = 171.94581078480542;
private Thought fo0 = null;
private Thought fo1 = null;
Thought30 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought30 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought30 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought30 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought30 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought30 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought30 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought30 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought30 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought30 instance = new Thought30 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought30 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought30 instance = new Thought30 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought30 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought30 instance = new Thought30 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought30 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought30 instance = new Thought30 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought30 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought30 instance = new Thought30 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought30 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought30 instance = new Thought30 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought30 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought30 instance = new Thought30 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought30 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought30 instance = new Thought30 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
      fd0 = fo1.m3(fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    boolean lb0 = true;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    Output.points[0][2] -= fd1;
    fb1 = !lb0;
    boolean lb1 = true;
    Output.points[0][3] -= fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb1, fb0, fb1, lb0);
}
    fd1 *= -1;
    Output.points[0][4] += fd0;
    Thought lo2 = Thought15.getInstance(fo1, fo0, fo1, fo0);
    double ld3 = 340.9226115905206;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld3, fd0, lb1, fb0, fb1, lb0);
}
        lb1 = fd1 > ld3;
    fb0 = fd0 > fd1;
    ld3 = fd0 - fd1;
        for(int i0=0; i0<10; i0++){
        fb1 = lb0 && lb1;
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
    double ld0 = 148.00892838318177;
    ab1 = ab2 && ab3;
if(fo1 != null){
      ld0 = fo1.m3();
}
    ab4 = fd0 > fd1;
    fb0 = !fb1;
    boolean lb1 = true;
if(fo0 != null){
      fo0.m1(ld0, fd0, fd1, ld0);
}
    double ld2 = 626.9754789528213;
    ld2 *= -1;
    lb1 = fd0 > fd1;
    boolean lb3 = false;
if(fo0 != null){
      fo1 = fo0.m4(lb3, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1, ld0, ld2, fd0, fd1);
}
    double ld4 = 263.6804012033006;
    ld0 = ld2 + ld4;
if(fo0 != null){
      lb1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld2, lb3, ab1, ab2, ab3);
}
    ld4 *= -1;
    double ld5 = 373.973601088356;
    ab4 = fb0 && fb1;
    lb1 = lb3 || ab1;

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
    boolean lb0 = false;
    fb0 = ad2 > ad3;
    fb1 = !lb0;
    fb0 = !fb1;
    lb0 = ad4 > fd0;
    fb0 = fd1 > ad1;
    fb1 = ad2 > ad3;
    Thought lo1 = Thought16.getInstance(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
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
    Thought lo0 = Thought31.getInstance(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
    Thought lo1 = Thought24.getInstance();
if(fo0 != null){
      fo0.m3(fd1, ad1, ad2, ad3);
}
        Output.points[0][5] += ad4;
    boolean lb2 = false;
    fd0 *= -1;
    fd1 = ad1 - ad2;
    Output.points[0][6] += ad3;
    ad4 = fd0 + fd1;
    ad1 = ad2 - ad3;
    boolean lb3 = true;
if(fo0 != null){
      fo1 = fo0.m4(ab4, fb0, fb1, lb2);
}
if(fo1 != null){
      lb3 = fo1.m2(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ao1.m2(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
    fb0 = fb1 || lb0;
    boolean lb1 = true;
    lb1 = fb0 || fb1;
    Output.points[0][7] += fd0;
    lb0 = fd1 > fd0;
    Thought lo2 = Thought25.getInstance();
    boolean lb3 = true;
    Output.points[0][8] -= fd1;
    Output.points[1][0] -= fd0;
if(ao2 != null){
      fd1 = ao2.m3(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
if(ao4 != null){
      ao3 = ao4.m4(lb1, lb3, fb0, fb1);
}
    fd1 *= -1;
if(fo0 != null){
      lb0 = fo0.m2(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, lb1, lb3, fb0, fb1);
}
    fd0 = fd1 + fd0;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = !fb1;
    fb0 = fb1 || fb0;
    boolean lb0 = true;
    ad2 *= -1;
    Thought lo1 = Thought47.getInstance(ao2, ao3, ao4, fo0, fb0, fb1, lb0, fb0);
    ad3 = ad4 + fd0;
    fd1 = ad1 - ad2;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fo1.m2(ad3, ad4, fd0, fd1, fb1, lb0, fb0, fb1);
}
if(ao1 != null){
      ad1 = ao1.m3();
}
if(ao3 != null){
      ao2 = ao3.m4(ad2, ad3, ad4, fd0);
}
if(ao4 != null){
      lb0 = ao4.m2(fb0, fb1, lb0, fb0);
}
    fd1 = ad1 + ad2;
    Thought lo2 = Thought88.getInstance(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1);

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
    Thought lo0 = Thought36.getInstance(fo1, ao1, ao2, ao3, fb1, ab1, ab2, ab3);
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
    fd0 *= -1;
if(fo1 != null){
      fd1 = fo1.m3();
}
    fd0 = fd1 - fd0;
    fd1 *= -1;
    boolean lb1 = true;
    fd0 = fd1 - fd0;

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
    Thought lo0 = Thought50.getInstance(ad2, ad3, ad4, fd0);
    boolean lb1 = true;
    ab1 = !ab2;
    Thought lo2 = Thought58.getInstance(ab3, ab4, fb0, fb1);
    lb1 = ab1 || ab2;
    ab3 = ab4 || fb0;
    fb1 = fd1 > ad1;
    ad2 *= -1;
    lb1 = !ab1;
    ad3 = ad4 - fd0;
    ab2 = fd1 < ad1;
    boolean lb3 = true;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} 
}
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 - fd1;
    fb1 = fb0 && fb1;
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    boolean lb0 = false;
    double ld1 = 99.46873463815442;
    ld1 *= -1;
    fd0 = fd1 - ld1;
    double ld2 = 20.629686250290113;
    double ld3 = 41.885331854238025;
if(fo0 != null){
      ld2 = fo0.m3(fo1, fo0, fo1, fo0, ld3, fd0, fd1, ld1, fb0, fb1, lb0, fb0);
}
    Thought lo4 = Thought30.getInstance(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
    lb0 = ld2 > ld3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb0 = fb1 && lb0;
    fb0 = fb1 || lb0;
if(fo1 != null){
      fo1.m3(fd0, fd1, ld1, ld2, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(ld3, fd0, fd1, ld1);
}
if(fo0 != null){
      ld2 = fo0.m3(fb1, lb0, fb0, fb1);
}
    double ld5 = 92.35188698374176;
    ld3 = ld5 - fd0;
    Thought lo6 = Thought74.getInstance(fo1, fo0, fo1, fo0, fd1, ld1, ld2, ld3);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld5, fd0, fd1, ld1, lb0, fb0, fb1, lb0);
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
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      fo0.m3();
}
if(fo1 != null){
      ab3 = fo1.m2(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo0.m3(ab4, fb0, fb1, ab1);
}
    ab2 = fd1 > fd0;
    ab3 = ab4 && fb0;
    fb1 = fd1 < fd0;
    Thought lo0 = Thought27.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
    Thought lo1 = Thought65.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
    double ld2 = 28.74160490105719;
    ab3 = fd0 < fd1;
    ab4 = fb0 && fb1;
    ab1 = !ab2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ab3 = ld2 < fd0;
    double ld3 = 950.4737334889589;
    fd0 *= -1;
    ab4 = !fb0;
if(fo0 != null){
      fb1 = fo0.m2(fd1, ld2, ld3, fd0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4();
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
    Thought lo0 = Thought28.getInstance(ad2, ad3, ad4, fd0);
if(fo1 != null){
      fo1.m3(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    Output.points[1][1] += fd0;
    double ld1 = 852.9490426770109;
    fb1 = fb0 && fb1;
    double ld2 = 715.0960686609374;
    fb0 = ad4 > fd0;
    fb1 = !fb0;
    fd1 *= -1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ld1, ld2, ad1, ad2, fb1, fb0, fb1, fb0);
}
    double ld3 = 198.00113987394298;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    ad2 = ad3 + ad4;
    fd0 = fd1 + ld1;
    fb1 = fb0 && fb1;
    ld2 *= -1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
    Thought lo4 = Thought69.getInstance(ld3, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
    boolean lb5 = true;
    double ld6 = 853.8519221134407;
    ad3 = ad4 - fd0;
    boolean lb7 = true;
    lb7 = fd1 > ld1;
if(fo0 != null){
      fo0.m1();
}
if(fo1 != null){
      fb0 = fo1.m2(ld2, ld3, ld6, ad1);
}
    if (fb1) {
}
Thought.STACK_COUNTER++;
return lb5;
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
    ab2 = ab3 || ab4;
    Thought lo0 = Thought91.getInstance(fb0, fb1, ab1, ab2);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    double ld1 = 745.6364310577396;
    Output.points[1][2] -= fd0;
    fd1 = ld1 - ad1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
    boolean lb2 = false;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, lb2, ab1, ab2, ab3);
}
    if (ab4) {
        ld1 *= -1;
        fb0 = fb1 && lb2;
        boolean lb3 = true;
        Output.points[1][3] -= ad1;
        ad2 = ad3 + ad4;
        for(int i0=0; i0<10; i0++){
            }
if(fo1 != null){
          fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
        boolean lb4 = true;
if(fo1 != null){
          fo0 = fo1.m4(fd1, ld1, ad1, ad2, lb4, lb2, ab1, ab2);
}
if(fo1 != null){
          fo0 = fo1.m4();
}
        ad3 *= -1;
        boolean lb5 = false;
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
    Thought lo0 = Thought28.getInstance(fd0, fd1, fd0, fd1);
    Thought lo1 = Thought31.getInstance(fb0, fb1, fb0, fb1);
    fd0 = fd1 + fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    fd1 = fd0 + fd1;
    Thought lo2 = Thought95.getInstance(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
    Thought lo3 = Thought69.getInstance(fo0, fo1, ao1, ao2);
    fb0 = fb1 || fb0;
    fb1 = !fb0;
    fb1 = fb0 || fb1;

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
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4, fb0, fb1, lb0, fb0);
}
    Thought lo1 = Thought98.getInstance();
    fd0 *= -1;
    fd1 = ad1 - ad2;
if(ao4 != null){
      ao3 = ao4.m4(ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      fo0.m2(fb1, lb0, fb0, fb1);
}
    lb0 = ad1 > ad2;
    ad3 = ad4 - fd0;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, ad1, ad2, ad3);
}
    ad4 = fd0 + fd1;
    fb0 = ad1 < ad2;
    boolean lb2 = true;
if(fo1 != null){
      ad3 = fo1.m3(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ad1, fb0, fb1, lb0, lb2);
}
    boolean lb3 = true;
    lb3 = !fb0;
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, fb1, lb0, lb2, lb3);
}
    ad2 = ad3 - ad4;
    Thought lo4 = Thought59.getInstance(ao4, fo0, fo1, ao1);
if(ao2 != null){
      fb0 = ao2.m2(fd0, fd1, ad1, ad2, fb1, lb0, lb2, lb3);
}
    ad3 = ad4 - fd0;
if(ao4 != null){
      ao3 = ao4.m4();
}
    Output.points[1][4] -= fd1;
    Thought lo5 = Thought21.getInstance(ad1, ad2, ad3, ad4);
    fb0 = !fb1;
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(lb0, lb2, lb3, fb0);
}
    fb1 = fd1 < ad1;
    double ld6 = 177.39984787678884;

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
    fd1 *= -1;
if(ao1 != null){
      ab2 = ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
    ab3 = !ab4;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fd1 = fo1.m3(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
    ab3 = fd0 < fd1;
    fd0 *= -1;
    Thought lo0 = Thought2.getInstance(fo0, fo1, ao1, ao2, ab4, fb0, fb1, ab1);
    double ld1 = 388.1035735599311;
    boolean lb2 = false;
    double ld3 = 541.9103513345609;
        boolean lb4 = true;
    ld3 = fd0 + fd1;

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
if(ao1 != null){
      ab1 = ao1.m2(ao2, ao3, ao4, fo0);
}
    double ld0 = 908.5268351754618;
if(fo1 != null){
      ab2 = fo1.m2(ld0, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
    ad4 = fd0 - fd1;
    ld0 *= -1;
    ab1 = ad1 < ad2;
    double ld1 = 609.4744210893653;
    ab2 = ab3 || ab4;
    fb0 = ad2 < ad3;
    fb1 = ab1 && ab2;
    boolean lb2 = false;
    ab2 = ad4 > fd0;

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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 484.2887651567673;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, fd0);
}
    Output.points[1][5] += fd1;
if(fo0 != null){
      fo0.m2(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
}
    Thought lo1 = Thought84.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
    Output.points[1][6] += fd1;

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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    if (ab2) {
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        Thought lo0 = Thought89.getInstance(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
        boolean lb1 = false;
        double ld2 = 605.9716499450954;
if(fo1 != null){
          fo0 = fo1.m4();
}
        Thought lo3 = Thought61.getInstance(fd0, fd1, ld2, fd0);
        boolean lb4 = true;
        fd1 *= -1;
if(fo0 != null){
          fo0.m3(lb1, lb4, ab1, ab2);
}
        } else {
if(fo1 != null){
                  fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
        Thought lo5 = Thought41.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
        fd0 = fd1 + fd0;
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
}
        fd1 *= -1;
        Thought lo6 = Thought76.getInstance(fo1, fo0, fo1, fo0);
        Output.points[1][7] += fd0;
        boolean lb7 = true;
if(fo0 != null){
                  fo1 = fo0.m4(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
        fd1 = fd0 - fd1;
        fb0 = fd0 < fd1;
if(fo1 != null){
          fo1.m2();
}
        fd0 = fd1 - fd0;
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
if(fo0 != null){
      fb0 = fo0.m2(ad1, ad2, ad3, ad4);
}
    fb1 = fb0 || fb1;
    Output.points[1][8] += fd0;
    fb0 = fb1 || fb0;
    Thought lo0 = Thought16.getInstance(fb1, fb0, fb1, fb0);
    if (fb1) {
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
        fb0 = ad4 < fd0;
if(fo1 != null){
          fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
        fb0 = fb1 && fb0;
        fb1 = fb0 && fb1;
        fb0 = ad4 > fd0;
        Output.points[2][0] -= fd1;
if(fo0 != null){
          fb1 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
        boolean lb1 = true;
        boolean lb2 = false;
        lb1 = ad1 > ad2;
        lb2 = ad3 > ad4;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        Output.points[2][1] -= fd0;
        fd1 = ad1 - ad2;
if(fo1 != null){
          fo1.m3(ad3, ad4, fd0, fd1, fb0, fb1, lb1, lb2);
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
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4();
}
    double ld1 = 197.54131950652658;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
    lb0 = ab1 || ab2;
    fd0 = fd1 - ld1;
    boolean lb2 = false;
    ab2 = ab3 || ab4;
    double ld3 = 491.8370938603254;
    boolean lb4 = false;
    Output.points[2][2] -= ld3;
if(fo1 != null){
      fo0 = fo1.m4(ab4, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    lb2 = lb4 || ab1;
    double ld5 = 710.715487263836;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld1, ab2, ab3, ab4, fb0);
}
    fb1 = lb0 || lb2;
    ld3 = ld5 + ad1;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fd1 = fd0 - fd1;
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0);
}
    fb1 = fd0 > fd1;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + fd0;
    fd1 *= -1;
if(ao3 != null){
      ao2 = ao3.m4();
}
if(ao4 != null){
      ao4.m2(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
    boolean lb1 = true;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    lb0 = !lb1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb1);
}
    double ld2 = 541.8533533217064;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fb0, fb1, lb0, lb1);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fo1.m2(fd0, fd1, ld2, fd0, fb0, fb1, lb0, lb1);
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
    ad1 = ad2 - ad3;
    ad4 *= -1;
    boolean lb0 = false;
    boolean lb1 = false;
    lb0 = fd0 > fd1;
if(ao1 != null){
      ad1 = ao1.m3();
}
if(ao3 != null){
      ao2 = ao3.m4(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      ao4 = fo0.m4(lb1, fb0, fb1, lb0);
}
if(fo1 != null){
      fd1 = fo1.m3(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, ad1, ad2, lb1, fb0, fb1, lb0);
}
    boolean lb2 = true;
    Thought lo3 = Thought48.getInstance(fo0, fo1, ao1, ao2, lb1, lb2, fb0, fb1);
    ad3 = ad4 + fd0;
    Thought lo4 = Thought16.getInstance(ao3, ao4, fo0, fo1);
if(ao2 != null){
      ao1 = ao2.m4(fd1, ad1, ad2, ad3, lb0, lb1, lb2, fb0);
}
if(ao3 != null){
      fb1 = ao3.m2();
}
if(fo0 != null){
      ao4 = fo0.m4(ad4, fd0, fd1, ad1);
}
    lb0 = lb1 && lb2;
    ad2 = ad3 - ad4;
    fb0 = !fb1;
    lb0 = lb1 || lb2;
    fd0 = fd1 - ad1;
    ad2 = ad3 - ad4;
if(fo1 != null){
      fb0 = fo1.m2(fb1, lb0, lb1, lb2);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, ab1, ab2, ab3);
}
    fd1 = fd0 - fd1;
    boolean lb0 = false;
    ab3 = fd0 < fd1;
    ab4 = fd0 > fd1;
    fb0 = !fb1;
    Thought lo1 = Thought13.getInstance(ao1, ao2, ao3, ao4);
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, lb0, ab1, ab2, ab3);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
    Output.points[2][3] += fd0;
    ab4 = !fb0;
    double ld2 = 590.375645627929;
    fd0 *= -1;
    Thought lo3 = Thought76.getInstance(fd1, ld2, fd0, fd1);
    fb1 = ld2 > fd0;
    lb0 = fd1 < ld2;
    double ld4 = 980.5320233757689;
if(ao3 != null){
      ao3.m3(ab1, ab2, ab3, ab4);
}
    ld4 *= -1;
    fb0 = fd0 > fd1;
    Output.points[2][4] -= ld2;
    fb1 = lb0 && ab1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld4, fd0, fd1, ld2);
}

Thought.STACK_COUNTER++;
return ld4;
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
    ab1 = ab2 && ab3;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, ab4, fb0, fb1, ab1);
}
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 && ab2;
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4);
}
    ab3 = ab4 || fb0;
        boolean lb0 = true;
    fd0 = fd1 + ad1;
if(fo0 != null){
      fo0.m1(ad2, ad3, ad4, fd0, fb0, fb1, lb0, ab1);
}
    fd1 = ad1 + ad2;
    ad3 = ad4 - fd0;
    boolean lb1 = false;
    Thought lo2 = Thought79.getInstance();
    boolean lb3 = true;
    fd1 = ad1 + ad2;
    lb3 = ab1 && ab2;
    ad3 = ad4 + fd0;
if(ao1 != null){
      fo1 = ao1.m4(fd1, ad1, ad2, ad3);
}
if(ao3 != null){
      ao2 = ao3.m4(ab3, ab4, fb0, fb1);
}
    lb0 = ad4 < fd0;
    fd1 = ad1 + ad2;
    boolean lb4 = false;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1);
}
    Thought lo5 = Thought43.getInstance(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, lb1, lb3, lb4, ab1);
    ab2 = fd0 < fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
}
    double ld6 = 529.3456771463933;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}

Thought.STACK_COUNTER++;
return ld6;
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
    fd1 = fd0 - fd1;
        Thought lo0 = Thought55.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
    Thought lo1 = Thought95.getInstance();
if(fo0 != null){
      fb0 = fo0.m2(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    boolean lb2 = true;
    boolean lb3 = false;
if(fo0 != null){
      fo1 = fo0.m4(lb3, fb0, fb1, lb2);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    for(int i0=0; i0<10; i0++){
        boolean lb4 = false;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb2, lb3, fb0, fb1);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb4, lb2, lb3, fb0);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        fd1 *= -1;
        fb1 = lb4 || lb2;
        lb3 = fd0 < fd1;
        fb0 = fb1 && lb4;
if(fo0 != null){
          lb2 = fo0.m2(fd0, fd1, fd0, fd1, lb3, fb0, fb1, lb4);
}
        fd0 = fd1 - fd0;
        Output.points[2][5] += fd1;
        double ld5 = 594.838655642188;
        ld5 = fd0 - fd1;
        ld5 = fd0 + fd1;
        ld5 = fd0 + fd1;
        ld5 *= -1;
        fd0 = fd1 + ld5;
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
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    boolean lb0 = true;
    ab1 = !ab2;
    Thought lo1 = Thought29.getInstance(ab3, ab4, fb0, fb1);
    fd1 *= -1;
    boolean lb2 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb0, lb2, ab1, ab2);
}
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
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    fd1 *= -1;
    if (fb0) {
        fb1 = !fb0;
        fb1 = fb0 && fb1;
if(fo0 != null){
          fb0 = fo0.m2();
}
        Output.points[2][6] -= ad1;
if(fo0 != null){
          fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
if(fo1 != null){
          fd1 = fo1.m3(fb1, fb0, fb1, fb0);
}
        double ld0 = 623.5116145680621;
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
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
    ad3 = ad4 + fd0;
    fb1 = !ab1;
    fd1 = ad1 - ad2;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fb1 = !ab1;
    ab2 = ad3 > ad4;
    double ld0 = 6.5066294767850374;
    Thought lo1 = Thought69.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      ad4 = fo0.m3(fd0, fd1, ld0, ad1, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    ad2 *= -1;
    ab1 = ab2 && ab3;
    Thought lo2 = Thought62.getInstance(ad3, ad4, fd0, fd1);
if(fo1 != null){
      ab4 = fo1.m2(fb0, fb1, ab1, ab2);
}
    ab3 = ld0 < ad1;
    ad2 *= -1;
    ad3 = ad4 - fd0;
    ab4 = fd1 < ld0;
    ad1 = ad2 + ad3;
    fb0 = fb1 || ab1;
    ab2 = ad4 < fd0;
    Output.points[2][7] -= fd1;
    Output.points[2][8] += ld0;
    ab3 = !ab4;
    double ld3 = 208.66715680029895;
    fb0 = ld3 < ad1;

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
    fb1 = fd1 > fd0;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought9.getInstance(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    for(int i0=0; i0<10; i0++){
        fd0 *= -1;
        }
    boolean lb1 = false;
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao4 != null){
      ao3 = ao4.m4(fd1, fd0, fd1, fd0);
}
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    double ld1 = 803.1884702716447;
    ad1 *= -1;
    double ld2 = 512.9750807536354;
    lb0 = ad1 < ad2;
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, lb0, fb0);
}
    Thought lo3 = Thought21.getInstance(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1);
    boolean lb4 = false;
    fb0 = fb1 && lb0;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, ld1, ld2, ad1, ad2, lb4, fb0, fb1, lb0);
}
    lb4 = ad3 < ad4;
    Thought lo5 = Thought36.getInstance(ao1, ao2, ao3, ao4, fb0, fb1, lb0, lb4);
    Output.points[3][0] += fd0;
    fb0 = fb1 && lb0;
    fd1 = ld1 + ld2;
if(fo0 != null){
      lb4 = fo0.m2(fo1, ao1, ao2, ao3);
}
    fb0 = fb1 || lb0;
if(ao4 != null){
      lb4 = ao4.m2(ad1, ad2, ad3, ad4, fb0, fb1, lb0, lb4);
}
if(fo1 != null){
      fo0 = fo1.m4();
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 *= -1;
    boolean lb0 = true;
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0);
}
if(ao4 != null){
      lb0 = ao4.m2(ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || lb0;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    boolean lb1 = true;
    fd1 *= -1;
    fd0 *= -1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab4, fb0, fb1, lb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    Output.points[3][1] -= fd1;
if(ao4 != null){
      fd0 = ao4.m3(fd1, fd0, fd1, fd0, lb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fd1 = fo0.m3();
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ad1 = ao1.m3(ad2, ad3, ad4, fd0);
}
if(ao2 != null){
      fd1 = ao2.m3(ab2, ab3, ab4, fb0);
}
    Thought lo0 = Thought83.getInstance(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
    fd0 = fd1 + ad1;
    Output.points[3][2] -= ad2;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, fb1, ab1, ab2, ab3);
}
    boolean lb1 = false;
    ad1 *= -1;
    ad2 = ad3 - ad4;
    Output.points[3][3] -= fd0;
    for(int i0=0; i0<10; i0++){
        for(int i1=0; i1<10; i1++){
            Thought lo2 = Thought13.getInstance(ao1, ao2, ao3, ao4, ab3, ab4, fb0, fb1);
            lb1 = !ab1;
            Thought lo3 = Thought72.getInstance(fo0, fo1, ao1, ao2);
if(ao4 != null){
              ao3 = ao4.m4(fd1, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
            fb1 = lb1 && ab1;
            if (ab2) {
if(fo0 != null){
                  ab3 = fo0.m2();
}
                boolean lb4 = true;
                ab3 = ab4 && fb0;
if(fo1 != null){
                  ad4 = fo1.m3(fd0, fd1, ad1, ad2);
}
                ad3 = ad4 - fd0;
if(ao1 != null){
                  fd1 = ao1.m3(fb1, lb4, lb1, ab1);
}
                double ld5 = 164.0916146774528;
                ab2 = ld5 > ad1;
                ab3 = ab4 || fb0;
                ad2 *= -1;
if(ao2 != null){
                  ao2.m2(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
}
}}}
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
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    double ld0 = 96.02254794926877;
    Output.points[3][4] -= ld0;
    fd0 = fd1 + ld0;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
    boolean lb1 = false;
    lb1 = fb0 || fb1;
if(fo0 != null){
      fo0.m1();
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld0, fd0, fd1);
}
    ld0 *= -1;
    boolean lb2 = false;
if(fo1 != null){
      lb1 = fo1.m2(lb2, fb0, fb1, lb1);
}
    lb2 = !fb0;
    fd0 = fd1 - ld0;
    Output.points[3][5] -= fd0;

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
        fb1 = fb0 || fb1;
        fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
    fb0 = fd0 > fd1;
    Thought lo0 = Thought19.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
    double ld1 = 869.2885858205407;
    double ld2 = 626.2718827941301;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, ld1, ld2, fd0, fd1, fb0, fb1, fb0, fb1);
}
    ld1 *= -1;
    ld2 *= -1;
    fb0 = !fb1;
    fd0 = fd1 + ld1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    double ld3 = 385.2415099705083;
    Output.points[3][6] += ld2;
    boolean lb4 = true;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    lb4 = ld3 > fd0;
    fd1 = ld1 - ld2;

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
    fd0 = fd1 + fd0;
        fb1 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb0 = false;
    fd1 *= -1;
    boolean lb1 = true;
    double ld2 = 822.892681567483;
    boolean lb3 = false;
    boolean lb4 = false;
    ld2 = fd0 + fd1;
    boolean lb5 = false;
if(fo0 != null){
      ld2 = fo0.m3(fd0, fd1, ld2, fd0);
}
        fd1 = ld2 - fd0;
    Thought lo6 = Thought17.getInstance(lb1, lb3, lb4, lb5);
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, ld2, fd0, fd1);
}
    fb0 = fb1 && lb0;
if(fo0 != null){
      lb1 = fo0.m2(fo1, fo0, fo1, fo0, ld2, fd0, fd1, ld2, lb3, lb4, lb5, fb0);
}
    fd0 = fd1 - ld2;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fb1, lb0, lb1, lb3);
}
    boolean lb7 = false;
    Thought lo8 = Thought29.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      fo0.m1(fd0, fd1, ld2, fd0, lb4, lb5, lb7, fb0);
}
    fb1 = lb0 || lb1;
    boolean lb9 = false;

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
