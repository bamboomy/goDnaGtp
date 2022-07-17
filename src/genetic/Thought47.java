package genetic;
import java.util.ArrayList;
class Thought47 extends Thought{
private static ArrayList<Thought47> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 578.4207238054851;
private double fd1 = 155.04098640065524;
private Thought fo0 = null;
private Thought fo1 = null;
Thought47 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought47 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought47 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought47 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought47 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought47 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought47 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought47 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought47 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought47 instance = new Thought47 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought47 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought47 instance = new Thought47 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought47 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought47 instance = new Thought47 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought47 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought47 instance = new Thought47 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought47 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought47 instance = new Thought47 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought47 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought47 instance = new Thought47 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought47 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought47 instance = new Thought47 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought47 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought47 instance = new Thought47 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd0 *= -1;
    Thought lo0 = Thought28.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
if(fo1 != null){
      fo1.m2(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
    Output.points[7][0] += fd1;

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
    Thought lo0 = Thought260.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
    double ld1 = 727.2066017974089;
    ab1 = ld1 < fd0;
    Thought lo2 = Thought37.getInstance(fd1, ld1, fd0, fd1, ab2, ab3, ab4, fb0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
}
    ld1 = fd0 - fd1;
    ab4 = ld1 > fd0;
    Output.points[7][1] += fd1;
if(fo0 != null){
      fo0.m2();
}
if(fo1 != null){
      ld1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      fo0.m1(ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      ab1 = fo0.m2(fd1, ld1, fd0, fd1);
}
if(fo1 != null){
      ld1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0);
}
if(fo0 != null){
      fd1 = fo0.m3(ld1, fd0, fd1, ld1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
}
    boolean lb3 = true;
    fd1 = ld1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    double ld4 = 266.73949670895274;
if(fo1 != null){
      ld1 = fo1.m3(lb3, ab1, ab2, ab3);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ld4 = fd0 + fd1;
    if (ab4) {
if(fo0 != null){
          fo0.m3(ld1, ld4, fd0, fd1);
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
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[7][2] += ad1;
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 - ad1;
    boolean lb0 = true;
    fb0 = fb1 || lb0;
    ad2 = ad3 + ad4;
    Thought lo1 = Thought53.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
    fd0 = fd1 - ad1;
    double ld2 = 685.1741554920967;
    ad1 = ad2 - ad3;
    fb1 = lb0 || fb0;
    fb1 = !lb0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    ad4 *= -1;
    if (fb0) {
        Output.points[7][3] += fd0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld2, ad1, ad2, fb1, lb0, fb0, fb1);
}
        Thought lo3 = Thought305.getInstance(lb0, fb0, fb1, lb0);
        fb0 = !fb1;
        Output.points[7][4] += ad3;
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
    boolean lb0 = true;
    lb0 = ad1 > ad2;
    Thought lo1 = Thought278.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      fo0.m2(ad3, ad4, fd0, fd1);
}
    Thought lo2 = Thought237.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, ab1, ab2, ab3);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, ab4, fb0, fb1, lb0);
}
if(fo0 != null){
      fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
    Thought lo3 = Thought48.getInstance(fo1, fo0, fo1, fo0);
    ad2 *= -1;
    fb0 = fb1 || lb0;

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
    fd0 = fd1 + fd0;
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0);
}
    boolean lb1 = false;
    fd1 = fd0 - fd1;
    boolean lb2 = false;
    boolean lb3 = false;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
if(ao4 != null){
      ao4.m1(fd1, fd0, fd1, fd0, lb1, lb2, lb3, fb0);
}
    fb1 = fd1 < fd0;
    lb0 = lb1 && lb2;
    lb3 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb1, lb0, lb1, lb2);
}
    Output.points[7][5] += fd1;
    lb3 = fd0 > fd1;
    boolean lb4 = false;
    double ld5 = 678.8212178370617;

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
    fb0 = ad1 > ad2;
if(ao2 != null){
      ao1 = ao2.m4();
}
    boolean lb0 = true;
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, fb1, lb0, fb0, fb1);
}
    ad1 = ad2 + ad3;
    boolean lb1 = true;
    lb0 = ad4 > fd0;
    Thought lo2 = Thought334.getInstance(lb1, fb0, fb1, lb0);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fd1 = ad1 - ad2;

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
      ao2.m3(fd0, fd1, fd0, fd1);
}
    ab2 = ab3 || ab4;
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      fd1 = ao2.m3(fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
    double ld0 = 466.40104909103815;
    boolean lb1 = false;
    Thought lo2 = Thought183.getInstance(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
    ld0 *= -1;
    boolean lb3 = false;
    boolean lb4 = true;
    ab4 = fd0 < fd1;
if(ao2 != null){
      ao1 = ao2.m4();
}
    ld0 *= -1;
    boolean lb5 = false;
    boolean lb6 = true;
    Output.points[7][6] += fd0;
    ab3 = fd1 < ld0;

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
      ao1.m2(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fb0 = fo1.m2(fb1, ab1, ab2, ab3);
}
    double ld0 = 646.1019896730559;
    Output.points[7][7] += fd0;
    Output.points[7][8] -= fd1;
    ab4 = ld0 < ad1;
    Thought lo1 = Thought150.getInstance(ao1, ao2, ao3, ao4);
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fd1, ld0, ad1, ad2);
}
    ad3 *= -1;
    Thought lo2 = Thought278.getInstance(ad4, fd0, fd1, ld0, fb0, fb1, ab1, ab2);
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, ab3, ab4, fb0, fb1);
}
    ab1 = ad1 > ad2;
if(fo0 != null){
      ab2 = fo0.m2();
}
    boolean lb3 = false;
    ab2 = ad3 < ad4;
    ab3 = fd0 < fd1;
    Thought lo4 = Thought284.getInstance(fo1, ao1, ao2, ao3, ld0, ad1, ad2, ad3, ab4, fb0, fb1, lb3);
    ad4 = fd0 - fd1;
    ld0 = ad1 + ad2;

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
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    fb1 = fd1 < fd0;
    fd1 = fd0 + fd1;
    boolean lb0 = false;
    boolean lb1 = false;
    lb0 = !lb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
        fd0 *= -1;
    fd1 = fd0 - fd1;

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
    Output.points[8][0] += fd0;
    double ld0 = 32.39214655624618;
    if (ab2) {
        ab3 = ab4 || fb0;
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
}
        fb1 = fd1 < ld0;
        ab1 = fd0 > fd1;
if(fo1 != null){
          fo0 = fo1.m4(ld0, fd0, fd1, ld0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
}
        double ld1 = 19.566916185136897;
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
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    double ld0 = 365.93969193127293;
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
    Output.points[8][1] -= fd1;
    ld0 *= -1;
    lb1 = ad1 > ad2;
    fb0 = !fb1;
    lb1 = !fb0;
    boolean lb2 = false;
    Thought lo3 = Thought270.getInstance(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
if(fo0 != null){
      fo0.m3(ld0, ad1, ad2, ad3, fb0, fb1, lb1, lb2);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb1, lb2);
}
if(fo1 != null){
      fo1.m1();
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld0, fb1, lb1, lb2, fb0);
}
    ad1 = ad2 - ad3;
if(fo1 != null){
      ad4 = fo1.m3(fb1, lb1, lb2, fb0);
}
    fb1 = lb1 || lb2;
    fd0 = fd1 + ld0;
    ad1 = ad2 + ad3;
    double ld4 = 774.6331155230059;

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
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      ad1 = fo0.m3(ad2, ad3, ad4, fd0);
}
    double ld0 = 477.0970573200112;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld0, ad1, ad2);
}
if(fo0 != null){
      ad3 = fo0.m3(ad4, fd0, fd1, ld0, ab2, ab3, ab4, fb0);
}
    ad1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
    ad2 = ad3 - ad4;
if(fo1 != null){
      fd0 = fo1.m3();
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, ad1, ad2, ab4, fb0, fb1, ab1);
}
    Thought lo1 = Thought137.getInstance(ab2, ab3, ab4, fb0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, ad1, ad2, ad3);
}
    fb1 = ad4 > fd0;
    Thought lo2 = Thought306.getInstance(fd1, ld0, ad1, ad2, ab1, ab2, ab3, ab4);
    ad3 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
    double ld3 = 432.3461444035411;

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
    Thought lo0 = Thought178.getInstance();
    fb1 = fd0 < fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    boolean lb1 = false;
    lb1 = fd0 > fd1;
        fd0 = fd1 - fd0;
    fb0 = !fb1;
if(ao1 != null){
      lb1 = ao1.m2(fb0, fb1, lb1, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    double ld2 = 309.23408832720054;
if(ao2 != null){
      ao2.m3(fd0, fd1, ld2, fd0);
}
    Thought lo3 = Thought92.getInstance(ao3, ao4, fo0, fo1, fd1, ld2, fd0, fd1);
    double ld4 = 476.9327370983063;
    ld2 *= -1;

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
    Output.points[8][2] -= ad2;
    fb0 = fb1 && fb0;
if(ao1 != null){
      ao1.m3(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought69.getInstance(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
if(fo1 != null){
      fo1.m2();
}
    fb1 = fb0 && fb1;
    Thought lo1 = Thought41.getInstance(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
    fd0 = fd1 + ad1;
    Thought lo2 = Thought90.getInstance(fb0, fb1, fb0, fb1);
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3);
}
    ad2 *= -1;
    fb0 = fb1 && fb0;
    ad3 *= -1;
if(fo0 != null){
      ao4 = fo0.m4(ad4, fd0, fd1, ad1);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
}
    fd1 = ad1 - ad2;
    Output.points[8][3] += ad3;
    fb1 = fb0 && fb1;
    fb0 = !fb1;
if(ao1 != null){
      fo1 = ao1.m4(ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
    ad2 *= -1;
    double ld3 = 915.9276884759969;
if(ao2 != null){
          ad2 = ao2.m3(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
    ad3 *= -1;
if(ao2 != null){
      ao1 = ao2.m4();
}
    fb0 = ad4 < fd0;

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
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
        fb0 = fb1 || ab1;
    boolean lb0 = true;
if(ao1 != null){
      fo1 = ao1.m4(ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && lb0;
    ab1 = ab2 || ab3;
    ab4 = !fb0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
          ao2 = ao3.m4(fd0, fd1, fd0, fd1);
}
    fb1 = lb0 && ab1;
    ab2 = fd0 > fd1;
    fd0 = fd1 + fd0;
    ab3 = ab4 && fb0;
    fd1 = fd0 - fd1;
    fd0 *= -1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    fb1 = lb0 || ab1;

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
    Thought lo0 = Thought256.getInstance(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
    fd0 = fd1 + ad1;
    Thought lo1 = Thought310.getInstance(ao2, ao3, ao4, fo0, fb1, ab1, ab2, ab3);
    Thought lo2 = Thought255.getInstance();
if(fo1 != null){
      ab4 = fo1.m2(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0, fb0, fb1, ab1, ab2);
}
    if (ab3) {
        fd1 = ad1 + ad2;
if(fo1 != null){
          fo0 = fo1.m4(ab4, fb0, fb1, ab1);
}
        ad3 = ad4 + fd0;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
        ab2 = !ab3;
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 *= -1;
    fb0 = fb1 && fb0;
    fd0 = fd1 + fd0;
    fb1 = fb0 || fb1;
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
    fb0 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fd0 = fo0.m3();
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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    Thought lo0 = Thought237.getInstance(fb1, ab1, ab2, ab3);
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    Thought lo1 = Thought218.getInstance(fd0, fd1, fd0, fd1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    ab4 = !fb0;
    fb1 = ab1 && ab2;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    if (fb0) {
        fd1 = fd0 - fd1;
        Thought lo2 = Thought361.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
if(fo0 != null){
          fo1 = fo0.m4(ab4, fb0, fb1, ab1);
}
        ab2 = ab3 || ab4;
        fd0 = fd1 + fd0;
        fb0 = !fb1;
if(fo1 != null){
          ab1 = fo1.m2(fo0, fo1, fo0, fo1);
}
        Thought lo3 = Thought363.getInstance(fd1, fd0, fd1, fd0);
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
        ab2 = ab3 && ab4;
        fd1 = fd0 + fd1;
        fb0 = fd0 > fd1;
        fd0 = fd1 + fd0;
        fd1 = fd0 + fd1;
        fb1 = fd0 < fd1;
        ab1 = ab2 || ab3;
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
if(fo0 != null){
      ad2 = fo0.m3(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
if(fo1 != null){
      fb0 = fo1.m2();
}
    fb1 = !fb0;
    double ld0 = 58.97497865134735;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
    ad4 = fd0 + fd1;
    ld0 *= -1;
    ad1 = ad2 + ad3;
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    fb1 = ad4 > fd0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    fb0 = fb1 || fb0;
if(fo1 != null){
      fd1 = fo1.m3(ld0, ad1, ad2, ad3);
}
    double ld1 = 862.9646185430715;
    Thought lo2 = Thought396.getInstance(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
    fb1 = !fb0;
    ld0 = ld1 + ad1;

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
    ab2 = ab3 || ab4;
    ad1 = ad2 + ad3;
    boolean lb0 = false;
    ad4 = fd0 - fd1;
    boolean lb1 = false;
    boolean lb2 = true;
    double ld3 = 245.42756153041012;
    ld3 = ad1 - ad2;
    Thought lo4 = Thought163.getInstance(ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
    ld3 = ad1 + ad2;
    Thought lo5 = Thought324.getInstance(fo0, fo1, fo0, fo1, fb1, lb0, lb1, lb2);
    ad3 = ad4 - fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd1 = ld3 + ad1;
    ad2 *= -1;
    boolean lb6 = false;
    ad3 = ad4 - fd0;
    if (lb6) {
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, fd1, ld3, ad1, ad2, ab1, ab2, ab3, ab4);
}
        ad3 = ad4 - fd0;
        fd1 *= -1;
        ld3 = ad1 + ad2;
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
    Thought lo0 = Thought142.getInstance(fb0, fb1, fb0, fb1);
    fb0 = fd0 < fd1;
    double ld1 = 700.1372181574269;
    boolean lb2 = false;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      ao2.m2(ld1, fd0, fd1, ld1);
}
    fb0 = fd0 < fd1;
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, ld1, fd0, fd1, ld1);
}
    lb2 = !fb0;
    fb1 = fd0 < fd1;
if(ao3 != null){
      ao2 = ao3.m4(ld1, fd0, fd1, ld1, lb2, fb0, fb1, lb2);
}
    fb0 = !fb1;
    boolean lb3 = true;

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
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
    ad1 *= -1;
    ad2 = ad3 - ad4;
        boolean lb0 = true;
    fd0 = fd1 + ad1;
    Output.points[8][4] += ad2;
if(ao2 != null){
      ao2.m2();
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1, lb0, fb0, fb1, lb0);
}
    ad1 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, lb0, fb0);
}
    boolean lb1 = false;
    boolean lb2 = true;
if(fo0 != null){
      ad2 = fo0.m3(fo1, ao1, ao2, ao3);
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
    boolean lb0 = true;
    lb0 = fd1 > fd0;
    Thought lo1 = Thought373.getInstance(fd1, fd0, fd1, fd0);
    boolean lb2 = false;
    fd1 *= -1;
    lb2 = ab1 || ab2;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    ab3 = fd0 > fd1;
    fd0 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
}
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought53.getInstance(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
    fb1 = !ab1;
    Thought lo1 = Thought182.getInstance();
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    fd0 = fd1 - ad1;
    fb1 = !ab1;
    boolean lb2 = false;
    ab1 = ad2 < ad3;
if(ao1 != null){
      fo1 = ao1.m4(ab2, ab3, ab4, fb0);
}
    fb1 = !lb2;
    Thought lo3 = Thought324.getInstance(ao2, ao3, ao4, fo0);
if(fo1 != null){
      fo1.m1(ad4, fd0, fd1, ad1);
}
    boolean lb4 = true;
    ad2 = ad3 - ad4;
    boolean lb5 = true;
    lb4 = fd0 > fd1;

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
    Thought lo0 = Thought152.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
    fd1 = fd0 + fd1;
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb1);
}
    Thought lo2 = Thought177.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, lb1, fb0);
    fd0 *= -1;
    Thought lo3 = Thought183.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, lb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(lb1, fb0, fb1, lb1);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    double ld4 = 494.11503219910287;
    Thought lo5 = Thought272.getInstance(ld4, fd0, fd1, ld4);
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, ld4, fd0);
}
    fb0 = fb1 && lb1;
    boolean lb6 = false;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld4, fd0, fd1, lb6, fb0, fb1, lb1);
}
    lb6 = ld4 > fd0;
    double ld7 = 227.03583990764707;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, lb1, lb6);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb0 = fd1 < ld4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld7, fd0, fd1, ld4, fb1, lb1, lb6, fb0);
}
    Thought lo8 = Thought251.getInstance(fb1, lb1, lb6, fb0);
    ld7 = fd0 + fd1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    ld4 = ld7 - fd0;
    fb1 = fd1 < ld4;

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
    ab1 = ab2 && ab3;
if(fo1 != null){
      ab4 = fo1.m2(fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought301.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
    boolean lb1 = false;
    boolean lb2 = false;
    fd0 = fd1 + fd0;
    Output.points[8][5] += fd1;
    ab1 = fd0 < fd1;
    Thought lo3 = Thought36.getInstance(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
if(fo1 != null){
      fb1 = fo1.m2();
}
    fd0 = fd1 - fd0;
    double ld4 = 957.7211107043046;
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld4, fd0, fd1, lb1, lb2, ab1, ab2);
}
if(fo0 != null){
      fo1 = fo0.m4(ab3, ab4, fb0, fb1);
}
    ld4 = fd0 - fd1;
if(fo1 != null){
      lb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      lb2 = fo0.m2(ld4, fd0, fd1, ld4);
}
    boolean lb5 = false;
    fd0 = fd1 + ld4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld4, fd0);
}
    boolean lb6 = true;
if(fo1 != null){
      fd1 = fo1.m3(ld4, fd0, fd1, ld4, lb5, lb6, ab1, ab2);
}
    Thought lo7 = Thought40.getInstance(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
    Thought lo8 = Thought212.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld4, fd0, lb1, lb2, lb5, lb6);
}
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
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 && fb0;
    fb1 = !fb0;
    ad1 = ad2 + ad3;
        Thought lo0 = Thought398.getInstance(fb1, fb0, fb1, fb0);
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
    fb0 = fb1 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1);
}
    fb1 = ad2 > ad3;
    boolean lb1 = true;
    boolean lb2 = false;
    ad4 = fd0 - fd1;
    if (lb1) {
        lb2 = fb0 && fb1;
        ad1 = ad2 - ad3;
        lb1 = ad4 < fd0;
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, ad1, ad2, lb2, fb0, fb1, lb1);
}
        double ld3 = 871.1799910158695;
if(fo1 != null){
          lb2 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, lb1, lb2);
}
        fb0 = ad2 > ad3;
        fb1 = ad4 < fd0;
if(fo1 != null){
          fo0 = fo1.m4();
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld3, ad1, ad2, lb1, lb2, fb0, fb1);
}
        lb1 = !lb2;
if(fo0 != null){
          ad3 = fo0.m3(fb0, fb1, lb1, lb2);
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
    double ld0 = 438.67466741745403;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    ab1 = ad1 > ad2;
    ab2 = ad3 < ad4;
    Thought lo1 = Thought48.getInstance(fd0, fd1, ld0, ad1);
    double ld2 = 863.9730808368728;
    boolean lb3 = true;
    ab2 = ab3 || ab4;
    fb0 = !fb1;
    ad1 = ad2 + ad3;
    ad4 = fd0 + fd1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ld0, ld2, ad1, ad2);
}
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1, lb3, ab1, ab2, ab3);
}
    ld0 = ld2 - ad1;
    ab4 = ad2 < ad3;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, lb3, ab1, ab2);
}
    ab3 = ab4 && fb0;
    Thought lo4 = Thought61.getInstance();
    Thought lo5 = Thought376.getInstance(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld0, fb1, lb3, ab1, ab2);
    Output.points[8][6] -= ld2;
if(fo1 != null){
      ad1 = fo1.m3(ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m1(ad2, ad3, ad4, fd0);
}
    fd1 = ld0 + ld2;
    Thought lo6 = Thought12.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
    Output.points[8][7] += fd0;
if(fo1 != null){
      fo1.m3(fd1, ld0, ld2, ad1, lb3, ab1, ab2, ab3);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb3);
}
    ad2 = ad3 + ad4;

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
    Thought lo0 = Thought89.getInstance();
    Thought lo1 = Thought111.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
    fb1 = fd0 > fd1;
    boolean lb2 = true;
if(ao1 != null){
      fo1 = ao1.m4(lb2, fb0, fb1, lb2);
}
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1);
}
    double ld3 = 658.6313400207066;
if(ao2 != null){
      ao1 = ao2.m4(ld3, fd0, fd1, ld3);
}
    fd0 *= -1;
    fb0 = fb1 || lb2;
    for(int i0=0; i0<10; i0++){
        fd1 = ld3 - fd0;
if(ao3 != null){
          ao3.m3(ao4, fo0, fo1, ao1, fd1, ld3, fd0, fd1);
}
if(ao3 != null){
          ao2 = ao3.m4(ld3, fd0, fd1, ld3, fb0, fb1, lb2, fb0);
}
        fd0 = fd1 - ld3;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb1, lb2, fb0, fb1);
}
if(ao4 != null){
          ao4.m2();
}
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, ld3, fd0, lb2, fb0, fb1, lb2);
}
        Thought lo4 = Thought234.getInstance(fb0, fb1, lb2, fb0);
if(fo0 != null){
          fb1 = fo0.m2(fo1, ao1, ao2, ao3);
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
    fb0 = fb1 && fb0;
    boolean lb0 = true;
    fb0 = fb1 && lb0;
if(ao1 != null){
      fb0 = ao1.m2(ad1, ad2, ad3, ad4);
}
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2);
}
    Thought lo1 = Thought52.getInstance(ad3, ad4, fd0, fd1, lb0, fb0, fb1, lb0);
    double ld2 = 359.26258009970843;
    Output.points[8][8] -= ld2;
    for(int i0=0; i0<10; i0++){
        ad1 = ad2 - ad3;
        fb0 = fb1 && lb0;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, lb0, fb0);
}
        boolean lb3 = true;
        fb0 = ad4 > fd0;
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
    ab1 = fd0 < fd1;
    ab2 = !ab3;
if(ao3 != null){
          ao2 = ao3.m4();
}
if(ao4 != null){
      ab4 = ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
    ab3 = fd0 < fd1;
    fd0 = fd1 + fd0;
if(ao3 != null){
      ab4 = ao3.m2(fb0, fb1, ab1, ab2);
}
    boolean lb0 = false;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    boolean lb1 = false;
    Thought lo2 = Thought188.getInstance(fd1, fd0, fd1, fd0);
    ab1 = fd1 < fd0;
    Output.points[0][0] += fd1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
}
    ab2 = ab3 && ab4;
    fb0 = fd0 < fd1;
    boolean lb3 = true;
    fd0 *= -1;

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
        boolean lb0 = true;
    Thought lo1 = Thought106.getInstance(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
    fb0 = fb1 || lb0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
    fd1 *= -1;
    fb0 = ad1 > ad2;
    ad3 = ad4 + fd0;
    fb1 = lb0 || ab1;
if(ao2 != null){
      ao1 = ao2.m4();
}
    fd1 = ad1 - ad2;
    Thought lo2 = Thought191.getInstance(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
    ad1 = ad2 + ad3;
    ad4 *= -1;
    fb1 = lb0 || ab1;
    ab2 = fd0 < fd1;
    ab3 = !ab4;
if(ao1 != null){
      ad1 = ao1.m3(fb0, fb1, lb0, ab1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    ad2 *= -1;

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
    Thought lo0 = Thought97.getInstance(fd0, fd1, fd0, fd1);
    fb0 = fb1 || fb0;
    fb1 = fd0 > fd1;
    fb0 = !fb1;
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    lb1 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb1, fb0);
}
    fb1 = fd0 > fd1;
if(fo0 != null){
      fo0.m1();
}
    Output.points[0][1] += fd0;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb1, fb0, fb1, lb1);
}
    fb0 = fd1 > fd0;
    fb1 = lb1 || fb0;

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
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Thought lo0 = Thought139.getInstance(fd1, fd0, fd1, fd0);
    fd1 *= -1;
    fd0 *= -1;
    fb0 = fd1 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 > fd0;
    fd1 = fd0 + fd1;
    fb0 = fd0 > fd1;
    Thought lo1 = Thought358.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb2 = true;
    fb0 = fd0 > fd1;
    boolean lb3 = false;
    fb0 = fb1 || lb2;

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
    fb1 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Output.points[0][2] += fd0;
if(fo0 != null){
      fo0.m2(fb1, fb0, fb1, fb0);
}
    double ld0 = 422.8267026089308;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m1(fd0, fd1, ld0, fd0);
}
    fb1 = fd1 < ld0;
        fd0 *= -1;
    fb0 = fb1 && fb0;
    Thought lo1 = Thought256.getInstance(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1);
    fb1 = ld0 < fd0;
if(fo0 != null){
      fd1 = fo0.m3(ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 - ld0;
    boolean lb2 = true;

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
