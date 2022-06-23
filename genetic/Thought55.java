package genetic;
import java.util.ArrayList;
class Thought55 extends Thought{
private static ArrayList<Thought55> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 623.626913594842;
private double fd1 = 570.3995772068716;
private Thought fo0 = null;
private Thought fo1 = null;
Thought55 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought55 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought55 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought55 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought55 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought55 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought55 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought55 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought55 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought55 instance = new Thought55 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought55 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought55 instance = new Thought55 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought55 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought55 instance = new Thought55 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought55 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought55 instance = new Thought55 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought55 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought55 instance = new Thought55 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought55 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought55 instance = new Thought55 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought55 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought55 instance = new Thought55 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought55 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought55 instance = new Thought55 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fd1 *= -1;
    fd0 *= -1;
    fd1 *= -1;
    Output.points[3][4] -= fd0;
    fb0 = fd1 > fd0;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 < fd1;
    fb0 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    Thought lo0 = Thought49.getInstance(fd0, fd1, fd0, fd1);
    double ld1 = 133.01227952334185;
if(fo1 != null){
      fb1 = fo1.m2(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      ld1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    ld1 = fd0 + fd1;
    Output.points[3][5] += ld1;

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
    fd1 = fd0 - fd1;
    boolean lb0 = false;
    fd0 = fd1 + fd0;
    fd1 *= -1;
    lb0 = fd0 < fd1;
if(fo1 != null){
          ab1 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    Thought lo1 = Thought25.getInstance();
    fb1 = fd0 < fd1;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
    double ld2 = 68.99779019900352;
if(fo1 != null){
      fo1.m2(lb0, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
    fd0 *= -1;
    lb0 = !ab1;
    ab2 = ab3 && ab4;
    Output.points[3][6] -= fd1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ld2, fd0, fd1, ld2);
}
    fd0 *= -1;
    double ld3 = 59.55540938368865;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld2, ld3, fb0, fb1, lb0, ab1);
}
    fd0 = fd1 - ld2;
    ab2 = ab3 || ab4;
    ld3 = fd0 - fd1;

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
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fb1 = fo0.m2(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb0 = !fb1;
    Output.points[3][7] += fd1;
    fb0 = ad1 > ad2;
if(fo1 != null){
      fo1.m2(ad3, ad4, fd0, fd1);
}
    fb1 = ad1 < ad2;

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
    boolean lb0 = false;
    Thought lo1 = Thought50.getInstance(lb0, ab1, ab2, ab3);
    ab4 = !fb0;
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    fb1 = !lb0;
    Thought lo2 = Thought80.getInstance(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
    fb0 = fb1 || lb0;
    Output.points[3][8] -= ad4;
    fd0 = fd1 - ad1;
    ab1 = ab2 && ab3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb0);
}
    boolean lb3 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        lb3 = ad2 < ad3;
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
}
    boolean lb4 = true;
    Output.points[4][0] += ad2;
    boolean lb5 = false;
if(fo1 != null){
      ab3 = fo1.m2();
}
    ab4 = ad3 > ad4;
    fd0 *= -1;
    fb0 = fd1 > ad1;

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
    fb1 = fd1 < fd0;
    fb0 = fd1 < fd0;
    fb1 = fd1 < fd0;
    fb0 = fd1 < fd0;
    Output.points[4][1] -= fd1;
    fd0 = fd1 - fd0;
    boolean lb0 = false;
    fb0 = fd1 > fd0;
    Thought lo1 = Thought72.getInstance(fd1, fd0, fd1, fd0);
if(ao2 != null){
      ao1 = ao2.m4(fb1, lb0, fb0, fb1);
}
    lb0 = fd1 < fd0;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    Thought lo2 = Thought43.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);

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
    Thought lo0 = Thought2.getInstance(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
    ad3 = ad4 + fd0;
    fb0 = fd1 < ad1;
    fb1 = ad2 > ad3;
    boolean lb1 = true;
    ad4 = fd0 - fd1;
    double ld2 = 421.88889082125087;
    lb1 = fb0 || fb1;
if(fo1 != null){
      ld2 = fo1.m3(ao1, ao2, ao3, ao4);
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
if(ao1 != null){
      ab1 = ao1.m2(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fd1 = fd0 - fd1;
    fd0 *= -1;
if(ao2 != null){
      fd1 = ao2.m3();
}
if(ao3 != null){
      ao3.m1(fd0, fd1, fd0, fd1);
}
if(ao4 != null){
      fb1 = ao4.m2(ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && ab1;
    fd0 = fd1 + fd0;
    ab2 = !ab3;
    boolean lb0 = true;
    ab3 = fd1 < fd0;
    if (ab4) {
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
}
        fb0 = fd1 < fd0;
        fb1 = fd1 > fd0;
        boolean lb1 = true;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, lb1, lb0, ab1, ab2);
}
        ab3 = ab4 && fb0;
        fb1 = fd1 > fd0;
        double ld2 = 778.4507710446796;
if(fo0 != null){
          lb1 = fo0.m2(fo1, ao1, ao2, ao3, lb0, ab1, ab2, ab3);
}
        Output.points[4][2] += fd0;
        fd1 = ld2 - fd0;
        fd1 = ld2 - fd0;
        Thought lo3 = Thought98.getInstance(ao4, fo0, fo1, ao1);
        ab4 = fd1 > ld2;
        fb0 = fd0 < fd1;
if(ao2 != null){
          ao2.m2(ld2, fd0, fd1, ld2, fb1, lb1, lb0, ab1);
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
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao4 != null){
      ao3 = ao4.m4(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo0.m2(ab2, ab3, ab4, fb0);
}
    fb1 = fd1 > ad1;
    ad2 = ad3 + ad4;
    Thought lo0 = Thought69.getInstance(fo1, ao1, ao2, ao3, fd0, fd1, ad1, ad2);
    ab1 = ad3 > ad4;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
    boolean lb1 = false;
    fb0 = ad3 < ad4;
    fd0 = fd1 - ad1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb1, lb1, ab1, ab2);
}
    ab3 = !ab4;
    Output.points[4][3] += ad2;
    Output.points[4][4] -= ad3;
    fb0 = fb1 || lb1;

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
    fd1 *= -1;
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
    if (fb1) {
        fd0 *= -1;
        fb0 = !fb1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
          fo1.m2(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
        fb0 = fd1 > fd0;
        double ld0 = 515.4966132062652;
if(fo0 != null){
          fo0.m3();
}
        fb1 = !fb0;
        fd0 = fd1 - ld0;
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, ld0, fd0);
}
        fb1 = fd1 > ld0;
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
    fd1 = fd0 - fd1;
    ab2 = ab3 || ab4;
    fb0 = fd0 > fd1;
    fb1 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fb0 = fd1 < fd0;
    fb1 = fd1 < fd0;
    ab1 = ab2 && ab3;
    fd1 = fd0 - fd1;
    ab4 = fb0 && fb1;
    ab1 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    Thought lo0 = Thought50.getInstance(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd0 *= -1;
    ab3 = fd1 < fd0;
    Output.points[4][5] += fd1;

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
    Output.points[4][6] += ad1;
    Thought lo0 = Thought49.getInstance(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
    boolean lb1 = false;
    fd1 *= -1;
    fb0 = !fb1;
    lb1 = fb0 && fb1;
    boolean lb2 = false;
    double ld3 = 50.21625949120901;
    Thought lo4 = Thought83.getInstance();
    double ld5 = 65.73294470645058;
if(fo0 != null){
      lb1 = fo0.m2(ld3, ld5, ad1, ad2);
}
if(fo1 != null){
      lb2 = fo1.m2(fb0, fb1, lb1, lb2);
}
    fb0 = ad3 < ad4;
    Output.points[4][7] -= fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ld3, ld5, ad1, ad2);
}
    fb1 = ad3 > ad4;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld3, ld5, lb1, lb2, fb0, fb1);
}
    boolean lb6 = false;
    double ld7 = 515.2099373198532;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb1, lb2, lb6, fb0);
}
    ld7 = ad1 + ad2;
    ad3 *= -1;
    ad4 = fd0 - fd1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    ld3 = ld5 + ld7;
if(fo1 != null){
      fb1 = fo1.m2(ad1, ad2, ad3, ad4, lb1, lb2, lb6, fb0);
}
    double ld8 = 121.300268260919;
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo9 = Thought86.getInstance(ad4, fd0, fd1, ld3);

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
    ab1 = ad2 > ad3;
    ad4 = fd0 + fd1;
    ad1 = ad2 + ad3;
if(fo0 != null){
      fo0.m2(ab2, ab3, ab4, fb0);
}
    fb1 = ab1 || ab2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
    ad1 = ad2 + ad3;
    if (ab1) {
        ad4 *= -1;
        boolean lb0 = true;
        ab1 = ab2 && ab3;
if(fo0 != null){
          ab4 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, lb0, ab1);
}
if(fo1 != null){
          fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
        boolean lb1 = false;
if(fo0 != null){
          fd1 = fo0.m3(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
        Thought lo2 = Thought90.getInstance();
        if (fb0) {
if(fo0 != null){
              fo1 = fo0.m4(fd0, fd1, ad1, ad2);
}
            fb1 = ad3 < ad4;
            fd0 = fd1 - ad1;
}}
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
    boolean lb0 = false;
    fb0 = !fb1;
    boolean lb1 = false;
    Thought lo2 = Thought6.getInstance(lb0, lb1, fb0, fb1);
    boolean lb3 = false;
    lb0 = lb1 || lb3;
    fb0 = !fb1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    double ld4 = 417.7098212730255;
    Output.points[4][8] += fd0;
    lb0 = lb1 || lb3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ld4, fd0, fd1, fb0, fb1, lb0, lb1);
}
    double ld5 = 737.0997943478337;
if(ao2 != null){
      lb3 = ao2.m2(ao3, ao4, fo0, fo1, fb0, fb1, lb0, lb1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    boolean lb6 = true;
    boolean lb7 = true;
    lb3 = !lb6;
if(ao1 != null){
      lb7 = ao1.m2(ld4, ld5, fd0, fd1, fb0, fb1, lb0, lb1);
}
if(ao2 != null){
      ao2.m2();
}
    Thought lo8 = Thought18.getInstance(ld4, ld5, fd0, fd1);
    ld4 *= -1;
    boolean lb9 = true;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      fb1 = ao1.m2(fb0, fb1, fb0, fb1);
}
    ad2 *= -1;
    Thought lo0 = Thought49.getInstance(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1);
    ad1 = ad2 - ad3;
    boolean lb1 = false;
    if (lb1) {
        boolean lb2 = true;
        Output.points[5][0] += ad4;
        Thought lo3 = Thought82.getInstance(fo1, ao1, ao2, ao3, fd0, fd1, ad1, ad2, lb1, fb0, fb1, lb2);
        for(int i0=0; i0<10; i0++){
            }
        ad3 = ad4 - fd0;
        boolean lb4 = true;
if(ao4 != null){
          fd1 = ao4.m3(fo0, fo1, ao1, ao2, lb4, lb1, fb0, fb1);
}
        Output.points[5][1] += ad1;
        boolean lb5 = true;
        Thought lo6 = Thought67.getInstance(ao3, ao4, fo0, fo1);
        boolean lb7 = true;
        double ld8 = 765.7386709231101;
if(ao1 != null){
          ad1 = ao1.m3(ad2, ad3, ad4, fd0, lb2, lb4, lb5, lb7);
}
        boolean lb9 = false;
        fd1 = ld8 - ad1;
        ad2 = ad3 - ad4;
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
    Output.points[5][2] += fd1;
if(ao2 != null){
      fd0 = ao2.m3();
}
    ab1 = !ab2;
    boolean lb0 = false;
    Output.points[5][3] -= fd1;
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
        Thought lo1 = Thought9.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, fb1, lb0, ab1, ab2);
    boolean lb2 = true;
    Thought lo3 = Thought45.getInstance(fo0, fo1, ao1, ao2, ab2, ab3, ab4, fb0);
        boolean lb4 = false;
    boolean lb5 = true;
    boolean lb6 = true;
    ab3 = fd0 < fd1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb0);
}
    boolean lb7 = true;
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo8 = Thought13.getInstance(fd0, fd1, fd0, fd1);

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought86.getInstance(ab1, ab2, ab3, ab4);
    fb0 = fb1 && ab1;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(ao1, ao2, ao3, ao4, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3);
}
    fb0 = ad3 > ad4;
    boolean lb1 = true;
    boolean lb2 = false;
    ab4 = !fb0;
    fb1 = !lb1;
    boolean lb3 = false;
if(ao4 != null){
          fd0 = ao4.m3(fd1, ad1, ad2, ad3, lb2, lb3, ab1, ab2);
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    for(int i0=0; i0<10; i0++){
        Thought lo0 = Thought1.getInstance();
        boolean lb1 = true;
        Thought lo2 = Thought87.getInstance(fd1, fd0, fd1, fd0);
if(fo0 != null){
          lb1 = fo0.m2(fb0, fb1, lb1, fb0);
}
        }
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    boolean lb3 = true;

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
    boolean lb0 = true;
    Thought lo1 = Thought74.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb0, ab1, ab2, ab3);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb0);
}
    ab1 = ab2 && ab3;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    boolean lb2 = true;
    double ld3 = 956.0010572373591;
if(fo0 != null){
      fo0.m3(ld3, fd0, fd1, ld3, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      lb0 = fo1.m2(fd0, fd1, ld3, fd0);
}
        lb2 = ab1 || ab2;

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
    if (fb0) {
if(fo1 != null){
          fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
        fb1 = fb0 || fb1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
        double ld0 = 786.5872979851298;
        ad4 = fd0 - fd1;
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, ld0, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
        ad4 *= -1;
        Output.points[5][4] += fd0;
if(fo1 != null){
          fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
        Thought lo1 = Thought92.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
          fo0 = fo1.m4(fd1, ld0, ad1, ad2, fb1, fb0, fb1, fb0);
}
        boolean lb2 = true;
if(fo0 != null){
          fb0 = fo0.m2();
}
if(fo0 != null){
          fo1 = fo0.m4(ad3, ad4, fd0, fd1);
}
        ld0 *= -1;
        fb1 = ad1 > ad2;
        if (lb2) {
            ad3 = ad4 - fd0;
            Thought lo3 = Thought34.getInstance(fb0, fb1, lb2, fb0);
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, ad1, ad2);
}
            double ld4 = 584.6359566530563;
            fb1 = lb2 || fb0;
if(fo1 != null){
              fo1.m2(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb1, lb2, fb0, fb1);
}
            fd1 = ld4 + ld0;
}}
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
    boolean lb0 = false;
    Thought lo1 = Thought1.getInstance(fo0, fo1, fo0, fo1, lb0, ab1, ab2, ab3);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ad2 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1, ab4, fb0, fb1, lb0);
}
    ad1 = ad2 + ad3;
    boolean lb2 = false;
    lb2 = !ab1;
    ad4 *= -1;
    fd0 = fd1 - ad1;
    boolean lb3 = true;
if(fo0 != null){
      fo0.m3();
}
    ab1 = ab2 || ab3;
    boolean lb4 = true;
    boolean lb5 = true;
    ab2 = ab3 || ab4;
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fb0 = fo1.m2(fb1, lb0, lb2, lb3);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    lb4 = lb5 && ab1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
    double ld6 = 726.50613638711;
    Thought lo7 = Thought17.getInstance(fo0, fo1, fo0, fo1, fb1, lb0, lb2, lb3);
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
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
    fd1 *= -1;
if(ao2 != null){
      fb1 = ao2.m2(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      fb0 = ao3.m2();
}
    fb1 = fd0 < fd1;
    fb0 = fd0 > fd1;
    boolean lb0 = true;
    fb0 = fb1 && lb0;
    if (fb0) {
if(fo0 != null){
          ao4 = fo0.m4(fd0, fd1, fd0, fd1);
}
        fb1 = lb0 || fb0;
if(fo1 != null){
          fo1.m2(fb1, lb0, fb0, fb1);
}
        double ld1 = 256.62696058255744;
if(ao1 != null){
          ao1.m1(ao2, ao3, ao4, fo0, ld1, fd0, fd1, ld1);
}
if(fo1 != null){
          fo1.m2(ao1, ao2, ao3, ao4, fd0, fd1, ld1, fd0, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb0, fb1, lb0, fb0);
}
        fb1 = fd1 < ld1;
        lb0 = !fb0;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
        fb1 = lb0 && fb0;
        fb1 = !lb0;
if(fo0 != null){
          fd0 = fo0.m3(fd1, ld1, fd0, fd1, fb0, fb1, lb0, fb0);
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
if(ao3 != null){
      ao2 = ao3.m4();
}
    if (fb0) {
if(fo0 != null){
          ao4 = fo0.m4(ad2, ad3, ad4, fd0);
}
        Thought lo0 = Thought23.getInstance(fb1, fb0, fb1, fb0);
        double ld1 = 262.0105098634826;
        fd0 *= -1;
if(fo1 != null){
          fb1 = fo1.m2(ao1, ao2, ao3, ao4, fd1, ld1, ad1, ad2);
}
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
          fo0.m1(fo1, ao1, ao2, ao3, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
          fb0 = ao4.m2(fo0, fo1, ao1, ao2);
}
if(ao4 != null){
          ao3 = ao4.m4(ld1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
        if (fb1) {
if(fo0 != null){
              fo0.m2();
}
            Output.points[5][5] += ad4;
            fb0 = fb1 && fb0;
            fd0 = fd1 + ld1;
if(ao1 != null){
              fo1 = ao1.m4(ad1, ad2, ad3, ad4);
}
if(ao2 != null){
              ao2.m3(fb1, fb0, fb1, fb0);
}
if(ao3 != null){
              ao3.m1(ao4, fo0, fo1, ao1, fd0, fd1, ld1, ad1);
}
            ad2 *= -1;
            } else if (fb1) {
            ad3 = ad4 + fd0;
if(ao3 != null){
              ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ld1, ad1, ad2, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
              ad3 = ao2.m3(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = fd1 > fd0;
    ab2 = fd1 < fd0;
    Output.points[5][6] += fd1;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0);
}
    ab3 = fd0 < fd1;
    ab4 = !fb0;
    boolean lb0 = true;
    Thought lo1 = Thought84.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, lb0, ab1);
    ab2 = !ab3;
if(fo1 != null){
      fo1.m1();
}
if(ao1 != null){
      fd0 = ao1.m3(fd1, fd0, fd1, fd0);
}
    ab4 = fd1 > fd0;
    Thought lo2 = Thought7.getInstance(fb0, fb1, lb0, ab1);
    ab2 = ab3 || ab4;
    fb0 = fb1 && lb0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
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
    ad1 *= -1;
if(ao2 != null){
      ad2 = ao2.m3(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
    boolean lb0 = true;
if(ao1 != null){
      ad1 = ao1.m3(ao2, ao3, ao4, fo0, fb0, fb1, lb0, ab1);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    ad2 *= -1;
    ad3 = ad4 + fd0;
    ab2 = fd1 > ad1;
    ad2 = ad3 - ad4;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, ad1, ad2, ab3, ab4, fb0, fb1);
}
    ad3 *= -1;
if(ao3 != null){
      ao2 = ao3.m4();
}
    lb0 = ab1 || ab2;
    ad4 *= -1;
    ab3 = !ab4;

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
    double ld0 = 14.732496504030081;
    Thought lo1 = Thought71.getInstance(fd0, fd1, ld0, fd0);
        boolean lb2 = false;
    fd1 = ld0 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb2, fb0);
}
    fd1 = ld0 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, fb1, lb2, fb0, fb1);
}
    fd0 = fd1 - ld0;
    lb2 = !fb0;
    if (fb1) {
        fd0 = fd1 - ld0;
        boolean lb3 = false;
        lb3 = !lb2;
        fb0 = fb1 || lb3;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb2, fb0, fb1, lb3);
}
        double ld4 = 367.91557630785826;
        lb2 = fb0 && fb1;
        lb3 = !lb2;
        ld0 *= -1;
        fd0 = fd1 + ld4;
        if (fb0) {
if(fo0 != null){
              fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
              fo1.m3(ld0, fd0, fd1, ld4, lb3, lb2, fb0, fb1);
}
            ld0 = fd0 - fd1;
if(fo1 != null){
              fo0 = fo1.m4();
}
if(fo0 != null){
              fo0.m1(ld4, ld0, fd0, fd1);
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
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fb0 = fb1 || ab1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fd0 = fd1 - fd0;
    double ld0 = 363.49095045884866;
    fd0 = fd1 - ld0;
    if (fb1) {
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
        fd0 = fd1 + ld0;
        Output.points[5][7] += fd0;
        Output.points[5][8] -= fd1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
          ld0 = fo1.m3(fd0, fd1, ld0, fd0, fb0, fb1, ab1, ab2);
}
        fd1 *= -1;
        ld0 *= -1;
if(fo0 != null){
          ab3 = fo0.m2();
}
        Output.points[6][0] -= fd0;
        ab4 = !fb0;
if(fo0 != null){
          fo1 = fo0.m4(fd1, ld0, fd0, fd1);
}
        ld0 *= -1;
        boolean lb1 = false;
if(fo1 != null){
          fd0 = fo1.m3(fb0, fb1, lb1, ab1);
}
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
    double ld0 = 892.2878728976268;
    ld0 = ad1 - ad2;
    fb0 = !fb1;
    ad3 = ad4 + fd0;
    double ld1 = 122.50842555296495;
    fb0 = fb1 || fb0;
    fd0 = fd1 - ld0;
if(fo1 != null){
      ld1 = fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    Thought lo2 = Thought20.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld1, fb1, fb0, fb1, fb0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    ad1 = ad2 + ad3;
    boolean lb3 = false;
    ad4 = fd0 + fd1;
    fb0 = fb1 || lb3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      ld0 = fo0.m3(ld1, ad1, ad2, ad3, fb0, fb1, lb3, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fb1 = fo1.m2(ad4, fd0, fd1, ld0);
}
    Thought lo4 = Thought69.getInstance(lb3, fb0, fb1, lb3);
    ld1 = ad1 + ad2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          ld0 = fo0.m3(fo1, fo0, fo1, fo0, ld1, ad1, ad2, ad3, fb0, fb1, lb3, fb0);
}
        ad4 *= -1;
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
    boolean lb0 = false;
        ad1 *= -1;
    ab3 = ab4 && fb0;
    ad2 = ad3 + ad4;
    fb1 = fd0 < fd1;
    ad1 = ad2 + ad3;
    lb0 = !ab1;
    boolean lb1 = true;
    ad4 = fd0 - fd1;
    ab1 = ad1 > ad2;
    ab2 = !ab3;
    ad3 = ad4 + fd0;
    ab4 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb0, lb1, ab1);
}
    Thought lo2 = Thought5.getInstance(fo0, fo1, fo0, fo1);
    Thought lo3 = Thought8.getInstance(fd1, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
    boolean lb4 = false;
    Thought lo5 = Thought95.getInstance();
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao2.m3(fd1, fd0, fd1, fd0);
}
if(ao3 != null){
      fb0 = ao3.m2(fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought71.getInstance(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
    Thought lo1 = Thought40.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    Thought lo2 = Thought10.getInstance(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
    fd1 = fd0 - fd1;
    if (fb1) {
if(fo1 != null){
          fb0 = fo1.m2();
}
if(ao1 != null){
          fb1 = ao1.m2(fd0, fd1, fd0, fd1);
}
        double ld3 = 661.4765549544968;
if(ao2 != null){
          ld3 = ao2.m3(fb0, fb1, fb0, fb1);
}
if(ao3 != null){
          ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, ld3, fd0);
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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 < fd1;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    fb1 = ad1 < ad2;
    ad3 *= -1;
if(fo1 != null){
      ad4 = fo1.m3(ao1, ao2, ao3, ao4);
}
    double ld0 = 345.6857907411802;
    ad4 = fd0 - fd1;
    boolean lb1 = true;
    lb1 = fb0 || fb1;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[6][1] -= fd0;
    ab1 = !ab2;
if(ao2 != null){
      ao2.m1(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    ab1 = fd1 < fd0;
        boolean lb0 = true;
    ab1 = fd1 < fd0;
if(ao3 != null){
      fd1 = ao3.m3();
}
if(ao4 != null){
      ao4.m1(fd0, fd1, fd0, fd1);
}
    ab2 = fd0 > fd1;

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
    ad1 = ad2 - ad3;
if(ao2 != null){
      ao2.m1(ab2, ab3, ab4, fb0);
}
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1);
}
    fb1 = ab1 || ab2;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, ab1, ab2, ab3, ab4);
}
    Thought lo0 = Thought87.getInstance(fo1, ao1, ao2, ao3);
    ad1 *= -1;
    ad2 = ad3 + ad4;
    double ld1 = 716.7281504284632;
    Thought lo2 = Thought47.getInstance(ad4, fd0, fd1, ld1, fb0, fb1, ab1, ab2);
    ab3 = ad1 < ad2;
    Thought lo3 = Thought16.getInstance();
    for(int i0=0; i0<10; i0++){
        boolean lb4 = false;
if(fo0 != null){
          ao4 = fo0.m4(ad3, ad4, fd0, fd1);
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
    fd0 *= -1;
    Thought lo0 = Thought92.getInstance(fb1, fb0, fb1, fb0);
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fb1 = fd1 < fd0;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = fd0 + fd1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    double ld1 = 96.44913059599014;

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
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m2();
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
if(fo1 != null){
      fo1.m3(fb1, fb0, fb1, fb0);
}
    fb1 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fb0 = !fb1;
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fd0 *= -1;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
    fb0 = fd0 > fd1;
    fb1 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      lb0 = fo1.m2(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fo0.m2();
}
    fb1 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4(lb0, lb1, fb0, fb1);
}
    Output.points[6][2] += fd0;

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
    fb0 = fd1 > fd0;
    Output.points[6][3] += fd1;
    fb1 = fd0 > fd1;
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    Thought lo0 = Thought18.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
    fb1 = fb0 && fb1;
    fb0 = !fb1;
    Thought lo1 = Thought98.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fb0 = fo1.m2(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2();
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    fb0 = fd1 > fd0;
if(fo1 != null){
      fb1 = fo1.m2(fb0, fb1, fb0, fb1);
}
    fb0 = fd1 < fd0;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 < fd0;
    fd1 = fd0 - fd1;
    boolean lb2 = true;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, lb2, fb0);
}
    double ld3 = 747.1858211193113;

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
