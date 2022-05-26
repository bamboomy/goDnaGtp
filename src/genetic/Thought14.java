package genetic;
import java.util.ArrayList;
class Thought14 extends Thought{
private static ArrayList<Thought14> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 675.6495735267009;
private double fd1 = 680.5568153202958;
private Thought fo0 = null;
private Thought fo1 = null;
Thought14 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought14 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought14 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought14 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought14 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought14 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought14 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought14 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought14 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought14 instance = new Thought14 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought14 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought14 instance = new Thought14 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought14 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought14 instance = new Thought14 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought14 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought14 instance = new Thought14 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought14 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought14 instance = new Thought14 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought14 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought14 instance = new Thought14 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought14 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought14 instance = new Thought14 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought14 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought14 instance = new Thought14 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
if(fo1 != null){
      fo1.m1(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 > fd0;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    fb1 = fb0 || fb1;
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
    boolean lb0 = false;
    lb0 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fo1.m2(fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fo0.m2(fd0, fd1, fd0, fd1);
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
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    fd0 *= -1;
    ab1 = ab2 && ab3;
    fd1 = fd0 + fd1;
    ab4 = fb0 || fb1;
    ab1 = !ab2;
    Thought lo0 = Thought19.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
    if (ab1) {
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
        Thought lo1 = Thought13.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
if(fo0 != null){
          fo0.m2();
}
        fb1 = !ab1;
        Output.points[1][1] += fd0;
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
        fd1 = fd0 - fd1;
        fd0 = fd1 - fd0;
        } else {
        fb1 = ab1 || ab2;
        fd1 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(ab3, ab4, fb0, fb1);
}
        fd0 = fd1 + fd0;
        fd1 *= -1;
        fd0 = fd1 - fd0;
if(fo1 != null){
          fo0 = fo1.m4(fd1, fd0, fd1, fd0);
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
    Output.points[1][2] -= ad2;
    double ld0 = 911.3135989206339;
    boolean lb1 = false;
    lb1 = !fb0;
    fb1 = lb1 && fb0;
    Thought lo2 = Thought19.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb1, lb1, fb0, fb1);
}
    lb1 = !fb0;
    fb1 = !lb1;
    ld0 = ad1 + ad2;
if(fo1 != null){
      fo1.m3(ad3, ad4, fd0, fd1, fb0, fb1, lb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, ad1, ad2, ad3);
}
    double ld3 = 470.20811083137363;
    Output.points[1][3] += ad3;
    boolean lb4 = true;
    Thought lo5 = Thought2.getInstance();
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, lb1, lb4, fb0);
}
    boolean lb6 = false;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb1, lb4);
}
    double ld7 = 314.6983688248415;
    ad3 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ld0);
}
    ld3 = ld7 - ad1;

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
    boolean lb0 = false;
    boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ad1 = ad2 - ad3;
    lb0 = ad4 > fd0;
    boolean lb2 = false;
    lb1 = lb2 && ab1;
    ab2 = !ab3;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, ab4, fb0, fb1, lb0);
}
if(fo0 != null){
      fo0.m3(fd0, fd1, ad1, ad2, lb1, lb2, ab1, ab2);
}
    ab3 = ad3 < ad4;
    fd0 = fd1 + ad1;
    ab4 = ad2 < ad3;
    fb0 = ad4 > fd0;
    fb1 = !lb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
    ad4 = fd0 - fd1;
if(fo1 != null){
      fo1.m2();
}
    ad1 = ad2 + ad3;
    Output.points[1][4] += ad4;
    Thought lo3 = Thought3.getInstance(fo0, fo1, fo0, fo1, lb1, lb2, ab1, ab2);

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
    fb1 = fb0 && fb1;
    fd0 = fd1 + fd0;
if(ao1 != null){
      ao1.m3(fb0, fb1, fb0, fb1);
}
    fd1 = fd0 + fd1;
if(ao2 != null){
      fd0 = ao2.m3(fd1, fd0, fd1, fd0);
}
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1);
}
    Output.points[1][5] += fd1;
    fb1 = !fb0;
    fd0 *= -1;
    Thought lo0 = Thought9.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
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
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
}
    double ld0 = 296.83524692709017;
    fb1 = fb0 || fb1;
    ad4 = fd0 - fd1;
    ld0 = ad1 - ad2;
    ad3 = ad4 + fd0;
    fb0 = fd1 > ld0;
if(fo1 != null){
      ad1 = fo1.m3();
}
    ad2 = ad3 + ad4;
    fb1 = fb0 || fb1;
    Thought lo1 = Thought9.getInstance(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
    fb0 = fd0 < fd1;
    ld0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    boolean lb2 = false;
    ad1 = ad2 - ad3;
if(ao2 != null){
      ao1 = ao2.m4(ad4, fd0, fd1, ld0);
}
    double ld3 = 318.5961309393336;
    Output.points[1][6] -= ld3;

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
    ab2 = !ab3;
    ab4 = fb0 || fb1;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0);
}
    ab1 = fd1 < fd0;
    Thought lo0 = Thought5.getInstance(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
    fb1 = fd1 > fd0;
if(ao4 != null){
      ao4.m3(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = fd1 > fd0;
    if (fb1) {
        boolean lb1 = true;
        double ld2 = 460.2449095161102;
        boolean lb3 = true;
        lb1 = lb3 && ab1;
        ab2 = fd0 < fd1;
        ab3 = ab4 || fb0;
        fb1 = ld2 < fd0;
        boolean lb4 = false;
        lb1 = fd1 > ld2;
        Output.points[1][7] += fd0;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, ld2, fd0, fd1);
}
        lb3 = lb4 && ab1;
        ab2 = ld2 > fd0;
        fd1 = ld2 + fd0;
        Output.points[1][8] += fd1;
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
    ab2 = ad1 > ad2;
if(ao2 != null){
      ao1 = ao2.m4();
}
    Thought lo0 = Thought2.getInstance(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
if(ao1 != null){
      ao1.m1(ab1, ab2, ab3, ab4);
}
    fb0 = ad3 < ad4;
if(ao2 != null){
          fd0 = ao2.m3(fd1, ad1, ad2, ad3);
}
    Thought lo1 = Thought11.getInstance(ao3, ao4, fo0, fo1);
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1, fb1, ab1, ab2, ab3);
}
    Output.points[2][0] += ad2;
    ab4 = ad3 > ad4;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, ad1, ad2, fb0, fb1, ab1, ab2);
}
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
}
if(ao1 != null){
      ao1.m1();
}
    boolean lb2 = false;
    Thought lo3 = Thought9.getInstance(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
    double ld4 = 501.8032847958941;
    fb1 = lb2 && ab1;

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
    Thought lo0 = Thought8.getInstance(fb0, fb1, fb0, fb1);
    fd0 *= -1;
    fd1 *= -1;
    fb0 = fd0 > fd1;
    Thought lo1 = Thought18.getInstance(fd0, fd1, fd0, fd1);
        boolean lb2 = false;
    boolean lb3 = false;
    Output.points[2][1] += fd0;
    lb3 = fd1 < fd0;
    Thought lo4 = Thought0.getInstance(fo1, fo0, fo1, fo0);
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, lb2, lb3);
}
    Thought lo5 = Thought8.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, lb2, lb3);

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
    ab2 = fd0 > fd1;
    fd0 = fd1 - fd0;
    ab3 = ab4 && fb0;
    fd1 *= -1;
        boolean lb0 = false;
    double ld1 = 429.0881164284081;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1);
}
    fb0 = fd0 < fd1;
    fb1 = ld1 < fd0;
    Thought lo2 = Thought3.getInstance();
    boolean lb3 = true;
        double ld4 = 503.15952931313717;
    fd0 = fd1 - ld1;

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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    fb1 = fb0 && fb1;
    ad2 = ad3 + ad4;
    fb0 = fb1 || fb0;
    fd0 = fd1 - ad1;
    double ld0 = 255.2255710113885;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    if (fb1) {
        Output.points[2][2] += ad1;
        fb0 = !fb1;
        ad2 *= -1;
        Output.points[2][3] += ad3;
        ad4 = fd0 + fd1;
if(fo0 != null){
          fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
        ld0 *= -1;
if(fo1 != null){
          fb0 = fo1.m2(ad1, ad2, ad3, ad4);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        double ld1 = 14.715606559386677;
        ad4 = fd0 + fd1;
        ld1 = ld0 - ad1;
        Output.points[2][4] -= ad2;
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
          fo1.m3(ld1, ld0, ad1, ad2, fb1, fb0, fb1, fb0);
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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    ad1 *= -1;
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
    boolean lb0 = false;
    lb0 = ad1 > ad2;
    boolean lb1 = true;
    boolean lb2 = true;
    ad3 = ad4 + fd0;
if(fo1 != null){
      fo1.m1();
}
    fd1 = ad1 + ad2;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, lb1, lb2, ab1, ab2);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    fd0 *= -1;
    boolean lb0 = true;
if(ao2 != null){
      lb0 = ao2.m2(fb0, fb1, lb0, fb0);
}
if(ao3 != null){
      fb1 = ao3.m2(fd1, fd0, fd1, fd0);
}
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2);
}
    boolean lb1 = true;
    boolean lb2 = false;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, lb0, lb1, lb2, fb0);
}
if(ao3 != null){
      ao3.m3(fd0, fd1, fd0, fd1, fb1, lb0, lb1, lb2);
}
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
    fb0 = fd1 > fd0;
if(ao4 != null){
      ao3 = ao4.m4();
}
    fb1 = fd1 < fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, ao1, ao2, ao3, lb0, lb1, lb2, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fb1, lb0, lb1, lb2);
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
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4);
}
    boolean lb0 = true;
if(ao4 != null){
      lb0 = ao4.m2(fo0, fo1, ao1, ao2);
}
    Output.points[2][5] += fd0;
    double ld1 = 142.68050641721942;
    fd0 = fd1 - ld1;
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, fb1, lb0, fb0, fb1);
}
    lb0 = fb0 || fb1;
    boolean lb2 = true;
    double ld3 = 593.4326693855604;
    boolean lb4 = false;

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
    ab2 = fd1 < fd0;
    ab3 = fd1 < fd0;
    double ld0 = 657.5799881450564;
    ab4 = fb0 && fb1;
    double ld1 = 183.65368068390046;
if(ao2 != null){
      ld1 = ao2.m3(fd0, fd1, ld0, ld1, ab1, ab2, ab3, ab4);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ld0, ld1);
}
    fd0 *= -1;
    fd1 *= -1;
if(ao3 != null){
      fb0 = ao3.m2();
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb1, ab1, ab2, ab3);
}
    ab4 = ld0 < ld1;
    fb0 = fb1 && ab1;
    ab2 = ab3 || ab4;
if(fo0 != null){
          ao4 = fo0.m4(fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      fo1.m2(fd0, fd1, ld0, ld1);
}
    ab3 = ab4 && fb0;
    fb1 = fd0 < fd1;
    ld0 = ld1 + fd0;
    ab1 = fd1 < ld0;
if(ao1 != null){
      ld1 = ao1.m3(ao2, ao3, ao4, fo0);
}
    Thought lo2 = Thought4.getInstance(fo1, ao1, ao2, ao3, fd0, fd1, ld0, ld1, ab2, ab3, ab4, fb0);
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, ld0, ld1, fb1, ab1, ab2, ab3);
}
    double ld3 = 294.2143519337947;
    boolean lb4 = true;

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
if(ao2 != null){
      ao2.m1(ad1, ad2, ad3, ad4);
}
    ab1 = ab2 && ab3;
    fd0 = fd1 - ad1;
    Thought lo0 = Thought16.getInstance(ao3, ao4, fo0, fo1);
    ab4 = ad2 < ad3;
    fb0 = ad4 > fd0;
    fb1 = fd1 > ad1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
if(ao1 != null){
      fd1 = ao1.m3(ad1, ad2, ad3, ad4, fb0, fb1, ab1, ab2);
}
    fd0 *= -1;
    ab3 = ab4 && fb0;
    fd1 = ad1 - ad2;
    fb1 = ab1 && ab2;
    boolean lb1 = false;
    boolean lb2 = false;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1);
}
    double ld3 = 557.4065346813481;
    double ld4 = 40.670768902423724;
    ld3 *= -1;
    double ld5 = 942.099472119046;

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
    boolean lb0 = false;
    fd1 = fd0 - fd1;
    Thought lo1 = Thought18.getInstance(fb0, fb1, lb0, fb0);
    Thought lo2 = Thought0.getInstance(fd0, fd1, fd0, fd1);
    double ld3 = 529.760642780509;
    ld3 = fd0 + fd1;
    Output.points[2][6] -= ld3;
    fb1 = lb0 && fb0;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    fd0 = fd1 + ld3;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, ld3, fd0, fb1, lb0, fb0, fb1);
}
    fd1 = ld3 - fd0;
    boolean lb4 = false;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld3, fd0, fd1, lb0, lb4, fb0, fb1);
}
    ld3 = fd0 + fd1;
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1, ld3, fd0, fd1, ld3);
}
if(fo1 != null){
          fo0 = fo1.m4();
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
    double ld0 = 861.9398509946756;
    ab2 = ab3 || ab4;
        fb0 = ld0 < fd0;
    fb1 = fd1 > ld0;
    Thought lo1 = Thought8.getInstance(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
    fb0 = fb1 || ab1;
    for(int i0=0; i0<10; i0++){
        Thought lo2 = Thought5.getInstance(ab2, ab3, ab4, fb0);
        boolean lb3 = true;
        double ld4 = 694.1038287943945;
        Thought lo5 = Thought6.getInstance(ld0, fd0, fd1, ld4);
        fb0 = fb1 && lb3;
        ab1 = !ab2;
        Thought lo6 = Thought13.getInstance(fo0, fo1, fo0, fo1);
        Output.points[2][7] -= ld0;
        fd0 = fd1 + ld4;
        if (ab3) {
            double ld7 = 957.1761993679936;
}}
Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} 
}
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    Output.points[2][8] -= ad1;
    Thought lo0 = Thought7.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
    fb0 = fd1 > ad1;
    ad2 = ad3 + ad4;
if(fo0 != null){
      fb1 = fo0.m2(fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
    Thought lo1 = Thought16.getInstance(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
if(fo1 != null){
      ad1 = fo1.m3();
}
    ad2 = ad3 - ad4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fd0 *= -1;
    Output.points[3][0] += fd1;
    Thought lo2 = Thought6.getInstance(fb0, fb1, fb0, fb1);
    boolean lb3 = true;
    ad1 = ad2 - ad3;
    lb3 = fb0 && fb1;
    boolean lb4 = false;

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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
    Thought lo0 = Thought8.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo0.m3(ad3, ad4, fd0, fd1, fb0, fb1, ab1, ab2);
}
    Thought lo1 = Thought13.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
    fd0 = fd1 - ad1;
if(fo1 != null){
      ab3 = fo1.m2();
}
    Output.points[3][1] -= ad2;
    ab4 = ad3 < ad4;
    fb0 = fd0 > fd1;
    boolean lb2 = false;
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, lb2, ab1);
}
    boolean lb3 = false;
    boolean lb4 = true;
    boolean lb5 = false;
        Thought lo6 = Thought9.getInstance(lb4, lb5, ab1, ab2);
    boolean lb7 = false;
    ad2 *= -1;
if(fo1 != null){
      ad3 = fo1.m3(ad4, fd0, fd1, ad1);
}
    ad2 = ad3 + ad4;
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0);
}
    Thought lo8 = Thought4.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, ab3, ab4, fb0, fb1);

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
if(ao2 != null){
      fd1 = ao2.m3(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 > fd1;
    fb1 = fd0 > fd1;
    fb0 = fd0 > fd1;
    fb1 = fb0 || fb1;
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    fb0 = fb1 || fb0;
    boolean lb0 = true;

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
if(ao2 != null){
      ao1 = ao2.m4(fb1, fb0, fb1, fb0);
}
    Output.points[3][2] -= ad2;
    boolean lb0 = true;
if(ao3 != null){
      ao3.m3(ad3, ad4, fd0, fd1);
}
    fb0 = fb1 && lb0;
    fb0 = !fb1;
    for(int i0=0; i0<10; i0++){
if(ao4 != null){
          ao4.m3(fo0, fo1, ao1, ao2);
}
        ad1 = ad2 + ad3;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ad1, lb0, fb0, fb1, lb0);
}
        fb0 = fb1 && lb0;
        Thought lo1 = Thought16.getInstance(ad2, ad3, ad4, fd0, fb0, fb1, lb0, fb0);
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ad1, ad2, ad3);
}
        fb1 = lb0 || fb0;
if(ao4 != null){
          ao3 = ao4.m4();
}
        double ld2 = 765.4024939278441;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    ab1 = ab2 && ab3;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab4, fb0, fb1, ab1);
}
    fd0 = fd1 - fd0;
    ab2 = fd1 > fd0;
    ab3 = !ab4;
    Output.points[3][3] -= fd1;
    Thought lo0 = Thought7.getInstance(fb0, fb1, ab1, ab2);
    fd0 = fd1 + fd0;
    ab3 = fd1 > fd0;
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    ab4 = fb0 && fb1;
    ab1 = ab2 || ab3;
    ab4 = !fb0;
    Output.points[3][4] -= fd1;
    Output.points[3][5] += fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
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
    double ld0 = 142.49280648612176;
if(ao1 != null){
      ld0 = ao1.m3(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
    fd0 = fd1 - ld0;
    ad1 = ad2 + ad3;
    ad4 = fd0 - fd1;
    fb0 = ld0 > ad1;
    fb1 = ad2 < ad3;
    double ld1 = 391.8381301493864;
    double ld2 = 90.07551481592503;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
    fd1 = ld0 - ld1;
    ab1 = ab2 && ab3;
if(ao3 != null){
      ao2 = ao3.m4();
}
    boolean lb3 = false;
    ld2 = ad1 - ad2;
        Output.points[3][6] += ad3;
    ad4 *= -1;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, ab3, ab4, fb0, fb1);
}
    lb3 = ab1 && ab2;
    fd0 = fd1 - ld0;
    boolean lb4 = false;
    ab2 = ld1 < ld2;
    ab3 = ad1 < ad2;

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
    Output.points[3][7] -= fd0;
    fb1 = fb0 && fb1;
if(fo0 != null){
      fo0.m3(fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb1);
}
    boolean lb2 = true;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    double ld3 = 780.0275125580894;
if(fo0 != null){
      fo1 = fo0.m4();
}
    lb2 = fb0 || fb1;
    Thought lo4 = Thought19.getInstance(fo1, fo0, fo1, fo0, lb0, lb1, lb2, fb0);
    fd0 *= -1;
    Thought lo5 = Thought18.getInstance(fb1, lb0, lb1, lb2);

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
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
    double ld0 = 228.07278411559187;
    fd0 = fd1 - ld0;
    boolean lb1 = true;
    ab1 = ab2 || ab3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, ab4, fb0, fb1, lb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld0, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb1, ab1);
}
    fd0 = fd1 + ld0;
    boolean lb2 = true;
    ab1 = ab2 || ab3;
    fd0 = fd1 - ld0;
if(fo1 != null){
      fo0 = fo1.m4(ab4, fb0, fb1, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, fd0);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    boolean lb3 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1, lb2, lb3, ab1, ab2);
}
if(fo0 != null){
      fo1 = fo0.m4(ld0, fd0, fd1, ld0, ab3, ab4, fb0, fb1);
}
    fd0 = fd1 + ld0;
    fd0 = fd1 - ld0;

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
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    fb1 = fb0 || fb1;
    Output.points[3][8] += fd1;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m1(fb0, fb1, fb0, fb1);
}
    ad2 = ad3 + ad4;
    fd0 = fd1 + ad1;
    fb0 = ad2 > ad3;
    ad4 *= -1;
    fd0 = fd1 + ad1;
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
    fb1 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
    fb0 = ad2 < ad3;
    ad4 = fd0 - fd1;
    Output.points[4][0] += ad1;

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
    Thought lo0 = Thought14.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
    fd1 = ad1 - ad2;
    ab2 = ab3 || ab4;
if(fo0 != null){
      ad3 = fo0.m3();
}
    Thought lo1 = Thought8.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
    ab3 = ab4 && fb0;
    ad4 *= -1;
    fd0 *= -1;
    fb1 = fd1 > ad1;
    ad2 = ad3 + ad4;
    Output.points[4][1] -= fd0;
    Output.points[4][2] -= fd1;
    ad1 = ad2 + ad3;
    ad4 *= -1;
    boolean lb2 = false;

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
    fb0 = fd0 < fd1;
    double ld0 = 59.50510243781334;
    ld0 = fd0 + fd1;
    boolean lb1 = true;
    Thought lo2 = Thought1.getInstance(fb0, fb1, lb1, fb0);
if(ao1 != null){
      ao1.m3(ld0, fd0, fd1, ld0);
}
    fd0 *= -1;
    fb1 = !lb1;
    fd1 = ld0 - fd0;
        fd1 = ld0 + fd0;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1);
}
    Thought lo3 = Thought8.getInstance(ao1, ao2, ao3, ao4, ld0, fd0, fd1, ld0, fb0, fb1, lb1, fb0);
    fb1 = lb1 || fb0;
    Thought lo4 = Thought1.getInstance(fd0, fd1, ld0, fd0, fb1, lb1, fb0, fb1);
    if (lb1) {
        fd1 *= -1;
        boolean lb5 = false;
        lb1 = ld0 < fd0;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, ld0, fd0, fd1);
}
if(fo1 != null){
          fo0 = fo1.m4();
}
        fb0 = !fb1;
if(ao1 != null){
          ao1.m1(ao2, ao3, ao4, fo0, lb5, lb1, fb0, fb1);
}
if(ao1 != null){
          fo1 = ao1.m4(lb5, lb1, fb0, fb1);
}
        } else if (lb1) {
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
    fb1 = fb0 && fb1;
    ad1 = ad2 - ad3;
if(ao2 != null){
      ao1 = ao2.m4(ad4, fd0, fd1, ad1);
}
    ad2 = ad3 - ad4;
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1);
}
    fb0 = fd1 < ad1;
    boolean lb0 = false;
    fb0 = ad2 > ad3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1, fb1, lb0, fb0, fb1);
}
    boolean lb1 = true;
if(ao2 != null){
      lb0 = ao2.m2(ad2, ad3, ad4, fd0, lb1, fb0, fb1, lb0);
}
    double ld2 = 246.10572899161218;
    Output.points[4][3] -= fd0;
    lb1 = !fb0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ld2, ad1, ad2);
}
    double ld3 = 423.5524684926973;

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
    ab2 = fd1 < fd0;
    boolean lb0 = true;
    ab2 = fd1 > fd0;
if(ao3 != null){
      ao2 = ao3.m4();
}
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, ab3, ab4, fb0, fb1);
}
    Output.points[4][4] -= fd1;
if(ao3 != null){
      ao3.m1(lb0, ab1, ab2, ab3);
}
        Thought lo1 = Thought6.getInstance(fd0, fd1, fd0, fd1);
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2);
}
    fd1 *= -1;
if(ao3 != null){
      ab4 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb0, fb1, lb0, ab1);
}
    fd0 *= -1;
if(ao2 != null){
      ao2.m3(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    boolean lb2 = false;
    Output.points[4][5] += fd1;
    double ld3 = 369.2030811711382;
    boolean lb4 = true;
    double ld5 = 385.638362594419;
    double ld6 = 966.2810648137023;
    ld3 *= -1;
    ab4 = ld5 > ld6;
    Thought lo7 = Thought11.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, ld3, ld5);
    fb0 = fb1 || lb0;
    lb2 = lb4 && ab1;
if(ao1 != null){
      ab2 = ao1.m2();
}
    ab3 = ld6 < fd0;
    fd1 = ld3 + ld5;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    boolean lb0 = true;
    boolean lb1 = false;
    lb0 = lb1 || ab1;
    ab2 = ad1 < ad2;
    Output.points[4][6] -= ad3;
    ad4 = fd0 - fd1;
    Output.points[4][7] += ad1;
    ad2 = ad3 + ad4;
    ab3 = fd0 < fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab4, fb0, fb1, lb0);
}
    ad1 = ad2 - ad3;
    lb1 = ab1 && ab2;
    boolean lb2 = true;
    ad4 = fd0 + fd1;
    ad1 = ad2 + ad3;
    ad4 = fd0 - fd1;
    boolean lb3 = true;
    boolean lb4 = false;
    lb4 = ad1 < ad2;

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
    fd0 = fd1 + fd0;
    boolean lb0 = false;
if(fo1 != null){
      fo1.m2(fb0, fb1, lb0, fb0);
}
    Thought lo1 = Thought7.getInstance(fd1, fd0, fd1, fd0);
    Thought lo2 = Thought16.getInstance(fo0, fo1, fo0, fo1);
    boolean lb3 = true;
    fb0 = fd1 < fd0;
    Thought lo4 = Thought4.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, lb0, lb3, fb0);
    fb1 = fd1 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, lb0, lb3, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    lb0 = lb3 || fb0;

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
    fb1 = fb0 && fb1;
    fb0 = !fb1;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
    lb0 = fb0 || fb1;
    fd0 = fd1 + fd0;
if(fo1 != null){
          lb0 = fo1.m2(fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    double ld1 = 49.70912727136957;
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
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    Thought lo0 = Thought15.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
            Thought lo1 = Thought10.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
    fd0 *= -1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    Thought lo2 = Thought6.getInstance();
    Output.points[4][8] += fd1;
    Thought lo3 = Thought0.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
    double ld4 = 48.71209901399221;
    fb1 = ld4 > fd0;
    fd1 *= -1;
    Output.points[5][0] += ld4;
if(fo0 != null){
      fd0 = fo0.m3(fb0, fb1, fb0, fb1);
}
    fd1 = ld4 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld4, fd0, fd1);
}
    Thought lo5 = Thought18.getInstance(fo1, fo0, fo1, fo0);
    Output.points[5][1] += ld4;
    fb0 = fd0 > fd1;
    fb1 = ld4 > fd0;
    double ld6 = 151.76579473418803;
    fd0 = fd1 - ld4;
    Output.points[5][2] += ld6;
    fb0 = !fb1;
    boolean lb7 = false;

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
